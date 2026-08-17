import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            int x = sc.nextInt();
 
            for (int i = 1; i < n; i++) {
                sc.nextInt();
            }
 
            int y = sc.nextInt();
 
            for (int i = 1; i < m; i++) {
                sc.nextInt();
            }
 
            if (x + n >= y + m) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
 
        sc.close();
    }
}