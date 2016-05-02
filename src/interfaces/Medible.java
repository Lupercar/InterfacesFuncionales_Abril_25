package interfaces;

public interface Medible {
	// Hacemos un enumerado para unidades de medida
	enum Unidad {
		M, CM
	};
	
//	Convertira un valor al SI (metros) a una medida 
//	destino concreta 
	double getUnidad(Unidad unidad, double valor); 
}
