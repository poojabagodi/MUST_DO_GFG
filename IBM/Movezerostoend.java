package IBM;

public class Movezerostoend {
    public static void movezero(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<arr.length){
            arr[count]=0;
            count++;
        }
    }

    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        movezero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
