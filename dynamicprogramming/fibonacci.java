package dynamicprogramming;

//top down approch 

// public class fibonacci {

//     public static void main(String []aa){
//         int x=250;

//         int cache[]=new int[x+1];
        
//         System.out.println(fab(x,cache));

// }
//    public static int  fab(int n,int[] cache){

    

//     if(n==0) return 0;
//     if(n==1) return 1;

//     if(cache[n]!=0){
//         return cache[n];

//     }else{
//         cache[n]=fab(n-1,cache) + fab(n-2,cache);
//         return cache[n];

//     }
    

     
//     }
// }

class fibonacci { 
    static int fib(int n) 
    { 
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n + 1]; 
        int i; 
  
        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0; 
  
        if (n > 0) { 
            f[1] = 1; 
  
            for (i = 2; i <= n; i++) { 
                /* Add the previous 2 numbers in the series 
             and store it */
                f[i] = f[i - 1] + f[i - 2]; 
            } 
        } 
  
        return f[n]; 
    } 
  
    public static void main(String args[]) 
    { 
        int n = 74; 
        System.out.println(fib(n)); 
    } 
} 
