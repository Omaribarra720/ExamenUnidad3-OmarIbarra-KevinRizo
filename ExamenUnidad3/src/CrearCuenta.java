import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class CrearCuenta {

		JFrame frame;
	
	    private JTextField nombreUsuario;
	    private JPasswordField contraseñaUsuario;
	    private JTextField apellidosUsuario;
	    private JTextField nombredeUsuario;
	    private JPasswordField contraseñaConfirmar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearCuenta window = new CrearCuenta();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CrearCuenta() {
		initialize();
	}

	

	    /**
	     * Initialize the contents of the frame.
	     */
	    private void initialize() {
	        frame = new JFrame("Crear Cuenta Gym - World");
	        frame.setBounds(100, 100, 1075, 759);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().setLayout(null);
	        frame.setLocationRelativeTo(null);

	        JPanel panel = new JPanel();
	        panel.setBackground(Color.decode("#7FC7D9"));

	        panel.setBounds(0, 0, 1060, 720);
	        frame.getContentPane().add(panel);
	        panel.setLayout(null);

	        JPanel panel_1 = new JPanel();
	        panel_1.setBackground(new Color(255, 255, 255));
	        panel_1.setBounds(90, 60, 880, 600);
	        panel.add(panel_1);
	        panel_1.setLayout(null);

	        JLabel lblTitulo = new JLabel("Gym-World");
	        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
	        lblTitulo.setBounds(399, 47, 119, 60);
	        lblTitulo.setFocusable(true);
	        panel_1.add(lblTitulo);

	        

	        

	        JLabel lblSubTitulo = new JLabel("LLene los datos");
	        lblSubTitulo.setBounds(340, 135, 250, 14);
	        panel_1.add(lblSubTitulo);

	      
	          
	        
	        JLabel lblCuenta = new JLabel("Ya tengo cuenta");
	        lblCuenta.setBounds(414, 374, 97, 14);
	        
	      
	        lblCuenta.setForeground(Color.BLUE.darker());
	        lblCuenta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        lblCuenta.setFont(lblCuenta.getFont().deriveFont(Font.BOLD | Font.ITALIC));
	       
	        lblCuenta.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	               
	                frame.dispose(); 
	                
	               
	                EventQueue.invokeLater(new Runnable() {
	                    public void run() {
	                        try {
	                            Login window = new Login();
	                            window.frame.setVisible(true);
	                        } catch (Exception e) {
	                            e.printStackTrace();
	                        }
	                    }
	                });
	                
	                
	            }
	        });
	        panel_1.add(lblCuenta);
	        JLabel lblCadaDiaMas = new JLabel("Cada dia mas cerca de un mejor tu");
	        lblCadaDiaMas.setBounds(382, 528, 250, 14);
	        panel_1.add(lblCadaDiaMas);
	        
	              
	        
	        JButton btnCrear = new JButton("Crear cuenta");
	        btnCrear.setFocusPainted(false);
	        btnCrear.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	               
	                char[] contraseñaChars = contraseñaUsuario.getPassword();
	                String contraseña = new String(contraseñaChars);
	                
	                char[] contraseñaChars2 = contraseñaConfirmar.getPassword();
	                String contraseña2 = new String(contraseñaChars2);

	                
	                if (nombreUsuario.getText().isEmpty() || 
	                        nombreUsuario.getText().equals("Nombre(s)") || 
	                        apellidosUsuario.getText().isEmpty() || 
	                        apellidosUsuario.getText().equals("Apellido(s)") || 
	                        nombredeUsuario.getText().isEmpty() || 
	                        nombredeUsuario.getText().equals("Nombre de usuario") || 
	                        contraseña.isEmpty() || contraseña.equals("Contraseña2")||
	                        contraseña2.isEmpty() || contraseña2.equals("Contraseña")
	                       ) {
	                        
	                        JOptionPane.showMessageDialog(frame, "Por favor, llene todos los campos.");
	                    }
	                else {
	                	 JOptionPane.showMessageDialog(frame,"Se ha creado su cuenta");
	                	 frame.dispose();
	                	 
	                	 EventQueue.invokeLater(new Runnable() {
	                         public void run() {
	                             try {
	                                 Login window = new Login();
	                                 window.frame.setVisible(true);
	                             } catch (Exception e) {
	                                 e.printStackTrace();
	                             }
	                         }
	                     });
	                }
	            }
	        });
	        btnCrear.setBackground(new Color(0, 128, 255));
	        btnCrear.setBounds(340, 421, 250, 25);
	        panel_1.add(btnCrear);
	        
	        
	        nombreUsuario = new JTextField();
	        nombreUsuario.setText("Nombre(s)");
	        nombreUsuario.setColumns(10);
	        nombreUsuario.setBounds(340, 160, 250, 25);
	        nombreUsuario.setForeground(new Color(192, 192, 192));

	        
	        nombreUsuario.addFocusListener(new FocusAdapter() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                if ("Nombre(s)".equals(nombreUsuario.getText())) {
	                    nombreUsuario.setText("");
	                    nombreUsuario.setForeground(Color.BLACK);
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (nombreUsuario.getText().isEmpty()) {
	                    nombreUsuario.setText("Nombre(s)");
	                    nombreUsuario.setForeground(new Color(192, 192, 192));
	                }
	            }
	        });

	        panel_1.add(nombreUsuario);
	        
	        apellidosUsuario = new JTextField();
	        apellidosUsuario.setText("Apellido(s)");
	        apellidosUsuario.setForeground(Color.LIGHT_GRAY);
	        apellidosUsuario.setColumns(10);
	        apellidosUsuario.setBounds(340, 200, 250, 25);
	        apellidosUsuario.addFocusListener(new FocusAdapter() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                if ("Apellido(s)".equals(apellidosUsuario.getText())) {
	                	apellidosUsuario.setText("");
	                	apellidosUsuario.setForeground(Color.BLACK);
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (apellidosUsuario.getText().isEmpty()) {
	                	apellidosUsuario.setText("Apellido(s)");
	                	apellidosUsuario.setForeground(new Color(192, 192, 192));
	                }
	            }
	        });
	        
	        panel_1.add(apellidosUsuario);
	        
	        nombredeUsuario = new JTextField();
	        nombredeUsuario.setText("Nombre de usuario");
	        nombredeUsuario.setForeground(Color.LIGHT_GRAY);
	        nombredeUsuario.setColumns(10);
	        nombredeUsuario.setBounds(340, 240, 250, 25);
	        nombredeUsuario.addFocusListener(new FocusAdapter() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                if ("Nombre de usuario".equals(nombredeUsuario.getText())) {
	                	nombredeUsuario.setText("");
	                	nombredeUsuario.setForeground(Color.BLACK);
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (nombredeUsuario.getText().isEmpty()) {
	                	nombredeUsuario.setText("Nombre de usuario");
	                	nombredeUsuario.setForeground(new Color(192, 192, 192));
	                }
	            }
	        });
	        panel_1.add(nombredeUsuario);
	        
	        
	        
	        contraseñaUsuario = new JPasswordField();
	        contraseñaUsuario.setText("Contraseña");
	        contraseñaUsuario.setEchoChar((char) 0);
	        contraseñaUsuario.setColumns(10);
	        contraseñaUsuario.setBounds(340, 280, 250, 25);
	        contraseñaUsuario.setForeground(new Color(192, 192, 192));
   	        contraseñaUsuario.addFocusListener(new FocusAdapter() {
	            @Override
	            public void focusGained(FocusEvent e) {
	            	contraseñaUsuario.setEchoChar('\u2022');
	            	char[] password = contraseñaUsuario.getPassword();
	                String passText = new String(password);
	                if ("Contraseña".equals(passText)) {
	                    contraseñaUsuario.setText("");
	                    contraseñaUsuario.setForeground(Color.BLACK);
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	            	 char[] password = contraseñaUsuario.getPassword();
	                 String passText = new String(password);
	                 if (passText.isEmpty()) {
	                     contraseñaUsuario.setText("Contraseña");
	                     contraseñaUsuario.setForeground(new Color(192, 192, 192));
	                 } 
	            }
	        });
	        
	        panel_1.add(contraseñaUsuario);
	        
	        contraseñaConfirmar = new JPasswordField();
	        contraseñaConfirmar.setText("Confirmar contraseña");
	        contraseñaConfirmar.setEchoChar((char) 0);
	        contraseñaConfirmar.setForeground(Color.LIGHT_GRAY);
	        contraseñaConfirmar.setColumns(10);
	        contraseñaConfirmar.setBounds(340, 320, 250, 25);
	        contraseñaConfirmar.addFocusListener(new FocusAdapter() {
	            @Override
	            public void focusGained(FocusEvent e) {
	            	contraseñaConfirmar.setEchoChar('\u2022');
	            	char[] password =  contraseñaConfirmar.getPassword();
	                String passText = new String(password);
	                if ("Confirmar contraseña".equals(passText)) {
	                	 contraseñaConfirmar.setText("");
	                	 contraseñaConfirmar.setForeground(Color.BLACK);
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	            	 char[] password =  contraseñaConfirmar.getPassword();
	                 String passText = new String(password);
	                 if (passText.isEmpty()) {
	                	 contraseñaConfirmar.setText("Confirmar contraseña");
	                	 contraseñaConfirmar.setForeground(new Color(192, 192, 192));
	                 } 
	            }
	        });
	        panel_1.add(contraseñaConfirmar);
	    }
}
