package consola;

import interfaces.Pesable;

public class App {

	public static void main(String[] args) {
//		creo un objeto de esa interface Pesable, 
//		objeto que debe implementar el metodo que tiene la interfaz
		Pesable p = new Pesable() {
			
			@Override
			public double getPeso() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}
