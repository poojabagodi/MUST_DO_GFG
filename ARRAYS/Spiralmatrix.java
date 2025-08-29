package ARRAYS;

import java.util.ArrayList;

public class Spiralmatrix {
      public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int startrow=0,startcol=0;
        int endrow=mat.length-1;
        int endcol=mat[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int j=startcol;j<=endcol;j++){
                ans.add(mat[startrow][j]);
            }
            
            //right
            for(int i=startrow+1;i<=endrow;i++){
                ans.add(mat[i][endcol]);
            }
            
            //bottom
             if (startrow < endrow) {
                for (int j = endcol - 1; j >= startcol; j--) {
                    ans.add(mat[endrow][j]);
                }
            }
            
            
            //left
            if (startcol < endcol) {
                for (int i = endrow - 1; i > startrow; i--) {
                    ans.add(mat[i][startcol]);
                }
            }
            
            
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return ans;
    }    
}
