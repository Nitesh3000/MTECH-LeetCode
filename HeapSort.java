import java.util.Random;

public class HeapSort {
    public static int[] sortArray(int[] nums) {
        int endIndex = nums.length;

        // Build a max heap
        for (int i = endIndex / 2 - 1; i >= 0; i--) {
            heapify(nums, endIndex, i);
        }

        // Extract elements from the heap one by one
        while (endIndex > 1) {
            int temp = nums[0];
            nums[0] = nums[endIndex - 1];
            nums[endIndex - 1] = temp;

            --endIndex;
            heapify(nums, endIndex, 0);
        }

        return nums;
    }

    public static void heapify(int[] nums, int endIndex, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < endIndex && nums[left] > nums[largest]) {
            largest = left;
        }

        if (right < endIndex && nums[right] > nums[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = nums[i];
            nums[i] = nums[largest];
            nums[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(nums, endIndex, largest);
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[5000];
        for(int i = 0;i<nums.length;i++){
            nums[i] = rand.nextInt(100);
        }
        nums = sortArray(nums);
        // int i = 0;
        for(int num:nums){
            System.out.print(num+ " ");
            // if(i == 50)
                // System.out.println();
        }
    }
}
