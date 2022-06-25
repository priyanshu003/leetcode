class Solution {
    
    public int BFS(int s, boolean visited[],ArrayList<ArrayList<Integer>> adj){
        LinkedList<Integer> queue=new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        int count=1;
        while(queue.size()>0){
            s=queue.poll();
            for(Integer n : adj.get(s)){
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                    count++;
                }
            }
        }
        return count;
    }
    
    public long countPairs(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int [] edge: edges){
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        boolean visited[]=new boolean[n];
        ArrayList<Long> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                int ans=BFS(i,visited,list);
                result.add((long)ans);
                System.out.println(ans);
            }
        }
        long output=0;
        long arr[]=new long[result.size()];
        long sum=result.get(result.size()-1);
        for(int i=arr.length-2;i>=0;i--){
            arr[i]=sum;
            sum=sum+result.get(i);
        }
        for(int i=0;i<result.size()-1;i++){
            
                output=output+(long)(result.get(i)*arr[i]);
            
        }
        return output;
    }
}