package Convertidor_Alura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
public class Principal extends Operaciones_General implements Utilitario_General {

	JFrame frmConvertidorAluralatan;

	Realizado_Por realizado = new Realizado_Por();
	Convertidor_Moneda moneda = new Convertidor_Moneda();
	Convertidor_Masa masa = new Convertidor_Masa();
	public Principal() {
		initialize();
	}

	void initialize() {
		frmConvertidorAluralatan = new JFrame();
		frmConvertidorAluralatan.setBounds(100, 100, 315, 181);
		Operaciones_formulario(frmConvertidorAluralatan);

		JLabel lblSalir = new JLabel("");
		lblSalir.setToolTipText("Salir");
		lblSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/cerrar-sesion-color.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblSalir.getWidth(),lblSalir.getHeight() , Image.SCALE_DEFAULT ));
				lblSalir.setIcon(icono);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblSalir.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/cerrar-sesion.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblSalir.getWidth(),lblSalir.getHeight() , Image.SCALE_DEFAULT ));
				lblSalir.setIcon(icono);
			}
		});
		
		
		lblSalir.setBounds(282, 11, 33, 41);
		ImageIcon im = new ImageIcon("Imagenes/cerrar-sesion-color.png");
		Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblSalir.getWidth(),lblSalir.getHeight() , Image.SCALE_DEFAULT ));
		lblSalir.setIcon(icono);
		frmConvertidorAluralatan.getContentPane().add(lblSalir);
		
		JLabel lblmover = new JLabel("");
		lblmover.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				mover(frmConvertidorAluralatan,e);
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
		lblmover.setForeground(Etiquetas_titulos);
		lblmover.setBounds(0, 0, 261, 56);
		frmConvertidorAluralatan.getContentPane().add(lblmover);
		
		JLabel lblMoneda = new JLabel("Monedas");
		lblMoneda.setToolTipText("Moneda");
		lblMoneda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				ImageIcon imm = new ImageIcon("Imagenes/Moneda-color.png");
				Icon iconom = new ImageIcon(imm.getImage().getScaledInstance(lblMoneda.getWidth(),
						lblMoneda.getHeight(), Image.SCALE_DEFAULT));
				lblMoneda.setIcon(iconom);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/Moneda.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblMoneda.getWidth(),
						lblMoneda.getHeight(), Image.SCALE_DEFAULT));
				lblMoneda.setIcon(icono);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frmConvertidorAluralatan.setVisible(false);

				moneda.frmConvertidorAluralatan.setVisible(true);
			}
		});
		lblMoneda.setFont(new Font("Calibri", Font.BOLD, 13));
		lblMoneda.setBounds(74, 67, 60, 60);
		ImageIcon imm = new ImageIcon("Imagenes/Moneda-color.png");
		Icon iconom = new ImageIcon(imm.getImage().getScaledInstance(lblMoneda.getWidth(),
				lblMoneda.getHeight(), Image.SCALE_DEFAULT));
		lblMoneda.setIcon(iconom);
		frmConvertidorAluralatan.getContentPane().add(lblMoneda);
		
		JLabel lblMasa = new JLabel("Masa");
		lblMasa.setToolTipText("Masa");
		lblMasa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				ImageIcon masaico = new ImageIcon("Imagenes/Masa-color.png");
				Icon iconomasa = new ImageIcon(masaico.getImage().getScaledInstance(lblMasa.getWidth(),
						lblMasa.getHeight(), Image.SCALE_DEFAULT));
				lblMasa.setIcon(iconomasa);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/Masa.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblMasa.getWidth(),
						lblMasa.getHeight(), Image.SCALE_DEFAULT));
				lblMasa.setIcon(icono);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frmConvertidorAluralatan.setVisible(false);
				masa.frmConvertidorAluralatan.setVisible(true);
			}
		});
		lblMasa.setFont(new Font("Calibri", Font.BOLD, 13));
		lblMasa.setBounds(205, 67, 60, 60);
		ImageIcon masaico = new ImageIcon("Imagenes/Masa-color.png");
		Icon iconomasa = new ImageIcon(masaico.getImage().getScaledInstance(lblMasa.getWidth(),
				lblMasa.getHeight(), Image.SCALE_DEFAULT));
		lblMasa.setIcon(iconomasa);
		frmConvertidorAluralatan.getContentPane().add(lblMasa);
		
		JLabel lblNewLabel_2 = new JLabel("Alura");
		lblNewLabel_2.setForeground(Etiquetas_titulos);
		lblNewLabel_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 27));
		
		lblNewLabel_2.setBounds(7, 0, 101, 41);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Latam");
		lblNewLabel_2_1.setForeground(Etiquetas_titulos);
		lblNewLabel_2_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(48, 29, 60, 30);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblCreditos = new JLabel("");
		lblCreditos.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/Datos.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblCreditos.getWidth(),lblCreditos.getHeight() , Image.SCALE_DEFAULT ));
				lblCreditos.setIcon(icono);//
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
				realizado.frmConvertidorAluralatan.setAlwaysOnTop(true);

				realizado.frmConvertidorAluralatan.setVisible(true);
			}
		});
		lblCreditos.setToolTipText("Realizado por.");
		lblCreditos.setBounds(0, 147, 30, 30);
		ImageIcon imdatos = new ImageIcon("Imagenes/Datos-color.png");
		Icon iconodatos = new ImageIcon(imdatos.getImage().getScaledInstance(lblCreditos.getWidth(),lblCreditos.getHeight() , Image.SCALE_DEFAULT ));
		lblCreditos.setIcon(iconodatos);
		frmConvertidorAluralatan.getContentPane().add(lblCreditos);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Convertidor");
		lblNewLabel_2_1_1.setForeground(Etiquetas_titulos);
		lblNewLabel_2_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBounds(136, 147, 108, 30);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1_1);
	}
}