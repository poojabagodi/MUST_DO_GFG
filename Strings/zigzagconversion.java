package Strings;

public class zigzagconversion {
    class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows) return s;
        StringBuilder rows[]=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
              rows[i]=new StringBuilder();
        }
        int currrow=0;
        boolean goingdown=false;
        for(char c:s.toCharArray()){
            rows[currrow].append(c);
            if(currrow==0 || currrow== numRows-1 ){
                goingdown = !goingdown;
            }

            currrow+=goingdown?1 : -1;
        }
           StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
}
