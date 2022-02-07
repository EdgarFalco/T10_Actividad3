package Objetos;

public class MiException {	

	//Metodo mostrara por pantalla si el numero generado es par o impar
	public static void obtenerResultado() throws Exception {		
		int numError = NumeroAleatorio.generarNumero();		
		
		try {
			System.out.println("Generando numero aleatorio...");
			System.out.println("El numero generado es: " + numError);
			
			if(numError % 2 == 0) {
				throw new Exception("Es par");
			}else {
				throw new Exception("Es impar");
			}	
			
		} catch (Exception e){
			System.out.println(e.getMessage());
		}		
	}			
}
