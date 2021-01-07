package queues.problems;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class PalindromeQueue {
    int []array;
    int front =0;
    int rear=-1;
    int size;
    int capacity;
    public static void main(String[] aa){

        PalindromeQueue q=new PalindromeQueue(5);
        q.add(10);
        q.add(7);
        q.add(150);
        q.add(105);
        q.add(7);
        q.remove();
       // q.print();

       LinkedList<Character> list=new LinkedList<>();
        list.addFirst('c');
        list.push('k');
        list.addFirst('e');
        System.out.println(list.peekFirst());


    }

    


    PalindromeQueue(int capacity){
     this.capacity=capacity;
     this.array=new int [capacity];
    }

    public static boolean checkPalindrome(){

        

        


        return false;
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


    
}

class Node{
    //  String data;
      char c;
      Node nextLink;
  
      // Node(String data){
      //     this.data=data;
  
      // }
      Node(char c){
          this.c=c;
  
      }
  }

class LinkedlistStack{
    Node top;
   private int size;
   

    public void push(char data){
        Node temp=new Node(data);
        // if(temp==null){
        //     System.out.println("overflow");
        //     return;

        // }
        

        temp.c=data;
        temp.nextLink=top;
        top=temp;
        size++;


    }
    public void display(){
        
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.c); 
                temp=temp.nextLink;

            }
        }
   
    // public void pop(){
    //     if(top==null){
    //         System.out.print("underflow"); 


    //     }else{
    //         top=top.nextLink;
    //         size--;
    //     }
    // }

    public char pop(){
        char aa;
        if(top==null){
            System.out.print("underflow");
           throw new EmptyStackException();

         }
            aa=top.c;
            top=top.nextLink;
            size--;
       
        
        return aa;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return top==null;
    }


}