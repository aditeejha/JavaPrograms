import java.util.*;
public class A_Coins{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x,y;
            if(k%2==0){
                //x=k/2;
                //y=k/2;
                System.out.println("YES");
            }
            else{
                //x=k/2+1;
                //y=k/2;
                if(n%2==0){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
    }
}