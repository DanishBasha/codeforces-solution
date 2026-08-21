import java.util.*;
public class Main{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		while(testCase--> 0){
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		for (int idx = 0;idx<N;idx++){
			a.add(scan.nextInt());
		}
		for(int idx = 0;idx<M;idx++){
			b.add(scan.nextInt());
		}
		if (N < 2*M){
			 System.out.println("No");
			 continue;
			 }
		Collections.sort(a);
		Collections.sort(b);
		int flag = 0;
		for (int idx = 0;idx<M;idx++){
			if(b.get(M-idx-1) > a.get(N-idx-1)){
				System.out.println("No");
				flag = 1;
				break;
			}
		}
		if (flag == 1) continue;
		for (int idx = 0;idx<M;idx++){
			if(b.get(idx) < a.get(idx)){
				System.out.println("No");
				flag = 1;
				break;
			}
		}
		if (flag == 1) continue;
	System.out.println("Yes");
	}
	
 }
}