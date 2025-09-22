package Strings;

public class MinInsertionsPalindrome {
    public  int min(String s,int i,int j){
        if(i>=j) return 0;
        if(s.charAt(i)==s.charAt(j)){
           return  min(s,i+1,j-1);
        }
        else{
            return 1+Math.min(min(s,i+1,j),min(s,i,j-1));
        }
    }
}
