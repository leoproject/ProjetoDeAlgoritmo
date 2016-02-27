package ProjetoDeAlgoritmo;

public class Fibonacci {
    
    public static long fiboRec(int n){
         
          if ( n == 0 )
                 return 0;
          else
                 if ( n <= 2) //(( n == 1 ) || ( n == 2))
                        return 1;
                 else
                        return fiboRec(n-1) + fiboRec(n-2);
         
    }
   
    public static long fiboIter(int n){
   
          long r = 0, r1 = 0, r2 = 1;
         
          if (n <= 1) return n;
         
          for (int i = 2; i <= n; i++){
                 r  = r1 + r2;
                 r1 = r2;
                 r2 = r;     
          }
         
          return r;

    }


}