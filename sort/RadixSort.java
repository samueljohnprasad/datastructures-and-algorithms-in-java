package sort;


public class RadixSort {
    public static void main(String[] aa){
        int arr[]={4343,1435344,1,8493,33,3943,2343,88886};
        radixSort(arr,10);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         //   Arrays.sort();

        }
        

    }
    public static void radixSort(int[] arr,int radix){
        int count=digits(arr[1]);
       

        for(int i=0;i<count;i++){
            radixSingleSort(arr,i,radix);

        }
        

      


    }
    static int digits(int arr){
        int count =0;
        while(arr!=0){
            arr=arr/10;
            ++count;
         

        }
        return count;
       


    }


   static void  radixSingleSort(int[] input,int pos,int radix){

int numItems=input.length;
int []countArr= new int[radix]; 
for(int value:input){
    countArr[getDigit(pos, value, radix)]++;


}


     for(int j=1;j<radix;j++){
         countArr[j]+=countArr[j-1];
            
        }

        int[]temp=new int[numItems];
        for(int j=numItems-1;j>=0;j--){
            temp[--countArr[getDigit(pos, input[j], radix)]]=input[j];

        }
        for(int j=0;j<temp.length;j++){
            input[j]=temp[j];
        }
    }
    public static int getDigit(int i,int value,int radix){
        return value/(int) Math.pow(10,i)%radix;
    }

}