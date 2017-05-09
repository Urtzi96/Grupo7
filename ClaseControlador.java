import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

public class ClaseControlador implements ActionListener {
	ClaseModelo objModelo=null;
	ClaseVista objVista=null;
	ClaseVista objVista2=null;
	ClaseVista objVista3=null;
	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo, ClaseVista objVista2, ClaseVista objVista3) { 
		this.objModelo = objModelo; 
		this.objVista = objVista;
		this.objVista2 = objVista2;
		this.objVista3 = objVista3;
		actionListener(this); // Escuchador para el botón 
	}

	@Override 
	public void actionPerformed(ActionEvent objEvento) { 
		String dineroActual;
		String tuApuesta;
		int A;
		int B;
		int totalUs=0;
		int totalCr=0;
		String valorAs=null;

		try {
			dineroActual = objVista.tuDinero.getText();
			objModelo.Money(Integer.parseInt(dineroActual));

			tuApuesta = objVista.tuApuesta.getText();
			objModelo.Money(Integer.parseInt(tuApuesta));

			if(objEvento.getSource()==objVista.botonSiguiente){
				objVista.setVisible(false);
				objVista2.setVisible(true);
				objVista2.dineroTotal.setText("Dinero: "+dineroActual+"€");
				objVista2.apuesta.setText("Apuesta: "+tuApuesta+"€");
			}


			if(objEvento.getSource()==objVista2.pedirCarta){
				A=objModelo.crearCarta();
				if(A==1){
					objVista3.setVisible(true);
					valorAs=objVista3.respuesta.getText();
					
				}
				totalUs=objModelo.totalCartaUs(A);
				objVista2.sumaUsuario.setText("Tienes: "+totalUs);
				if(totalUs>21){
					System.out.println("TE PAZAAAZTE");
					objVista2.pedirCarta.setEnabled(false);
					objVista2.plantarse.setEnabled(false);
				}
			}

			if(objEvento.getSource()==objVista2.plantarse){
				objVista2.pedirCarta.setEnabled(false);
				while(objModelo.stop(totalCr)==false){
					B=objModelo.crearCarta();
					if(B==1){
						B=objModelo.as(1);//Aqui 1 o 11 nosecomo.
					}
					totalCr=objModelo.totalCartaCr(B);
					objVista2.sumaCroupier.setText("El croupier tiene: "+totalCr);
					objModelo.espera();
				}
				objVista2.plantarse.setEnabled(false);
			}
			
			if(objEvento.getSource()==objVista3.aceptar){
				objVista3.setVisible(false);
			}
		}
		catch(Exception objExcepcion) {
			objExcepcion.printStackTrace();
		}
	}
	public void actionListener(ActionListener escuchador) {
		objVista.botonSiguiente.addActionListener(escuchador);
		objVista2.pedirCarta.addActionListener(escuchador);
		objVista2.plantarse.addActionListener(escuchador);
		objVista3.aceptar.addActionListener(escuchador);
	}
}