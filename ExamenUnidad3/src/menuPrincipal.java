import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class menuPrincipal {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public menuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Menu Gym - World");
        frame.setBounds(100, 100, 1075, 759);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
    	
    	JPanel panelClient = new JPanel();
    	panelClient.setBackground(Color.decode("#7FC7D9"));

    	panelClient.setBounds(0, 0, 1060, 720);
        frame.getContentPane().add(panelClient);
        panelClient.setLayout(null);
        
        JButton btnClientes = new JButton("Clientes");
        btnClientes.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose(); 
                
                
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
        });
        btnClientes.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        btnClientes.setIcon(new ImageIcon(menuPrincipal.class.getResource("/imagenes/imgClientes (1).png")));
        btnClientes.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnClientes.setIconTextGap(20);
        btnClientes.setHorizontalTextPosition(SwingConstants.CENTER);
        btnClientes.setFont(new Font("Tahoma", Font.PLAIN, 27));
        btnClientes.setFocusable(false);
        btnClientes.setBounds(90, 182, 210, 210);
        panelClient.add(btnClientes);
        
        JButton btnChecador = new JButton("Checador");
        btnChecador.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		JOptionPane.showMessageDialog(frame, "Su visita ha sido registrada con éxito en el sistema", "Registre su visita", JOptionPane.INFORMATION_MESSAGE);
        		}
        });
        
        
        btnChecador.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        btnChecador.setIcon(new ImageIcon(menuPrincipal.class.getResource("/imagenes/imgChecador (1).png")));
        btnChecador.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnChecador.setIconTextGap(30);
        btnChecador.setHorizontalTextPosition(SwingConstants.CENTER);
        btnChecador.setFont(new Font("Tahoma", Font.PLAIN, 27));
        btnChecador.setFocusable(false);
        btnChecador.setBounds(435, 455, 210, 210);
        panelClient.add(btnChecador);
        
        JButton btnRegresar = new JButton("Cerrar Sesión");
        btnRegresar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        btnRegresar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
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
        
        
        btnRegresar.setIcon(new ImageIcon(menuPrincipal.class.getResource("/imagenes/imgSalir (1).png")));
        btnRegresar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnRegresar.setIconTextGap(25);
        btnRegresar.setHorizontalTextPosition(SwingConstants.CENTER);
        btnRegresar.setFont(new Font("Tahoma", Font.PLAIN, 27));
        btnRegresar.setFocusable(false);
        btnRegresar.setBounds(765, 458, 210, 210);
        panelClient.add(btnRegresar);
        
        JLabel lblNewLabel = new JLabel("Menú Principal");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 38));
        lblNewLabel.setBounds(386, 36, 297, 45);
        panelClient.add(lblNewLabel);
        
        JLabel lblGymWorld = new JLabel("Gym-World");
        lblGymWorld.setHorizontalAlignment(SwingConstants.CENTER);
        lblGymWorld.setFont(new Font("Tahoma", Font.BOLD, 38));
        lblGymWorld.setBounds(409, 81, 246, 45);
        panelClient.add(lblGymWorld);
        
        JButton btnTarifa = new JButton("Tarifa");
        btnTarifa.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        btnTarifa.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		frame.dispose(); 
                
                
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
        });
        btnTarifa.setIcon(new ImageIcon(menuPrincipal.class.getResource("/imagenes/imgTarifaa (1).png")));
        btnTarifa.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnTarifa.setIconTextGap(25);
        btnTarifa.setHorizontalTextPosition(SwingConstants.CENTER);
        btnTarifa.setFont(new Font("Tahoma", Font.PLAIN, 27));
        btnTarifa.setFocusable(false);
        btnTarifa.setBounds(90, 455, 210, 210);
        panelClient.add(btnTarifa);
        
        JButton btnEntrenadores = new JButton("Entrenadores");
        btnEntrenadores.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        btnEntrenadores.setIcon(new ImageIcon(menuPrincipal.class.getResource("/imagenes/imgEntrenado (1).png")));
        btnEntrenadores.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnEntrenadores.setIconTextGap(25);
        btnEntrenadores.setHorizontalTextPosition(SwingConstants.CENTER);
        btnEntrenadores.setFont(new Font("Tahoma", Font.PLAIN, 27));
        btnEntrenadores.setFocusable(false);
        btnEntrenadores.setBounds(765, 182, 210, 210);
        btnEntrenadores.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 frame.dispose(); 
                 
                 
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
        });
        
        panelClient.add(btnEntrenadores);
        
        JButton btnRutinas = new JButton("Rutinas");
        btnRutinas.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        btnRutinas.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 frame.dispose(); 
                 
                 
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
        });
        btnRutinas.setIcon(new ImageIcon(menuPrincipal.class.getResource("/imagenes/imgRutinas (1).png")));
        btnRutinas.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnRutinas.setIconTextGap(25);
        btnRutinas.setHorizontalTextPosition(SwingConstants.CENTER);
        btnRutinas.setFont(new Font("Tahoma", Font.PLAIN, 27));
        btnRutinas.setFocusable(false);
        btnRutinas.setBounds(435, 182, 210, 210);
        panelClient.add(btnRutinas);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setOpaque(true);
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(35, 152, 994, 541);
        panelClient.add(lblNewLabel_1);
        
        frame.getContentPane().repaint();
	}
}
