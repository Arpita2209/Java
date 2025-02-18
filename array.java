import java.util.Scanner;

public class array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums=new int[size];

        //input
        for(int i=0;i<nums.length;i++)
        {
            nums[i]= sc.nextInt();
            
        }
        //output
        int x = sc.nextInt();
        for(int i=0;i<nums.length;i++)
        {
            if(x == nums[i])
            {
                System.out.print("x is found at" + i);
            }
        }
        sc.close();

    }
    
}
