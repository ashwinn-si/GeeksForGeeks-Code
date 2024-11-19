/* 
Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in place.
*/

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int pointer1 = 0;
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {
            if (arr[i] != 0) {
                arr[pointer1] = arr[i];
                pointer1++;
            }
        }
        while (pointer1 < arrLen) {
            arr[pointer1] = 0;
            pointer1++;
        }
    }
}