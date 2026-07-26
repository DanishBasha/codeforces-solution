import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int testcase=scanner.nextInt();
        while(testcase-->0){
            int N=scanner.nextInt();
            int[] weights=new int[N];
            for(int i=0;i<N;i++){
                weights[i]=scanner.nextInt();
            }
        if(N%2 == 1){
            System.out.println("No");
            continue;
        }
    int minOdd=Integer.MAX_VALUE;
    int maxEven=Integer.MIN_VALUE;
    for(int i=0;i<N;i++){
        if((i+1)%2 == 1){
            minOdd=Math.min(minOdd,weights[i]);
        }else{
        maxEven=Math.max(maxEven,weights[i]);
    }
}
if(minOdd-maxEven >= 2){
    System.out.println("Yes");
}else{
System.out.println("No");
}
 
}
}}
 