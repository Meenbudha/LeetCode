class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        // MergeSort(nums, 0, n-1);
        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }
    private void MergeSort(int[] nums, int left, int right){
        if(left >= right) return;

        int mid = left + (right - left)/2;

        MergeSort(nums, left, mid);
        MergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = nums[left + i];
        }

        for(int j = 0; j < n2; j++){
            R[j] = nums[mid + j + 1];
        }

        int i = 0, j = 0, k = left;

        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                nums[k++] = L[i++];
            } else {
                nums[k++] = R[j++];
            }
        }
        while(i < n1){
            nums[k++] = L[i++];
        }

        while(j < n2){
            nums[k++] = R[j++];
        }
    }
}