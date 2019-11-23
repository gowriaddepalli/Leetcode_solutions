class Solution {
    public String getHint(String secret, String guess) {

    if(secret.length() == 0){return "0A0B";}
    
    int bull = 0;
    int cow = 0;
    int [] result = new int [10];
    
    for(int i = 0;i<secret.length();i++)
    {
        int x = secret.charAt(i) - 48;
        int y = guess.charAt(i) - 48;
        
        if(x == y)
        {
            bull++;
        }
        else
        {
            // if the secret goes negative , it means there is one postn in place of  guess that doesnt match secret.
            if(result[x] < 0){cow++;}
            result[x]++;
             // if the guess goes pos , it means there is one postn in place of secret that doesnt match guess.
            if(result[y] > 0){cow++;}
            result[y]--;
        }
    }
    
    return bull+"A"+cow+"B";
    
}
}
