class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
     Map<String,List<String>> map = new HashMap<>();

     for(String s : strs){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String temp = new String(ch);

        if(map.containsKey(temp)){
          map.get(temp).add(s);
        }
        else{

            List<String> li = new ArrayList<>();
            li.add(s);
            map.put(temp,li );
          
 
        }
     }

     return new ArrayList<>(map.values());
    }
}
