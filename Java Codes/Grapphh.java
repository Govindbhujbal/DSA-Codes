package learningJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Grapphh {
	private LinkedList<Integer> adj[];
	public Grapphh(int v) {
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	public int bfs(int source, int destination) {
		boolean vis[]=new boolean[adj.length];
		int parent[]=new int[adj.length];
		vis[source]=true;
		parent[source]=-1;
		Queue<Integer> q=new LinkedList<>();
		q.offer(source);
		while(!q.isEmpty()) {
			int cur=q.poll();
			if(cur==destination) break;
			for(int neighbour: adj[cur]) {
				if(!vis[neighbour]) {
					vis[neighbour]=true;
					parent[neighbour]=cur;
					q.offer(neighbour);
				}
			}
		}
		int cur=destination;
		int distance=0;
		while(parent[cur]!=-1) {
			cur=parent[cur];
			distance++;
		}
		return distance;
	}
	boolean dfs(int source, int destination) {
		boolean vis[]=new boolean[adj.length];
		vis[source]=true;
		return dfsUtil(source,destination,vis);
	}
	boolean dfsUtil(int source, int destination, boolean vis[]) {
		if(source==destination) return true;
		for(int neighbour: adj[source]) {
			if(!vis[neighbour]) {
				vis[neighbour]=true;
				boolean isConnected=dfsUtil(source,destination,vis);
				if(isConnected) return true;
			}
		}
		return false;
	}
	boolean dfsStack(int source, int destination) {
		boolean vis[]=new boolean[adj.length];
		vis[source]=true;
		Stack<Integer> stack=new Stack<>();
		stack.push(source);
		while(!stack.isEmpty()) {
			int cur=stack.pop();
			if(cur==destination) return true;
			for(int neighbour: adj[cur]) {
				if(!vis[neighbour]) {
					vis[neighbour]=true;
					stack.push(neighbour);
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		Grapphh g=new Grapphh(v);
		for(int i=0;i<e;i++) {
			int source=sc.nextInt();
			int destination=sc.nextInt();
			g.addEdge(source, destination);
		}
		
	}
}