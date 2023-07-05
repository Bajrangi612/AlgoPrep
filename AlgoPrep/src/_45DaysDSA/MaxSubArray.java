package _45DaysDSA;

public class MaxSubArray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int arr[])
    {
        int maxSoFar = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>maxSoFar)
                maxSoFar = sum;
            if(sum<0)
                sum=0;
        }
        return maxSoFar;
    }
}
