package Backtracking;

public class Findsubsets {
    public static void findsubsets(String str,int idx,String curr){
        if(idx==str.length()){
            if(curr.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(curr);
            }
            return;
        }
        findsubsets(str, idx+1, curr);
        findsubsets(str, idx+1, curr+str.charAt(idx));
    }

    public static void main(String[] args) {
        String str="abc";
        findsubsets(str, 0, "");
    }
}
