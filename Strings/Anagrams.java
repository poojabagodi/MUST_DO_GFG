package Strings;
public class Anagrams {
 
 public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false;
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }    

}
