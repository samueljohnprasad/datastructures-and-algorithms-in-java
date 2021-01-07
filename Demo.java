import java.util.Arrays;

public class Demo{
    public static  void main(String [] arg){
       // int x=10;public int[] twoSum(int[] nums, int target) {
          
         //  }
         int arr[]={4,6,4,5,86,7};
         int x=9;
         
         System.out.println(Arrays.toString(twoSum(arr,x)));
           

    

      

}

public static int[] twoSum(int [] arr,int target){

    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==target-arr[j]){
                return new int[] {i,j};

            }
        }
    }
    throw new IllegalAccessError("lol");

}

}


