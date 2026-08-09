import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
 
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
 
            int current = 0;
            int longest = 0;
 
            for (int i = 0; i < n; i++) {
 
                if (s.charAt(i) == '#') {
                    current++;
                    longest = Math.max(longest, current);
                } else {
                    current = 0;
                }
            }
 
            int answer = (longest + 1) / 2;
 
            System.out.println(answer);
        }
    }
}