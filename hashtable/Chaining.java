package hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class Chaining {
    public static void main(String []aa){
             Employeee sam=new Employeee("sam","john",900);
            Employeee john=new Employeee("john","hai",200);
            Employeee yo=new Employeee("yo","haha",10);
            Employeee sammie=new Employeee("sammie","john",900);

            Employeee johnnyy=new Employeee("johnnyy","hai",200);
            Employeee iiiiiiii=new Employeee("iiiiiiii","haha",10);
            Employeee hello=new Employeee("hello","haha",10);
            Employeee kkkkkkkkk=new Employeee("kkkkkkkkk","haha",10);

            ChainedHashtable ht=new ChainedHashtable();
            // ht.put("sam", sam);
            // ht.put("john", john);
            // ht.put("yo", yo);
            ht.put("sammie", sammie);
            ht.put("johnnyy", johnnyy);
            ht.put("iiiiiiii", iiiiiiii);
            ht.put("sammie", sammie);
            ht.put("johnnyy", johnnyy);
            ht.put("iiiiiiii", iiiiiiii);
            ht.put("hello", hello);
            ht.put("kkkkkkkkk", kkkkkkkkk);
            ht.put("hello", hello);
            ht.put("kkkkkkkkk", kkkkkkkkk);

            ht.remove("hello");

            ht.printHashtable();

    }

    
}

class ChainedHashtable{
   private LinkedList<StoredEmployeee>[] hashtable;

   ChainedHashtable(){
       hashtable=new LinkedList[10];

       for(int i=0;i<hashtable.length;i++){
           hashtable[i]=new LinkedList<StoredEmployeee>();

       }

   }

   public void put(String key,Employeee emp){
       int hashedKey=hashKey(key);
       hashtable[hashedKey].add(new StoredEmployeee(key,emp));

   }
   public Employeee get(String key){
       int hashedKey =hashKey(key);
       ListIterator<StoredEmployeee> iterator=hashtable[hashedKey].listIterator();
       StoredEmployeee employ=null;
       while(iterator.hasNext()){
           employ=iterator.next();
           if(employ.key.equals(key)){
               return employ.employe;   

           }
          

       }
       return null;

   }

   public  Employeee remove(String key){
    int hashedKey =hashKey(key);
    ListIterator<StoredEmployeee> iterator=hashtable[hashedKey].listIterator();
    StoredEmployeee employ=null;
    int index=-1;
    while(iterator.hasNext()){
        index++;
        employ=iterator.next();
        if(employ.key.equals(key)){ 
             break;
        }
    }
    if(employ==null||!employ.key.equals(key)){
        return null;

    }else{
        hashtable[hashedKey].remove(index);
        return employ.employe;
    }


   }
   public void printHashtable(){
       for(int i=0;i<hashtable.length;i++){
           if(hashtable[i].isEmpty()){
               System.out.println("empty");
           }else{
            System.out.print(" pos "+i+" ");
               ListIterator<StoredEmployeee> iterator=hashtable[i].listIterator(); 
               while(iterator.hasNext()){
                   System.out.print(iterator.next().employe+" ");

               }
               System.out.println(" null");


           }
       }
   }



   private int hashKey(String key){
       return key.length()%hashtable.length;
   }

}

class  StoredEmployeee{
    String key;
    Employeee employe;

    StoredEmployeee(String key,Employeee employe){
        this.key=key;
        this.employe=employe;

    }

    public String toString(){
        return employe.toString();
    }
}

class Employeee{
    String firstName;
    String lastName;
    int id;

    Employeee(String firstName,String lastName, int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;

    }

    public String toString(){

        return firstName+" "+lastName+" "+id;
    }

}