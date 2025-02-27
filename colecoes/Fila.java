package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		//Offer e Add -> adicionam elementos na fila
		//Diferen�a � o comportamento quando a fila est� cheia
		//O "add" joga um problema(exception) e o "offer" retorna falso
		fila.add("Ana");//retorna falso
		fila.offer("Bia");//lan�a excessao
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
	
		//Peek e Element -> obter o pr�ximo elemento
		//da fila sem remover
		//Diferen�a � o comportamento quando a fila est� vazia
		//"peek" retorna nulo e "element" retorna erro
		System.out.println(fila.peek());//retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element());//lan�a uma exce��o
		System.out.println(fila.element());
				
		//Pool e Remove -> obter o pr�ximo elemento
		//da fila e remove!
		
		//Diferen�a � o comortamento ocorre
		//quando a fila est� vazia!
		System.out.println(fila.poll());//retorna false
		System.out.println(fila.remove());//lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
	}
}
