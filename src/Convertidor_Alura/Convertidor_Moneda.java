package Convertidor_Alura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Convertidor_Moneda {

	JFrame frmConvertidorAluralatan;
	//ButtonGroup grupo =new ButtonGroup();
	int xOffset,yOffset;
	Realizado_Por realizado = new Realizado_Por();
	//JLabel lblMoneda1;
	
	public Convertidor_Moneda() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frmConvertidorAluralatan = new JFrame();
		frmConvertidorAluralatan.setTitle("Convertidor de Monedas - AluraLatan");
		frmConvertidorAluralatan.setBounds(100, 100, 622, 414);
		frmConvertidorAluralatan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConvertidorAluralatan.getContentPane().setLayout(null);
		frmConvertidorAluralatan.setResizable(false);
		frmConvertidorAluralatan.setLocationRelativeTo(null);  //centra la ventana
		frmConvertidorAluralatan.setUndecorated(true);         //efecto de trasparencia unido con el color de fondo
		frmConvertidorAluralatan.setBackground(new Color(198,190,238,230)); // color de fondo de la ventana
		
		JLabel lblSalir = new JLabel("");
		lblSalir.setToolTipText("Volver");
		lblSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/volver-color.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblSalir.getWidth(), lblSalir.getHeight(),
						Image.SCALE_DEFAULT));
				lblSalir.setIcon(icono);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				Principal principal =new Principal();
				principal.frmConvertidorAluralatan.setVisible(true);
				frmConvertidorAluralatan.setVisible(false);
			}
		});
		lblSalir.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/volver.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblSalir.getWidth(), lblSalir.getHeight(),
						Image.SCALE_DEFAULT));
				lblSalir.setIcon(icono);
			}
		});

		lblSalir.setBounds(579, 0, 33, 41);
		ImageIcon im = new ImageIcon("Imagenes/volver-color.png");
		Icon icono = new ImageIcon(
				im.getImage().getScaledInstance(lblSalir.getWidth(), lblSalir.getHeight(), Image.SCALE_DEFAULT));
		lblSalir.setIcon(icono);
		frmConvertidorAluralatan.getContentPane().add(lblSalir);

		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Calibri", Font.BOLD, 13));
		btnContinuar.setBounds(523, 369, 89, 34);
		frmConvertidorAluralatan.getContentPane().add(btnContinuar);
		
		JLabel lblmover = new JLabel("");
		lblmover.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = frmConvertidorAluralatan.getLocation().x;
		        int y = frmConvertidorAluralatan.getLocation().y;
		        frmConvertidorAluralatan.setLocation(x + e.getX() - xOffset, y + e.getY() - yOffset);
		        frmConvertidorAluralatan.setLocation(x + e.getX() - xOffset, y + e.getY() - yOffset);
			}
		});
		
		lblmover.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblmover.setCursor(new Cursor(Cursor.MOVE_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				 	xOffset = e.getX();
			        yOffset = e.getY();
			}
		});
		lblmover.setForeground(new Color(0, 0, 255));
		lblmover.setBounds(7, 0, 562, 56);
		frmConvertidorAluralatan.getContentPane().add(lblmover);
		
		JLabel lblNewLabel_2 = new JLabel("Alura");
		lblNewLabel_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 27));
		
		lblNewLabel_2.setBounds(7, 0, 101, 41);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Latan");
		lblNewLabel_2_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_2_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(48, 29, 60, 30);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblCreditos = new JLabel("");
		lblCreditos.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/Datos.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblCreditos.getWidth(),lblCreditos.getHeight() , Image.SCALE_DEFAULT ));
				lblCreditos.setIcon(icono);
			}
		});
		lblCreditos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/Datos-color.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblCreditos.getWidth(),lblCreditos.getHeight() , Image.SCALE_DEFAULT ));
				lblCreditos.setIcon(icono);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				realizado.frmConvertidorAluralatan.setVisible(true);
				frmConvertidorAluralatan.setVisible(false);
			}
		});
		lblCreditos.setToolTipText("Realizado por.");
		lblCreditos.setBounds(7, 373, 30, 30);
		ImageIcon imdatos = new ImageIcon("Imagenes/Datos-color.png");
		Icon iconodatos = new ImageIcon(imdatos.getImage().getScaledInstance(lblCreditos.getWidth(),lblCreditos.getHeight() , Image.SCALE_DEFAULT ));
		lblCreditos.setIcon(iconodatos);
		frmConvertidorAluralatan.getContentPane().add(lblCreditos);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Latan");
		lblNewLabel_2_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_2_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBounds(83, 110, 60, 30);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblMoneda1 = new JLabel("");
		lblMoneda1.setBounds(62, 143, 46, 41);
		frmConvertidorAluralatan.getContentPane().add(lblMoneda1);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedIndex()==0) {					
					lblMoneda1.setIcon(setIcono("Imagenes/Peso.png"));
				} else if(comboBox.getSelectedIndex()==1) {
					lblMoneda1.setIcon(setIcono("Imagenes/Dolar.png"));
				} else if(comboBox.getSelectedIndex()==2) {
					lblMoneda1.setIcon(setIcono("Imagenes/Euro.png"));
				} else if(comboBox.getSelectedIndex()==3) {
					lblMoneda1.setIcon(setIcono("Imagenes/Libra.png"));
				}else if(comboBox.getSelectedIndex()==4) {
					lblMoneda1.setIcon(setIcono("Imagenes/Yen.png"));
				}else if(comboBox.getSelectedIndex()==5) {
					lblMoneda1.setIcon(setIcono("Imagenes/Won.png"));
				}
			}
		});
		comboBox.setBackground(new Color(50, 205, 50));
		comboBox.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Peso Colombiano", "Dolar", "Euro", "Libra Esterlina", "Yen Japones", "Won Surcoreano"}));
		comboBox.setBounds(119, 151, 155, 20);
		comboBox.setSelectedItem(comboBox.getItemAt(3));
		frmConvertidorAluralatan.getContentPane().add(comboBox);
		
		JLabel lblMoneda2 = new JLabel("");
		lblMoneda2.setBounds(335, 143, 46, 41);
		frmConvertidorAluralatan.getContentPane().add(lblMoneda2);

		JComboBox<String> comboBox2 = new JComboBox<String>();
		comboBox2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox2.getSelectedIndex()==0) {					
					lblMoneda2.setIcon(setIcono("Imagenes/Peso.png"));
				} else if(comboBox2.getSelectedIndex()==1) {
					lblMoneda2.setIcon(setIcono("Imagenes/Dolar.png"));
				} else if(comboBox2.getSelectedIndex()==2) {
					lblMoneda2.setIcon(setIcono("Imagenes/Euro.png"));
				} else if(comboBox2.getSelectedIndex()==3) {
					lblMoneda2.setIcon(setIcono("Imagenes/Libra.png"));
				}else if(comboBox2.getSelectedIndex()==4) {
					lblMoneda2.setIcon(setIcono("Imagenes/Yen.png"));
				}else if(comboBox2.getSelectedIndex()==5) {
					lblMoneda2.setIcon(setIcono("Imagenes/Won.png"));
				}
			}
		});
		comboBox2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
		comboBox2.setBackground(new Color(50, 205, 50));
		comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {"Peso Colombiano", "Dolar", "Euro", "Libra Esterlina", "Yen Japones", "Won Surcoreano"}));
		comboBox2.setBounds(392, 151, 155, 20);
		comboBox2.setSelectedItem(comboBox.getItemAt(1));
		frmConvertidorAluralatan.getContentPane().add(comboBox2);
	}

	public Icon setIcono(String ruta) {
		ImageIcon im = new ImageIcon(ruta);
		return new ImageIcon(im.getImage().getScaledInstance(50,50,
				Image.SCALE_DEFAULT));
		
	}
}
