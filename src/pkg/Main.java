package pkg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public int solution(int n, int m) {
		 int answer=0;
		 
		 Queue<Integer> Q = new LinkedList<>();
		 
		 for(int i=1; i<=n; i++) Q.offer(i);
		 
		 while(!Q.isEmpty()) {
			 for(int i=1; i<m; i++) Q.offer(Q.poll());
			 Q.poll();
			 if(Q.size()==1) answer = Q.poll();
		 }
		 
		 return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(T.solution(n,m));
	}

}
