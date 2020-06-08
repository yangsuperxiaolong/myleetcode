package problem;

import java.util.Arrays;

public class Problem_837 {
    public static void main(String[] args) {
        int N = 21, K = 17, W = 10;
        System.out.println(new21Game(N,K ,W));
    }
    public static double new21Game(int N, int K, int W) {
        //N = 21, K = 17, W = 10
        if(K==0){
            return 1;
        }
        if(K-1+W<=N)
            return 1.0;
        if(N<K)
            return 0.0;
        double[] pArray = new double[K+W];
        for(int i = K ; i <= N ;i++){
            pArray[i] = 1;
        }
        for(int i = N+1; i< K+W;i++){
            pArray[i] = 0;
        }
        double p = 0;
        for(int j = K;j<K+W;j++){
            p=p+pArray[j];
        }
        for(int i = K-1;i>=0;i--){
            //i  = 16  17 + 26
            pArray[i] = p/W;
            //if(i>0) {
                p = p + pArray[i] - pArray[i+W-1];
            //}
        }
        System.out.println(Arrays.toString(pArray));

        return pArray[0];
        //N = 21, K = 17, W = 10
//        if(K==0){
//            return 1;
//        }
//        if(K-1+W<=N)
//            return 1.0;
//        if(N<K)
//            return 0.0;
//        double[] pArray = new double[K+W];
//        for(int i = K ; i <= N ;i++){
//            pArray[i] = 1;
//        }
//        for(int i = N+1; i< K+W;i++){
//            pArray[i] = 0;
//        }
//        for(int i = K-1;i>=0;i--){
//            double p = 0;
//            for(int j = i+1;j<=i+W;j++){
//                p=p+pArray[j];
//            }
//            pArray[i] = p/W;
//        }
//        System.out.println(Arrays.toString(pArray));
//        return pArray[0];
    }
}
