 
///////////////////////////////////////////////////////////
///    Teste.java
//////////////////////////////////////////////////////////
 
 
package ProjetoDeAlgoritmo;
 
public class Teste {
 
       public static void main(String[] args) {
            
             /*
            
             int p = 8;
            
             long iter = Fatorial.fatIter(p);
            
            
             long ini = System.nanoTime();
             iter = Fatorial.fatIter(p);
             long fim = System.nanoTime();
            
             System.out.println(iter);
             System.out.println(fim-ini);
            
             ini = System.nanoTime();
             long rec  = Fatorial.fatRec(p);
             fim = System.nanoTime();
            
             System.out.println(rec);
             System.out.println(fim-ini);
            
             */
            
             int p = 8;
 
             long iter = Fibonacci.fiboIter(p);
            
            
             long ini = System.nanoTime();
             iter = Fibonacci.fiboIter(p);
             long fim = System.nanoTime();
            
             System.out.println(iter);
             System.out.println(fim-ini);
            
             ini = System.nanoTime();
             long rec  = Fibonacci.fiboRec(p);
             fim = System.nanoTime();
            
             System.out.println(rec);
             System.out.println(fim-ini);
            
 
       }
 
}
 
 

 