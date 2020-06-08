package problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ProblemEightyNine {
    public static void main(String[] args) {
        //int[] heights = new int[]{2,1,5,6,2,3};
        int[] heights = new int[]{1,3,2,5};
       // int[] heights = new int[]{4,2};
        int min = largestRectangleArea(heights);
        System.out.println(min);
    }

    public static int largestRectangleArea(int[] heights) {
        if(heights.length==0){
            return 0;
        }
        int minheight = heights[0];
        for(int i = 0 ;i<heights.length;i++) {
            if(heights[i]<minheight){
                minheight = heights[i];
            }
        }
        int maxArea = minheight * heights.length;
        for(int i = 0 ;i<heights.length;i++){
            if(maxArea<heights[i]){
                maxArea = heights[i];
            }
            int right = i +1;
            for(;right<heights.length;right++){
                if(heights[right]<heights[i]){
                    break;
                }
            }
            if(maxArea<heights[i]*(right-i)){
                maxArea=heights[i]*(right-i);
            }

        }

        
        return maxArea;
    }
}