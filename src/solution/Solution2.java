package solution;

import java.util.Scanner;

public class Solution2 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //two pointer
        //nums1.length = n  +  1
        //index i = m - 1;
        //index j = n - 1;
        int index = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[index--] = nums2[j--];
            } else {
                nums1[index--] = nums1[i--];
            }
        }
        while (j >= 0) {
            nums1[index--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

    }
}
