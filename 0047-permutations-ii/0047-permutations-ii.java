class Solution {

    public void recuPermut(int[] nums, List<Integer> ds,
                           List<List<Integer>> ans, boolean fre[]) {

        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i < nums.length; i++) {

            if(fre[i]) {
                continue;
            }

            if(i > 0 && nums[i] == nums[i-1] && !fre[i-1]) {
                continue;
            }

            fre[i] = true;
            ds.add(nums[i]);

            recuPermut(nums, ds, ans, fre);

            ds.remove(ds.size() - 1);
            fre[i] = false;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        boolean fre[] = new boolean[nums.length];

        recuPermut(nums, ds, ans, fre);

        return ans;
    }
}