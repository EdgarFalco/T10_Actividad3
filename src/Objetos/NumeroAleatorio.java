package Objetos;

import java.util.Random;

public class NumeroAleatorio {

	static int numeroGenerado;
	
	//Genera un numero aleatorio entre 1 i 1000 ambos incluidos
	public static int generarNumero() {
		Random random = new Random();
		numeroGenerado = random.nextInt(1001);	
		return numeroGenerado;
	}
}
