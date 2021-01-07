package queues;

// public class QueArr {
//     int front,rear,size,capacity;
//     int[] array;

//     QueArr(int capacity){
//         this.capacity=capacity;
//         front=size=0;
//         rear=-1;
//         array=new int[this.capacity];

//     }

//     boolean isFull(){
//         return (size==capacity);
//     }
//     boolean isEmpty(){
//         return size==0;
//     }

//     void add(int x){
//         if(isFull()){
//             return;

//         }
//         rear=(rear+1)%capacity;
//         array[rear]=x;
//         this.size=this.size+1;

//     }
//     void remove(){
//         if(isEmpty()){
//             return;

//         }
//         front=(front+1)%capacity;
//         size=size-1;

//     }
//     public void print(){
//         int i=front;
//         if(isEmpty()){
//             System.out.println("empty");
      
//         }else{
//             while(i!=rear){
//                 System.out.println(array[i]);
//                  i=(i+1)%capacity;
//                // i++;


//             }
//             System.out.println(array[rear]+"r");
//         }

     
        
//     }
//      int rear() 
//     { 
//         if (isEmpty()) 
//             return Integer.MIN_VALUE; 
           
//         return this.array[this.rear]; 
//     }
//     int size(){
//         return size;
//     }

//     public static void main(String[] aa){
//         QueArr Q=new QueArr(5);
//         Q.add(10);
//         Q.add(5);
//         Q.add(3);
//         Q.add(7);
//     // //    Q.add(9);
//     //    Q.remove();
//     //    Q.remove();
//        Q.remove();
       
//         Q.remove(); 
//        Q.add(7);
//        Q.add(4);
//        Q.add(3);
//        Q.add(4);
       

//         Q.print();
//         System.out.println(Q.rear()+"?");
//         System.out.println(Q.size()+"size");



//     }
    
// }

public class QueArr {
        int []array;
        int front =0;
        int rear=-1;
        int size;
        int capacity;


        QueArr(int capacity){
         this.capacity=capacity;
         this.array=new int [capacity];
        }

        public void add(int x){
            if(isFull())
                return;

            rear=(rear+1)%capacity;
            array[rear]=x;
            size+=1;
        }

        public void remove(){
            if(isEmpty())
            return;
            front=(front+1)%capacity;
            
          
        }

        boolean isFull(){

        return (size==capacity);

        }
        boolean isEmpty(){
            return size==0;
        }

        int size(){
            return size;
        }

        public void print(){
            int i=front;
            if(isEmpty())
            return;
            while(i!=rear){
                System.out.println(array[i]);
                i=(i+1)%capacity;

            }
            System.out.println(array[rear]);

        }



    public static void main(String[]aa){
        QueArr q=new QueArr(5);
        q.add(10);
        q.add(7);
        q.add(150);
        q.add(105);
        q.add(7);
        // q.add(150);
        // q.add(105);
        // q.add(7);
        // q.add(150);
        // q.add(105);

        q.remove();
        q.print();



    }
}
