package learningJava;
import java.util.PriorityQueue;
public class ConnectNRopesWithMinCost{
	public static void main(String[] args) {

	}
	static int minCost(int[]a) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for (int i = 0; i < a.length; i++) {
			pq.add(a[i]);
		}
		int ans=0;
		while(pq.size()>1) {
			int f=pq.poll();
			int s=pq.poll();
			int sum=f+s;
			ans+=sum;
			pq.offer(ans);
		}
		return ans;
	}
}
