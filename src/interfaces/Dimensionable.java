package interfaces;

//interfaz no funcional hereda tambi�n los m�todos de Medible y Pesable
//En total tiene 3 m�todos abstractos.
public interface Dimensionable extends Medible, Pesable{
	double getDimension( String unidadMedida); 
}
