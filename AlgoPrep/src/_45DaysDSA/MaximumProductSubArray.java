package _45DaysDSA;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int arr[] = {0,2};
        System.out.println(maximumProductSubArray(arr));
    }

    public static int maximumProductSubArray(int arr[]) {
        int maxSoFar = arr[0];
        if(arr.length>0){
            int iMax = maxSoFar, iMin = maxSoFar;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]<0)
                {
                    int temp = iMax;
                    iMax = iMin;
                    iMin = temp;
                }
                iMax = Math.max(arr[i],arr[i]*iMax);
                iMin = Math.min(arr[i],arr[i]*iMin);
                maxSoFar = Math.max(iMax,maxSoFar);
            }
            return maxSoFar;
        }else return 0;
    }

}
