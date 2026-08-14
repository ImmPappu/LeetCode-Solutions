class Solution {
    public int maximumLengthSubstring(String s) {
     int i =0;
     int max =0;
     int[] freq = new int[26];
     for(int j=0;j<s.length();j++){
        
        int index =(s.charAt(j)-'a');
        freq[index]++;

        while(freq[index]>2){
            freq[s.charAt(i)- 'a']--;  // jis index ki freq 2 se jyda hai uski kam kareneg 
            i++;                       // i =0 ,s[0] = b , b-a =1 i.e freq[1]--
        }
            max=Math.max(max,j-i+1);
        }
     return max;
    }
        // char[] str = s.toCharArray();
        // int count = 1;
        // for(int i=0;i<str.length;i++){
        //     for(int j=0;j<str.length;j++){
        //         if(str[i]==str[j]){
        //             if(count<=2) count++;
        //             return str.length;
        //         }
        //     }
        // }  
}