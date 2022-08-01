class Solution {
   public int uniquePaths(int m, int n) {
//         int i=0,j=0;
//         int answer=sumUniquePaths(i,j,m,n);
//         return answer;
//     }
    
//     private int sumUniquePaths(int i,int j,int m,int n){
//           if(i==(m-1)&&j==(n-1))return 1;
//            if(i>=m||j>=n)return 0;
       
//         else{
//             return sumUniquePaths(i+1,j,m,n)+ sumUniquePaths(i,j+1,m,n);
//         }
//     }
    //simply compute ncr in this question to get combination
    int R=m+n-2;
       int v=m-1;
   double result=1;
       for(int i=1;i<=v;i++){
           result=result*(R-v+i)/i;
       }
       return (int)result;
   }
}