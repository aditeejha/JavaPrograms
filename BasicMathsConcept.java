import java.util.*;
public class BasicMathsConcept{
    public static void countdigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println("The count of digits is : " + count);
    }

    public static void reverse(int n){
        int ld, rev=0;
        while(n>0){
            ld= n%10;
            rev= rev*10+ld;
            n=n/10;
        }
        System.out.println("The reverse of number is : " + rev);
    }

    public static void palindrome(int n){
        int ld, rev=0;
        int num=n;
        while(n>0){
            ld= n%10;
            rev= rev*10+ld;
            n=n/10;
        }
        if(num==rev)
            System.out.println("The number is a plaindrome ");
            else System.out.println("The number is not a plaindrome");
    }

    public static void armstrong(int n){
        int sum=0;
        int ld;
        int num=n;
        while(n>0){
            ld=n%10;
            sum = sum+ (ld*ld*ld);
            n=n/10;
        }
        if(sum==num)
        System.out.println("The number is an armstrong number");
        else System.out.println("The number isn't an armstrong number");
    }
    
    public static void divisors(int n){
        for(int i=1; i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                if((n/i)!=0){
                    System.out.println(n/i);
                }
            }
        }

    }

    public static void prime(int n){
        int count=0;
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("The number is a prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }

    public static void gcd(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            System.out.println("GCD of given numbers is: " + b);
        }
        else{
            System.out.println("GCD of given numbers is: " + a); 
        }
    }

    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner sc =new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println();
        gcd(x,y);
    }
}