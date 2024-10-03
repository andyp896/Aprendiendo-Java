public class SegundaClase {
	
	public static void main(String[] args) {

		/*
		 *  EJERCICIO:
		 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
		 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
		 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
		
		 * - Debes hacer print por consola del resultado de todos los ejemplos.
		 *
		 * DIFICULTAD EXTRA (opcional):
		 * Crea un programa que imprima por consola todos los números comprendidos
		 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
		 *
		 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
		 */
		
		//Operadores Aritméticos
		
		//suma +
		int resultado = 10 + 3; 
		System.out.println("La suma de 10 + 3 = " + resultado);
		
		//Resta -
		int resta = 13 - 10;
		System.out.println("La resta de 13 - 10 = " + resta);
		
		//Multiplicación *
		int multiplicacion = 3 * 3;
		System.out.println("La multiplicacion de 3 * 3 = " + multiplicacion);
		
		//Division /
		int division = 12 / 3;
		System.out.println("La division de 12 / 3 = " + division);
		
		//Modulo %
		int residuo = 7 % 3;
		System.out.println("El residuo de la division de 7 % 3 = " + residuo);
		
		//Incremento ++
		int incremento = 0;
		while(incremento < 11){
			System.out.println("El valor del incremento es " + incremento);
			incremento++;
		}
		
		//Decremento --
		int decremento = 10;
		while(decremento > -1) {
			System.out.println("El valor del decremento es " + decremento);
			decremento--;
		}
		
		//Operadores relacionales
		
		// igual a ==
		int a = 5;
		int b = 5;
		boolean esIgual = (a == b);
		System.out.println("Si nuestro dato1 es igual == a nuestro dato2 entonces el resultado es true: " + esIgual);
		
		// diferente de !=
		int c = 3;
		int d = 4;
		boolean esDiferente = (c != d);
		System.out.println("Si nuestro dato c(3) es difenrente del dato d(4) el resultado sera true: " + esDiferente);
		
		// mayor que > 
		int numero1 = 4;
		int numero2 = 3;
		if(numero1 > numero2) {
			System.out.println("El primer numero es mayor");
		}else {
			System.out.println("El segundo numero es mayor");
		}
		
		// menor que <
		int num1 = 3;
		int num2 = 4;
		if(num1 < num2) {
			System.out.println("El primer numero es menor");
		}else {
			System.out.println("El segundo numero es menor");
		}
		
		// mayor o igual que >=
		int mayorOIgual = 10;
		while(mayorOIgual >= 0){
			System.out.println("El valor disminuira hasta ser mayor o igual a 0 " + mayorOIgual);
			mayorOIgual--;
		}
		
		// menor o igual que <= 
		int menorOIgual = 0;
		while(menorOIgual <= 10){
			System.out.println("El valor aumentara hasta ser menor o igual a 10 " + menorOIgual);
			menorOIgual++;
		}
		
		//Operadores lógicos
		
		boolean x = true;
		boolean y = false;
		
		// and && true si ambas son verdaderas
		boolean andLogico = (x && y);
		System.out.println(andLogico);
		
		// or || true si almenos una condicion es verdadera
		boolean orLogico = (x || y);
		System.out.println(orLogico);
		
		// not ! invierte el valor de una condicion
		boolean notLogico =  !x;
		System.out.println(notLogico);
		
		/*
		 *   Utilizando las operaciones con operadores que tú quieras, crea ejemplos
		 *   que representen todos los tipos de estructuras de control que existan
		 *   en tu lenguaje:
		 *   Condicionales, iterativas, excepciones...
		 */
		
		 
		
		
		
	}
}
























