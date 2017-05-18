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
	
	public void quitarCartasUs(){
		objVista2.fondoas.setVisible(false);
		objVista2.fondo2.setVisible(false);
		objVista2.fondo3.setVisible(false);
		objVista2.fondo4.setVisible(false);
		objVista2.fondo5.setVisible(false);
		objVista2.fondo6.setVisible(false);
		objVista2.fondo7.setVisible(false);
		objVista2.fondo8.setVisible(false);
		objVista2.fondo9.setVisible(false);
		objVista2.fondo10.setVisible(false);
		objVista2.fondoJ.setVisible(false);
		objVista2.fondoQ.setVisible(false);
		objVista2.fondoK.setVisible(false);	
	}
	
	public void quitarCartasCr(){
		objVista2.fondo2as.setVisible(false);
		objVista2.fondo22.setVisible(false);
		objVista2.fondo23.setVisible(false);
		objVista2.fondo24.setVisible(false);
		objVista2.fondo25.setVisible(false);
		objVista2.fondo26.setVisible(false);
		objVista2.fondo27.setVisible(false);
		objVista2.fondo28.setVisible(false);
		objVista2.fondo29.setVisible(false);
		objVista2.fondo210.setVisible(false);
		objVista2.fondo2J.setVisible(false);
		objVista2.fondo2Q.setVisible(false);
		objVista2.fondo2K.setVisible(false);
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
		int cartaA;
		int cartaB;

		try {
			dineroActual = objVista.tuDinero.getText();
			tuApuesta = objVista.tuApuesta.getText();
			try{
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
			}catch(NumberFormatException e){
				
			}


			if(objEvento.getSource()==objVista2.pedirCarta){
				quitarCartasUs();
				cartaA=objModelo.crearCarta();
				if(cartaA==1){
					objVista2.fondoas.setVisible(true);
				}else if(cartaA==2){
					objVista2.fondo2.setVisible(true);
				}else if(cartaA==3){
					objVista2.fondo3.setVisible(true);
				}else if(cartaA==4){
					objVista2.fondo4.setVisible(true);
				}else if(cartaA==5){
					objVista2.fondo5.setVisible(true);
				}else if(cartaA==6){
					objVista2.fondo6.setVisible(true);
				}else if(cartaA==7){
					objVista2.fondo7.setVisible(true);
				}else if(cartaA==8){
					objVista2.fondo8.setVisible(true);
				}else if(cartaA==9){
					objVista2.fondo9.setVisible(true);
				}else if(cartaA==10){
					objVista2.fondo10.setVisible(true);
				}else if(cartaA==11){
					objVista2.fondoJ.setVisible(true);
				}else if(cartaA==12){
					objVista2.fondoQ.setVisible(true);
				}else if(cartaA==13){
					objVista2.fondoK.setVisible(true);
				}
				A=objModelo.valorC(cartaA);
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
						if(con<0){
							objVista4.tienes.setText("NO TE QUEDA DINERO PARA APOSTAR");
							objVista4.otrasi.setEnabled(false);
						}
					}
				}
			}

			if(objEvento.getSource()==objVista2.plantarse){
				objVista2.pedirCarta.setEnabled(false);
				objVista2.plantarse.setVisible(false);
				objVista2.actualizar.setVisible(true);
				objVista2.actualizar.setEnabled(true);
				objVista2.plantarse.setEnabled(false);
			}
			
			if(objEvento.getSource()==objVista2.actualizar){
				quitarCartasCr();
				cartaB=objModelo.crearCarta();
				if(cartaB==1){
					objVista2.fondo2as.setVisible(true);
				}else if(cartaB==2){
					objVista2.fondo22.setVisible(true);
				}else if(cartaB==3){
					objVista2.fondo23.setVisible(true);
				}else if(cartaB==4){
					objVista2.fondo24.setVisible(true);
				}else if(cartaB==5){
					objVista2.fondo25.setVisible(true);
				}else if(cartaB==6){
					objVista2.fondo26.setVisible(true);
				}else if(cartaB==7){
					objVista2.fondo27.setVisible(true);
				}else if(cartaB==8){
					objVista2.fondo28.setVisible(true);
				}else if(cartaB==9){
					objVista2.fondo29.setVisible(true);
				}else if(cartaB==10){
					objVista2.fondo210.setVisible(true);
				}else if(cartaB==11){
					objVista2.fondo2J.setVisible(true);
				}else if(cartaB==12){
					objVista2.fondo2Q.setVisible(true);
				}else if(cartaB==13){
					objVista2.fondo2K.setVisible(true);
				}
				B=objModelo.valorC(cartaB);
				if(B==1 && totalCr<=10){
					B=11;
				}
				totalCr=objModelo.totalCartaCr(B);
				objVista2.sumaCroupier.setText("El croupier tiene: "+totalCr);
				if(objModelo.stop(totalCr)==true){
					objVista2.actualizar.setEnabled(false);
					
					c1=objModelo.getUs();
					c2=objModelo.getCr();

					if(c2>21){
						objVista4.ganaspierdes.setText("HAS GANADO");
						dineroActual=Integer.toString(objModelo.suma());
						objModelo.Money(Integer.parseInt(dineroActual));
						objVista4.tienes.setText("TIENES "+dineroActual+" €");
						objVista4.setVisible(true);

						con=0;//Si ganas, no hace falta esto verdad????????
						con=objModelo.condicion();
						if(con<0){
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
						if(con<0){
							objVista4.tienes.setText("NO TE QUEDA DINERO PARA APOSTAR");
							objVista4.otrasi.setEnabled(false);
						}
					}else if(c1==c2){
						objVista4.ganaspierdes.setText("EMPATE");
						dineroActual=Integer.toString(objModelo.getMoney());
						objVista4.tienes.setText("TIENES "+dineroActual+" €");
						objVista4.setVisible(true);

					}else{
						objVista4.ganaspierdes.setText("HAS PERDIDO");
						dineroActual=Integer.toString(objModelo.resta());
						objModelo.Money(Integer.parseInt(dineroActual));
						objVista4.tienes.setText("TIENES "+dineroActual+" €");
						objVista4.setVisible(true);

						con=0;
						con=objModelo.condicion();
						if(con<0){
							objVista4.tienes.setText("NO TE QUEDA DINERO PARA APOSTAR");
							objVista4.otrasi.setEnabled(false);
						}
					}
				}
			}

			if(objEvento.getSource()==objVista3.uno){//En los botones uno y once se repite código. MODULAR??
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
					if(con<0){
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
					if(con<0){
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

				objVista2.apuesta.setText("Apuesta: "+tuApuesta+"€");//Podríamos hacer que se pudiera cambiar la apuesta muy facil, SI NO?
				
				objVista2.pedirCarta.setVisible(true);
				objVista2.pedirCarta.setEnabled(true);
				objVista2.plantarse.setVisible(true);
				objVista2.plantarse.setEnabled(true);
				objVista2.actualizar.setVisible(false);
				
				quitarCartasUs();
				quitarCartasCr();
				
				objVista4.setVisible(false);
			}

			if(objEvento.getSource()==objVista4.otrano){
				System.exit(0);
			}			
		}
		catch(Exception objExcepcion) {

		}
	}
	public void actionListener(ActionListener escuchador) {
		objVista.botonSiguiente.addActionListener(escuchador);
		objVista2.pedirCarta.addActionListener(escuchador);
		objVista2.plantarse.addActionListener(escuchador);
		objVista2.actualizar.addActionListener(escuchador);
		objVista3.uno.addActionListener(escuchador);
		objVista3.once.addActionListener(escuchador);
		objVista4.otrasi.addActionListener(escuchador);
		objVista4.otrano.addActionListener(escuchador);
	}
}
