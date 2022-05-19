class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        boolean used[] = new boolean[nums.length];
        List<List<Integer>> per = new ArrayList<>();
        generatePer(nums, new ArrayList<Integer>(), per, used);
        return per;
    }

    public void generatePer(int nums[], ArrayList<Integer> cur, List<List<Integer>> per, boolean used[]) {
        if (cur.size() == nums.length) {
            per.add(new ArrayList<Integer>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue; else {
                used[i] = true;
                cur.add(nums[i]);
                generatePer(nums, cur, per, used);
                used[i] = false;
                cur.remove(cur.size() - 1);
            }
        }
    }
}
