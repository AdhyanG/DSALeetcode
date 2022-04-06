// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> res=new ArrayList<>();
        int rowstart=0;
        int rowend=matrix.length-1;
        int colstart=0;
        int colend =matrix[0].length-1;
        int size=r*c;
       
        while(res.size()<size){
            for(int i=colstart;i<=colend && res.size()<size;i++){
                res.add(matrix[rowstart][i]);
            }
            rowstart++;
            for(int i=rowstart;i<=rowend&&res.size()<size;i++){
                res.add(matrix[i][colend]);
            }
            colend--;
            for(int i=colend;i>=colstart&&res.size()<size;i--){
                res.add(matrix[rowend][i]);
            }
            rowend--;
            
            for(int i=rowend;i>=rowstart&&res.size()<size;i--){
                res.add(matrix[i][colstart]);
            }
            colstart++;
        }
return res;
    }
}
