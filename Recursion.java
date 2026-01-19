import java.util.*;

public class Recursion {
    public static void printName(int n, int i, String name){
        if(i>n){
            return;
        }
        System.out.println(name);
        printName(n,i+1,name);
    }

    public static void onetoN(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        onetoN(i+1,n);
    }


    /*public static void main(String args[]){
        System.out.println("How many times do you want to print your name?");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");
        String name= sc.nextLine();
        System.out.println("__________________________________________________________________");
        int i=1;
        printName(x,i,name);
    } */
    /*public static void main(String args[]){
        System.out.println("Till where do you want to print numbers? ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int i=1;
        onetoN(i,x);
    }*/
    public static void ntoone(int i){
        if(i==0){
            return;
        }
        System.out.println(i);
        ntoone(i-1);
    }

    public static void onetonbacktrack(int i, int n){
        if(i<1){
            return;
        }
        onetonbacktrack(i-1,n);
        System.out.println(i);
    }

    public static void ntoonebacktrack(int i, int n){
        if(i>n){
            return;
        }
        ntoonebacktrack(i+1,n);
        System.out.println(i);
    }

    public static int sumofn(int n){
        if(n==0){
            return 0;
        }
        return n+sumofn(n-1);
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
        
    }
    public static void main (String args[]){
        System.out.println("Till where do you want to print fibonacci series? ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Fibonacci series is: ");
        for(int i=0; i<x; i++){
           System.out.print(fibonacci(i)+" "); 
        }
    }
}
