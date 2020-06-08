package problem;

import java.util.ArrayList;
import java.util.List;

public class ProblemFour {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(ProblemFour.findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<Integer>();
        int nums1Index = 0;
        int nums2Index = 0;
        while(nums1Index<nums1.length || nums2Index<nums2.length){
            if(nums1Index==nums1.length){
                //数组1已经循环完
                for(int i = nums2Index;i<nums2.length;i++){
                    resultList.add(nums2[i]);
                }
                break;
            }else if(nums2Index==nums2.length){
                //数组2已经循环完
                for(int i = nums1Index;i<nums1.length;i++){
                    resultList.add(nums1[i]);
                }
                break;
            }else{
                if(nums1[nums1Index]<=nums2[nums2Index]){
                    resultList.add(nums1[nums1Index]);
                    nums1Index++;
                }else{
                    resultList.add(nums2[nums2Index]);
                    nums2Index++;
                }
            }
        }
        double result = 0;

        if(resultList.size()%2==0){
            result = (resultList.get((resultList.size()/2)-1).doubleValue() + resultList.get(resultList.size()/2).doubleValue())/2 ;

        }else{
            result = resultList.get(resultList.size()/2).doubleValue();
        }
        return result;

    }
}
