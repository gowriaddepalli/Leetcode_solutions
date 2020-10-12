// Reference: https://www.youtube.com/watch?v=0LjVxtLnNOk

// The algorithm is as:

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int count = 0;
        
        // 1. calculate the indegree of every node.
        
        // 2. keep a stack and push all nodes into the stack whose indegree is zero.
        
        // 3. while stack is not empty pop out the element and push its dependencies into the stack.
        
        int[] indegree = new int[numCourses];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<prerequisites.length; i++)
        {
            indegree[prerequisites[i][1]]++;
        }
        
        for(int j=0; j< indegree.length; j++){
            if (indegree[j]==0)
            {
                st.push(j);
            }
        }
        
        while(!st.isEmpty())
        {
            int curr = st.pop();
            //System.out.println(curr);
            count++;
            
            for(int i=0; i<prerequisites.length; i++){
                if(prerequisites[i][0] == curr){ // the current element is equal to the the node dependent on,reduce the indegree of the core dependent node
                    indegree[prerequisites[i][1]]--;
                    if(indegree[prerequisites[i][1]] == 0){
                    st.push(prerequisites[i][1]);
                }
                }
                
                
            }
            
        }
        //System.out.println(count);
        return count == numCourses;
        
    }
}
