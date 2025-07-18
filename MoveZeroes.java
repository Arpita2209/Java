public class MoveZeroes {
    public static void movezeroes(int[] nums){
        int lastNonZeroIndex = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0){
                nums[lastNonZeroIndex]=nums[i];
                lastNonZeroIndex++;
            }
        }
        for(int i=lastNonZeroIndex; i<nums.length;i++){
            nums[i]=0;
        }


    }
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        movezeroes(nums);
        for(int num :nums){
            System.out.println(num+" ");
        }
    }
}
