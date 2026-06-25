class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> hashset = new HashSet<>();

       for(int i: nums){
        hashset.add(i);
       }

       if(hashset.size() != nums.length)
       {
        return true;
       }
       else {
        return false;
       }

    }
}