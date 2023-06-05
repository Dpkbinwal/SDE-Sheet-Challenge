import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				long [][]dp=new long[n][n];
				for(int i=0;i<n;i++) dp[i][0]=(long)1;
				ArrayList<ArrayList<Long>> ans=new ArrayList<>();
				ArrayList<Long> temp=new ArrayList<>();
				temp.add((long)1);
				ans.add(new ArrayList<>(temp));

				 for(int i=1;i<n;i++){
					 ArrayList<Long> list=new ArrayList<>();
					 list.add((long)1);
					 for(int j=1;j<=i;j++){
						 dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
						 list.add((long)dp[i][j]);
					 }
					 ans.add(new ArrayList<>(list));
				 }
			return ans;
	}
}

