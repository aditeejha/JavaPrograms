import java.util.*;
public class Patterns {
    public static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
public static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
public static void pattern3(int n){
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
public static void pattern4(int n){
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
public static void pattern5(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
public static void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
public static void pattern7(int n){
        for(int i=0; i<n; i++){
            //spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*i-1; j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
public static void pattern8(int n){
        for(int i=0; i<n; i++){
            //spaces
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*n -(2*i+1); j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
public static void pattern9(int n){
        for(int i=0; i<n; i++){
            //spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*i-1; j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            //spaces
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*n -(2*i+1); j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        System.out.println("Enter the value of n");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern9(n);

    }
    
}
