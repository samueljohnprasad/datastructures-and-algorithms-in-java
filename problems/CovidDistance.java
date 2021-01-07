package problems;
import java.io.*;

public class CovidDistance {

    
  
        public static void main(String [] arg) throws IOException {
    
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
          //  Scanner sc=new Scanner (System.in);
    
          //String str= br.readLine();
          String line=br.readLine();
         int t =Integer.parseInt(line);
         while(t-- > 0){
    
            line =br.readLine();
            int n=Integer.parseInt(line);
    
            int [] arr=new int[n];
            line =br.readLine();
    
            String [] str=line.split(" ");
    
            for(int i=0;i<n;i++){
    
                arr[i]= Integer.parseInt(str[i]);
    
    
            }
    
            int f=0;
    
            for(int i=0;i<n;i++){
    
                if(arr[i]==1)
                {
                    f=i;
                    break;
    
                }
    
            }
            int flag=0;
    
            for(int i=f+1;i<n;i++){
    
                if(arr[i]==1){
    
                    if(i-f>=6){
    
                        f=i;
    
                    }else{
                        flag=1;
                        break;
                    }
    
    
                }
    
               
    
    
            }
            if(flag==1){
    
                System.out.println("NO");
        
            }else{
                System.out.println("YES");
        
            }
    
    
    
         }
         
    
        }
    }