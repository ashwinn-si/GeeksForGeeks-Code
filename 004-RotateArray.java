/*
Given an unsorted array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
*/

//!expected : solving using O(1) space complexity
class Solution {
    static void rotateArr(int arr[], int d) {
        int arrLen = arr.length;
        d= d%arrLen;
        int temp[] = new int[d];
        int index = 0;
        for(int i = 0 ; i < d ; i++){
            temp[i] = arr[i];
        }
        for(int i = d ; i < arrLen ; i++){
            arr[index] = arr[i];
            index++;
        }
        for(int i = 0 ; i < d ; i++){
            arr[index] = temp[i];
            index++;
        }
    }
}