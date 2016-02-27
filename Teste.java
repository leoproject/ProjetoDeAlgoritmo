package ProjetoDeAlgoritmo;
 
public class Teste {
 
                public static void main(String[] args) {
                              
                               ///*
                               int p = 20;
                              
                               long iter = Fatorial.fatIter(p), rec = Fatorial.fatRec(p), ini = 0, fim = 0;
                              
                               ini = System.nanoTime();
                               iter = Fatorial.fatIter(p);
                               fim = System.nanoTime();
                              
                               System.out.println(iter);
                               System.out.println(fim-ini);
                              
                               ini = System.nanoTime();
                               rec  = Fatorial.fatRec(p);
                               fim = System.nanoTime();
                              
                               System.out.println(rec);
                               System.out.println(fim-ini);
                               //*/
                              
                               /*
                               int p = 30;
                              
                               long iter = Fibonacci.fiboIter(p), rec = Fibonacci.fiboRec(p), ini = 0, fim = 0;
                              
                               ini = System.nanoTime();
                               iter = Fibonacci.fiboIter(p);
                               fim = System.nanoTime();
                              
                               System.out.println(iter);
                               System.out.println(fim-ini);
                              
                               ini = System.nanoTime();
                               rec  = Fibonacci.fiboRec(p);
                               fim = System.nanoTime();
                              
                               System.out.println(rec);
                               System.out.println(fim-ini);
                               */
 
                }
 
}