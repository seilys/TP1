package tp.pr0;

/**
 * Práctica 0 - Tercera parte: método nuevo de la clase
 * 
 * Entry point class
 * @author seilys
 */
public class Pr0Main
{

	public static void escribeSaludo(String nombre) {
		System.out.println("Hola, " + nombre);
	}
	
	public static void main(String args[]) {
		Pr0Main.escribeSaludo("Walterio Malatesta");
		
		for (int i = 0; i < 6; ++i) {
			for (int j = 0; j <= i; ++j) {
				System.out.print(FuncsMatematicas.combinatorio(i, j) + " ");
			}
			System.out.println();
		}
	}
}
