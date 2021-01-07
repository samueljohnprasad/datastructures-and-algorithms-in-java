package hashtable;

public class Hashtable {
    public static void main(String []aa){
        Employee sam=new Employee("sam","john",900);
        Employee john=new Employee("kkk","hai",200);
        Employee yo=new Employee("hehe","haha",10);

        SimpleHashtable ht=new SimpleHashtable();

        ht.put("sam",sam);
        ht.put("sam",john);
        ht.put("john",john);
        ht.put("yo",yo);
       // ht.put("yo",yo);
        ht.put("saergm",sam);
        ht.put("sagerbem",john);
        ht.put("jobefbebhn",john);
        ht.put("yobebebeb",yo);

        ht.print();


       // System.out.println(ht.get("yo"));

    }
    
}

class SimpleHashtable{
    Employee[] hashtable;

    SimpleHashtable(){
        hashtable=new Employee[10];
    }


    void put (String key,Employee emp){
        int hashedKey=hashKey(key);

        if(hashtable[hashedKey]!=null){
            System.out.println("not empty");

        }else{
            hashtable[hashedKey]=emp;
        }

    }

    int hashKey(String key){

        return key.length()%hashtable.length; 

    }
    
    Employee get(String key){
        int hashedkey=hashKey(key);
        return hashtable[hashedkey];

    }

    void print(){
        for(int i=0;i<hashtable.length;i++){
            System.out.println(hashtable[i]);

        }
    }


}


class Employee{
    String firstName;
    String lastName;
    int id;

    Employee(String firstName,String lastName, int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;

    }

    public String toString(){

        return firstName+" "+lastName+" "+id;
    }

}