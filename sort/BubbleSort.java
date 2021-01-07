package sort;

public class BubbleSort {

    public static  void main(String [] arg){


        // Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
        int []arr= {4,2,3,1};
        
        // for(int j=0;j<arr.length;j++){
        //     arr[j]=sc.nextInt();
        // }


        for(int unsort=arr.length-1;unsort>0;unsort--){  //length-1=3  
            for(int j=0;j<unsort;j++){    //3
            //     System.out.print(j+" "); 
            //     System.out.print("........ "); 
            //    System.out.print(j+1+" ");
                if(arr[j]>arr[j+1]){          //index2>index3  end loop
                                              //not iterating upto last element
                   
                    swap(arr,j,j+1);

                }

            }

        }
        
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
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