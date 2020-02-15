- tricks to check for int overflow.

if(num>(Integer.MAX_VALUE)/10 || ((num==(Integer.MAX_VALUE)/10) && rem > 7) )
