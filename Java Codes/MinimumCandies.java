package learningJava;

public class MinimumCandies {
	public static void main(String[] args) {
		int[][] a=new int[10][10];
		int result=shortesPath(a,0,0,8,0);
		System.out.println(result);
	}

	    static int shortesPath(int[][] a, int i, int j, int x, int y) {
		int  rows=a.length;
		int col=a[0].length;
		 
		boolean[][] vis=new boolean[rows][col];
		return shortestPath(a,i,j,x,y);
		
	}
}
