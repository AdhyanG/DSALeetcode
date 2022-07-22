class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length==0){
            return "";
        }
        String[] strArr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strArr[i]=Integer.toString(nums[i]);
        }
        Comparator<String> comp=new Comparator<String>(){
            @Override
            public int compare(String a,String b){
                String s1=a+b;
                String s2=b+a;
                return s2.compareTo(s1);  //because we want in reverse order
            }
        };
        Arrays.sort(strArr,comp);
        
        //edge case
        if(strArr[0].equals("0")) return "0";
        
        StringBuilder sb=new StringBuilder();
        for(String s:strArr){
            sb.append(s);
        }
        return sb.toString();
        
    }
}