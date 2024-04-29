import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
public class Login {

    public JFrame frame;
    private JTextField nombreUser;
    private JPasswordField contraseñaUsuario;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
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

    /**
     * Create the application.
     */
    public Login() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame("GYM WORLD");
        frame.setBounds(100, 100, 1075, 759);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#7FC7D9"));

        panel.setBounds(0, 0, 1060, 720);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblTitulo = new JLabel("Gym-World");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 38));
        lblTitulo.setBounds(417, 149, 271, 81);
        lblTitulo.setFocusable(true);
        panel.add(lblTitulo);

        nombreUser = new JTextField();
        nombreUser.setText("Nombre Usuario");
        
        nombreUser.setColumns(10);
        nombreUser.setBounds(428, 301, 250, 25);
        nombreUser.setForeground(new Color(192, 192, 192));

        
        nombreUser.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if ("Nombre Usuario".equals(nombreUser.getText())) {
                    nombreUser.setText("");
                    nombreUser.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (nombreUser.getText().isEmpty()) {
                    nombreUser.setText("Nombre Usuario");
                    nombreUser.setForeground(new Color(192, 192, 192));
                }
            }
        });

        panel.add(nombreUser);

        

        JLabel lblSubTitulo = new JLabel("Favor de ingresar nombre de usario y contraseña");
        lblSubTitulo.setBounds(415, 241, 299, 37);
        panel.add(lblSubTitulo);

      
        
        contraseñaUsuario = new JPasswordField();
        contraseñaUsuario.setText("Contraseña");
        contraseñaUsuario.setColumns(10);
        contraseñaUsuario.setBounds(428, 348, 250, 25);
        contraseñaUsuario.setForeground(new Color(192, 192, 192));

       
        contraseñaUsuario.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
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
        JButton btnSesion = new JButton("Iniciar sesión");
        btnSesion.setFocusPainted(false);
        btnSesion.setBounds(428, 407, 250, 23);
        btnSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = nombreUser.getText();
                char[] passwordChars = contraseñaUsuario.getPassword();
                String password = new String(passwordChars);

                if (username.isEmpty()|| username.equals("Nombre Usuario") || password.isEmpty() || password.equals("Contraseña")) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese usuario y contraseña.");
	                } else {
	                	 frame.dispose(); 
	                     
	                     
	                     EventQueue.invokeLater(new Runnable() {
	                         public void run() {
                             try {
                                 menuPrincipal window = new menuPrincipal();
                                 window.frame.setVisible(true);
                             } catch (Exception e) {
                                 e.printStackTrace();
                             }
                         }
                     });
                }
            }
        });
        btnSesion.setBackground(new Color(0, 128, 255));
        panel.add(btnSesion);
        
        
        panel.add(contraseñaUsuario);
        
        JLabel lblCrearCuenta = new JLabel("No tengo cuenta");
        lblCrearCuenta.setForeground(Color.BLUE.darker());
        lblCrearCuenta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblCrearCuenta.setFont(lblCrearCuenta.getFont().deriveFont(Font.BOLD | Font.ITALIC));
        lblCrearCuenta.setBounds(428, 460, 97, 14);
        lblCrearCuenta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
                frame.dispose(); 
                
               
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
        });
        
        panel.add(lblCrearCuenta);
        
        JLabel lblOlvideUnDato = new JLabel("No puedo iniciar sesión");
        lblOlvideUnDato.setBounds(535, 455, 143, 25);
        lblOlvideUnDato.setForeground(Color.BLUE.darker());
        lblOlvideUnDato.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblOlvideUnDato.setFont(lblOlvideUnDato.getFont().deriveFont(Font.BOLD | Font.ITALIC));
        lblOlvideUnDato.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JTextField textField = new JTextField(20);
                JPanel panel = new JPanel();
                panel.add(new JLabel("Ingrese el correo con el que esta registrado"));
                panel.add(textField);
                int result = JOptionPane.showConfirmDialog(frame, panel, "Ingresa un mensaje", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    JOptionPane.showMessageDialog(frame,"Se le ha mandado un correo para que haga los cambios que desea");
                }
            }
        });
        panel.add(lblOlvideUnDato);
        
        JLabel lblCadaDiaMas = new JLabel("La disciplina es la \r\nmadre del éxito.");
        lblCadaDiaMas.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblCadaDiaMas.setHorizontalAlignment(SwingConstants.CENTER);
        lblCadaDiaMas.setBounds(393, 492, 321, 62);
        panel.add(lblCadaDiaMas);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imagenes/imgPrincipal.jpeg")));
        lblNewLabel.setBounds(223, 75, 626, 589);
        panel.add(lblNewLabel);

    }
}
