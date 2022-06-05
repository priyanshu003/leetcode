class Solution {

    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                List<Integer> temp = map.get(nums[i]);
                temp.add(i);
                map.put(nums[i], temp);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(nums[i], temp);
            }
        }
        for (int i = 0; i < operations.length; i++) {
            int val = operations[i][0];
            int rep = operations[i][1];
            List<Integer> idx = map.get(val);
            map.put(val, new ArrayList<Integer>());
            for (int k = 0; k < idx.size(); k++) {
                nums[idx.get(k)] = rep;
                if (map.containsKey(rep)) {
                    List<Integer> temp = map.get(rep);
                    temp.add(idx.get(k));
                    map.put(rep, temp);
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(idx.get(k));
                    map.put(rep, temp);
                }
            }
        }

        return nums;
    }
}
