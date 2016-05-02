package interfaces;
/*
 * Las interfaces funcionales son interfaces pero en JAVA8 se le llaman 
 * así a las interfaces que tienen un unico metodo abstracto al que 
 * poner codigo. 
 */

//interfaz funcional
@FunctionalInterface
public interface Pesable {
	double getPeso(); //metodo que nos devuelva el peso.
}
