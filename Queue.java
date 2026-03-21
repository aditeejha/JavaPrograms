public class Queue{
    int size=10, currSize=0, start=-1, end=-1;
    int[] q=new int[size];
    void push(int x){
        if(currSize==size){
            System.out.println("Queue is full");
            return;
        }
        else if(currSize==0){
            start=0; end=0;
        }
        else{
            end=(end+1)%size;
            q[end]=x;
            currSize+=1;
        }
    }
    int pop(){
        if(currSize==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int el=q[start];
        if(currSize==1){
            start=-1;
            end=-1;
        }
        else {
            start=(start+1)%size;
        }
        currSize-=1;
        return el;
    }
    int top(){
        if(currSize==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return q[start];
    }
    int size(){
        return currSize;
    }
    public static void main(String[] args){
        Queue q=new Queue();
        q.push(1);
        q.push(2);
        q.pop();
        q.pop();
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        q.push(7);
        q.push(8);
        q.push(9);
        q.push(10);
        q.push(11);
        q.push(12);
        q.top();
        q.size();
        for(int i=0; i<q.size; i++){
            System.out.print(" "+q.q[i]);
        }
    }
}
