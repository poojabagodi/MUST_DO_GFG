package Capgemini;

public class Minimumstepstomakeanagram {
    public static int steps(String s1,String s2){
        int freq[]=new int[26];
        for(char c:s1.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:s2.toCharArray()){
            freq[c-'a']--;
        }
        int st=0;
        for(int f:freq){
            st+=Math.abs(f);
        }
        return st;
    }
}
