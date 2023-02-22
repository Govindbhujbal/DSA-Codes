package learningJava;

public class MatrixProbablity {
	public static void main(String[] args) {
		
		
	}
	public static double findProbablity(int m,int n,int x,int y,int N) {
		if(!isSafe(x,y,m,n)) {
			return 0.0;
		}
		if(N==0) {
			return 1.0;
		}
		double prob=0.0;
		//top
		prob+=findProbablity(m,n,x,y+1,N-1)*0.25;
		//bottom
		prob+=findProbablity(m,n,x,y-1,N-1)*0.25;
		//left
		prob+=findProbablity(m,n,x-1,y,N-1)*0.25;
//		right
		prob+=findProbablity(m,n,x+1,y,N-1)*0.25;
		return prob;
	}
	private static boolean isSafe(int x,int y,int m,int n) {
		return (x>=0 && x<m && y>=0 && y<n);
	}
}
