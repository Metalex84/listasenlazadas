package listasenlazadas;

public class PrincipalUD6 {

	public static void main(String[] args) {
		
		// Operaciones con pilas
		MiPila miStack = new MiPila();
		
		// Voy haciendo inserciones en la pila
		miStack.pilaPush("Hola"); 
		miStack.pilaPush("soy");
		miStack.pilaPush("Coco");
		miStack.pilaPush("y");
		miStack.pilaPush("me");
		miStack.pilaPush("gustan");
		miStack.pilaPush("las");
		miStack.pilaPush("galletas");	
		
		// Hago comprobaciones sobre los elementos que conforman actualmente la pila
		System.out.print("Mi pila es: ");
		miStack.recorrerPila();
		System.out.println("El elemento Coco esta en la posicion "+ miStack.pilaSearch("Coco")); 
		System.out.println("El elemento galletas esta en la posicion "+ miStack.pilaSearch("galletas")); 
		System.out.println("Por lo tanto, el elemento Top of Stack es " + miStack.pilaTop()); 
		
		// Ahora extraigo un elemento de la pila y evalúo en qué estado está
		miStack.pilaPop(); 
		System.out.print("Ahora mi pila es: ");
		miStack.recorrerPila(); // 
		System.out.println("Y el elemento Top of Stack es: "+miStack.pilaTop()); // y lo compruebo aquí
		
		// Ahora inserto un nuevo elemento; veo en qué estado se encuentra
		miStack.pilaPush("fallas");
		System.out.print("Tras una insercion mi pila es: ");
		miStack.recorrerPila(); 
		System.out.println("Y el elemento Top of Stack es: " + miStack.pilaTop());


		// Realizo otra extracción más y vuelvo a comprobar cómo está la pila
		miStack.pilaPop();
		System.out.print("Tras la ultima extraccion mi pila es: ");
		miStack.recorrerPila(); // Vuelvo a recorrer la pila...
		System.out.println("El elemento que ahora esta en Top of Stack es: " + miStack.pilaTop()); // ... y muestro cuál es ahora el último elemento
		System.out.println("Ahora Coco ha cambiado a la posicion " + miStack.pilaSearch("Coco")); // Ahora me devuelve la posición 5 de la pila
		System.out.println("Y galletas, como ya no esta, se considera en la posicion " + miStack.pilaSearch("galletas")); // Me devuelve -1 porque no se encuentra el objeto
		
		// Vacío la pila y compruebo si se ha hecho correctamente o no
		System.out.println("Vaciando la pila...");
		miStack.vaciarPila();
		if(miStack.pilaVacia())	System.out.println("Ahora la pila esta vacia.\n");
		else System.out.println("Uy, algo ha ido mal y no se ha podido vaciar la pila.\n");
		
		//***********************************************************************************
		
		// Operaciones con colas
		MiCola miQueue = new MiCola();
		
		// Voy haciendo inserciones en la cola
		miQueue.colaAdd("Tengo"); 
		miQueue.colaAdd("el");
		miQueue.colaAdd("corazon");
		miQueue.colaAdd("contento");
		
		// Y voy comprobando su estado actual
		System.out.print("Mi cola es: ");
		miQueue.recorrerCola(); //
		System.out.println("El ultimo elemento de la cola es " + miQueue.colaPeek()); //Saco por pantalla el último elemento de la cola
		
		//Extraigo el último elemento de la cola, a ver qué pasa
		miQueue.colaPoll();  
		System.out.print("Extraigo y ahora mi cola es: ");
		miQueue.recorrerCola(); 
		
		// Vuelvo a hacer inserciones y a reevaluar la cola
		miQueue.colaAdd("de"); 
		miQueue.colaAdd("verdad");
		System.out.print("Tras las ultimas inserciones, la cola actual es: ");
		miQueue.recorrerCola(); 
		
		//Extraigo de nuevo y reevalúo la cola
		miQueue.colaPoll();  
		System.out.print("De nuevo, extraigo y ahora mi cola es: ");
		miQueue.recorrerCola(); 
		
		// Vacío la cola y compruebo si se ha hecho correctamente o no
		System.out.println("Vaciando la cola...");
		miQueue.vaciarCola();
		if (miQueue.colaVacia()) System.out.println("Ahora la cola esta vacia.\n");
		else System.out.println("Uy, algo ha ido mal y no se ha podido vaciar la cola.\n");
		
		
	}

}
