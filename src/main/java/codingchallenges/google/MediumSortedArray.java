package codingchallenges.google;

//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//You may assume nums1 and nums2 cannot be both empty.

// Considerations: Can either of the array's be null?

public class MediumSortedArray {

    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 7, 11, 13};
        int[] array2 = {4, 6, 8, 9, 10, 12};
        System.out.println(findMedianSortedArrays(array1, array2));
    }

    public static double findMedian(int[] array1, int[] array2) {
        int m = array1.length;
        int n = array2.length;
        int sum = m + n / 2;
        if (sum % 2 == 0) {
            return findKth(array1, 0, array2, 0, sum / 2 + 1) / 2.0;
        }

        return 0.0;
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int sum = m + n;
        if (sum % 2 == 0) {
            return (findKth(nums1, 0, nums2, 0, sum / 2) + findKth(nums1, 0, nums2, 0, sum / 2 + 1)) / 2.0;
        } else {
            return findKth(nums1, 0, nums2, 0, sum / 2 + 1) * 1.0;
        }
    }

    private static int findKth(int[] a, int startA, int[] b, int startB, int k) {
        if (startA >= a.length) {
            return b[startB + k - 1];
        }
        if (startB >= b.length) {
            return a[startA + k - 1];
        }
        if (k == 1) {
            return Math.min(a[startA], b[startB]);
        }
        // start to throw away k/2 length array in either a or b
        int midA = (startA + k / 2 - 1 >= a.length) ? Integer.MAX_VALUE : a[startA + k / 2 - 1];
        int midB = (startB + k / 2 - 1 >= b.length) ? Integer.MAX_VALUE : b[startB + k / 2 - 1];
        if (midA > midB) {
            return findKth(a, startA, b, startB + k / 2, k - k / 2);
        } else {
            return findKth(a, startA + k / 2, b, startB, k - k / 2);
        }
    }

}
