class RecentCounter {
    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000) {  // t-3000 to t is the range ;if number in queue is less than this it will be removed
            q.remove();   // t = 3002 hai toh 2 se 3002 tak ke element queue mei rahnege baki remove
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */