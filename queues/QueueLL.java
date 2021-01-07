package queues;

public class QueueLL {
    Qnode front;
    Qnode rear;

    public static void main(String a[]){
        QueueLL q=new QueueLL();

        q.add(10);
        q.add(4);
        q.add(2);
        q.add(6);
        q.add(2);
        q.remove();

        q.print();
    }

    void add(int x){
        Qnode newnode=new Qnode(x);
       // newnode.data=x;
        if(rear==null){
            front=rear=newnode;
            return;

        }else{
            rear.nextLink=newnode;
            rear=newnode;
        }
        

    }
    void remove(){
        if(front==null&&rear==null){
            System.out.println("empty");

          return;
        }else{
            Qnode temp=front;
            front=front.nextLink;
            temp=null;
        }
    }
    void print(){
        if(front==null&&rear==null){
            System.out.println("empty");

        }else{
            Qnode temp=front;
            while(temp!=rear){
                System.out.println(temp.data);
                temp=temp.nextLink;


            }
            System.out.println(rear.data);
        }
    }

    
}
class Qnode{
    int data;
    Qnode nextLink;

    Qnode(int data){
        this.data=data;

    }
}