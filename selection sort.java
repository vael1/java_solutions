public static void selectionSort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        // min is the index of the smallest element with an index greater or equal to i
        int min = i;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] < nums[min]) {
                min = j;
            }
        }
        // Swapping i-th and min-th elements
        int swap = nums[i];
        nums[i] = nums[min];
        nums[min] = swap;
    }
}