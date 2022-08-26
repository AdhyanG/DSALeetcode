class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)return intervals;
        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        
        List<int[]> result=new ArrayList<>();
        int[] out_arr=intervals[0];
        result.add(out_arr);
        for(int[] interval:intervals)
            
        {
            int curr_start=out_arr[0];
            int curr_end=out_arr[1];
            int next_start=interval[0];
            int next_end=interval[1];
            
            if(curr_end>=next_start)
            {
                out_arr[1]=Math.max(curr_end,next_end);
            }
            else{
                out_arr=interval;
                result.add(out_arr);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}