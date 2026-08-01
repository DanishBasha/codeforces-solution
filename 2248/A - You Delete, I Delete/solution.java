import java.util.*;
 
public class Main {
 
    static void solve(Scanner sc) {
        String s = sc.nextLine();
        int firstZero = s.indexOf('0');
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i != firstZero)
            sb.append(s.charAt(i));
        }
    int firstOne = sb.indexOf("1");
    sb.deleteCharAt(firstOne);
 
    System.out.println(sb.toString());
}
 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int t = Integer.parseInt(sc.nextLine());
 
    while (t-- > 0) {
        solve(sc);
    }
}
}