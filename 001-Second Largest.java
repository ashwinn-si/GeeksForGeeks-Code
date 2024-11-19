/*
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.
*/

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int firstLargest = arr[0];
        int secondLargest = -1;
        for(int i : arr){
            if(i > firstLargest){
                secondLargest = firstLargest;
                firstLargest = i;
            }else if(i > secondLargest && i != firstLargest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}