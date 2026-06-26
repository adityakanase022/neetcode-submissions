class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        Map<Integer,Integer> index = new HashMap<>();
        
        for(int i=0;i< nums.length; i++){
            index.put(nums[i],i);
        }

   

        for(int i=0; i<nums.length;i++){
            int diff = target-nums[i];
            if(index.containsKey(diff) && index.get(diff) != i){
                arr[0] = i;
                arr[1] = index.get(diff);
                return arr;
            }
        }

        return arr;
     
    }
}
