import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

public class ClaseControlador implements ActionListener {
	ClaseModelo objModelo=null;
	ClaseVista objVista=null;
	ClaseVista objVista2=null;
	ClaseVista objVista3=null;
	ClaseVista objVista4=null;
	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo, ClaseVista objVista2, ClaseVista objVista3, ClaseVista objVista4) { 
		this.objModelo = objModelo; 
		this.objVista = objVista;
		this.objVista2 = objVista2;
		this.objVista3 = objVista3;
		this.objVista4 = objVista4;
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
		int c1=0;
		int c2=0;
		int con;

		try {
			dineroActual = objVista.tuDinero.getText();
			tuApuesta = objVista.tuApuesta.getText();

			if(objEvento.getSource()==objVista.botonSiguiente){
				objModelo.Money(Integer.parseInt(dineroActual));
				objModelo.Apuesta(Integer.parseInt(tuApuesta));
				if(Integer.parseInt(dineroActual)>=Integer.parseInt(tuApuesta)){
					objVista.setVisible(false);
					objVista2.setVisible(true);
					objVista2.dineroTotal.setText("Dinero: "+dineroActual+"€");
					objVista2.apuesta.setText("Apuesta: "+tuApuesta+"€");
				}
			}


			if(objEvento.getSource()==objVista2.pedirCarta){
				A=objModelo.crearCarta();
				if(A==1){
					objVista3.setVisible(true);
					objVista2.pedirCarta.setEnabled(false);
					objVista2.plantarse.setEnabled(false);						
				}else{
					objVista2.pedirCarta.setEnabled(true);
					objVista2.plantarse.setEnabled(true);
					totalUs=objModelo.totalCartaUs(A);
					objVista2.sumaUsuario.setText("Tienes: "+totalUs);
					if(totalUs>21){
						objVista2.pedirCarta.setEnabled(false);
						objVista2.plantarse.setEnabled(false);
						objVista4.ganaspierdes.setText("HAS PERDIDO");
						dineroActual=Integer.toString(objModelo.resta());
						objModelo.Money(Integer.parseInt(dineroActual));
						objVista4.tienes.setText("TIENES "+dineroActual+" €");
						objVista4.setVisible(true);
						
						con=0;
						con=objModelo.condicion();
						if(con<=0){
							objVista4.tienes.setText("NO TE QUEDA DINERO PARA APOSTAR");
							objVista4.otrasi.setEnabled(false);
						}
					}
				}
			}

			if(objEvento.getSource()==objVista2.plantarse){
				objVista2.pedirCarta.setEnabled(false);
				while(objModelo.stop(totalCr)==false){
					B=objModelo.crearCarta();
					totalCr=objModelo.totalCartaCr(B);
					objVista2.sumaCroupier.setText("El croupier tiene: "+totalCr);
					objModelo.espera();
				}
				objVista2.plantarse.setEnabled(false);
				
				c1=objModelo.getUs();
				c2=objModelo.getCr();
				
				if(c2>21){
					objVista4.ganaspierdes.setText("HAS GANADO");
					dineroActual=Integer.toString(objModelo.suma());
					objModelo.Money(Integer.parseInt(dineroActual));
					objVista4.tienes.setText("TIENES "+dineroActual+" €");
					objVista4.setVisible(true);
					
					con=0;
					con=objModelo.condicion();
					if(con<=0){
						objVista4.tienes.setText("NO TE QUEDA DINERO PARA APOSTAR");
						objVista4.otrasi.setEnabled(false);
					}
				}else if(c1>c2){					
					objVista4.ganaspierdes.setText("HAS GANADO");
					dineroActual=Integer.toString(objModelo.suma());
					objModelo.Money(Integer.parseInt(dineroActual));
					objVista4.tienes.setText("TIENES "+dineroActual+" €");
					objVista4.setVisible(true);
					
					con=0;
					con=objModelo.condicion();
					if(con<=0){
						objVista4.tienes.setText("NO TE QUEDA DINERO PARA APOSTAR");
						objVista4.otrasi.setEnabled(false);
					}
				}else{
					objVista4.ganaspierdes.setText("HAS PERDIDO");
					dineroActual=Integer.toString(objModelo.resta());
					objModelo.Money(Integer.parseInt(dineroActual));
					objVista4.tienes.setText("TIENES "+dineroActual+" €");
					objVista4.setVisible(true);
					
					con=0;
					con=objModelo.condicion();
					if(con<=0){
						objVista4.tienes.setText("NO TE QUEDA DINERO PARA APOSTAR");
						objVista4.otrasi.setEnabled(false);
					}
				}
			}
			
			if(objEvento.getSource()==objVista3.uno){
				objVista3.setVisible(false);
				A=1;
				objVista2.pedirCarta.setEnabled(true);
				objVista2.plantarse.setEnabled(true);
				totalUs=objModelo.totalCartaUs(A);
				objVista2.sumaUsuario.setText("Tienes: "+totalUs);
				if(totalUs>21){
					objVista2.pedirCarta.setEnabled(false);
					objVista2.plantarse.setEnabled(false);
					objVista4.ganaspierdes.setText("HAS PERDIDO");
					dineroActual=Integer.toString(objModelo.resta());
					objModelo.Money(Integer.parseInt(dineroActual));
					objVista4.tienes.setText("TIENES "+dineroActual+" €");
					objVista4.setVisible(true);
					
					con=0;
					con=objModelo.condicion();
					if(con<=0){
						objVista4.tienes.setText("NO TE QUEDA DINERO PARA APOSTAR");
						objVista4.otrasi.setEnabled(false);
					}
				}
			}
			
			if(objEvento.getSource()==objVista3.once){
				objVista3.setVisible(false);
				A=11;
				objVista2.pedirCarta.setEnabled(true);
				objVista2.plantarse.setEnabled(true);
				totalUs=objModelo.totalCartaUs(A);
				objVista2.sumaUsuario.setText("Tienes: "+totalUs);
				if(totalUs>21){
					objVista2.pedirCarta.setEnabled(false);
					objVista2.plantarse.setEnabled(false);
					objVista4.ganaspierdes.setText("HAS PERDIDO");
					dineroActual=Integer.toString(objModelo.resta());
					objModelo.Money(Integer.parseInt(dineroActual));
					objVista4.tienes.setText("TIENES "+dineroActual+" €");
					objVista4.setVisible(true);
					
					con=0;
					con=objModelo.condicion();
					if(con<=0){
						objVista4.tienes.setText("NO TE QUEDA DINERO PARA APOSTAR");
						objVista4.otrasi.setEnabled(false);
					}
				}
			}
			
			if(objEvento.getSource()==objVista4.otrasi){
				totalUs=0;
				objModelo.setUs(totalUs);
				objVista2.sumaUsuario.setText("Tienes: "+totalUs);
				
				totalCr=0;
				objModelo.setCr(totalCr);
				objVista2.sumaCroupier.setText("El croupier tiene: "+totalCr);
				
				dineroActual=Integer.toString(objModelo.getMoney());
				objVista2.dineroTotal.setText("Dinero: "+dineroActual+"€");
				
				objVista2.apuesta.setText("Apuesta: "+tuApuesta+"€");
				
				objVista2.pedirCarta.setEnabled(true);
				objVista2.plantarse.setEnabled(true);
				
				objVista4.setVisible(false);
			}
			
			if(objEvento.getSource()==objVista4.otrano){
				System.exit(0);
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
		objVista3.uno.addActionListener(escuchador);
		objVista3.once.addActionListener(escuchador);
		objVista4.otrasi.addActionListener(escuchador);
		objVista4.otrano.addActionListener(escuchador);
	}
}