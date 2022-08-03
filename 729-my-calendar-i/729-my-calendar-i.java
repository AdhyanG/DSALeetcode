class MyCalendar {
List<int[]> result;
    public MyCalendar() {
        result=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] arr:result){
            if(arr[0]<end&&arr[1]>start){
                return false;
            }
        }
      result.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */