package master_Mind;

public class Combinacion {
	public static final int MIDA = 4;
	private byte[] array_combi;
	
	public Combinacion() {
		array_combi = new byte[MIDA];
	}
	
	public Combinacion(int n) {
		array_combi = new byte[n];
	}
	
	public byte[] getArray_Combi() {
		return array_combi;
	}
	
	public void setArray_Combi(byte[] a) {
		array_combi = a;
	}
	
	public void generaCSecreta(int min, int max) {
		boolean tmp = true;
		while(tmp == true) {
			for(int i = 0; i < MIDA; i++) {
				array_combi[i] = (byte)(Math.random() * (max - min + 1)+ min);
			}	
			tmp = ComprovarJugada();
		}
		//for(int i = 0; i < MIDA; i++)
			//System.out.print(array_combi[i] +" ");

	}
	
	public boolean ComprovarJugada() {
		boolean tmp = false;
		for(int i = 0; i < MIDA; i++) {
			for(int j = i + 1; j < MIDA; j++) {
				if(array_combi[i] == array_combi[j]) {
					tmp = true;
				}
			}
		}
	return tmp;
	}
}
