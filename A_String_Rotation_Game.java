import java.util.*;

public class A_String_Rotation_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int blocks = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    blocks++;
                }
            }
            if (n > 1 && s.charAt(0) != s.charAt(n - 1)) {
                blocks++;
            }
            System.out.println(Math.min(n, blocks));
        }
        sc.close();
    }
}