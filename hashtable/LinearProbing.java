package hashtable;

public class LinearProbing {
        public static void main(String []aa){
            Employe sam=new Employe("sam","john",900);
            Employe john=new Employe("john","hai",200);
            Employe yo=new Employe("yo","haha",10);
            Employe sammie=new Employe("sammie","john",900);
            Employe johnnyy=new Employe("johnnyy","hai",200);
            Employe iiiiiiii=new Employe("iiiiiiii","haha",10);
            Employe hello=new Employe("hello","haha",10);
            Employe kkkkkkkkk=new Employe("kkkkkkkkk","haha",10);

            Employe hahahey=new Employe("hahahey","hai",200);


    
            SimpleHashtablee ht=new SimpleHashtablee();
    
            ht.put("sam",sam);
            //ht.put("john",john);
            ht.put("sammie",sammie);
            ht.put("iiiiiiii",iiiiiiii);
            ht.put("kkkkkkkkk",kkkkkkkkk);
            //ht.put("kkkkkkkkk",kkkkkkkkk);
           // ht.put("hello",hello);
            ht.put("johnnyy",johnnyy);
            ht.put("yo",yo);
            ht.put("y",yo);
           // ht.put("y",yo);

            //ht.put("sam",sam);
            ht.put("hello",hello);
            ht.put("hello",hahahey);
           // ht.put("hello",hello);
           ht.put("y",yo);
    
            ht.print();
    
    
            System.out.println(ht.get("hello"));
    
        }
        
    }
    
    class SimpleHashtablee{
        StoredEmployee[] hashtable;
    
        SimpleHashtablee(){
            hashtable=new StoredEmployee[10];
        }
    
    
        void put (String key,Employe emp){
            int hashedKey=hashKey(key);

            if(occupied(hashedKey)){

                int stopIndex=hashedKey;
                if(hashedKey==hashtable.length-1){
                    hashedKey=0;
                    //System.out.println(hashedKey+"key=0 ");

                }else{
                    hashedKey++;
                   // System.out.println(hashedKey+"k ");
                }   
               // System.out.println(hashedKey+"if/ ");

                while(occupied(hashedKey) && hashedKey!=stopIndex){
                    hashedKey=(hashedKey+1)%hashtable.length;
                   // System.out.println(hashedKey+"k ");

                }
               // System.out.println(hashedKey);

            }
             if(occupied(hashedKey)){
                System.out.println("index not empty");
    
            }else{
                hashtable[hashedKey]=new StoredEmployee(key,emp);

            }

    
        }
    
        int hashKey(String key){
    
            return key.length()%hashtable.length; 
    
        }
        
        Employe get(String key){
            int hashedKey=findKey(key);
            if(hashedKey==-1){
                return null;

            }else{
                return hashtable[hashedKey].employe;
            }
    
        }

        boolean occupied(int index){
            return hashtable[index]!=null;

        }
    
        void print(){
            for(int i=0;i<hashtable.length;i++){
                System.out.println(i+" "+hashtable[i]);
    
            }
        }

        private int findKey(String key){
            int hashedKey=hashKey(key);
            if(hashtable[hashedKey]!=null && hashtable[hashedKey].key.equals(key)){
              
                return hashedKey;
            }

            int stopIndex= hashKey(key);

            if(hashedKey==hashtable.length-1){
                hashedKey=0;

            }else{
                hashedKey++;
            }

            while(hashedKey!=stopIndex && hashtable[hashedKey]!=null &&
             !hashtable[hashedKey].key.equals(key)){

                hashedKey=(hashedKey+1)%hashtable.length;

            }

            if(hashedKey==stopIndex){
                return -1;

            }else{
                return hashedKey;
            }
        }
    
    
    }

    class  StoredEmployee{
        String key;
        Employe employe;

        StoredEmployee(String key,Employe employe){
            this.key=key;
            this.employe=employe;

        }

        public String toString(){
            return employe.toString();
        }
    }

   
    
    
    class Employe{
        String firstName;
        String lastName;
        int id;
    
        Employe(String firstName,String lastName, int id){
            this.firstName=firstName;
            this.lastName=lastName;
            this.id=id;
    
        }
    
        public String toString(){
    
            return firstName+" "+lastName+" "+id;
        }
    
    }

  