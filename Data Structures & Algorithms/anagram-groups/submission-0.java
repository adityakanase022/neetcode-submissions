class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
    
         
        Map<String, List<String> > mapping = new HashMap<>();

        for(String s: strs){
         int[] arr = new int[26];

          for(char c: s.toCharArray()){
            arr[c - 'a']++;
          }
         //stored the array in the string inside key
         String key  = Arrays.toString(arr);

         //key must be unique and create list for each key 
          mapping.putIfAbsent(key ,new ArrayList<>());

          //find the value  and 
          mapping.get(key).add(s);
      }
  
    return new ArrayList<>(mapping.values());

    }
}
