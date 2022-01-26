package lab1;
import java.util.Arrays;
public class Pain {
	//static Rect[] fig = new Rect[5];
	
	public int findTones(int m) {
		return m/1000;
	}
	
	public boolean isOdd(int m) {
		if (m%2==0) return false;
		else return true;
	}
	
	public int plusMinus (int m) {
		if (m>0) return m+1;
		else return m-2;
	}
	
	public String Grade (int m) {
	String evaluation;
		switch(m) {
			case 1:
				evaluation="The lowest grade";
				break;
			case 2:
				evaluation="Unsatisfactory";
				break;
			case 3:
				evaluation="Satisfactory";
				break;
			case 4:
				evaluation="Good";
				break;
			case 5:
				evaluation="Excellent";
				break;
			default:
				evaluation="Mistake";	
		}
		return evaluation;
	}
	
	public int[] loop (int a, int b) {
		int c,arr[]=new int[5],j=0;
		if (a>b)
		{
			c=a;
			a=b;
			b=c;
		}
		for (int i=a;i<=b;i++)
		{
			arr[j]=i;
			j++;
		}
		//System.out.println("\nThere are " + (b-a+1) + " numbers");
		return arr;
	}
	
	public int intervalCount(int a,int b)
	{
		int c,i=0,count=-1;
		if (a>b)
		{
			c=a;
			a=b;
			b=c;
		}
		while(i<=b)
		{
			count++;
			i+=a;
		}
		return count;
		
	}
	
	public int square() {
		int min=1,sq;
		int rect[][]= {{1,4},{5,6},{3,2},{8,2}};
		for (int i=0;i<4;i++)
		{
			sq=rect[i][0]*rect[i][1];
			if (i==0)
			{
				min=sq;
			}
			else{
				if (min>sq) min=sq;
			}
		}
		return min;
	}
			
	public int[] array(int n){
		int res[]=new int[n],d=2;
		res[0]=2;
		for (int i=1;i<n;i++) {
			res[i]=res[i-1]*2;
		}
		return res;
	}
	
	public int[][] matrix(int m,int n){
		int matr[][]=new int[m][n];
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				matr[i][j]=5*j;
			}
		}
		return matr;
	}
	

}
