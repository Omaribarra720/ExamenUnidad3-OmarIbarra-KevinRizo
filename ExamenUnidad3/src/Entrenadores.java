
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;



public class Entrenadores {

	public JFrame frame;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrenadores window = new Entrenadores();
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
	public Entrenadores() {
		initialize();
	}



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Entrenadores Gym - World");
		frame.setBounds(100, 100, 1075, 759);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);;

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
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitulo.setBounds(419, 11, 204, 27);
		lblTitulo.setFocusable(true);
		panel_1.add(lblTitulo);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(28, 61, 954, 587);

		panel_2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel = new JLabel("Entrenadores mejor valorados");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 0, 954, 33);
		panel_2.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Entrenadores.class.getResource("/imagenes/imgEntrenador4 (1).jpg")));
		lblNewLabel_2.setBackground(new Color(192, 192, 192));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(745, 88, 140, 124);
		panel_2.add(lblNewLabel_2);

		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setBounds(10, 563, 81, 24);
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
		panel_2.add(lblRegresar);
		
		
		

		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(Entrenadores.class.getResource("/imagenes/imgEntrenador1 (1).png")));
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2_1.setBounds(50, 88, 140, 124);
		panel_2.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(Entrenadores.class.getResource("/imagenes/imgEntrenador2  (1).png")));
		lblNewLabel_2_2.setOpaque(true);
		lblNewLabel_2_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2_2.setBounds(261, 88, 140, 124);
		panel_2.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon(Entrenadores.class.getResource("/imagenes/imgEntrenador3 (1).png")));
		lblNewLabel_2_3.setOpaque(true);
		lblNewLabel_2_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2_3.setBounds(488, 88, 140, 124);
		panel_2.add(lblNewLabel_2_3);



		JTextArea txtrExperienciaMsDe = new JTextArea();
		
		txtrExperienciaMsDe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtrExperienciaMsDe.setBounds(35, 267, 180, 255);
		txtrExperienciaMsDe.setLineWrap(true);
		txtrExperienciaMsDe.setEditable(false);
		txtrExperienciaMsDe.setWrapStyleWord(true);
		txtrExperienciaMsDe.setText(

				"Experiencia: Más de 8 años como entrenador personal e instructor de fitness en sala.\r\n\r\nFormación: Licenciado en Ciencias de la Actividad Física y del Deporte, estudiando la maestría.\r\n\r\n\r\nHorario: Lunes a viernes, de 8:00 AM a 12:00 PM y de 4:00 PM a 8:00 PM.\r\n\r\n"
				);
		panel_2.add(txtrExperienciaMsDe);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEditable(false);
		textArea_1.setBounds(239, 267, 180, 222);
		textArea_1.setText(
				"Experiencia: 6 años como entrenadora personal y monitora de fitness.\n\n" +
						"Formación: Graduada en Ciencias del Deporte. Certificada en Entrenamiento Funcional y Pilates\n\n" +
						"Horario: Lunes a viernes, de 9:00 AM a 1:00 PM y de 5:00 PM a 9:00 PM.\n\n"
				);
		panel_2.add(textArea_1);

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textArea_3.setBounds(472, 267, 180, 222);
		textArea_3.setLineWrap(true);
		textArea_3.setEditable(false);
		textArea_3.setWrapStyleWord(true);
		textArea_3.setText(

				"Experiencia: 10 años como entrenador personal y asesor de nutrición.\n\n\n" +
						"Formación: Licenciado en Nutrición y Dietética. Certificado en Entrenamiento de Alta Intensidad\n\n" +
						"Horario:Martes a sábado, de 7:00 AM a 11:00 AM y de 3:00 PM a 7:00 PM.\n\n"
				);
		panel_2.add(textArea_3);

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textArea_4.setEditable(false);
		textArea_4.setBounds(719, 267, 180, 222);
		textArea_4.setLineWrap(true);
		textArea_4.setWrapStyleWord(true);
		textArea_4.setText(
				"Experiencia: 5 años como entrenadora personal y coach de bienestar.\n\n\n" +
				"Formación: Licenciada en Educación Física y Certificada en Yoga\n\n" +
						"Horario:Miércoles a domingo, de 10:00 AM a 2:00 PM y de 6:00 PM a 10:00 PM.\n\n"
				);
		panel_2.add(textArea_4);

		JLabel lblNewLabel_1 = new JLabel("Karim Dasaev Wence ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(50, 238, 146, 14);
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Brenda Rodriguez");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(270, 238, 127, 14);
		panel_2.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Yahir Radilla");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(501, 238, 118, 14);
		panel_2.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Vannia Chiu");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(766, 238, 101, 14);
		panel_2.add(lblNewLabel_1_3);



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