package Capgemini;

public class Stringcompression {
    public static String compress(String s){
        StringBuilder sb=new StringBuilder("");
        int count=1;
        for(int i=1;i<s.length();i++){
          if(i<s.length() && s.charAt(i)==s.charAt(i-1) ){
            i++;
          }
          else{
            sb.append(s.charAt(i-1));
            if(count>1 ) {
                sb.append(count);
                
            }
            count=1;
          }
        }
        return sb.length()<s.length()?sb.toString():s;
    }
}
