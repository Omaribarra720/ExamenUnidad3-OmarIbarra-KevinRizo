
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import java.awt.*;


public class Cliente {

	public JFrame frame;
	public String nombreUsuario ="Chintuma12",tel ="61217014";
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente window = new Cliente();
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
	public Cliente() {
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
		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));

		panel.setBounds(0, 0, 1060, 720);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(20, 20, 1020, 680);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblTitulo = new JLabel("Gym-World");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblTitulo.setBounds(410, 11, 208, 27);
		lblTitulo.setFocusable(true);
		panel_1.add(lblTitulo);

		 JPanel panel_2 = new JPanel();
	        panel_2.setBackground(Color.WHITE);
	        panel_2.setBounds(28, 61, 954, 587);
	        
	        panel_2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	        panel_1.add(panel_2);
	        panel_2.setLayout(null);
	        
	        JLabel lblNewLabel = new JLabel("Información personal del cliente");
	        lblNewLabel.setOpaque(true);
	        lblNewLabel.setBackground(new Color(0, 128, 255));
	        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
	        lblNewLabel.setForeground(new Color(255, 255, 255));
	        lblNewLabel.setBounds(0, 0, 954, 33);
	        panel_2.add(lblNewLabel);
	        
	        JLabel lblNewLabel_1 = new JLabel("Nombre");
	        
	        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1.setBounds(99, 139, 90, 24);
	        panel_2.add(lblNewLabel_1);
	        
	        JLabel lblNewLabel_1_1 = new JLabel("Alejandro Chintum Ramirez");
	        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
	        lblNewLabel_1_1.setBounds(299, 139, 204, 24);
	        panel_2.add(lblNewLabel_1_1);
	        
	        JLabel lblNewLabel_1_2 = new JLabel("Nombre de usuario");
	        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1_2.setBounds(99, 185, 128, 24);
	        panel_2.add(lblNewLabel_1_2);
	        
	        JLabel lbl11 = new JLabel("Fecha de nacimiento");
	        lbl11.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lbl11.setBounds(99, 233, 128, 24);
	        panel_2.add(lbl11);
	        
	        JLabel lblNewLabel_1_2_1_1 = new JLabel("Télefono");
	        lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1_2_1_1.setBounds(99, 277, 128, 24);
	        panel_2.add(lblNewLabel_1_2_1_1);
	        
	        JLabel lblNewLabel_1_2_1_2 = new JLabel("Correo Eléctronico");
	        lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1_2_1_2.setBounds(99, 317, 128, 30);
	        panel_2.add(lblNewLabel_1_2_1_2);
	        
	        JLabel lblNewLabel_2 = new JLabel("");
	        lblNewLabel_2.setIcon(new ImageIcon(Cliente.class.getResource("/imagenes/imgCliente (1).png")));
	        lblNewLabel_2.setBounds(695, 139, 174, 148);
	        panel_2.add(lblNewLabel_2);
	       
	        
	        
	        
	     
	        
	        JLabel lblNewLabel_1_1_4 = new JLabel("ramirez12@gmail.com");
	        lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 13));
	        lblNewLabel_1_1_4.setBounds(299, 320, 204, 24);
	        panel_2.add(lblNewLabel_1_1_4);
	        
	        
	        JLabel lblnombredeUsuario = new JLabel(nombreUsuario);
	        lblnombredeUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
	        lblnombredeUsuario.setBounds(299, 185, 204, 24);
	        panel_2.add(lblnombredeUsuario);
	        
	      
	        
	        JLabel lblnCambiarnombreUsuario = new JLabel("Editar");
	        lblnCambiarnombreUsuario.setBounds(510, 186, 99, 24);
	        lblnCambiarnombreUsuario.setForeground(Color.BLUE);
	        lblnCambiarnombreUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        panel_2.add(lblnCambiarnombreUsuario);
	        
	       
	        lblnCambiarnombreUsuario.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                String nuevoNombre = JOptionPane.showInputDialog(frame, "Ingrese el nuevo nombre de usuario:");
	                if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
	                    nombreUsuario=nuevoNombre;
	                    lblnombredeUsuario.setText(nombreUsuario);
	                } else {
	                    JOptionPane.showMessageDialog(frame, "Por favor ingrese un nombre válido.");
	                }
	            }
	        });
	        
	        
	        JLabel lblNacimiento = new JLabel("--/--/----");
	        lblNacimiento.setFont(new Font("Tahoma", Font.BOLD, 13));
	        lblNacimiento.setBounds(299, 239, 123, 24);
	        panel_2.add(lblNacimiento);
	        
	        JLabel lblnCambiarNacimiento = new JLabel("Editar");
	        lblnCambiarNacimiento.setForeground(Color.BLUE);
	        lblnCambiarNacimiento.setBounds(510, 239, 81, 24);
	        lblnCambiarNacimiento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        panel_2.add(lblnCambiarNacimiento);
	        
	        
	        
	        lblnCambiarNacimiento.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                String[] dias = new String[31];
	                String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	                String[] años = new String[80]; 
	                
	                for (int i = 0; i < 31; i++) {
	                    dias[i] = Integer.toString(i + 1);
	                }
	                
	                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
	                for (int i = 0; i < 80; i++) {
	                    años[i] = Integer.toString(currentYear - i);
	                }
	                
	                JComboBox<String> diaComboBox = new JComboBox<>(dias);
	                JComboBox<String> mesComboBox = new JComboBox<>(meses);
	                JComboBox<String> añoComboBox = new JComboBox<>(años);
	                
	                JPanel panel = new JPanel();
	                panel.setLayout(new GridLayout(0, 2));
	                panel.add(new JLabel("Día:"));
	                panel.add(diaComboBox);
	                panel.add(new JLabel("Mes:"));
	                panel.add(mesComboBox);
	                panel.add(new JLabel("Año:"));
	                panel.add(añoComboBox);
	                
	                int result = JOptionPane.showConfirmDialog(frame, panel, "Seleccione su fecha de nacimiento", JOptionPane.OK_CANCEL_OPTION);
	                if (result == JOptionPane.OK_OPTION) {
	                    String fechaNacimiento = (String) diaComboBox.getSelectedItem() + "/" + (String) mesComboBox.getSelectedItem() + "/" + (String) añoComboBox.getSelectedItem();
	                    lblNacimiento.setText(fechaNacimiento);
	                }
	            }
	        });
	        
	        JLabel lblTelefono = new JLabel(tel);
	        lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 13));
	        lblTelefono.setBounds(332, 285, 90, 24);
	        panel_2.add(lblTelefono);
	        
	        
	        
	        JButton btnEliminarCuenta = new JButton("Eliminar cuenta");
	        btnEliminarCuenta.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		JOptionPane.showMessageDialog(btnEliminarCuenta, "Se ha eliminado su cuenta");
	        		
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
	        
	        btnEliminarCuenta.setBackground(new Color(255, 128, 128));
	        btnEliminarCuenta.setBounds(540, 483, 139, 23);
	        panel_2.add(btnEliminarCuenta);
	        
	        JLabel lblTelefono_1 = new JLabel("+52");
	        lblTelefono_1.setFont(new Font("Tahoma", Font.BOLD, 13));
	        lblTelefono_1.setBounds(299, 285, 81, 24);
	        panel_2.add(lblTelefono_1);
	        
	        
	       
	        JButton btnRegresar = new JButton("Regresar");
	        btnRegresar.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
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
	        });
	        btnRegresar.setBackground(new Color(255, 255, 255));
	        btnRegresar.setBounds(307, 483, 139, 23);
	        panel_2.add(btnRegresar);
	        
	        JLabel lblnCambiarTelefono = new JLabel("Editar");
	        lblnCambiarTelefono.setForeground(Color.BLUE);
	        lblnCambiarTelefono.setBounds(510, 286, 99, 24);
	        lblnCambiarTelefono.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        panel_2.add(lblnCambiarTelefono);
	        
	        lblnCambiarTelefono.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                JTextField textField = new JTextField(20);
	                PlainDocument doc = (PlainDocument) textField.getDocument();
	                doc.setDocumentFilter(new NumberFilter());
	                
	                JPanel panel = new JPanel();
	                panel.add(new JLabel("Ingrese el nuevo número de teléfono:"));
	                panel.add(textField);
	                
	                int result = JOptionPane.showConfirmDialog(frame, panel, "Cambiar teléfono", JOptionPane.OK_CANCEL_OPTION);
	                if (result == JOptionPane.OK_OPTION) {
	                   tel = textField.getText();
	                    lblTelefono.setText(tel);
	                }
	            }
	        });
	        
		
		
		
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public String getTel() {
		return tel;
	}

	

	static class NumberFilter extends DocumentFilter {
        @Override
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            StringBuilder builder = new StringBuilder();
            builder.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
            builder.insert(offset, string);
            
            if (builder.toString().matches("\\d{0,10}")) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String string, AttributeSet attr) throws BadLocationException {
            StringBuilder builder = new StringBuilder();
            builder.append(fb.getDocument().getText(0, fb.getDocument().getLength()));
            builder.replace(offset, offset + length, string);
            
            if (builder.toString().matches("\\d{0,10}")) {
                super.replace(fb, offset, length, string, attr);
            }
        }
       
    }
	
}