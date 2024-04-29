import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Rutinas {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rutinas window = new Rutinas();
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
	public Rutinas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Rutinas Gym - World");
		frame.setBounds(100, 100, 1075, 759);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#7FC7D9"));
		panel.setBounds(0, 0, 1060, 720);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Relajada", "Equilibrada", "Intensiva"}));
		comboBox.setName("");
		comboBox.setToolTipText("");
		comboBox.setBounds(105, 227, 168, 29);
		panel.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Seleccione su tipo de rutina");
		lblNewLabel_2.setBounds(105, 202, 168, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Seleccione el area a ejercitar");
		lblNewLabel_2_1.setBounds(105, 285, 168, 14);
		panel.add(lblNewLabel_2_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Pecho", "Tríceps", "Espalda", "Glúteos "}));
		comboBox_1.setToolTipText("");
		comboBox_1.setName("");
		comboBox_1.setBounds(105, 321, 168, 29);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Genere su rutina");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(148, 146, 125, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setBounds(135, 492, 113, 34);
		panel.add(btnGenerar);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Seleccione tiempo estimado de realización");
		lblNewLabel_2_1_1.setBounds(86, 373, 261, 14);
		panel.add(lblNewLabel_2_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"30 Minutos", "1 Hora", "1 Hora y 30 Minutos", "2 Horas"}));
		comboBox_1_1.setToolTipText("");
		comboBox_1_1.setName("");
		comboBox_1_1.setBounds(105, 410, 168, 29);
		panel.add(comboBox_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(61, 120, 277, 476);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(441, 120, 554, 476);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(null);
		lblNewLabel_1.setBounds(38, 26, 165, 151);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		
		lblNewLabel_1_1.setBounds(347, 26, 165, 151);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setBounds(38, 261, 165, 151);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setBounds(347, 261, 165, 151);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblEjercicio1 = new JLabel("");
		lblEjercicio1.setBounds(48, 188, 148, 14);
		panel_1.add(lblEjercicio1);
		
		JLabel lblEjercicio2 = new JLabel("");
		lblEjercicio2.setBounds(357, 188, 148, 14);
		panel_1.add(lblEjercicio2);
		
		JLabel lblEjercicio3 = new JLabel("");
		lblEjercicio3.setBounds(48, 423, 148, 14);
		panel_1.add(lblEjercicio3);
		
		JLabel lblEjercicio4 = new JLabel("");
		lblEjercicio4.setBounds(357, 423, 148, 14);
		panel_1.add(lblEjercicio4);
		
		
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ejercicio = comboBox_1.getSelectedIndex();
				
				switch(ejercicio) {
				case 0:
					lblNewLabel_1.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioPecho (1).png")));
					lblNewLabel_1_1.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioPecho2 (1).jpg")));
					lblNewLabel_1_2.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioPecho3 (1).jpg")));
					lblNewLabel_1_3.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioPecho4 (1).png")));
					
					lblEjercicio1.setText("Press banca");
					lblEjercicio2.setText("Pull over");
					lblEjercicio3.setText("Apertura de pecho");
					lblEjercicio4.setText("Levantamiento de pecho");
					break;
				case 1:
					lblNewLabel_1.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioTricep (1).jpg")));
					lblNewLabel_1_1.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioTricep2 (1).png")));
					lblNewLabel_1_2.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioTricep3 (1).png")));
					lblNewLabel_1_3.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioTricep4 (1).png")));
					
					lblEjercicio1.setText("Tricep dips");
					lblEjercicio2.setText("Triceps chop");
					lblEjercicio3.setText("Curl de triceps");
					lblEjercicio4.setText("Jale de polea baja");
					break;

				case 2:
					lblNewLabel_1.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioEspalda (1).png")));
					lblNewLabel_1_1.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioEspalda2 (1).png")));
					lblNewLabel_1_2.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioEspalda3 (1).jpg")));
					lblNewLabel_1_3.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioEspalda4 (1).png")));
					
					lblEjercicio1.setText("Remo con mancuerna");
					lblEjercicio2.setText("Remo de agarre cerrado");
					lblEjercicio3.setText("Dominadas");
					lblEjercicio4.setText("Peso muerto");
					break;

				case 3:
					lblNewLabel_1.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioGluteo (1).png")));
					lblNewLabel_1_1.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioGluteo2 (1).png")));
					lblNewLabel_1_2.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioGluteo3 (1).png")));
					lblNewLabel_1_3.setIcon(new ImageIcon(Rutinas.class.getResource("/imagenes/ejercicioGluteo4 (1).jpg")));
					
					lblEjercicio1.setText("Sentadillas");
					lblEjercicio2.setText("Hip Thrust");
					lblEjercicio3.setText("Movimiento con maquina");
					lblEjercicio4.setText("Paseo lateral");
					break;

				}
			}
		});
		
		
	}
}
