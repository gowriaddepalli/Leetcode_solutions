class Solution {
public boolean wordBreak(String s, List wordDict) {

    String st = s;
    String st2 = s;

    for(int i =0; i< st.length(); i++)
    {
        // getting substrings in linear time in forward way and checking if it exists in the list and 
		// hence removing that substring from the string.
        if(wordDict.contains(st.substring(i)))
        {
            st = new String(st.substring(0,i));
            i=-1;
        }
    }
    // after iteration if the words are in the list the string shhould be reduced into empty string.
    if("".equals(st)){
        return true;
    }
	
	// generating substrings in the backward approach, it is used only if the forward substrings are not able to generate strings cuts in the optimal manner.
    for(int i =0; i< st2.length(); i++)
    {
        if(wordDict.contains(st2.substring(st2.length() - i-1)))
        {
            st2 = new String(st2.substring(0,st2.length() - i-1));
            i=-1;
        }
    }
    
    if("".equals(st2)){
        return true;
    }
    
  return false;  
}
}
