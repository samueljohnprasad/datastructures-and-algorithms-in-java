package sort;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String [] args){
       Scanner sc= new Scanner(System.in);

       int t= sc.nextInt();
       int arr[]=new int[t];

       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
           sc.close();
       }

       for(int unsort=arr.length-1;unsort>0;unsort--){    //unsort =6 length=7
        int max=0;
        for(int j=1;j<=unsort;j++){

            if(arr[j]>arr[max]){
                max=j;

            }
           // System.out.print(arr[j]+". ");
            

        }
        swap(arr,unsort,max);
       
        

      

       }

       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");

    }

    }
    public static void swap(int[] arr,int i,int j){
        if(i==j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}