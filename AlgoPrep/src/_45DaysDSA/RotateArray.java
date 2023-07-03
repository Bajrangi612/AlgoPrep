package _45DaysDSA;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println("Before rotation");
        for (int ele : arr) {
            System.out.print(ele +" ");
        }
        System.out.println();
        System.out.println("After rotation");
       rotateArray1(arr,k);
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
    public static void rotateArray(int [] arr, int k)
    {
//      todo:   to avoid the unwanted rotation.
    k %= arr.length;
//        todo: reverse whole array.
    reverse(arr,0,arr.length-1);
//    todo: reverse the array from 0 to k-1.
    reverse(arr,0,k-1);
//    todo: reverse the array from k to length - 1.
    reverse(arr, k, arr.length-1);

    }
    public static void reverse(int arr[], int from, int to)
    {
        while(from < to)
        {
            int temp = arr[from];
            arr[from] = arr[to];
            arr[to] = temp;
            from++; to--;
        }
    }

     public static void rotateArray1(int []nums, int k) {
         int n = nums.length;
         int[] temp = new int[n];
         for (int i = 0; i < n; i++) {
             temp[(i + k) % n] = nums[i];
         }
         System.arraycopy(temp, 0, nums, 0, n);


            
     }
}
