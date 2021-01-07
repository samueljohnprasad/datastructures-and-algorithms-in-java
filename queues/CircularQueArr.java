package queues;

public class CircularQueArr {
    int front,rear,size;
    int arr[];

    CircularQueArr(int size){
        this.size=size;
        arr=new int[size];
        front=rear=-1;
    }
    public static void main(String []aa){
        CircularQueArr q=new CircularQueArr(5);
        q.add(10);
        q.add(9);
        q.add(5);
        q.add(44);

        q.remove();
       

        q.print();



    }
 
    public void add(int x){
        if(front==-1&&rear==-1){
           rear=front=0;
           arr[rear]=x;

        }else if(rear==size-1&&front==0){
            System.out.println("empty");

        }else if(rear ==size-1 && front!=0){
            rear=0;
            arr[rear]=x;

        }else{
            rear++;
            arr[rear]=x;
        }

    }

    public void remove(){
        if(front==-1&&rear==-1){
            System.out.println("empty");
 
            return;
        }
         if(front ==rear){
            front=rear=-1;

        }else if(front==size-1){
            front=0;



        }else{
            front++;
        }
    }

    public void print(){
        if(front==-1&&rear==-1){
            System.out.println("empty");
            return;

        }
        if(rear>=front){  // 0=0 or 4>0
          for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);

    
                
            }
        }else{
            for(int i=front;i<size;i++){
                System.out.println(arr[i]);

            }
            for(int i=0;i<=rear;i++){
                System.out.println(arr[i]);

            }
        }
       

    }

    
}


