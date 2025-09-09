package Backtracking;

public class FindPermutations {
    public static void findpermutations(String str,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            findpermutations(newstr, perm+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findpermutations(str, "");
    }
}
