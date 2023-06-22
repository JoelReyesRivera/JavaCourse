package Arreglos;

public class Arreglos {

	public static void main(String[] args) {
		
		//DECLARAR UN ARREGLO
		int[] arreglo = new int[5];

		
		//INDICES 0,1,2,3,4,5...N
		//ALMACENAMIENTO 1,2,3,4,5...N
		//EJEMPLO
		// 0 1  2  3  4  Indices 
		//[] [] [] [] [] CASILLAS DE ALMACENAMIENTO
		// ALMACENAMIENTO = CANTIDAD DE DATOS QUE SE PUEDEN GUARDAR
		//SI EL ARREGLO TIENE N CANTIDAD DE CASILLAS
		// LA ULTIMA CASIILA TENDRA EL INDICE DE N-1
		arreglo[0] = 5;
		arreglo[1] = 6;
		arreglo[2] = 7;
		arreglo[3] = 8;
		arreglo[4] = 9;

		//COMO RECORRER UN ARREGLO CON UN CICLO FOR
		//RECOMENDACION: ES MAS UTILIZADO PARA MODIFICAR O ASIGNAR VALORES AL ARREGLO
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
		//COMO RECORRER UN ARREGLO CON UN CICLO FOR EACH
		//RECOMENDACION: ES MAS UTILIZADO PARA LECTURA DE INFORMACIÓN
		for (int valor : arreglo) {
			System.out.println(valor);
		}
	}

}
