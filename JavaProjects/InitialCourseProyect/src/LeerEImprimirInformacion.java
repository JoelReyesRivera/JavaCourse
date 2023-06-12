import java.util.Scanner;

public class LeerEImprimirInformacion {

	public static void main(String[] args) {
		
		//IMPRIMIR INFO
		System.out.println("HOLA MUNDO");
		
		//INGRESAR INFO POR TECLADO
		//PRIMER PASO - CREAR EL SCANNER
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Ingresa tu nombre: ");
		//CON EL METODO NEXTLINE SE VA A LEER EL DATO QUE INGRESES
        String nombre = scanner.nextLine();
		System.out.println(nombre);
	}

}
