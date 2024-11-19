/* 
    You are given an array of integers arr[]. Your task is to reverse the given array.
*/
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int leftPointer = 0;
        int rightPointer = arr.length -1 ;
        while(leftPointer < rightPointer){
            int temp = arr[leftPointer];
            arr[leftPointer] = arr[rightPointer];
            arr[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
    }
}