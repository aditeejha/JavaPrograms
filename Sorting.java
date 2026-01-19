import java.util.*;

public class Sorting {
    public static void main(String args[]){
        System.out.println("How many elemnts you want to enter in you array?");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[n];
        System.out.println("Input elemnts for your array");
        for(int i=0; i<n; i++){
            int arr[i]=sc,nextInt();
        }
        System.out.println("Your array before sorting:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");;
        }
        System.out.println("Your array after sorting:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");;
        }
    }
}
