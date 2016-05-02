package consola;

import interfaces.Medible;
import interfaces.Medible.Unidad;
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
		
		Medible m1 = (u,v) -> {
			double valor = 0.0; 
			switch(u){
			case M: 
				valor = v; 
				break;
			case CM:
				valor = v*100; 
				break; 
			}
			return valor; 
		}; 
		
		//uso el método, nos devuelve el valor lo muestro por pantalla
		System.out.println(m1.getUnidad(Unidad.CM, 1));
		
	}
}
