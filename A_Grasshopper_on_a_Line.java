import java.util.*;
public class A_Grasshopper_on_a_Line{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=0,y=0;
            int cnt=0;
            int mc=0;
            while((x+y)!=n && x%k!=0 && y%k!=0){
                x=n;
                y=x-n;
                mc++;
                cnt=Math.max(cnt,mc);
                x++;
                y--;
            }
            System.out.println(cnt);
        }
    }
}