// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
            


int r, i;
   for(i=0; i<n; i++){
   int q = a[i], sum = 0;
   while(q != 0)
   {
       r = q%10;
       sum = sum*10 + r;
       q = q/10;
   }
   if(sum != a[i])
   return 0;
  }
   return 1;      //add code here.
           }
}