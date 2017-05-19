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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClaseVista extends JFrame {
	final boolean cambiaAs=false;
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
	JLabel dineroTotal = null; // El dinero se introducirÃ¡ en la primera
								// ventana.
	JLabel apuesta = null; // La apuesta se realizarÃ¡ en la primera ventana.
	JLabel sumaUsuario = null;
	JButton pedirCarta = null;
	JButton plantarse = null;
	JButton actualizar = null;
	private static JPanel panel1 = new JPanel();
	private static JPanel panel2 = new JPanel();
	private static JPanel panel3 = new JPanel();
	private static JPanel panel4 = new JPanel();
	private static JPanel panel10 = new JPanel();
	private static JPanel panel11 = new JPanel();
	private static JPanel panel51 = new JPanel();
	JLabel fondoas = null;
	JLabel fondo2 = null;
	JLabel fondo3 = null;
	JLabel fondo4 = null;
	JLabel fondo5 = null;
	JLabel fondo6 = null;
	JLabel fondo7 = null;
	JLabel fondo8 = null;
	JLabel fondo9 = null;
	JLabel fondo10 = null;
	JLabel fondoJ = null;
	JLabel fondoQ = null;
	JLabel fondoK = null;
	JLabel fondo2as = null;
	JLabel fondo22 = null;
	JLabel fondo23 = null;
	JLabel fondo24 = null;
	JLabel fondo25 = null;
	JLabel fondo26 = null;
	JLabel fondo27 = null;
	JLabel fondo28 = null;
	JLabel fondo29 = null;
	JLabel fondo210 = null;
	JLabel fondo2J = null;
	JLabel fondo2Q = null;
	JLabel fondo2K = null;

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
		dineroVenido.setFont(new Font("Fipps", Font.BOLD, 15));
		dineroVenido.setForeground(Color.WHITE);
		
		dineroApuesta = new JLabel("Tu apuesta:");
		dineroApuesta.setBounds(446,76,174,23);
		dineroApuesta.setFont(new Font("Fipps", Font.BOLD, 15));
		dineroApuesta.setForeground(Color.WHITE);
		
		tuDinero = new JTextField("", 8);
		tuDinero.setBounds(446,41,160,26);
		tuDinero.setFont(new Font("Fipps", Font.ITALIC, 15));
		tuDinero.addMouseListener(new MouseAdapter(){
            		public void mouseClicked(MouseEvent e){
                		tuDinero.setText("");
           		}
        	});
		
		tuApuesta = new JTextField("", 8);
		tuApuesta.setBounds(446,118,160,26);
		tuApuesta.setFont(new Font("Fipps", Font.ITALIC, 15));
		tuApuesta.addMouseListener(new MouseAdapter(){
            		public void mouseClicked(MouseEvent e){
                		tuApuesta.setText("");
            		}
        	});
		
		botonSiguiente = new JButton("Jugar");
		botonSiguiente.setBounds(446,162,154,48);
		botonSiguiente.setFont(new Font("Fipps", Font.PLAIN, 15));

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
		
		sumaCroupier = new JLabel("Croupier: "/* añadir metodo */);
		sumaCroupier.setForeground(Color.white); 
		sumaCroupier.setBounds(357,16,193,36);
		sumaCroupier.setFont(new Font("Bernard MT Condensed", Font.BOLD, 30));
		
		dineroTotal = new JLabel();
		dineroTotal.setForeground(Color.white); 
		dineroTotal.setBounds(680,20,140,80);
		dineroTotal.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 17));
		
		apuesta = new JLabel();
		apuesta.setForeground(Color.white); 
		apuesta.setBounds(382,240,145,29);
		apuesta.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 18));
		
		sumaUsuario = new JLabel("Tienes: "/* añadir metodo */);
		sumaUsuario.setForeground(Color.white); 
		sumaUsuario.setBounds(370,465,169,33);
		sumaUsuario.setFont(new Font("Bernard MT Condensed", Font.BOLD, 30));
		
		pedirCarta = new JButton("Pedir Carta");
		pedirCarta.setBounds(92,365,136,54);
		pedirCarta.setFont(new Font("Fipps", Font.ITALIC, 15));
		
		plantarse = new JButton("Plantarse");
		plantarse.setBounds(680,365,136,54);
		plantarse.setFont(new Font("Fipps", Font.ITALIC, 15));
		
		actualizar = new JButton("Actualizar");
		actualizar.setBounds(680,365,136,54);
		actualizar.setFont(new Font("Fipps", Font.ITALIC, 15));
		actualizar.setVisible(false);

		panel1.add(sumaCroupier);
		panel2.add(dineroTotal);
		panel3.add(apuesta);
		panel4.add(sumaUsuario);
		panel10.add(pedirCarta);
		panel11.add(plantarse);
		panel51.add(actualizar);

		bloqueContenedor.add(sumaCroupier);
		bloqueContenedor.add(dineroTotal);	
		bloqueContenedor.add(apuesta);	
		bloqueContenedor.add(sumaUsuario);	
		bloqueContenedor.add(pedirCarta);	
		bloqueContenedor.add(plantarse);
		bloqueContenedor.add(actualizar);
		
		//CARTA AS
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon as = new ImageIcon(this.getClass().getResource(
				"/Imagenes/A.jpg"));
		fondoas = new JLabel();
		fondoas.setIcon(as);
		getLayeredPane().add(fondoas, JLayeredPane.FRAME_CONTENT_LAYER);
		fondoas.setBounds(381, 315, as.getIconWidth(), as.getIconHeight());
		fondoas.setVisible(false);
		
		//CARTA 2
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon dos = new ImageIcon(this.getClass().getResource(
				"/Imagenes/2.jpg"));
		fondo2 = new JLabel();
		fondo2.setIcon(dos);
		getLayeredPane().add(fondo2, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo2.setBounds(381, 315, dos.getIconWidth(), dos.getIconHeight());
		fondo2.setVisible(false);
		
		//CARTA 3
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon tres = new ImageIcon(this.getClass().getResource(
				"/Imagenes/3.jpg"));
		fondo3 = new JLabel();
		fondo3.setIcon(tres);
		getLayeredPane().add(fondo3, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo3.setBounds(381, 315, tres.getIconWidth(), tres.getIconHeight());
		fondo3.setVisible(false);
		
		//CARTA 4
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon cuatro = new ImageIcon(this.getClass().getResource(
				"/Imagenes/4.jpg"));
		fondo4 = new JLabel();
		fondo4.setIcon(cuatro);
		getLayeredPane().add(fondo4, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo4.setBounds(381, 315, cuatro.getIconWidth(), cuatro.getIconHeight());
		fondo4.setVisible(false);
		
		//CARTA 5
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon cinco = new ImageIcon(this.getClass().getResource(
				"/Imagenes/5.jpg"));
		fondo5 = new JLabel();
		fondo5.setIcon(cinco);
		getLayeredPane().add(fondo5, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo5.setBounds(381, 315, cinco.getIconWidth(), cinco.getIconHeight());
		fondo5.setVisible(false);
		
		//CARTA 6
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon seis = new ImageIcon(this.getClass().getResource(
				"/Imagenes/6.jpg"));
		fondo6 = new JLabel();
		fondo6.setIcon(seis);
		getLayeredPane().add(fondo6, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo6.setBounds(381, 315, seis.getIconWidth(), seis.getIconHeight());
		fondo6.setVisible(false);
		
		//CARTA 7
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon siete = new ImageIcon(this.getClass().getResource(
				"/Imagenes/7.jpg"));
		fondo7 = new JLabel();
		fondo7.setIcon(siete);
		getLayeredPane().add(fondo7, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo7.setBounds(381, 315, siete.getIconWidth(), siete.getIconHeight());
		fondo7.setVisible(false);
		
		//CARTA 8
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon ocho = new ImageIcon(this.getClass().getResource(
				"/Imagenes/8.jpg"));
		fondo8 = new JLabel();
		fondo8.setIcon(ocho);
		getLayeredPane().add(fondo8, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo8.setBounds(381, 315, ocho.getIconWidth(), ocho.getIconHeight());
		fondo8.setVisible(false);
		
		//CARTA 9
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon nueve = new ImageIcon(this.getClass().getResource(
				"/Imagenes/9.jpg"));
		fondo9 = new JLabel();
		fondo9.setIcon(nueve);
		getLayeredPane().add(fondo9, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo9.setBounds(381, 315, nueve.getIconWidth(), nueve.getIconHeight());
		fondo9.setVisible(false);
		
		//CARTA 10
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon diez = new ImageIcon(this.getClass().getResource(
				"/Imagenes/10.jpg"));
		fondo10 = new JLabel();
		fondo10.setIcon(diez);
		getLayeredPane().add(fondo10, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo10.setBounds(381, 315, diez.getIconWidth(), diez.getIconHeight());
		fondo10.setVisible(false);
		
		//CARTA J
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon jota = new ImageIcon(this.getClass().getResource(
				"/Imagenes/J.jpg"));
		fondoJ = new JLabel();
		fondoJ.setIcon(jota);
		getLayeredPane().add(fondoJ, JLayeredPane.FRAME_CONTENT_LAYER);
		fondoJ.setBounds(381, 315, jota.getIconWidth(), jota.getIconHeight());
		fondoJ.setVisible(false);
		
		//CARTA Q
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon qu = new ImageIcon(this.getClass().getResource(
				"/Imagenes/Q.jpg"));
		fondoQ = new JLabel();
		fondoQ.setIcon(qu);
		getLayeredPane().add(fondoQ, JLayeredPane.FRAME_CONTENT_LAYER);
		fondoQ.setBounds(381, 315, qu.getIconWidth(), qu.getIconHeight());
		fondoQ.setVisible(false);
		
		//CARTA K
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon ka = new ImageIcon(this.getClass().getResource(
				"/Imagenes/K.jpg"));
		fondoK = new JLabel();
		fondoK.setIcon(ka);
		getLayeredPane().add(fondoK, JLayeredPane.FRAME_CONTENT_LAYER);
		fondoK.setBounds(381, 315, ka.getIconWidth(), ka.getIconHeight());
		fondoK.setVisible(false);

		//CARTA AS
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon as2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/A.jpg"));
		fondo2as = new JLabel();
		fondo2as.setIcon(as2);
		getLayeredPane().add(fondo2as, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo2as.setBounds(381, 83, as2.getIconWidth(), as2.getIconHeight());
		fondo2as.setVisible(false);

		//CARTA 2
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon dos2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/2.jpg"));
		fondo22 = new JLabel();
		fondo22.setIcon(dos2);
		getLayeredPane().add(fondo22, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo22.setBounds(381, 83, dos2.getIconWidth(), dos2.getIconHeight());
		fondo22.setVisible(false);

		//CARTA 3
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon tres2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/3.jpg"));
		fondo23 = new JLabel();
		fondo23.setIcon(tres2);
		getLayeredPane().add(fondo23, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo23.setBounds(381, 83, tres2.getIconWidth(), tres2.getIconHeight());
		fondo23.setVisible(false);

		//CARTA 4
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon cuatro2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/4.jpg"));
		fondo24 = new JLabel();
		fondo24.setIcon(cuatro2);
		getLayeredPane().add(fondo24, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo24.setBounds(381, 83, cuatro2.getIconWidth(), cuatro2.getIconHeight());
		fondo24.setVisible(false);

		//CARTA 5
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon cinco2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/5.jpg"));
		fondo25 = new JLabel();
		fondo25.setIcon(cinco2);
		getLayeredPane().add(fondo25, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo25.setBounds(381, 83, cinco2.getIconWidth(), cinco2.getIconHeight());
		fondo25.setVisible(false);

		//CARTA 6
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon seis2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/6.jpg"));
		fondo26 = new JLabel();
		fondo26.setIcon(seis2);
		getLayeredPane().add(fondo26, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo26.setBounds(381, 83, seis2.getIconWidth(), seis2.getIconHeight());
		fondo26.setVisible(false);

		//CARTA 7
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon siete2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/7.jpg"));
		fondo27 = new JLabel();
		fondo27.setIcon(siete2);
		getLayeredPane().add(fondo27, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo27.setBounds(381, 83, siete2.getIconWidth(), siete2.getIconHeight());
		fondo27.setVisible(false);

		//CARTA 8
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon ocho2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/8.jpg"));
		fondo28 = new JLabel();
		fondo28.setIcon(ocho2);
		getLayeredPane().add(fondo28, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo28.setBounds(381, 83, ocho2.getIconWidth(), ocho2.getIconHeight());
		fondo28.setVisible(false);

		//CARTA 9
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon nueve2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/9.jpg"));
		fondo29 = new JLabel();
		fondo29.setIcon(nueve2);
		getLayeredPane().add(fondo29, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo29.setBounds(381, 83, nueve2.getIconWidth(), nueve2.getIconHeight());
		fondo29.setVisible(false);

		//CARTA 10
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon diez2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/10.jpg"));
		fondo210 = new JLabel();
		fondo210.setIcon(diez2);
		getLayeredPane().add(fondo210, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo210.setBounds(381, 83, diez2.getIconWidth(), diez2.getIconHeight());
		fondo210.setVisible(false);

		//CARTA J
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon jota2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/J.jpg"));
		fondo2J = new JLabel();
		fondo2J.setIcon(jota2);
		getLayeredPane().add(fondo2J, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo2J.setBounds(381, 83, jota2.getIconWidth(), jota2.getIconHeight());
		fondo2J.setVisible(false);

		//CARTA Q
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon qu2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/Q.jpg"));
		fondo2Q = new JLabel();
		fondo2Q.setIcon(qu2);
		getLayeredPane().add(fondo2Q, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo2Q.setBounds(381, 83, qu2.getIconWidth(), qu2.getIconHeight());
		fondo2Q.setVisible(false);

		//CARTA K
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon ka2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/K.jpg"));
		fondo2K = new JLabel();
		fondo2K.setIcon(ka2);
		getLayeredPane().add(fondo2K, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo2K.setBounds(381, 83, ka2.getIconWidth(), ka2.getIconHeight());
		fondo2K.setVisible(false);

		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource(
				"/Imagenes/imagen.jpg"));
		JLabel fondoimg = new JLabel();
		fondoimg.setIcon(img2);
		getLayeredPane().add(fondoimg, JLayeredPane.FRAME_CONTENT_LAYER);
		fondoimg.setBounds(0, 0, img2.getIconWidth(), img2.getIconHeight());
		
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
