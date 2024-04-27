import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

    private JFrame frame;
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
        frame = new JFrame();
        frame.setBounds(100, 100, 1075, 759);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 128, 255));

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
        lblTitulo.setBounds(419, 47, 119, 60);
        lblTitulo.setFocusable(true);
        panel_1.add(lblTitulo);

        nombreUser = new JTextField();
        nombreUser.setText("Nombre Usuario");
        
        nombreUser.setColumns(10);
        nombreUser.setBounds(340, 199, 250, 25);
        nombreUser.setForeground(new Color(192, 192, 192));

        // Agregar un FocusListener al JTextField nombreUser para eliminar el placeholder cuando se le dé clic
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

        panel_1.add(nombreUser);

        

        JLabel lblSubTitulo = new JLabel("Favor de registrarse para iniciar sesión");
        lblSubTitulo.setBounds(340, 139, 250, 14);
        panel_1.add(lblSubTitulo);

      
        
        contraseñaUsuario = new JPasswordField();
        contraseñaUsuario.setText("Contraseña");
        contraseñaUsuario.setColumns(10);
        contraseñaUsuario.setBounds(340, 246, 250, 25);
        contraseñaUsuario.setForeground(new Color(192, 192, 192));

        // Agregar un FocusListener al JTextField contraseñaUsuario para eliminar el placeholder cuando se le dé clic
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
        btnSesion.setBounds(419, 305, 167, 23);
        btnSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = nombreUser.getText();
                char[] passwordChars = contraseñaUsuario.getPassword();
                String password = new String(passwordChars);

                if (username.isEmpty()|| username.equals("Nombre Usuario") || password.isEmpty() || password.equals("Contraseña")) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese usuario y contraseña.");
                } else {
                    // Aquí puedes agregar la lógica para iniciar sesión
                }
            }
        });
        btnSesion.setBounds(340, 293, 250, 25);
        btnSesion.setBackground(new Color(0, 128, 255));
        panel_1.add(btnSesion);
        
        
        panel_1.add(contraseñaUsuario);
        
        JLabel lblCrearCuenta = new JLabel("No tengo cuenta");
        lblCrearCuenta.setBounds(340, 358, 97, 14);
        panel_1.add(lblCrearCuenta);
        
        JLabel lblOlvideUnDato = new JLabel("No puedo iniciar sesión");
        lblOlvideUnDato.setBounds(447, 358, 143, 14);
        panel_1.add(lblOlvideUnDato);
        
        JLabel lblCadaDiaMas = new JLabel("Cada dia mas cerca de un mejor tu");
        lblCadaDiaMas.setBounds(340, 418, 250, 14);
        panel_1.add(lblCadaDiaMas);
        
       
        
        
    }
}