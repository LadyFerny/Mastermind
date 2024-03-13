package master_Mind;
import java.util.Scanner;

public class Mastermind {
	private int numJugadas;
	private Combinacion secreta;
	private Combinacion jugada;
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
		    numJugadas = new Scanner(System.in).nextInt();
	    }
	    System.out.println("");
		secreta.generaCSecreta(2, 8);
	}
	
	public void pedirJugada() {
		iniciarJuego();
		for(int i = 0; i < numJugadas; i++) {
			System.out.println("Jugada " +"["+(i+1) +"]" +":");
			
		}
		
		
	}
	
	public void verificarJugada() {
		
	}

}
