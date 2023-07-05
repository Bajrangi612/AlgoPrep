package _45DaysDSA;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_II {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,0,1,99};
        System.out.println( findSingleNumber(arr));
    }
    public static  int findSingleNumber(int arr[])
    {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0;i<arr.length;i++)
        {
            if(hs.get(arr[i])== null)
            hs.put(arr[i],1);
            else{
                int val =hs.get(arr[i]);
                hs.put(arr[i],val+=1);
            }
        }
        for (Map.Entry<Integer, Integer> entry :hs.entrySet()) {
            if(entry.getValue()==1)
                return entry.getKey();
        }
//        System.out.println(hs);
        return 0;
    }
}
