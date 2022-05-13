class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=0){
            return intervals;
        }
        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        List<int[]> out_arr=new ArrayList<>();
        int[] curr_int=intervals[0];
        out_arr.add(curr_int);
        for(int[] interval:intervals){
            int curr_start=curr_int[0];
            int curr_end=curr_int[1];
            int next_start=interval[0];
            int next_end=interval[1];
            
            if(curr_end>=next_start){
                curr_int[1]=Math.max(curr_end,next_end);
            }
            else{
                curr_int=interval;
                out_arr.add(curr_int);
            }
        }
        return out_arr.toArray(new int[out_arr.size()][]);
        
    }
}











//[1,3],[2,6],[8,10]