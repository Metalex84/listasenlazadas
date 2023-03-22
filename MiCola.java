package listasenlazadas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MiCola {
	
	// Implemento una cola de String con Queue y LinkedList
	private Queue<String> cola;

	// Constructor: instancio la clase
	public MiCola() {
		this.cola = new LinkedList<>();
	}

	// Un método que me dice si la cola está vacía o no
	public boolean colaVacia() {
		if(!this.cola.isEmpty()) return false;
		else return true;
	}
	
	// Método add -> Para insertar objetos en la cola
	public void colaAdd(String s) {
		this.cola.add(s);
	}
	
	//  Método poll -> Para sacar el último de los nodos de la cola (eliminandolo)
	public String colaPoll() {
		if(!colaVacia()) return this.cola.poll(); 
		else return null; //Solo si la cola no está vacía
	}
	
	// Método peek -> Para devolver el nodo al final de la cola (sin borrarlo)
	public String colaPeek() {
		if(!colaVacia()) return this.cola.peek();
		else return null; //Solo si la cola no está vacía
	}
	

	// Implemento un método para recorrer la cola y mostrarla en pantalla
	public void recorrerCola() {
		Iterator<String> it = this.cola.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
	
	// Implemento un método para vaciar la cola con un Iterator
	public void vaciarCola() {
		Iterator<String> it = this.cola.iterator();
		if(!colaVacia()) {
			do {
				colaPoll();
			}while(it.hasNext());
		}
	}
	
	// getter y setter
	Queue<String> getCola() {
		return cola;
	}

	void setCola(Queue<String> cola) {
		this.cola = cola;
	}

}
