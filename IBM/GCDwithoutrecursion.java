package IBM;

public class GCDwithoutrecursion {
   public static int gcd(int num1,int num2){
    while(num2!=0){
        int rem=num1%num2;
        num1=num2;
        num2=rem;
    
    }
    return num1;
   } 


   public static void main(String[] args) {
    System.out.println(gcd(81,153));
   }
}
