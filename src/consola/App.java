package consola;

import interfaces.Pesable;

public class App {

	public static void main(String[] args) {
//		creo un objeto de esa interface Pesable, 
//		objeto que debe implementar el metodo que tiene la interfaz
		Pesable p1 = new Pesable() {
			
			@Override
			public double getPeso() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
//		A partir de Java8 tenemos las expresiones lambda, la cual 
//		nos devuelve un codigo fuente. 
		Pesable p2 = () -> {//varias líneas de codigo con llaves + comando return si hace falta.
								return 0.0; 
							};
		
		Pesable p3 = () -> 0.0; //una linea de codigo se entiende que es el return
	}
}
