package Strings;

public class Removeduplicates {
    // User function Template for Java


    String removeDups(String s) {
        // code here
        boolean seen[] = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!seen[ch - 'a']) {
                sb.append(ch);
                seen[ch - 'a'] = true;
            }
        }
        return sb.toString();
        
    }
}

