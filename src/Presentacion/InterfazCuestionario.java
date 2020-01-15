package Presentacion;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.Persona;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Timer;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import java.awt.Font;

public class InterfazCuestionario extends JFrame {
	private static final long serialVersionUID = 1L;
	cargar hilo;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					milogin frame = new milogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazCuestionario() {
		
        setLocationRelativeTo(null);
        hilo = new cargar(progressBar);
        hilo.start();
        hilo= null;
		setTitle("Formulario de anime");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1227, 710);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCorreo = new JLabel("\u00BFTe gusta el anime?");
		lblCorreo.setFont(new Font("Kalam", Font.BOLD, 12));
		lblCorreo.setBounds(432, 23, 115, 19);
		contentPane.add(lblCorreo);

		JLabel lblContrasea = new JLabel("\u00BFCual de estos escogerias?");
		lblContrasea.setFont(new Font("Kalam", Font.BOLD, 12));
		lblContrasea.setBounds(10, 324, 159, 24);
		contentPane.add(lblContrasea);
		
		
		JButton btnAcceder = new JButton("Enviar");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hilo = new cargar(progressBar);
		        hilo.start();
		        hilo= null;
				

			}
                            
                    
		}
         
                
                );
		btnAcceder.setBounds(1112, 629, 89, 31);
		contentPane.add(btnAcceder);
		
	
		rdbtnsi = new JRadioButton("Si");
		rdbtnsi.setBackground(Color.GRAY);
		rdbtnsi.setBounds(553, 21, 52, 23);
		contentPane.add(rdbtnsi);
		
		rdbtnno = new JRadioButton("No");
		rdbtnno.setBackground(Color.GRAY);
		rdbtnno.setBounds(662, 21, 52, 23);
		contentPane.add(rdbtnno);
		
		ButtonGroup btng=new ButtonGroup();
		
		btng.add(rdbtnsi);
		btng.add(rdbtnno);
		
		
		
		textAreaSi = new JTextArea();
		textAreaSi.setBounds(170, 185, 250, 86);
		contentPane.add(textAreaSi);
		
		textAreaNo = new JTextArea();
		textAreaNo.setBounds(170, 185, 250, 86);
		contentPane.add(textAreaNo);
		System.out.println("Hola");
		
		if (rdbtnsi.isSelected()) {
			textAreaSi.setVisible(true);
			textAreaNo.setVisible(false);
			
		}else if(rdbtnno.isSelected()){
			textAreaSi.setVisible(false);
			textAreaNo.setVisible(true);
		}
		
		JLabel label = new JLabel("\u00BFPor que?");
		label.setFont(new Font("Kalam", Font.BOLD, 12));
		label.setBounds(52, 185, 63, 24);
		contentPane.add(label);
		
		rdbtnOnePiece = new JRadioButton("One piece");
		rdbtnOnePiece.setBackground(Color.GRAY);
		rdbtnOnePiece.setBounds(175, 306, 109, 23);
		contentPane.add(rdbtnOnePiece);
		
		rdbtnElGordoDe = new JRadioButton("Naruto");
		rdbtnElGordoDe.setBackground(Color.GRAY);
		rdbtnElGordoDe.setBounds(300, 306, 140, 23);
		contentPane.add(rdbtnElGordoDe);
		
		rdbtnBokuNoPico = new JRadioButton("Boku no pico");
		rdbtnBokuNoPico.setBackground(Color.GRAY);
		rdbtnBokuNoPico.setBounds(175, 351, 109, 23);
		contentPane.add(rdbtnBokuNoPico);
		
		rdbtnOtro = new JRadioButton("Railgun");
		rdbtnOtro.setBackground(Color.GRAY);
		rdbtnOtro.setBounds(300, 351, 109, 23);
		contentPane.add(rdbtnOtro);
		
		
ButtonGroup btna=new ButtonGroup();
		
		btna.add(rdbtnOnePiece);
		btna.add(rdbtnElGordoDe);
		btna.add(rdbtnBokuNoPico);
		btna.add(rdbtnOtro);
		
		JLabel lblenQueAnime = new JLabel("\u00BFEn que anime te gustaria vivir y por que?");
		lblenQueAnime.setFont(new Font("Kalam", Font.BOLD, 12));
		lblenQueAnime.setBounds(10, 415, 237, 24);
		contentPane.add(lblenQueAnime);
		
		textArea = new JTextArea();
		textArea.setBounds(257, 415, 227, 77);
		contentPane.add(textArea);
		
		JLabel lblCualesSonTus = new JLabel("Cuales son tus categorias favoritas");
		lblCualesSonTus.setFont(new Font("Kalam", Font.BOLD, 12));
		lblCualesSonTus.setBounds(17, 541, 218, 24);
		contentPane.add(lblCualesSonTus);
		
		chckbxRomanticas = new JCheckBox("Romanticas");
		chckbxRomanticas.setBackground(Color.GRAY);
		chckbxRomanticas.setBounds(17, 583, 97, 23);
		contentPane.add(chckbxRomanticas);
		
		chckbxAccion = new JCheckBox("Accion");
		chckbxAccion.setBackground(Color.GRAY);
		chckbxAccion.setBounds(17, 633, 97, 23);
		contentPane.add(chckbxAccion);
		
		chckbxAventuras = new JCheckBox("Aventuras");
		chckbxAventuras.setBackground(Color.GRAY);
		chckbxAventuras.setBounds(116, 583, 97, 23);
		contentPane.add(chckbxAventuras);
		
		chckbxFantasia = new JCheckBox("Fantasia");
		chckbxFantasia.setBackground(Color.GRAY);
		chckbxFantasia.setBounds(116, 633, 97, 23);
		contentPane.add(chckbxFantasia);
		
		chckbxCienciaFiccion = new JCheckBox("Ciencia ficcion");
		chckbxCienciaFiccion.setBackground(Color.GRAY);
		chckbxCienciaFiccion.setBounds(209, 633, 115, 23);
		contentPane.add(chckbxCienciaFiccion);
		
		chckbxGuerra = new JCheckBox("Guerra");
		chckbxGuerra.setBackground(Color.GRAY);
		chckbxGuerra.setBounds(209, 583, 97, 23);
		contentPane.add(chckbxGuerra);
		
		slider1 = new JSlider();
		slider1.setBackground(Color.GRAY);
		slider1.setSnapToTicks(true);
		slider1.setMinorTickSpacing(25);
		slider1.setMajorTickSpacing(25);
		slider1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		slider1.setBounds(432, 97, 301, 47);
		contentPane.add(slider1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 155, 713, 19);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 279, 713, 19);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 385, 713, 19);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 511, 713, 19);
		contentPane.add(separator_3);
		
		slider2 = new JSlider();
		slider2.setBackground(Color.GRAY);
		slider2.setSnapToTicks(true);
		slider2.setMajorTickSpacing(25);
		slider2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			}
		});
		slider2.setMinorTickSpacing(25);
		slider2.setBounds(444, 329, 301, 45);
		contentPane.add(slider2);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(755, 23, 22, 637);
		contentPane.add(separator_4);
		
		JLabel label_2 = new JLabel("No puedo");
		label_2.setBounds(1089, 72, 63, 19);
		contentPane.add(label_2);
		
		slider3 = new JSlider();
		slider3.setBackground(Color.GRAY);
		slider3.setSnapToTicks(true);
		slider3.setMajorTickSpacing(25);
		slider3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			}
		});
		slider3.setMinorTickSpacing(25);
		slider3.setBounds(830, 111, 301, 45);
		contentPane.add(slider3);
		
		JLabel label_3 = new JLabel("Mucho");
		label_3.setBounds(944, 86, 52, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Poco");
		label_4.setBounds(895, 86, 30, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("vivir sin el");
		label_5.setBounds(1091, 88, 61, 24);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Nada");
		label_6.setBounds(830, 86, 46, 14);
		contentPane.add(label_6);
		
		JLabel lblNewLabel = new JLabel("\u00BFCuanto te estan gustando los animes de este a\u00F1o?");
		lblNewLabel.setFont(new Font("Kalam", Font.BOLD, 12));
		lblNewLabel.setBounds(842, 13, 301, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblDemasiado = new JLabel("Demasiado");
		lblDemasiado.setBounds(998, 86, 81, 14);
		contentPane.add(lblDemasiado);
		
		JLabel label_1 = new JLabel("vivir sin el");
		label_1.setBounds(693, 76, 63, 24);
		contentPane.add(label_1);
		
		JLabel label_12 = new JLabel("No puedo");
		label_12.setBounds(691, 60, 63, 19);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("Demasiado");
		label_13.setBounds(608, 74, 75, 14);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("Mucho");
		label_14.setBounds(550, 74, 46, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("Poco");
		label_15.setBounds(497, 74, 30, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("Nada");
		label_16.setBounds(432, 74, 46, 14);
		contentPane.add(label_16);
		
		JLabel label_7 = new JLabel("vivir sin el");
		label_7.setBounds(692, 309, 63, 24);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("No puedo");
		label_8.setBounds(692, 293, 63, 19);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Demasiado");
		label_9.setBounds(614, 307, 72, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Mucho");
		label_10.setBounds(560, 307, 46, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("Poco");
		label_11.setBounds(512, 307, 30, 14);
		contentPane.add(label_11);
		
		JLabel label_17 = new JLabel("Nada");
		label_17.setBounds(447, 307, 46, 14);
		contentPane.add(label_17);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new TitledBorder(null, "Fecha Nacimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(830, 206, 291, 105);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(20, 23, 30, 20);
		panel.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(135, 26, 46, 14);
		panel.add(lblMes);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(235, 26, 46, 14);
		panel.add(lblAo);
		
		Dia = new JComboBox();
		Dia.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		Dia.setBounds(10, 46, 52, 22);
		panel.add(Dia);
		
		Mes = new JComboBox();
		Mes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		Mes.setBounds(111, 46, 61, 22);
		panel.add(Mes);
		
		Anio = new JComboBox();
		Anio.setModel(new DefaultComboBoxModel(new String[] {"1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		Anio.setBounds(216, 46, 52, 22);
		panel.add(Anio);
		
		progressBar = new JProgressBar();
		progressBar.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(progressBar.getValue()==100)
			    {
			        dispose();
			        Persona persona = new Persona();
					validarBoton();
					validarBoton2();
					validarcheck();
					validarslider1();
					validarslider2();
					validarslider3();
					validarCombobox();
					String msg="<html>Nombre: "+"<br>"+persona.Nombre+" <br><br>"
							+ "Apellidos: "+"<br>"+persona.Apellidos+"<br><br>"+
							"¿Te gusta el anime? "+"<br>"+mensaje+"  "+ValorSlider1+"<br><br>"+
							"¿Por que? "+"<br>"+textAreaSi.getText()+"<br><br>"+
							"Este es tu anime elegido: "+"<br>"+mensaje2+" te gusta "+ValorSlider2+"<br><br>"+
							"¿En que anime te gustarioa vivir? "+"<br>"+textArea.getText()+"<br><br>"+
							"Categorias Favoritas "+"<br>"+seleccion+"<br><br>"+
							"¿Te estan gustando los animes de este anio? "+"<br>"+ValorSlider3+"<br><br>"+
							"Tu fecha de nacimiento es: "+"<br>"+DiaValor+" "+MesValor+" "+AnioValor+"<br><br>"+
							"</html>";
					JOptionPane optionpane=new JOptionPane();
					optionpane.setMessage(msg);
					optionpane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
					JDialog dialog=optionpane.createDialog(null,"Resultado del test");
					dialog.setVisible(true);
			    }
			}
		});
		progressBar.setBackground(Color.WHITE);
		progressBar.setBounds(830, 415, 301, 37);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(InterfazCuestionario.class.getResource("/Presentacion/Imagenes/soul.gif")));
		lblNewLabel_1.setBounds(0, 11, 205, 145);
		contentPane.add(lblNewLabel_1);
		
		chckbxEscolar = new JCheckBox("Escolar");
		chckbxEscolar.setBackground(Color.GRAY);
		chckbxEscolar.setBounds(326, 583, 97, 23);
		contentPane.add(chckbxEscolar);
		
		chckbxSuperpoderes = new JCheckBox("Superpoderes");
		chckbxSuperpoderes.setBackground(Color.GRAY);
		chckbxSuperpoderes.setBounds(326, 633, 115, 23);
		contentPane.add(chckbxSuperpoderes);
		
		chckbxZombies = new JCheckBox("Zombies");
		chckbxZombies.setBackground(Color.GRAY);
		chckbxZombies.setBounds(443, 583, 97, 23);
		contentPane.add(chckbxZombies);
		
		chckbxMagia = new JCheckBox("Magia");
		chckbxMagia.setBackground(Color.GRAY);
		chckbxMagia.setBounds(443, 633, 115, 23);
		contentPane.add(chckbxMagia);
		
		chckbxDeportes = new JCheckBox("Deportes");
		chckbxDeportes.setBackground(Color.GRAY);
		chckbxDeportes.setBounds(553, 583, 97, 23);
		contentPane.add(chckbxDeportes);
		
		chckbxHistorico = new JCheckBox("Historico");
		chckbxHistorico.setBackground(Color.GRAY);
		chckbxHistorico.setBounds(553, 633, 115, 23);
		contentPane.add(chckbxHistorico);
		
		
	}
	private Timer tiempo;
	private JProgressBar progressBar;
	private JComboBox Dia, Mes, Anio;
	private JSlider slider1, slider2, slider3;
	private JRadioButton rdbtnsi, rdbtnno, rdbtnOnePiece, rdbtnElGordoDe, rdbtnBokuNoPico, rdbtnOtro;
	private JTextArea textAreaSi, textAreaNo, textArea;
	private JCheckBox chckbxRomanticas, chckbxAccion, chckbxAventuras, chckbxFantasia, chckbxCienciaFiccion, chckbxGuerra,chckbxEscolar, chckbxSuperpoderes, chckbxZombies, chckbxMagia, chckbxDeportes, chckbxHistorico;
	//private ButtonGroup btng, btna;
	String mensaje="";
	String mensaje2="";
	String seleccion="";
	String ValorSlider1="";
	String ValorSlider2="";
	String ValorSlider3="";
	String DiaValor="";
	String MesValor="";
	String AnioValor="";
	int cont=0;
	public void validarcheck() {
		
		if (chckbxRomanticas.isSelected()) {
			seleccion+="Romanticas ";
		}if (chckbxAccion.isSelected()) {
			seleccion+="Accion ";
		}if (chckbxAventuras.isSelected()) {
			seleccion+="Aventuras ";
		}if (chckbxFantasia.isSelected()) {
			seleccion+="Fantasia ";
		}if (chckbxCienciaFiccion.isSelected()) {
			seleccion+="Ciencia ficcion ";
		}if (chckbxGuerra.isSelected()) {
			seleccion+="Guerra ";
		}if (chckbxEscolar.isSelected()) {
			seleccion+="Escolar ";
		}if (chckbxSuperpoderes.isSelected()) {
			seleccion+="Superpoderes ";
		}if (chckbxZombies.isSelected()) {
			seleccion+="Zombies ";
		}if (chckbxMagia.isSelected()) {
			seleccion+="Magia ";
		}if (chckbxDeportes.isSelected()) {
			seleccion+="Deportes ";
		}if (chckbxHistorico.isSelected()) {
			seleccion+="Historico ";
		}
	}
	public void validarBoton(){
		if(rdbtnsi.isSelected()){
			mensaje = "Si";
		}else if(rdbtnno.isSelected()){
			mensaje = "No";
		}
	}
	public void validarBoton2(){
		if(rdbtnOnePiece.isSelected()){
			mensaje2 = "One Piece";
		}else if(rdbtnElGordoDe.isSelected()){
			mensaje2 = "Naruto";
		}else if(rdbtnBokuNoPico.isSelected()){
			mensaje2 = "Boku no pico";
		}else if(rdbtnOtro.isSelected()){
			mensaje2 = "Railgun";
		}
	}
	
public void validarslider1() {
	if (slider1.getValue()==0) {
		ValorSlider1="Nada";
	}
	if (slider1.getValue()==25) {
		ValorSlider1="Poco";
	}
	if (slider1.getValue()==50) {
		ValorSlider1="Mucho";
	}
	if (slider1.getValue()==75) {
		ValorSlider1="Demasiado";
	}
	if (slider1.getValue()==100) {
		ValorSlider1="Lo mejor que he visto";
	}
	
		
	}

public void validarslider2() {
	if (slider2.getValue()==0) {
		ValorSlider2="Nada";
	}
	if (slider2.getValue()==25) {
		ValorSlider2="Poco";
	}
	if (slider2.getValue()==50) {
		ValorSlider2="Mucho";
	}
	if (slider2.getValue()==75) {
		ValorSlider2="Demasiado";
	}
	if (slider2.getValue()==100) {
		ValorSlider2="Lo mejor que he visto";
	}
	
		
	}

public void validarslider3() {
	if (slider3.getValue()==0) {
		ValorSlider3="Nada";
	}
	if (slider3.getValue()==25) {
		ValorSlider3="Poco";
	}
	if (slider3.getValue()==50) {
		ValorSlider3="Mucho";
	}
	if (slider3.getValue()==75) {
		ValorSlider3="Demasiado";
	}
	if (slider3.getValue()==100) {
		ValorSlider3="Lo mejor que he visto";
	}
	
		
	}
public void validarCombobox() {
	DiaValor=Dia.getSelectedItem().toString();
	MesValor=Mes.getSelectedItem().toString();
	AnioValor=Anio.getSelectedItem().toString();
}
}

