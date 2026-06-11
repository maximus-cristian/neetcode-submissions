class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            if(freq.containsKey(num)){
                freq.put(num, freq.get(num)+1);
            } else{
                freq.put(num, 1);
            }
        }

        List<Integer> list = new ArrayList<>(freq.keySet());

        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return freq.get(b) - freq.get(a);
            }
        });

        int[] result = new int[k];
        for(int i = 0; i<k ; i++){
            result[i] = list.get(i);
        }
        return result;

    }
}
