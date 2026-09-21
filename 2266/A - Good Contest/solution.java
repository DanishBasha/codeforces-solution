import java.util.*;
public class Main{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		while(testCase-->0){
			int n = scan.nextInt();
			int a1 = scan.nextInt();
			int a2 = scan.nextInt();
			int a3 = scan.nextInt();
			int min = Math.min(a1,Math.min(a2,a3));
			System.out.println(n-min);
		}
	}
}