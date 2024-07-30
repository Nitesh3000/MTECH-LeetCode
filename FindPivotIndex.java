public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int i = 1;
       
        int rightSum = 0;
        int leftSum = 0;
        int sum = 0;
        for(int num:nums){
            sum+=num;
        }
        if(sum-nums[0] == 0){
            return 0;
        }
        while(i<nums.length){
            leftSum +=nums[i-1];
            rightSum = sum -leftSum-nums[i];
            if(leftSum == rightSum){
                return i;
            }
            i++;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        FindPivotIndex find = new FindPivotIndex();
        int[] nums ={1,2,3};
        // int i = 0;
        // while(i++ != 10000000)
        System.out.println(find.pivotIndex(nums));
    }
}
