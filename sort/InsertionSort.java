package sort;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String [] args){

        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();


        }
        for(int unsortIndex=1;unsortIndex<arr.length;unsortIndex++){ 
                  
                int sort=unsortIndex-1;   // 0th element
                int unsort=arr[unsortIndex];   


                
                while(sort>=0&&arr[sort]>unsort){
                    arr[sort+1]=arr[sort];
                   
                    sort--;       


                }
                arr[sort+1]=unsort;     

            }


        

        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");


        }

        sc.close();



    }

}