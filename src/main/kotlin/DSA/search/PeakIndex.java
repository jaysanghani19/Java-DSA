package DSA.search;

//  Question - Peak Index in a Mountain Array
//  Link - https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndex {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
