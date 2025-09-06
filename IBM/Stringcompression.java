package IBM;
import java.util.*;
public class Stringcompression {
    public static String compress(String s){
        StringBuilder sb=new StringBuilder();
          int count=1;
          
          for(int i=0;i<s.length();i++){
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                 count++;
            }
            else{
                sb.append(s.charAt(i));
                if(count>1){
                    sb.append(count);
                    count=1;
                }
            }
          }
          return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(compress(s));
        sc.close();
    }
}
