package interfaces;

//interfaz no funcional hereda también los métodos de Medible y Pesable
//En total tiene 3 métodos abstractos.
public interface Dimensionable extends Medible, Pesable{
	double getDimension( String unidadMedida); 
}
