import java.util.*;
class A_Team{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
            int n=sc.nextInt();
            for(int i=0; i<n; i++){
                int arr[]=new int[3];
                for(int j=0; j<3; j++){
                    arr[j]=sc.nextInt();
                }
                if(arr[0]+arr[1]+arr[2]>=2){
                    count++;
                }
            }
        System.out.println(count);
    }
}

