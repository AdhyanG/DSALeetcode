class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> output_arr=new ArrayList<>();
        int[] curr_inter=intervals[0];
        output_arr.add(curr_inter);
        for(int[] interval:intervals){
            int curr_begins=curr_inter[0];
            int curr_end=curr_inter[1];
            int next_begin=interval[0];
            int next_end=interval[1];
            if(curr_end>=next_begin){
                curr_inter[1]=Math.max(curr_end,next_end);
            }
            else{
                curr_inter=interval;
                output_arr.add(curr_inter);
            }
        }
        return output_arr.toArray(new int[output_arr.size()][]);
    }
}