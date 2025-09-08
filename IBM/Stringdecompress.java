package IBM;

public class Stringdecompress {
    public static String decompress(String str) {
        int arr[] = new int[26];   // frequency array for a-z
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            // collect full number (handles multi-digit counts)
            StringBuilder numStr = new StringBuilder();
            i++;
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                numStr.append(str.charAt(i));
                i++;
            }
            i--; // adjust because for loop will also increment

            int num = Integer.parseInt(numStr.toString());

            arr[ch - 'a'] += num; // accumulate count
        }

        // build output string
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                s.append((char) ('a' + i)); // convert index back to char
                arr[i]--;
            }
        }

        return s.toString();
    }

    public static void main(String[] args) {
        String str = "a3b5a6S5";
        System.out.println(decompress(str));  // aaa aaaaa aaaaaa sssss
    }
}
