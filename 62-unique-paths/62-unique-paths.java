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
            int N = n + m - 2;
            int r = m - 1; 
            double res = 1;
            
            for (int i = 1; i <= r; i++)
                res = res * (N - r + i) / i;
            return (int)res;
   }
}