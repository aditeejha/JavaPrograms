class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};

public class SingleLL{
    public static Node convert2LL(int[] arr){
        if(arr.length==0){ 
            return null;
        }
        Node head=new Node(arr[0]);
        Node current=head;
        for(int i=1; i<arr.length; i++){
            Node temp=new Node(arr[i]);
            current.next=temp;
            current=temp;
        }
        return head;
    }

    public static void printLL(int[] arr){
        Node head=convert2LL(arr);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static int lengthOfLL(int[] arr){
        Node head=convert2LL(arr);
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static int checkExists(int[] arr, int k){
        Node head=convert2LL(arr);
        Node temp=head;
        while(temp!=null){
            if(temp.data==k){
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }

    public static Node deleteHead(int[] arr){
        Node head=convert2LL(arr);
        if(head==null){
            return head;
        }
        Node temp=head;
        head=head.next;
        return head;
    }

    public static Node deleteTail(int[] arr){
        Node head=convert2LL(arr);
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        return temp;
    }

    public static Node deleteK(int[] arr,int k){
        Node head=convert2LL(arr);
        if(head==null) return head;
        if(k==1){
            Node temp=head;
            head=head.next;
            return head;
        }
        Node temp=head;
        int count=0;
        Node prev=null;
        while(temp !=null){
            count++;
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    public static Node deleteEl(int[] arr,int el){
        Node head=convert2LL(arr);
        if(head==null) return head;
        if(head.data==el){
            Node temp=head;
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        while(temp !=null){
            if(temp.data==el){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    public static Node insertHead(Node head, int val){
        return new Node(val, head);
    }

    public static Node insertTail(Node head, int val){
        if(head==null){
            return new Node(val);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(val);
        temp.next=newNode;
        return head;
    }

    public static Node insertAtPos(Node head, int val, int pos){
        if(head==null){
            if(pos==1){
                return new Node(val);
            } else{
                return head;
            }   
        }
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            if(count==pos-1){
                Node newNode=new Node(val, temp.next);
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr={2,5,6,8,10};
        int el=8;
       Node head= convert2LL(arr);
       //head=insertHead(head, 17);
       insertAtPos(head,67, 3);
       Node temp=head;
       while(temp!=null){
           System.out.print(temp.data+"->");
           temp=temp.next;
       }
       System.out.println("null");
    }
}
