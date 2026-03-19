public class Stack {
    class StImpl{
        int top=-1; 
        int[] st=new int[10];
        void push(int x){
            if(top>=10){
                System.out.println("Stack is full");
            }
            st[top]=x;
        }
        int topp(){
            if(top==-1) return -1;
            return st[top];
        }
        void pop(){
            if(top==-1){
                System.out.println("Stack is empty");
            }
            top=top-1;
        }
        int size(){
            return top+1;
        }
    }
}
