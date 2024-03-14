package master_Mind;
import java.util.Scanner;

public class Mastermind {
	static Scanner sc = new Scanner(System.in);
	private int numJugadas;
	private Combinacion secreta;
	private Combinacion jugada;
	private byte[] inputNumeros = new byte[4];
	public static final int MIDA = 4;
	//private Combinacion jugada = new Combinacion();
	
	public Mastermind() {
		numJugadas = 0;
		secreta = new Combinacion();
		jugada = new Combinacion();
				
	}
	
	public void iniciarJuego() {
	    System.out.println("Introduce un numero de jugadas [6-20]");
	    while (6 > numJugadas || numJugadas > 20) {
		    System.out.print("Numero de jugadas: ");
		    numJugadas = sc.nextInt();
	    }
	    System.out.println("");
		secreta.generaCSecreta(2, 8);
	}
	
	public void pedirJugada() {
        iniciarJuego();
        int i = 0;
    	System.out.println("Ingresa una combinacion de 4 numeros del (2-8) separados por espacios!!\n");
        while( i < numJugadas) {
            System.out.println("Jugada [" + (i + 1) + "]");
            System.out.print("Ingresa la combinación: ");
            for (int j = 0; j < 4; j++) {
            	inputNumeros[j] = sc.nextByte();
            }
            jugada.setArray_Combi(inputNumeros);
            verificarJugada();
            i++;
        }
    }
	
	public boolean verificarJugada() {
		boolean tmp = false;
		for(int i = 0; i < MIDA; i++) {
			for(int j = i; j < i + 1; j++) {
				if(secreta.getArray_Combi()[i] == inputNumeros[j]) {
					System.out.println(" X ");
					//tmp = true;
				//}else if(secreta.getArray_Combi()[i]){
				}				
				
			}
		}
	 return tmp;
		
	}
}
