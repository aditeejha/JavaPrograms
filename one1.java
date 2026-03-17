import java.util.*;
public class one1{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      System.out.println("Enter the shape whose area you want to calculate");
      System.out.println("Enter 1 for square, 2 for rectangle, 3 for circle, 4 for triangle");
      int choice=sc.nextInt();
      switch(choice){
        case 1:
            System.out.println("Enter side length");
            int side=sc.nextInt();
            System.out.println(side*side);
      case 2:
            System.out.println("Enter length and breadth");
            int l=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(l*b);
      case 3:
            System.out.println("Enter radius");
            int r=sc.nextInt();
            System.out.println(3.14*r*r);
      case 4:
            System.out.println("Enter height and base");
            int h=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(0.5*h*b);
      }
    }
}

