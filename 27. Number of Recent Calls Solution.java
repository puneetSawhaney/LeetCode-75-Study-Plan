// code by Puneet 
// please visit to explanation file of this code to understand the approach

class RecentCounter {
    private Queue<Integer> Request;
    public RecentCounter() {
        this.Request = new LinkedList<>();
    }
    
    public int ping(int t) {
        Request.add(t);
        while(Request.peek() <t-3000){
            Request.poll();
        }
        return Request.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
