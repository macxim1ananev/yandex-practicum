import java.util.Arrays;

public class FindInsertIndex {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        System.out.println(searchInsert(nums, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        return arr2(nums, 0, target);
    }

    private static int arr2(int[] nums, int index, int target) {
        int current = nums.length / 2;
        if (nums[current] == target) {
            return index + current;
        }
        if (nums.length == 1) {
            if (nums[current] < target) {
                return index + current + 1;
            } else {
                return index + current;
            }
        }

        if (nums[current] < target) {
            index += current;
            return arr2(Arrays.copyOfRange(nums, current, nums.length), index, target);
        } else {
            return arr2(Arrays.copyOfRange(nums, 0, current), index, target);
        }
    }
}
