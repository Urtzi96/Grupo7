
public class ClasePrincipal {

	public static void main(String args[]) {
		ClaseModelo modelo = new ClaseModelo(); 
		ClaseVista vista = new ClaseVista();
		ClaseVista vista2 = new ClaseVista(false);
		ClaseVista vista3 = new ClaseVista(12);
		ClaseVista vista4 = new ClaseVista("RESULTADO");

		try{
			new ClaseControlador(vista, modelo, vista2, vista3, vista4); 
		}catch(NullPointerException e){
			System.out.println("Error, objetos nulos.");
		}
	} 
}