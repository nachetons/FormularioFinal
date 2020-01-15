package Presentacion;

import java.awt.BorderLayout;
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class milogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtCorreo;
	private JPasswordField txtContrasena;

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
	public milogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 325);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblRegistro = new JLabel("LOGIN");
		lblRegistro.setForeground(Color.WHITE);
		lblRegistro.setFont(new Font("Sigmar One", Font.PLAIN, 15));
		lblRegistro.setBounds(210, 111, 109, 19);
		contentPane.add(lblRegistro);

		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Ubuntu Mono", Font.PLAIN, 13));
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setBounds(110, 168, 45, 19);
		contentPane.add(lblCorreo);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Ubuntu Mono", Font.PLAIN, 13));
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setBounds(83, 200, 72, 24);
		contentPane.add(lblContrasea);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(176, 167, 143, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);

		txtContrasena = new JPasswordField();
		

		txtContrasena.setBounds(176, 202, 143, 20);
		contentPane.add(txtContrasena);

		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Persona persona = new Persona();
				int contador = 0;
				String correo = txtCorreo.getText();
				char[] contrasena = txtContrasena.getPassword();
				String contrasenafinal = new String(contrasena);
				if (persona.Email.equals(txtCorreo.getText()) && persona.Pass.equals(contrasenafinal)) {
					JOptionPane.showMessageDialog(null, "Login satisfactorio", "Registro",
							JOptionPane.INFORMATION_MESSAGE);
					InterfazCuestionario cu=new InterfazCuestionario();
                    cu.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Login Incorrecto", "Registro",
							JOptionPane.INFORMATION_MESSAGE);
				}


				/*for (int i = 0; i < contrasenafinal.length(); i++) {
					char letra = contrasenafinal.charAt(i);
					String letraStr = String.valueOf(letra);
					if (letraStr.matches("[A-Z]")) {
						contLetraMay++;
					} else if (letraStr.matches("[a-z]")) {
						contLetraMin++;
					} else if (letraStr.matches("[0-9]")) {
						contNumero++;
					}

				}
				if (contLetraMay > 1 && contLetraMin > 1 && contNumero > 1) {
					JOptionPane.showMessageDialog(null, "Registrado satisfactoriamente", "Registro",
							JOptionPane.INFORMATION_MESSAGE);
                                        InterfazCuestionario cu=new InterfazCuestionario();
                                        cu.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Registro no valido no se cumplen las reglas establecidas",
							"Registro", JOptionPane.WARNING_MESSAGE);
				}
				System.out.println("Cantidad de letras mayusculas:" + contLetraMay);

				System.out.println("Cantidad de letras minusculas:" + contLetraMin);

				System.out.println("Cantidad de numeros:" + contNumero);*/
                                
                                        

			}
		});
		
		btnAcceder.setBounds(380, 234, 94, 41);
		contentPane.add(btnAcceder);
		
		JLabel imagen = new JLabel("");
		imagen.setIcon(new ImageIcon(milogin.class.getResource("/Presentacion/Imagenes/otaku.gif")));
		imagen.setBounds(0, 0, 619, 100);
		contentPane.add(imagen);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                
                            
					InterfazRegistro in=new InterfazRegistro();
                                        in.setVisible(true);
                    
                    
				
				
				}
		});
		btnRegistrarse.setForeground(Color.WHITE);
		btnRegistrarse.setBounds(157, 233, 109, 19);
		btnRegistrarse.setFocusPainted(false);
		btnRegistrarse.setBorderPainted(false);
		btnRegistrarse.setContentAreaFilled(false);
		contentPane.add(btnRegistrarse);
	}

    boolean isVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
