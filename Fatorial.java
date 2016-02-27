package ProjetoDeAlgoritmo;


///////////////////////////////////////////////////////////
///    Fatorial.java
//////////////////////////////////////////////////////////

public class Fatorial {

public static long fatRec(int n) {

if (n < 2)
return 1;
else
return n * fatRec(n-1);

}

public static long fatIter(int n) {
int r = 1;

for (int i = 2; i <= n; i++) {
r *= i;                  
}

return r;

}

}