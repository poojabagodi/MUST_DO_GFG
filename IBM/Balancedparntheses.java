package IBM;
import java.util.*; 
public class Balancedparntheses {
      public static boolean valid(String str){
       // int n=str.length();
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                char top=s.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                    return false;
                }
            }
        }
        return s.isEmpty();
    
      }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(valid(str));
        sc.close();
      }
    }