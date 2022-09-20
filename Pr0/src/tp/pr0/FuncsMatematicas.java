package tp.pr0;

/**
 * Práctica 0 - Cuarta parte: clase matemática
 * 
 * Math util functions
 * @author seilys
 *
 */
public class FuncsMatematicas 
{
	
	/**
	 * @param n
	 * @return
	 */
	public static int factorial (int n) {
		
		// Si el nÃºmero es menor de 0, devolvemos 0
		if (n < 0)	return 0;
		
		// El factorial de 0 es 1,
		if (n == 0)	return 1;
		
		return n * factorial(n - 1);
	}
	
	/**
	 * @param n
	 * @param k
	 * @return
	 */
	public static int combinatorio (int n, int k) {
		
		// Si k < 0 o n < 0: devolveremos -1
		if (k < 0 || n < 0) return -1;
		
		// Si k > n: devolveremos 0
		if (k > n) return 0;
				
		return factorial(n) / (factorial(k) * factorial(n - k));
	}

}