package stack;

import java.util.EmptyStackException;

class Main {
    public static void main(String []aa){
        ArrayyStack stack=new ArrayyStack(10);
        Employe sam=new Employe("sam", "john", 123);
        Employe john=new Employe("john", "johnny", 456);
        Employe sammie=new Employe("sammie", "sam", 789);
        Employe johnny=new Employe("johnny", "john", 9000);

        stack.push(sam);
        stack.push(john);
        stack.push(sammie);
        stack.push(johnny);

        stack.pop();
        System.out.println(stack.peek());
        stack.printStack();
      

    }
    
}

class ArrayyStack{
    private Employe[] stack;
    private int top;

    public ArrayyStack(int capacity){
     this.stack=new Employe[capacity];   //init size thru constructor

    }

    public void push(Employe newEmploye){
        if(top==stack.length){
            //resize
            Employe[] newArray = new Employe[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack=newArray;

        }else{
            stack[top++]=newEmploye;
        }

    }
    public void pop(){
        if(isEmpty()){
            throw new EmptyStackException();

        }else{
            --top;
        }
    }
    public Employe peek(){
        if(isEmpty()){
            throw new EmptyStackException();

        }else{
            return stack[top-1];
           
        }
    }

    public boolean isEmpty(){
        return top==0;
    }
    public void printStack(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);

        }
    }

    public String toString(){
        return stack.toString();

    }
}



class Employe{
    String firstName;
    String lastName;
    int id;

    Employe(String firstName,String lastName,int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;

    }

 public  void setfirstName(String firstName){
      this.firstName=firstName;


    }

    public String getfirstName(){
        return this.firstName;
    }

   public  void setlast(String last){
       this.lastName=last;

   }
   public String getlastname( ){
       return this.lastName;

   }
   public void setid(int id){
       this.id=id;
   }
   public int getid(){
       return this.id;
   }
   public String toString(){
       return firstName+" "+lastName+" "+id;
        
}

}