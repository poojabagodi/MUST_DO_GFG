package ARRAYS;

public class Lastindexofone {
    
    public int lastIndex(String s) {
        
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            
            if(c=='1'){
                return i;
            }
        }
        return -1;
    }
}
