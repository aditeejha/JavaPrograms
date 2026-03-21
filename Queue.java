public class Queue{
    int size=10, currSize=0, start=-1, end=-1;
    int[] q=new int[size];
    void push(int x){
        if(currSize==size)
            System.out.println("Queue is full");
        else if(currSize==0){
            start=0; end=0;
        }
        else{
            end=(end+1)%size;
            q[end]=x;
            currSize+=1;
        }
    }
    void pop(){
        if(currSize==0) 
            System.out.println("Queue is empty");
        int el=q[end];
        if(currSize==1){
            start=-1;
            end=-1;
        }
        else {
            start=(start+1)%size;
            currSize-=1;
        }
    }
}
