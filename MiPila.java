package listasenlazadas;

import java.util.Iterator;
import java.util.Stack;

public class MiPila {
	
	// Implemento una pila de String con Stack
	private Stack<String> pila;
	
	// Constructor (instancio la clase)
	public MiPila() {
		this.pila = new Stack<>();
	}
	
	// Un método que me dice si la pila está vacía o no
	public boolean pilaVacia() {
		if(!this.pila.empty()) return false;
		else return true;
	}
	
	// Método push -> Para insertar objetos en la pila
	public void pilaPush(String s) {
		this.pila.push(s);
	}
	
	//  Método pop -> Para sacar el último de los datos de la pila
	public String pilaPop() {
		if(!pilaVacia()) return this.pila.pop(); 
		else return null; //Solo si la pila no está vacía
	}
	
	
	// Método top -> Para devolver el elemento que está en el final de la pila
	public String pilaTop() {
		if(!pilaVacia()) return this.pila.peek();
		else return null; //Solo si la pila no está vacía
	}


	// Método search -> Para buscar el índice en el que está un elemento concreto en la pila
	public int pilaSearch(String s) {
		if(!pilaVacia()) return this.pila.search(s);
		else return -1;
	}
	
	// Implemento un método con Iterator para recorrer la pila
	public void recorrerPila() {
		Iterator<String> it = this.pila.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
	// Implemento un método para vaciar la pila con un Iterator
	public void vaciarPila() {
		Iterator<String> it = this.pila.iterator();
		if(!pilaVacia()) {
			do {
				pilaPop();
			}while(it.hasNext());
		}
	}

	// getter y setter
	
	Stack<String> getPila() {
		return pila;
	}

	void setPila(Stack<String> pila) {
		this.pila = pila;
	}

}
