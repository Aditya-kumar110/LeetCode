class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            maxFreq = Math.max(maxFreq, count);
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < maxFreq; i++) {
            result.add(new ArrayList<>());
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            
            for (int i = 0; i < freq; i++) {
                result.get(i).add(num);
            }
        }
        
        return result;
    }
}