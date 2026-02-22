import java.util.*;
public class A_Everybody_Likes_Good_Arrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int operations=0;
            int n=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            for (int i = 0;i <n;i++) {   
                list.add(sc.nextInt()); 
            }
            if(list.xsize()==1){
                System.out.println(0);
                continue;
            }   
            for(int i=0;i<list.size();i++){
                if((list.get(i)%2==0 && list.get(i+1)%2==0) || (list.get(i)%2!=0 && list.get(i+1)%2!=0)){
                    continue;
                }
                else{
                    list.set(i, list.get(i)*list.get(i+1));
                    list.remove(i+1);
                    operations++;
                }
            }
            System.out.println(operations);
        }
    }
}