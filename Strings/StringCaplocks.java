import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    // Complete the pressAForCapsLock function below.
    static String pressAForCapsLock(String message) {
          boolean cap = false;
          String[] sp = message.split("");
          StringBuilder sb = new StringBuilder();

          for(int i = 0; i<sp.length; i++){
            if(sp[i].compareTo("a")>=0 && sp[i].compareTo("z")<=0)
            {
                if(sp[i].equals("a"))
                {
                   cap = !cap;
                }else
                {
                  sb.append(toUpperOrLower(cap,sp[i]));
                }
              
            }else
            {
                sb.append(sp[i]);
            }
          }
      return sb.toString();
    }

    static String toUpperOrLower(boolean cap, String str)
    {
        if(cap){
            return str.toUpperCase();
        }else{
            return str.toLowerCase();
        }
    }

    public static void main(String[] args) throws IOException {
