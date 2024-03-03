package DSA.search;

// Problem - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1164623728/
public class FirstAndLastPosition {
    static int[] findFirstAndLastOccurrence(int[] arr,int target){
        int first = findFirstOccurrence(arr,target);
        if (first!=-1){
            int last = findLastOccurrence(arr,target);
            return new int[] {first,last};
        } else {
            return new int[] {-1,-1};
        }
    }
    static int findFirstOccurrence(int[] arr , int target){
            int start = 0, end = arr.length - 1;
            int ans = -1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] == target) {
                    ans=mid;
                    end=mid-1;
                }
            }
            return ans;
    }

    static int findLastOccurrence(int[] arr,int target){
        int start = 0, end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
}
