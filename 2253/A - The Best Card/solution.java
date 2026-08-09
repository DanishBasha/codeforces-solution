import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
    while(t-->0){
     int n=sc.nextInt();
     int x=n+1;
   boolean ok=true;
for(int i=2;i*i<=x;i++){
  if(x%i==0){
  ok=false;
  break;
}
}
if(ok)System.out.println("YES");
else System.out.println("NO");
}
}
}