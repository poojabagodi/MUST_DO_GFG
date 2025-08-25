package ARRAYS;

public class Missingnuminarray {
    int missingNum(int arr[]) {
        // code here
       int n=arr.length+1;
       long expectedsum=n*(n+1)/2;
       long actual=0;
       for(int num:arr){
           actual+= (long)num;
       }
       return (int)(expectedsum-actual);
    }
    public static void main(String[] args) {
        Missingnuminarray obj = new Missingnuminarray();
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println(obj.missingNum(arr));
    }
}

//optimal solution
// int missingNum(int arr[]) {
//         Set<Integer> set = new HashSet<>();
//         int max = 0;

//         // Add all elements to the set and find max
//         for (int num : arr) {
//             set.add(num);
//             if (num > max) max = num;
//         }

//         // Check from 1 to max+1 to find the missing number
//         for (int i = 1; i <= max + 1; i++) {
//             if (!set.contains(i)) {
//                 return i;  // first missing number in sequence
//             }
//         }

//         return -1; // Should never reach here
//     }