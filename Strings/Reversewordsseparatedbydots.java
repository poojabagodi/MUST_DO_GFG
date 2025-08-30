package Strings;

public class Reversewordsseparatedbydots{
     public String reverseWords(String s) {
        // Code here
        String arr[]=s.split("\\.");
        StringBuilder sb=new StringBuilder("");
         boolean firstWord = true;
        for (int i = arr.length - 1; i >= 0; i--) {
             if (!arr[i].isEmpty()) {
                if (!firstWord) {
                    sb.append(".");
                }
                sb.append(arr[i]);
                firstWord = false;
            }
        }
        
        return sb.toString();
        
        
    }
}