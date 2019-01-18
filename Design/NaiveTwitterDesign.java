class Twitter {

    /** Initialize your data structure here. */
    
    // 1. We need an adjacency list (arraylist of  linkedlist list) to store followers and followees.
    // 2. we need to store the userId and tweetId post in a stack manner, so as to retrieve the posts in latest manner.
    
    // The adjacency graph.
    
    HashMap<Integer, LinkedList<Integer>> adjList  = null;
    Stack<HashMap<Integer,Integer>> st = null;
    
    public Twitter() {
        adjList = new HashMap<Integer,LinkedList<Integer>>();
        st = new Stack<HashMap<Integer,Integer>>();
    }
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        if(!adjList.containsKey(userId)){
            LinkedList<Integer> follow1 = new LinkedList<Integer>();
            follow1.add(new Integer(userId));
            adjList.put(userId, follow1);
        }
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        hm.put(userId,tweetId);
        st.push(hm);
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        if(!adjList.containsKey(userId)){
            LinkedList<Integer> follow1 = new LinkedList<Integer>();
            follow1.add(new Integer(userId));
            adjList.put(userId, follow1);
        }
        List<Integer> tweets = new ArrayList<Integer>();
        LinkedList<Integer> ll = adjList.get(userId);
        for (HashMap<Integer,Integer> hm : st)
        {
            for(Map.Entry<Integer, Integer> entry : hm.entrySet())
            {
                if(ll != null && ll.contains(entry.getKey())){
                   //System.out.println(entry.getValue());
                   tweets.add(entry.getValue()); 
                }
            }
        }
        Collections.reverse(tweets);
        int sz = tweets.size();
        if(sz> 10){
            sz =10;
        }
        return tweets.subList(0,sz);
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    // creating an adjacency list of user and who all it follows.
    public void follow(int followerId, int followeeId) {
        if(!adjList.containsKey(followerId)){
            LinkedList<Integer> follow1 = new LinkedList<Integer>();
            follow1.add(new Integer(followerId));
            follow1.add(new Integer(followeeId));
            adjList.put(followerId, follow1);
        }else
        {
            adjList.get(followerId).add(new Integer(followeeId));
        }
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if((followeeId != followerId) && adjList.containsKey(followerId)){
            adjList.get(followerId).remove(new Integer(followeeId));
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
