class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] topKFrequent = new int[k];
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int numero = nums[i];
            if(!freq.containsKey(numero)){
                freq.put(numero, 1);
            } else {
                freq.put(numero, freq.get(numero) + 1);
            }

        }  

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: freq.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        for(int i = 0; i < k; i++){
            topKFrequent[i] = arr.get(i)[1];
        }
        
        
        return topKFrequent;
    }
}
