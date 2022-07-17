class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            String[] input = Arrays.copyOf(nums, nums.length);
            result[i] = getResult(input, queries[i]);
        }
        return result;
    }
    
    public int getResult(String[] input, int[] query) {
        int size = query[0];
        int digit = query[1];
        int n = input.length;
        String[] info = new String[n];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2)->(info[o1].equals(info[o2]) ? (o2 - o1) : (info[o2].compareTo(info[o1]))));
        for(int i = 0; i < n; i++) {
            String s = input[i];
            info[i] = s.substring(s.length() - digit);
            maxHeap.offer(i);
            if(maxHeap.size() > size) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}