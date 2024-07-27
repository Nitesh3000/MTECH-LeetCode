public class UniqueTripletsInArray {
    public int unequalTriplets(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length-2;i++){
            
            for(int j = i+1;j<nums.length-1;j++){
                if(nums[j] != nums[i]){
                    for(int k = j+1;k<nums.length;k++){
                        if(nums[j]!=nums[k] && nums[i]!=nums[k]){
                            count++;
                            
                        }
                    }
                  
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,1,2,4};
        UniqueTripletsInArray triple = new UniqueTripletsInArray();
        System.out.println(triple.unequalTriplets(nums));
    }
}
