package stack;

import java.util.EmptyStackException;

class Mainn {
    public static void main(String[] aa){
       // LinkedlistStack stacky=new LinkedlistStack();
        // stacky.push('c');
        // stacky.push('l');
        // stacky.push('k');
        // stacky.push('y');

       // stacky.pop();
     //  palindrome("madam");
       
       //.display();
      // System.out.println(stacky.size());
       System.out.println(palindrome("ma&#*#()!*&#!+_d,!!@#$am"));




    }

    public static boolean palindrome(String data){
        LinkedlistStack stacky=new LinkedlistStack();

        StringBuilder stringNopuntuation=new StringBuilder();
        String lowerCase= data.toLowerCase();

        for(int i=0;i<lowerCase.length();i++){
            char c=lowerCase.charAt(i);
            if(c>='a'&&c<='z'){
                stringNopuntuation.append(c);
                stacky.push(c);
                


            }


        }
        stacky.display();
        StringBuilder reversed=new StringBuilder(stacky.size());
        while(!stacky.isEmpty()){
            char c= stacky.pop();
            reversed.append(c);

        }
       
    return reversed.toString().equals(stringNopuntuation.toString());
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
