class Solution {
  public static void merge(int[] nums1, int m, int[] nums2, int n) {

    int temp = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m + n; j++) {
        if (nums1[j] == 0) {
          nums1[j] = nums2[i];
          break;
        }
      }
      Arrays.sort(nums1);
    }
  }
}