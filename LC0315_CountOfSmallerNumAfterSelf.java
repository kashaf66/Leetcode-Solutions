import java.util.ArrayList;
import java.util.List;

public class LC0315_CountOfSmallerNumAfterSelf {
    class Solution {
     class Pair {
        int val;
        int index;

        Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    int[] ans;
    public List<Integer> countSmaller(int[] nums) {
       int n = nums.length;
        ans = new int[n];
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }
        mergeSort(arr, 0, n - 1);
        List<Integer> result = new ArrayList<>();
        for (int x : ans) {
            result.add(x);
        }
        return result;
    }

    private void mergeSort(Pair[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(Pair[] arr, int low, int mid, int high) {

        Pair[] temp = new Pair[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        int rightCount = 0;
        while (i <= mid && j <= high) {

            if (arr[j].val < arr[i].val) {
                rightCount++;
                temp[k++] = arr[j++];
            } else {
                ans[arr[i].index] += rightCount;
                temp[k++] = arr[i++];
            }
        }
        while (i <= mid) {
            ans[arr[i].index] += rightCount;
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        for (int x = low; x <= high; x++) {
            arr[x] = temp[x - low];
        }
    }
}
}
