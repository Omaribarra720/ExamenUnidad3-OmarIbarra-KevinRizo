
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


public class Tarifas {

	public JFrame frame;
	private JTable table_1;
	private JTextField fieldTarjeta;
	private JTextField fieldCodigo;
	private JTextField fieldNombre;
	private JTextField fieldLocalidad;
	private JTextField fieldDirecc;
	private JTextField fieldTotal;
	private JTextField fieldPostal;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarifas window = new Tarifas();
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
	public Tarifas() {
		initialize();
	}



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Tarifa Gym - World");
		frame.setBounds(100, 100, 1075, 759);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#7FC7D9"));

		panel.setBounds(0, 0, 1060, 720);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		

		Cliente cliente = new Cliente();
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(20, 20, 1020, 680);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblTitulo = new JLabel("Gym-World");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblTitulo.setBounds(424, 0, 181, 60);
		lblTitulo.setFocusable(true);
		panel_1.add(lblTitulo);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(44, 116, 395, 382);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel = new JLabel("Teléfono vinculado");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.decode("#7FC7D9"));
		lblNewLabel.setBounds(64, 77, 127, 25);
		panel_2.add(lblNewLabel);




		
		//telefono
		JLabel lblSubTitulo = new JLabel("+52 "+cliente.getTel());
		
		lblSubTitulo.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSubTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitulo.setOpaque(true);
		lblSubTitulo.setBackground(new Color(255, 255, 255));
		lblSubTitulo.setBounds(203, 77, 127, 25);
		panel_2.add(lblSubTitulo);

		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.decode("#7FC7D9"));
		lblNewLabel_1.setBounds(64, 176, 127, 25);
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nombre Usuario");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.decode("#7FC7D9"));
		lblNewLabel_2.setBounds(64, 126, 127, 25);
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Inicio de membresía");
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(Color.decode("#7FC7D9"));
		lblNewLabel_3.setBounds(64, 228, 127, 25);
		panel_2.add(lblNewLabel_3);

		JLabel lblSubTitulo_1 = new JLabel("Alejandro Ramirez Cota");
		lblSubTitulo_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSubTitulo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitulo_1.setOpaque(true);
		lblSubTitulo_1.setBackground(Color.WHITE);
		lblSubTitulo_1.setBounds(201, 126, 152, 25);
		panel_2.add(lblSubTitulo_1);

		JLabel lblSubTitulo_2 = new JLabel(cliente.getNombreUsuario());
		lblSubTitulo_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSubTitulo_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitulo_2.setOpaque(true);
		lblSubTitulo_2.setBackground(Color.WHITE);
		lblSubTitulo_2.setBounds(203, 176, 127, 25);
		panel_2.add(lblSubTitulo_2);

		JLabel lblSubTitulo_3 = new JLabel("25 de mayo del 2024");
		lblSubTitulo_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSubTitulo_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitulo_3.setOpaque(true);
		lblSubTitulo_3.setBackground(Color.WHITE);
		lblSubTitulo_3.setBounds(203, 228, 127, 25);
		panel_2.add(lblSubTitulo_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Estado de membresía");
		lblNewLabel_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setOpaque(true);
		lblNewLabel_3_1.setBackground(Color.decode("#7FC7D9"));
		lblNewLabel_3_1.setBounds(64, 322, 127, 25);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Membresia vence el");
		lblNewLabel_3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setOpaque(true);
		lblNewLabel_3_2.setBackground(Color.decode("#7FC7D9"));
		lblNewLabel_3_2.setBounds(64, 276, 127, 25);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblTitulo_1 = new JLabel("Datos del usuario");
		lblTitulo_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTitulo_1.setFocusable(true);
		lblTitulo_1.setBounds(116, 11, 188, 25);
		panel_2.add(lblTitulo_1);
		
		JLabel lblSubTitulo_3_1 = new JLabel("25 de junio del 2024");
		lblSubTitulo_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSubTitulo_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitulo_3_1.setOpaque(true);
		lblSubTitulo_3_1.setBackground(Color.WHITE);
		lblSubTitulo_3_1.setBounds(203, 276, 127, 25);
		panel_2.add(lblSubTitulo_3_1);
		
		JLabel lblSubTitulo_3_2 = new JLabel("Activa");
		lblSubTitulo_3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSubTitulo_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitulo_3_2.setOpaque(true);
		lblSubTitulo_3_2.setBackground(new Color(128, 255, 0));
		lblSubTitulo_3_2.setBounds(203, 322, 127, 25);
		panel_2.add(lblSubTitulo_3_2);
		
		
        Object[][] data = {
                {"Chintuma12", "01/01/2022", "31/12/2024", "1 año", "$5900.00"},
                {"Chintuma12", "14/02/2023", "14/02/2024", "1 año", "$5900.00"},
                {"Chintuma12", "10/03/2024", "10/04/2024", "1 mes", "$500.00"}
        };
        String[] columnNames = {"Usuario", "Inicio de membresía", "Finalización de membresía", "Duración", "Gasto"};
        
        
     
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };

   
        JTable table_1 = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table_1);
        scrollPane.setBounds(10, 559, 1000, 74);
        panel_1.add(scrollPane);
      
        
        JPanel panel_2_1 = new JPanel();
        panel_2_1.setLayout(null);
        panel_2_1.setBounds(521, 71, 489, 470);
        panel_1.add(panel_2_1);
        
        JLabel lblTitulo_1_1 = new JLabel("Pagar membresía");
        lblTitulo_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblTitulo_1_1.setFocusable(true);
        lblTitulo_1_1.setBounds(168, 11, 179, 25);
        panel_2_1.add(lblTitulo_1_1);
        
        JLabel lblNewLabel_4 = new JLabel("Seleccione método de pago");
        lblNewLabel_4.setBounds(33, 147, 168, 14);
        panel_2_1.add(lblNewLabel_4);
        
       
    
     
        String[] opciones = {"--","Visa", "Mastercard"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        comboBox.setBackground(new Color(255, 255, 255));
        comboBox.setBounds(32, 172, 129, 25);
        panel_2_1.add(comboBox);
        
  
        String[] meses = {"--","01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        
        JComboBox<String> comboMeses = new JComboBox<>(meses);
        comboMeses.setBackground(new Color(255, 255, 255));
        comboMeses.setBounds(220, 233, 47, 25);
        panel_2_1.add(comboMeses);
        
        
        String[] años = {"--","2024", "2025", "2026", "2027", "2028", "2029", "2030","2031", "2032", "2033", "2034", "2035"	};
        JComboBox<String> comboAños = new JComboBox<>(años);
        comboAños.setBackground(new Color(255, 255, 255));
        comboAños.setBounds(277, 233, 69, 25);
        panel_2_1.add(comboAños);
        
        String[] meses2 = {"--","1", "3", "6", "12"};
        JComboBox<String> mesesMembresia = new JComboBox<>(meses2);
        mesesMembresia.setBackground(new Color(255, 255, 255));
        mesesMembresia.setBounds(33, 74, 69, 25);
        panel_2_1.add(mesesMembresia);
        
        String[] paises = { "--","Argentina", "Australia", "Brasil", "Canadá", "Chile", "China", "Colombia", "España", "E.U.", "Filipinas", "Francia", "India", "Indonesia", "Irán", "Iraq", "Italia", "Japón", "Malasia", "México"};

        JComboBox<String> comboPaises = new JComboBox<>(paises);
        comboPaises.setBackground(new Color(255, 255, 255));
        comboPaises.setBounds(256, 391, 91, 25);
        panel_2_1.add(comboPaises);
        
        fieldTotal = new JTextField();
        fieldTotal.setBackground(new Color(255, 255, 255));
        fieldTotal.setEditable(false);
        fieldTotal.setColumns(10);
        fieldTotal.setBounds(206, 74, 168, 25);
        panel_2_1.add(fieldTotal);
        
        JLabel lblNewLabel_4_2_1 = new JLabel("Total a pagar");
        lblNewLabel_4_2_1.setBounds(209, 47, 154, 14);
        panel_2_1.add(lblNewLabel_4_2_1);
        
        
        
      
        mesesMembresia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) mesesMembresia.getSelectedItem();
                switch (seleccion) {
                    case "--":
                        fieldTotal.setText("");
                        break;
                    case "1":
                    	fieldTotal.setText("$500.00");
                        break;
                    case "3":
                    	fieldTotal.setText("$1450.00");
                        break;
                    case "6":
                    	fieldTotal.setText("$2925.00");
                        break;
                    case "12":
                    	fieldTotal.setText("$5900.00");
                        break;
                    default:
                        break;
                }
            }
        });
        
        JLabel lblNewLabel_4_1 = new JLabel("Número de tarjeta");
        lblNewLabel_4_1.setBounds(33, 208, 154, 14);
        panel_2_1.add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_4_1_1 = new JLabel("Fecha de caducidad");
        lblNewLabel_4_1_1.setBounds(220, 208, 125, 14);
        panel_2_1.add(lblNewLabel_4_1_1);
        
        JLabel lblNewLabel_4_1_1_1 = new JLabel("Código de seguridad");
        lblNewLabel_4_1_1_1.setBounds(360, 208, 119, 14);
        panel_2_1.add(lblNewLabel_4_1_1_1);
        
        
        fieldTarjeta = new JTextField();
        fieldTarjeta.setBounds(33, 233, 168, 25);
        
        fieldTarjeta.setColumns(10);
        fieldTarjeta.setDocument(new IntegerDocument(10));
        
        panel_2_1.add(fieldTarjeta);
        
       
        
        fieldCodigo = new JTextField();
        fieldCodigo.setColumns(10);
        fieldCodigo.setBounds(377, 233, 47, 25);
        fieldCodigo.setDocument(new IntegerDocument(3));
        panel_2_1.add(fieldCodigo);
        
        JLabel lblTitulo_1_1_1 = new JLabel("Información de facturación");
        lblTitulo_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTitulo_1_1_1.setFocusable(true);
        lblTitulo_1_1_1.setBounds(39, 269, 258, 25);
        panel_2_1.add(lblTitulo_1_1_1);
        
        fieldNombre = new JTextField();
        fieldNombre.setColumns(10);
        fieldNombre.setBounds(33, 330, 168, 25);
        fieldNombre.setDocument(new AlphaDocument());
        panel_2_1.add(fieldNombre);
        
        JLabel lblNewLabel_4_1_2 = new JLabel("Nombre de titular");
        lblNewLabel_4_1_2.setBounds(33, 305, 154, 14);
        panel_2_1.add(lblNewLabel_4_1_2);
        
        JLabel lblNewLabel_4_1_3 = new JLabel("Localidad");
        lblNewLabel_4_1_3.setBounds(256, 305, 154, 14);
        panel_2_1.add(lblNewLabel_4_1_3);
        
        JLabel lblNewLabel_4_1_4 = new JLabel("Dirección de facturación");
        lblNewLabel_4_1_4.setBounds(33, 366, 154, 14);
        panel_2_1.add(lblNewLabel_4_1_4);
        
        JLabel lblNewLabel_4_1_5 = new JLabel("País");
        lblNewLabel_4_1_5.setBounds(263, 366, 34, 14);
        panel_2_1.add(lblNewLabel_4_1_5);
        
        fieldLocalidad = new JTextField();
        fieldLocalidad.setColumns(10);
        fieldLocalidad.setBounds(256, 330, 168, 25);
        panel_2_1.add(fieldLocalidad);
        
        fieldDirecc = new JTextField();
        fieldDirecc.setColumns(10);
        fieldDirecc.setBounds(33, 391, 168, 25);
        panel_2_1.add(fieldDirecc);
        
        JLabel lblTitulo_1_1_1_1 = new JLabel("Método de pago");
        lblTitulo_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTitulo_1_1_1_1.setFocusable(true);
        lblTitulo_1_1_1_1.setBounds(33, 111, 258, 25);
        panel_2_1.add(lblTitulo_1_1_1_1);
        
        JLabel lblNewLabel_4_2 = new JLabel("Méses agregados");
        lblNewLabel_4_2.setBounds(33, 47, 154, 14);
        panel_2_1.add(lblNewLabel_4_2);
        
        JLabel lblNewLabel_4_1_5_1 = new JLabel("Código postal");
        lblNewLabel_4_1_5_1.setBounds(360, 366, 88, 14);
        panel_2_1.add(lblNewLabel_4_1_5_1);
        
        fieldPostal = new JTextField();
        fieldPostal.setColumns(10);
        fieldPostal.setBounds(361, 391, 63, 25);
        fieldPostal.setDocument(new IntegerDocument(5));
        panel_2_1.add(fieldPostal);
        
        
        JButton btnPagar = new JButton("Pagar");
        btnPagar.setBounds(189, 434, 108, 25);
        btnPagar.setBackground(new Color(255, 255, 255));
        
        btnPagar.setFocusPainted(false);
        btnPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox.getSelectedItem().equals("--") ||
                    comboMeses.getSelectedItem().equals("--") ||
                    comboAños.getSelectedItem().equals("--") ||
                    fieldTarjeta.getText().isEmpty() ||
                    fieldCodigo.getText().isEmpty() ||
                    fieldNombre.getText().isEmpty() ||
                    fieldLocalidad.getText().isEmpty() ||
                    fieldDirecc.getText().isEmpty() ||
                    fieldPostal.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor, llene todos los campos.");
                } else {
                    
                    JOptionPane.showMessageDialog(frame, "Pago procesado exitosamente.");
                    
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

       
        panel_2_1.add(btnPagar);
        
       
		
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setBounds(10, 655, 70, 14);
		
		
		lblRegresar.setForeground(Color.BLUE);
		lblRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegresar.setFont(lblRegresar.getFont().deriveFont(Font.BOLD | Font.ITALIC));
		lblRegresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
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
		
		panel_1.add(lblRegresar);
		
		
		
		
       
        
	}
	
	
	public class IntegerDocument extends PlainDocument {
	    private int maxLength;

	    public IntegerDocument(int maxLength) {
	        super();
	        this.maxLength = maxLength;
	    }

	    @Override
	    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
	        if (str == null) {
	            return;
	        }

	        if (getLength() + str.length() <= maxLength && isNumeric(str)) {
	            super.insertString(offs, str, a);
	        }
	    }

	    private boolean isNumeric(String str) {
	        return str.chars().allMatch(Character::isDigit);
	    }
	}

	    static class AlphaDocument extends PlainDocument {
	        @Override
	        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
	            if (str == null) {
	                return;
	            }

	            if (str.chars().allMatch(Character::isLetter)) {
	                super.insertString(offs, str, a);
	            }
	        }
	    }
}