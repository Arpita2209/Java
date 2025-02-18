import java.util.*;
public class containsduplicate {
    public static boolean containsduplicate(int[] nums) {
        
        //output
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                return true;
            }
        }return false;
    }  
    //input
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        //input
        for(int i=0;i<size;i++)
        {
             nums[i]=sc.nextInt();
        }
        boolean result = containsDuplicate(nums);
        System.out.println("Contains duplicate? " + result);
        sc.close();
    } 
    
}