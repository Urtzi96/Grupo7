import java.awt.BorderLayout;
import java.awt.Container;
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
	private static JPanel panel10 = new JPanel();
	private static JPanel panel11 = new JPanel();

	//DECLARACION TERCERA VENTANA
	Container bloqueContenedor3 = null; 
	JLabel pregunta=null;
	JButton uno=null;
	JButton once=null;
	private static JPanel panel20 = new JPanel();
	private static JPanel panel21 = new JPanel();
	private static JPanel panel22 = new JPanel();

	//DECLARACION CUARTA VENTANA
	Container bloqueContenedor4 = null; 
	JLabel ganaspierdes=null;
	JLabel otrapartida=null;
	JButton otrasi=null;
	JButton otrano=null;
	private static JPanel panel23 = new JPanel();
	private static JPanel panel24 = new JPanel();
	private static JPanel panel25 = new JPanel();
	private static JPanel panel26 = new JPanel();

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
	private static JPanel panel9 = new JPanel();

	// IMPORTANDO VALORES EN PRIMERA VENTANA
	public ClaseVista(){
		bloqueContenedor2 = getContentPane(); 
		setTitle("Black Jack"); 
		setLayout(new GridLayout(0,1));
		setSize(700,700);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		dineroVenido = new JLabel("Con cuanto dinero has venido?");
		dineroApuesta = new JLabel("Cuanto dinero vas a apostar?");
		tuDinero = new JTextField("", 8);
		tuApuesta = new JTextField("", 8);
		botonSiguiente = new JButton("Jugar");

		panel5.add(dineroVenido);
		panel6.add(dineroApuesta);
		panel7.add(tuDinero);
		panel8.add(tuApuesta);
		panel9.add(botonSiguiente);

		bloqueContenedor2.add(panel5);
		bloqueContenedor2.add(panel7);
		bloqueContenedor2.add(panel6); 
		bloqueContenedor2.add(panel8); 
		bloqueContenedor2.add(panel9); 


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
		setLayout(new BorderLayout()); 
		setSize(700,700);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		sumaCroupier = new JLabel("El croupier tiene "/*añadir metodo*/);
		dineroTotal = new JLabel();
		apuesta = new JLabel();
		sumaUsuario = new JLabel("Tienes "/*añadir metodo*/);
		pedirCarta = new JButton("Pedir Carta");
		plantarse = new JButton("Plantarse");

		panel1.add(sumaCroupier);
		panel2.add(dineroTotal);
		panel3.add(apuesta);
		panel4.add(sumaUsuario);
		panel10.add(pedirCarta);
		panel11.add(plantarse);


		bloqueContenedor.add(panel1, BorderLayout.NORTH);
		dineroTotal.setHorizontalAlignment(JLabel.RIGHT);
		bloqueContenedor.add(panel2, BorderLayout.NORTH);
		bloqueContenedor.add(panel1, BorderLayout.CENTER); 
		bloqueContenedor.add(panel4, BorderLayout.SOUTH);
		bloqueContenedor.add(panel10, BorderLayout.WEST);
		bloqueContenedor.add(panel11, BorderLayout.EAST);


		setVisible(cambioVentana);
	}

	//IMPORTANDO VALORES EN TERCERA VENTANA
	public ClaseVista(int A) {
		bloqueContenedor3 = getContentPane(); 
		setTitle("VALOR DEL AS"); 
		setLayout(new BorderLayout()); 
		setSize(300,140);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		pregunta = new JLabel("Que valor quieres que tenga el AS?");
		uno = new JButton("1");
		once = new JButton("11");

		panel20.add(pregunta);
		panel21.add(uno);
		panel22.add(once);

		bloqueContenedor3.add(panel20, BorderLayout.NORTH);
		bloqueContenedor3.add(panel21, BorderLayout.WEST);
		bloqueContenedor3.add(panel22, BorderLayout.EAST);


		setVisible(false);
	}

	//IMPORTANDO VALORES EN CUARTA VENTANA
	public ClaseVista(String b) {
		bloqueContenedor4 = getContentPane(); 
		setTitle("RESULTADO"); 
		setLayout(new BorderLayout()); 
		setSize(300,140);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		ganaspierdes = new JLabel();
		otrapartida = new JLabel("Quieres jugar otra vez?");
		otrasi = new JButton("SI");
		otrano = new JButton("NO");

		panel23.add(ganaspierdes);
		panel24.add(otrapartida);
		panel25.add(otrasi);
		panel26.add(otrano);

		bloqueContenedor3.add(panel23, BorderLayout.NORTH);
		bloqueContenedor3.add(panel24, BorderLayout.CENTER);
		bloqueContenedor3.add(panel25, BorderLayout.EAST);
		bloqueContenedor3.add(panel25, BorderLayout.WEST);

		setVisible(false);
	}
}
