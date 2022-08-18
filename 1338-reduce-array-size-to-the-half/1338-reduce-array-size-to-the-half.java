class Solution {
    public int minSetSize(int[] arr) {
        

        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list=new ArrayList<>(map.values());
        Collections.sort(list);
        Collections.reverse(list);
        int totalEle=n;
        int count=0;
        int i=0;
        while(totalEle>n/2)
        {
            totalEle=totalEle-list.get(i);
            i++;
            count++;
        }
        return count;
        
    }
}