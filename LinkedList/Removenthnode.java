package LinkedList;
import java.util.*;
public class Removenthnode {
    public static void remove(int n,LinkedList<Integer> list){
        int size=list.size();
        if(n==size){
            list.remove(0);
            return;
        }
        if(n==1){
            list.remove(size-1);
            return;
        }
        list.remove(size-n);

    }
}
