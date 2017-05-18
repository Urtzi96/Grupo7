import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClaseVista extends JFrame {

	private static final long serialVersionUID = 1L;
	// DECLARACION PRIMERA VENTANA
	Container bloqueContenedor2 = null;
	JLabel dineroVenido = null; // Con cuanto dinero has venido
	JLabel dineroApuesta = null; // Cuanto vas a apostar
	JTextField tuDinero = null;
	JTextField tuApuesta = null;
	JButton botonSiguiente = null;
	private static JPanel panel5 = new JPanel();
	private static JPanel panel6 = new JPanel();
	private static JPanel panel7 = new JPanel();
	private static JPanel panel8 = new JPanel();
	private static JPanel panel9 = new JPanel();

	// DECLARACION SEGUNDA VENTANA
	Container bloqueContenedor = null;
	Container cartaCroupier = null;
	Container cartaUsuario = null;
	JLabel sumaCroupier = null;
	JLabel dineroTotal = null; // El dinero se introducirá en la primera
								// ventana.
	JLabel apuesta = null; // La apuesta se realizará en la primera ventana.
	JLabel sumaUsuario = null;
	JButton pedirCarta = null;
	JButton plantarse = null;
	private static JPanel panel1 = new JPanel();
	private static JPanel panel2 = new JPanel();
	private static JPanel panel3 = new JPanel();
	private static JPanel panel4 = new JPanel();
	private static JPanel panel10 = new JPanel();
	private static JPanel panel11 = new JPanel();
	
	

	// DECLARACION TERCERA VENTANA
	Container bloqueContenedor3 = null;
	JLabel pregunta = null;
	JButton uno = null;
	JButton once = null;
	private static JPanel panel20 = new JPanel();
	private static JPanel panel21 = new JPanel();
	private static JPanel panel22 = new JPanel();

	// DECLARACION CUARTA VENTANA
	Container bloqueContenedor4 = null;
	JLabel ganaspierdes = null;
	JLabel otrapartida = null;
	JButton otrasi = null;
	JButton otrano = null;
	JLabel tienes = null;
	private static JPanel panel23 = new JPanel();
	private static JPanel panel24 = new JPanel();
	private static JPanel panel25 = new JPanel();
	private static JPanel panel26 = new JPanel();
	private static JPanel panel27 = new JPanel();

	// IMPORTANDO VALORES EN PRIMERA VENTANA
	public ClaseVista() {
		bloqueContenedor2 = getContentPane();
		setTitle("Black Jack");
		setLayout(new FlowLayout());
		bloqueContenedor2.setLayout(null);
		setSize(645, 255);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());

		dineroVenido = new JLabel("Tu dinero:");
		dineroVenido.setBounds(446,10,174,23);
		dineroVenido.setFont(new Font("Fipps", Font.ITALIC, 15));
		dineroVenido.setForeground(Color.WHITE);
		
		dineroApuesta = new JLabel("Tu apuesta:");
		dineroApuesta.setBounds(446,76,174,23);
		dineroApuesta.setFont(new Font("Fipps", Font.ITALIC, 15));
		dineroApuesta.setForeground(Color.WHITE);
		
		tuDinero = new JTextField("", 8);
		tuDinero.setBounds(446,41,160,26);
		tuDinero.setFont(new Font("Fipps", Font.ITALIC, 15));
		
		tuApuesta = new JTextField("", 8);
		tuApuesta.setBounds(446,118,160,26);
		tuApuesta.setFont(new Font("Fipps", Font.ITALIC, 15));
		
		botonSiguiente = new JButton("Jugar");
		botonSiguiente.setBounds(446,162,154,48);
		botonSiguiente.setFont(new Font("Fipps", Font.ITALIC, 15));

		panel5.add(dineroVenido);
		panel6.add(dineroApuesta);
		panel7.add(tuDinero);
		panel8.add(tuApuesta);
		panel9.add(botonSiguiente);
		
		bloqueContenedor2.add(dineroVenido);
		bloqueContenedor2.add(dineroApuesta);	
		bloqueContenedor2.add(tuDinero);	
		bloqueContenedor2.add(tuApuesta);	
		bloqueContenedor2.add(botonSiguiente);
		
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon uno = new ImageIcon(this.getClass().getResource(
				"/Imagenes/las-vegas.jpg"));
		JLabel fondo = new JLabel();
		fondo.setIcon(uno);
		getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

		setVisible(true);

	}

	// IMPORTANDO VALORES EN SEGUNDA VENTANA
	public ClaseVista(boolean cambioVentana) {
		bloqueContenedor = getContentPane();
		setTitle("Black Jack");
		setLayout(new FlowLayout());
		bloqueContenedor.setLayout(null);
		setSize(900, 556);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
		
		

		sumaCroupier = new JLabel("El croupier tiene "/* añadir metodo */);
		sumaCroupier.setBounds(338,16,193,36);
		sumaCroupier.setFont(new Font("Fipps", Font.ITALIC, 15));
		
		dineroTotal = new JLabel();
		dineroTotal.setBounds(692,20,154,36);
		dineroTotal.setFont(new Font("Fipps", Font.ITALIC, 15));
		
		apuesta = new JLabel();
		apuesta.setBounds(374,240,145,29);
		apuesta.setFont(new Font("Fipps", Font.ITALIC, 15));
		
		sumaUsuario = new JLabel("Tienes "/* añadir metodo */);
		sumaUsuario.setBounds(357,487,169,33);
		sumaUsuario.setFont(new Font("Fipps", Font.ITALIC, 15));
		
		pedirCarta = new JButton("Pedir Carta");
		pedirCarta.setBounds(92,365,136,54);
		pedirCarta.setFont(new Font("Fipps", Font.ITALIC, 15));
		
		plantarse = new JButton("Plantarse");
		plantarse.setBounds(680,365,136,54);
		plantarse.setFont(new Font("Fipps", Font.ITALIC, 15));

		panel1.add(sumaCroupier);
		panel2.add(dineroTotal);
		panel3.add(apuesta);
		panel4.add(sumaUsuario);
		panel10.add(pedirCarta);
		panel11.add(plantarse);

		bloqueContenedor.add(sumaCroupier);
		bloqueContenedor.add(dineroTotal);	
		bloqueContenedor.add(apuesta);	
		bloqueContenedor.add(sumaUsuario);	
		bloqueContenedor.add(pedirCarta);	
		bloqueContenedor.add(plantarse);	

		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon dos = new ImageIcon(this.getClass().getResource(
				"/Imagenes/imagen.jpg"));
		JLabel fondo2 = new JLabel();
		fondo2.setIcon(dos);
		getLayeredPane().add(fondo2, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo2.setBounds(0, 0, dos.getIconWidth(), dos.getIconHeight());

		setVisible(cambioVentana);
	}

	// IMPORTANDO VALORES EN TERCERA VENTANA
	public ClaseVista(int A) {
		bloqueContenedor3 = getContentPane();
		setTitle("VALOR DEL AS");
		setLayout(new BorderLayout());
		setSize(300, 140);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());

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

	// IMPORTANDO VALORES EN CUARTA VENTANA
	public ClaseVista(String A) {
		bloqueContenedor4 = getContentPane();
		setTitle(A);
		setLayout(new BorderLayout());
		setSize(300, 140);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());

		ganaspierdes = new JLabel();
		otrapartida = new JLabel("Quieres jugar otra vez?");
		otrasi = new JButton("SI");
		otrano = new JButton("NO");
		tienes = new JLabel();

		panel23.add(ganaspierdes);
		panel24.add(otrapartida);
		panel25.add(otrasi);
		panel26.add(otrano);
		panel27.add(tienes);

		bloqueContenedor4.add(panel23, BorderLayout.NORTH);
		bloqueContenedor4.add(panel24, BorderLayout.CENTER);
		bloqueContenedor4.add(panel25, BorderLayout.EAST);
		bloqueContenedor4.add(panel26, BorderLayout.WEST);
		bloqueContenedor4.add(panel27, BorderLayout.SOUTH);

		setVisible(false);
	}
}
