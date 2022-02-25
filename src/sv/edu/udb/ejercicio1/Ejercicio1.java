package sv.edu.udb.ejercicio1;
import java.util.*;

public class Ejercicio1 {

public static void main(String[] args) {
	
	//Variables a utilizar
	int Edad =0;
	String Nombre = "";
	
	//Declaramos un scaner
	Scanner Lectura = new Scanner(System.in);
	
	//Solicitar el nombre del estudiante
	System.out.println("Ingrese el nombre del estudiante: ");
	Nombre = Lectura.nextLine();
	
	//Solicitar la edad del estudiante
	System.out.println("Ingrese la edad del estudiante");
	//Edad = Lectura.nextInt();
	Edad = Integer.parseInt(Lectura.nextLine());
	
	System.out.println("El nombre del alumno es: "+Nombre+" y su edad es: "+Edad+" años.");
}
}
