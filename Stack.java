public class Stack {
        int top=-1; 
        int[] st=new int[10];
        void push(int x){
            if(top>=9){
                System.out.println("Stack is full");
            }
            st[top++]=x;
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
    public static void main(String[] args) {
       Stack obj=new Stack();
       obj.push(1);
       obj.push(2);
       obj.push(3);
       obj.push(4);
       obj.push(5);
       obj.push(6);
       obj.push(7);
       obj.push(8);
       obj.push(9);
       obj.push(10);
       obj.pop();
       obj.topp();
       obj.size();
       for(int i=0; i<9; i++){
        System.out.println(obj[i]);
       }
    }
}
