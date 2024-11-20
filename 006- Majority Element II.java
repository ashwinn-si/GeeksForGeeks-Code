/*
You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 
*/
import java.util.*;
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        ArrayList<Integer> res = new ArrayList<>();
        int size = nums.length;
        TreeMap<Integer,Integer> hash = new TreeMap<>();
        for(int i : nums){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        for(int i : hash.keySet()){
            if(hash.get(i) > (int)size/3){
                res.add(i);
            }
        }
        return res;
    }
}