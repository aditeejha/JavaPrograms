import java.util.*;
public class B_Flipping_Binary_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int cnt1 = 0;
            for(char c : s.toCharArray()){
                if(c == '1') cnt1++;
            }
            if(n == 1){
                if(s.equals("0")){
                   System.out.println(0);
            } else {
                   System.out.println(-1);
          }
            continue;
}
       if(cnt1 % 2 == 0){
           System.out.println(cnt1);
           for(int i = 0; i < n; i++){
               if(s.charAt(i) == '1'){
                   System.out.print((i+1) + " ");
                }
            }
            System.out.println();
        } else {
            int cnt0 = n - cnt1;
            System.out.println(cnt0);
            for(int i = 0; i < n; i++){
                 if(s.charAt(i) == '0'){
                 System.out.print((i+1) + " ");
                }
     }
            System.out.println();
           }
        }
    }
}