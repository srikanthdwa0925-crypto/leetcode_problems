class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer>map= new HashMap<>();
        int count = 0;
        for (int X: nums)
        {
            int need = k - X;
            if (map.containsKey(need) && map.get(need)>0){
                count++;
                map.put(need,map.get(need) - 1);
            }
                else{
                    map.put(X,map.getOrDefault(X, 0)+1);
                }
        }
        return count;
    }
}

 