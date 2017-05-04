import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClaseVista extends JFrame {

	private static final long serialVersionUID = 1L;
	//DECLARACION SEGUNDA VENTANA
	Container bloqueContenedor = null; 
	Container cartaCroupier = null;
	Container cartaUsuario = null;
	JLabel sumaCroupier= null; 
	JLabel dineroTotal= null; //El dinero se introducirá en la primera ventana.
	JLabel apuesta= null; //La apuesta se realizará en la primera ventana.
	JLabel sumaUsuario= null; 
	JButton pedirCarta = null;
	JButton plantarse = null;
	private static JPanel panel1 = new JPanel();
	private static JPanel panel2 = new JPanel();
	private static JPanel panel3 = new JPanel();
	private static JPanel panel4 = new JPanel();
	
	
	
	//DECLARACION PRIMERA VENTANA
	Container bloqueContenedor2 = null; 
	JLabel dineroVenido = null; //Con cuanto dinero has venido
	JLabel dineroApuesta = null; //Cuanto vas a apostar
	JTextField tuDinero= null; 
	JTextField tuApuesta= null; 
	JButton botonSiguiente = null;
	private static JPanel panel5 = new JPanel();
	private static JPanel panel6 = new JPanel();
	private static JPanel panel7 = new JPanel();
	private static JPanel panel8 = new JPanel();
	
	
	// IMPORTANDO VALORES EN PRIMERA VENTANA
	public ClaseVista(){
		bloqueContenedor2 = getContentPane(); 
		setTitle("Black Jack"); 
		setLayout(new GridLayout(0,1));
		setSize(1000,1000);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		dineroVenido = new JLabel("Con cuanto dinero has venido?");
		dineroApuesta = new JLabel("Cuanto dinero vas a apostar?");
		tuDinero = new JTextField();
		tuApuesta = new JTextField();
		botonSiguiente = new JButton("Jugar");
		
		panel5.add(dineroVenido);
		panel6.add(dineroApuesta);
		panel7.add(tuDinero);
		panel8.add(tuApuesta);
		
		bloqueContenedor2.add(panel5);
		bloqueContenedor2.add(panel7);
		bloqueContenedor2.add(panel6); 
		bloqueContenedor2.add(panel8); 
		
		dineroVenido.setHorizontalAlignment(JLabel.CENTER);
		dineroApuesta.setHorizontalAlignment(JLabel.CENTER);
		tuDinero.setHorizontalAlignment(JTextField.CENTER);
		tuApuesta.setHorizontalAlignment(JTextField.CENTER);
		botonSiguiente.setHorizontalAlignment(JButton.CENTER);

		setVisible(true);

	}

	//IMPORTANDO VALORES EN SEGUNDA VENTANA
	public ClaseVista(boolean cambioVentana) {
		bloqueContenedor = getContentPane(); 
		setTitle("Black Jack"); 
		setLayout(new FlowLayout()); 
		setSize(1000,1000);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		sumaCroupier = new JLabel("El croupier tiene "/*añadir metodo*/);
		dineroTotal = new JLabel("Dinero: \n" /*Añadir dinero*/ );
		apuesta = new JLabel("Apuesta: \n " /*Añadir apuesta*/);
		sumaUsuario = new JLabel("Tienes "/*añadir metodo*/);
		pedirCarta = new JButton("Pedir Carta");
		plantarse = new JButton("Plantarse");

		panel1.add(sumaCroupier);
		panel2.add(dineroTotal);
		panel3.add(apuesta);
		panel4.add(sumaUsuario);
		
		bloqueContenedor.add(panel1);
		bloqueContenedor.add(panel2);
		bloqueContenedor.add(panel3); 
		bloqueContenedor.add(pedirCarta);  
		bloqueContenedor.add(panel4);
		bloqueContenedor.add(plantarse);

		sumaCroupier.setHorizontalAlignment(JLabel.CENTER);
		apuesta.setHorizontalAlignment(JLabel.CENTER);
		sumaUsuario.setHorizontalAlignment(JLabel.CENTER);
		dineroTotal.setHorizontalAlignment(JLabel.RIGHT);
		pedirCarta.setHorizontalAlignment(JButton.LEFT);
		plantarse.setHorizontalAlignment(JButton.RIGHT);

		setVisible(false);

		if(cambioVentana == true){
			setVisible(true);
		}
	}
}
