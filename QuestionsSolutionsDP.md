### Questions and Solutions DP


#### Wildcard Matching:

// The aim is build a table for the expression.
// the condition for checking

// s[i] = p[j] || p[j]= ? 
//  :t[i][j] = t[i-1][j-1]
//  s[i] != p[j] = false;
        
// if p[j] = *
//   t[i-1][j] || t[i][j-1]
        

       
// first checking for  multiple ** and replacing it with single one
