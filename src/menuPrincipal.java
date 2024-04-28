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
        
        JButton btnNewButton = new JButton("Consultar");
        btnNewButton.setIconTextGap(30);
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
        btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
        btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnNewButton.setIcon(new ImageIcon(menuPrincipal.class.getResource("/imagenes/imgConsulta (1).png")));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
        btnNewButton.setFocusable(false);
        btnNewButton.setBounds(121, 183, 204, 207);
        panelClient.add(btnNewButton);
        
        JButton btnCrear = new JButton("Crear");
        btnCrear.setIcon(new ImageIcon(menuPrincipal.class.getResource("/imagenes/imgCrear (2).png")));
        btnCrear.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnCrear.setIconTextGap(20);
        btnCrear.setHorizontalTextPosition(SwingConstants.CENTER);
        btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 27));
        btnCrear.setFocusable(false);
        btnCrear.setBounds(431, 181, 204, 209);
        panelClient.add(btnCrear);
        
        JButton btnEditar = new JButton("Editar");
        btnEditar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnEditar.setIcon(new ImageIcon(menuPrincipal.class.getResource("/imagenes/imgEditar (1).png")));
        btnEditar.setIconTextGap(30);
        btnEditar.setHorizontalTextPosition(SwingConstants.CENTER);
        btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 27));
        btnEditar.setFocusable(false);
        btnEditar.setBounds(121, 458, 204, 209);
        panelClient.add(btnEditar);
        
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setIcon(new ImageIcon(menuPrincipal.class.getResource("/imagenes/imgBorrar (1).png")));
        btnEliminar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnEliminar.setIconTextGap(30);
        btnEliminar.setHorizontalTextPosition(SwingConstants.CENTER);
        btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 27));
        btnEliminar.setFocusable(false);
        btnEliminar.setBounds(431, 458, 204, 209);
        panelClient.add(btnEliminar);
        
        JButton btnRegresar = new JButton("Regresar");
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
        
        
        btnRegresar.setIcon(new ImageIcon(menuPrincipal.class.getResource("/imagenes/imgRegresar (3).png")));
        btnRegresar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnRegresar.setIconTextGap(25);
        btnRegresar.setHorizontalTextPosition(SwingConstants.CENTER);
        btnRegresar.setFont(new Font("Tahoma", Font.PLAIN, 27));
        btnRegresar.setFocusable(false);
        btnRegresar.setBounds(745, 180, 204, 209);
        panelClient.add(btnRegresar);
        
        JLabel lblNewLabel = new JLabel("Menu Principal");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 38));
        lblNewLabel.setBounds(389, 37, 297, 45);
        panelClient.add(lblNewLabel);
        
        JLabel lblGymWorld = new JLabel("Gym - World");
        lblGymWorld.setHorizontalAlignment(SwingConstants.CENTER);
        lblGymWorld.setFont(new Font("Tahoma", Font.BOLD, 38));
        lblGymWorld.setBounds(409, 80, 246, 45);
        panelClient.add(lblGymWorld);
        
        JButton btnTarifa = new JButton("Tarifa");
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
        btnTarifa.setBounds(745, 458, 204, 209);
        panelClient.add(btnTarifa);
        
        frame.getContentPane().repaint();
	}
}
