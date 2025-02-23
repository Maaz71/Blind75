package Sequences;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] solution( int[]nums, int target) throws NullPointerException
    {
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int diff= target-nums[i];
            if(map.containsKey(diff))
            {
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        int[] nums= new int[size];
        System.out.println("Enter the Elements im the array");
        for(int i=0;i<size;i++)
        {
          nums[i]=  sc.nextInt();
        }
        System.out.println("Enter Target");
        int target= sc.nextInt();
        System.out.println(Arrays.toString(nums));
        int[]result =solution(nums,target);
        System.out.println(Arrays.toString(result));


    }
}
