class Solution {
    class Node {
        int len;
        int prefix;
        int suffix;
        int max;
        char leftChar;
        char rightChar;

        Node(char ch) {
            len = 1;
            prefix = 1;
            suffix = 1;
            max = 1;
            leftChar = ch;
            rightChar = ch;
        }
        Node() {
        }
    }
    Node[] tree;
    char[] str;

    public int[] longestRepeating(String s, String qC, int[] qI) {
        str = s.toCharArray();
        int n = str.length;
        tree = new Node[4 * n];
        build(1, 0, n - 1);
        int[] ans = new int[qI.length];
        for (int i = 0; i < qI.length; i++) {
            int index = qI[i];
            char ch = qC.charAt(i);

            str[index] = ch;
            update(1, 0, n - 1, index, ch);
            ans[i] = tree[1].max;
        }
        return ans;
    }
    void build(int node, int l, int r) {

        if (l == r) {
            tree[node] = new Node(str[l]);
            return;
        }
        int mid = (l + r) / 2;
        build(node * 2, l, mid);
        build(node * 2 + 1, mid + 1, r);

        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }
    void update(int node, int l, int r, int index, char ch) {
        if (l == r) {
            tree[node] = new Node(ch);
            return;
        }
        int mid = (l + r) / 2;
        if (index <= mid)
            update(node * 2, l, mid, index, ch);
        else
            update(node * 2 + 1, mid + 1, r, index, ch);
        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }

    Node merge(Node left, Node right) {

        Node res = new Node();

        res.len = left.len + right.len;

        res.leftChar = left.leftChar;
        res.rightChar = right.rightChar;

        res.prefix = left.prefix;
        res.suffix = right.suffix;

        res.max = Math.max(left.max, right.max);
        if (left.rightChar == right.leftChar) {
            // Boundary ke dono runs combine ho sakte hain
            res.max = Math.max(
                res.max,
                left.suffix + right.prefix
            );
            // Left ka pura segment same character hai
            if (left.prefix == left.len) {
                res.prefix = left.len + right.prefix;
            }
            // Right ka pura segment same character hai
            if (right.suffix == right.len) {
                res.suffix = right.len + left.suffix;
            }
        }
        return res;
    }
}

//  not Optimal
// class Solution {    
//     public int[] longestRepeating(String s, String qC, int[] qI) {
//         int l = qI.length;
//         char[] str = s.toCharArray();
//         int[] arr = new int[l];
//         for(int i=0; i<l ;i++){
//             int count=1;
//             int max = 1;
//             str[qI[i]] = qC.charAt(i);
//             for(int j = 1;j<str.length;j++){
//                 if(str[j]==str[j-1]) count++;
//                 else count = 1;
//                 max = Math.max(count,max);  
//             }
//             arr[i] =max;
//         }
//         return arr;        
//     }
// }