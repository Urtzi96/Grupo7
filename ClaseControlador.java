import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

public class ClaseControlador implements ActionListener {
    ClaseModelo objModelo = null;
	ClaseVista objVista = null;
	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo) { 
		this.objModelo = objModelo; 
		this.objVista = objVista; 
		actionListener(this); // Escuchador para el botón 
	}
    
	@Override 
	public void actionPerformed(ActionEvent objEvento) { 
		try {

			// Capturamos el dinero que el usuario trae al casino 
			String dineroActual = this.objVista.tuDinero.getText(); 
			
			// Capturamos la apuesta que va a hacer el usuario
			String tuApuesta = this.objVista.tuDinero.getText();

            // Capturamos la apuesta que va a hacer el usuario
			if(objEvento.getSource()==objVista.botonSiguiente){
			   boolean x=objModelo.cambioVentana();
			}
			objVista = new ClaseVista(true);
			
		}
		catch(Exception objExcepcion) {
			objExcepcion.printStackTrace();
		}
	}
	public void actionListener(ActionListener escuchador) {
		objVista.botonSiguiente.addActionListener(escuchador);
		objVista.pedirCarta.addActionListener(escuchador);
		objVista.plantarse.addActionListener(escuchador);
	}
}