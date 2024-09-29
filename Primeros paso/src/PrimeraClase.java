
public class PrimeraClase {
	public static void main(String args []) {
		
		String saludo = mostrarSaludo("Paco");
		System.out.println("Hola, Java");
	}
		
		//Ejercicio 00 sintaxis, variables, tipos de datos y hola mundo
		
		/*
		 Ejercicio:
		 
		 - Crea un comentario en el código y coloca la URL del sitio web oficial del
    	  lenguaje de programación que has seleccionado.
  		 - Representa las diferentes sintaxis que existen de crear comentarios
	      en el lenguaje (en una línea, varias...).
	   	
	     - Crea variables representando todos los tipos de datos primitivos
	       del lenguaje (cadenas de texto, enteros, booleanos...).
	     - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 		*/
		
		// Lenguaje de programación Java: https://www.java.com/es/download/
		
		//Comentario de una sola línea, solo lo que esta en esta linea no sera ejecutado --> String blue = cielo;
		
		/*
		 Comentario de multiples lineas
		 int dark = 8; --> Nada de lo que esta aqui escrito afecta al código
		*/
		
		/**
		 * Comentario para documentación, en esta se inicia con doble "**" ademas de que se
		 * incorpora un "*" en cada nueva línea,
		 * 
		 * Se requieren algunos "componentes" para indicar los omponentes del código fuente, tales
		 * como parámetros, tipos de retorno, entre otros. 
		 * Estos componentes normalmente se preceden de un @, por ejemplo para indicar un 
		 * parámetro de una función de usa @param, o para indicar dealles sobre el retorno se usa
		 * @return 
		 */
		
		/**
		 * Este método se encarga de iniciar la ejecución del programa
		 * Este es el método principal del proyecto
		 * @param args[] es un arreglo con los parámetros que se reciba por la consola
		 * @return void    
		 */
	
		
	
		/**
		 * Este método se encarga de mostrar un saludo al usuario
		 * @author Soox
		 * @param nombre es una cadena de texto con el nombre a usar
		 * @return El mensaje usado para el saludo
	     */
	public static String mostrarSaludo(String nombre) {
		String mensaje = "Hola " + nombre;
		System.out.println(mensaje);
		return mensaje;
	}
	
	//Tipos de datos primitivos
	
	byte numeroEntero = 127; //numero entero capacidad 8 bits
	short numeroEntero1 = 32767; //numero entero capacidad 16 bits
	int numeroEntero2 = 1999; //numero entero capacidad 32 bits
	long numeroEntero3 = 355514169; //numero entero capacidad 64 bits
	float flotante = 3.1f; //numero decimal capacidad 32bits
	double decimal = 3.1416; //numero decimal capacidad 64bits
	boolean desicion = true; //solo admite true o false con capacidad de 1 bit
	char caracter = '@'; //un caracter de cualquier tipo capacidad 16bits
	String cadena = "esta es una cadena de texto";//almacenas varios caracteresn en cadena cualquier tipo
	
	

}


























