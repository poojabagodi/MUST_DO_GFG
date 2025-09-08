package IBM;

public class MoveHashesToFront {
     public static String moveHashes(String str) {
        int hashCount = 0;
        StringBuilder sb = new StringBuilder();

        // Count all '#'
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                hashCount++;
            } else {
                sb.append(str.charAt(i)); // store non-hash characters
            }
        }

        // Add all '#' at the beginning
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hashCount; i++) {
            result.append('#');
        }

        result.append(sb); // append remaining characters
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Move#Hash#to#Front";
        System.out.println(moveHashes(input));
    }
}
