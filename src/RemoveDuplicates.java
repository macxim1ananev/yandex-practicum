public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] nums = {1,2,2,2,3,3,3,4,4,4,5,6,7};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for (int i = 1; i< nums.length; i++){
            if (nums[i-1] != nums[i]){
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}
