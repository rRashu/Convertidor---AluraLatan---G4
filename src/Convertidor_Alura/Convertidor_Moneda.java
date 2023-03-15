package Convertidor_Alura;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Objects;

public class Convertidor_Moneda implements Utilitario_General {

	JFrame frmConvertidorAluralatan;
	int xOffset, yOffset;
	Realizado_Por realizado = new Realizado_Por();

	public Convertidor_Moneda () {

		initialize();
	}

	void initialize() {
		frmConvertidorAluralatan = new JFrame();
		frmConvertidorAluralatan.setTitle("Convertidor de Monedas - AluraLatam");
		frmConvertidorAluralatan.setBounds(100, 100, 622, 300);
		frmConvertidorAluralatan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConvertidorAluralatan.getContentPane().setLayout(null);
		frmConvertidorAluralatan.setResizable(false);
		frmConvertidorAluralatan.setLocationRelativeTo(null); // centra la ventana
		frmConvertidorAluralatan.setUndecorated(true); // efecto de trasparencia unido con el color de fondo
		frmConvertidorAluralatan.setBackground(FondoVentana); // color de fondo de la ventana
		ImageIcon iconoAlura = new ImageIcon("Imagenes/Alura.png");
		frmConvertidorAluralatan.setIconImage(iconoAlura.getImage());

		JLabel lblSalir = new JLabel("");
		lblSalir.setToolTipText("Volver");
		lblSalir.setBounds(579, 0, 33, 41);
		ImageIcon im = new ImageIcon("Imagenes/volver-color.png");
		Icon icono = new ImageIcon(
				im.getImage().getScaledInstance(lblSalir.getWidth(), lblSalir.getHeight(), Image.SCALE_DEFAULT));
		lblSalir.setIcon(icono);
		frmConvertidorAluralatan.getContentPane().add(lblSalir);

		JLabel lblmover = new JLabel("");
		lblmover.setForeground(Etiquetas_titulos);
		lblmover.setBounds(0, 0, 562, 56);
		frmConvertidorAluralatan.getContentPane().add(lblmover);

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
		lblCreditos.setToolTipText("Realizado por.");
		lblCreditos.setBounds(7, 259, 30, 30);
		ImageIcon imdatos = new ImageIcon("Imagenes/Datos-color.png");
		Icon iconodatos = new ImageIcon(imdatos.getImage().getScaledInstance(lblCreditos.getWidth(),
				lblCreditos.getHeight(), Image.SCALE_DEFAULT));
		lblCreditos.setIcon(iconodatos);
		frmConvertidorAluralatan.getContentPane().add(lblCreditos);

		JLabel lblNewLabel_2_1_1 = new JLabel("Convertidor De Monedas");
		lblNewLabel_2_1_1.setForeground(Etiquetas_titulos);
		lblNewLabel_2_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 30));
		lblNewLabel_2_1_1.setBounds(153, 67, 372, 56);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1_1);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBackground(Combo_Box);
		comboBox.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Peso Colombiano", "Dolar", "Euro",
				"Libra Esterlina", "Yen Japones", "Won Surcoreano" }));
		comboBox.setBounds(119, 151, 155, 20);
		comboBox.setSelectedItem(comboBox.getItemAt(3));
		frmConvertidorAluralatan.getContentPane().add(comboBox);

		JLabel lblMoneda2 = new JLabel("");
		lblMoneda2.setBounds(335, 143, 46, 41);
		lblMoneda2.setIcon(setIcono("Imagenes/Dolar.png"));
		frmConvertidorAluralatan.getContentPane().add(lblMoneda2);

		JComboBox<String> comboBox2 = new JComboBox<>();
		comboBox2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
		comboBox2.setBackground(Combo_Box);
		comboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"Peso Colombiano", "Dolar", "Euro",
				"Libra Esterlina", "Yen Japones", "Won Surcoreano"}));
		comboBox2.setBounds(392, 151, 155, 20);
		comboBox2.setSelectedItem(comboBox.getItemAt(1));
		frmConvertidorAluralatan.getContentPane().add(comboBox2);

		JTextField textmoneda1 = new JTextField();
		textmoneda1.setForeground(Texto_text);
		textmoneda1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		textmoneda1.setBounds(129, 182, 145, 34);
		textmoneda1.setColumns(10);
		textmoneda1.setBorder(new LineBorder(Borde_text, Borde_Grosor, true));
		textmoneda1.setOpaque(false);
		textmoneda1.setText("0.00");
		frmConvertidorAluralatan.getContentPane().add(textmoneda1);

		JTextField textmoneda2 = new JTextField();
		textmoneda2.setColumns(10);
		textmoneda2.setForeground(Texto_text);
		textmoneda2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		textmoneda2.setBounds(391, 182, 145, 34);
		textmoneda2.setBorder(new LineBorder(Borde_text, Borde_Grosor));
		textmoneda2.setOpaque(false);
		textmoneda2.setText("0.00");
		frmConvertidorAluralatan.getContentPane().add(textmoneda2);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("One G4");
		lblNewLabel_2_1_1_1.setForeground(Etiquetas_titulos);
		lblNewLabel_2_1_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1.setBounds(543, 259, 79, 30);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1_1_1);

		JLabel lblMoneda1 = new JLabel("");
		lblMoneda1.setBounds(62, 143, 46, 41);
		lblMoneda1.setIcon(setIcono("Imagenes/Libra.png"));
		frmConvertidorAluralatan.getContentPane().add(lblMoneda1);

		// eventos

		textmoneda1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if ((textmoneda1.getText().equals("0.00")) || (textmoneda1.getText().isEmpty())) {
					textmoneda1.setText("");
				}

			}

			@Override
			public void focusLost(FocusEvent e) {
				if (textmoneda1.getText().isEmpty()) {
					textmoneda1.setText("0.00");
				}
			}
		});

		textmoneda1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if ((textmoneda1.getText().length() == 10) | Character.isLetter(validar)
						| (validar == '.' && textmoneda1.getText().contains(".")) | (validar == ',')
						| (validar == '.' && textmoneda1.getText().length() == 0)) {
					e.consume();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (!textmoneda1.getText().isEmpty())
					textmoneda2.setText(calculo((Objects.requireNonNull(comboBox.getSelectedItem())).toString(),
							(Objects.requireNonNull(comboBox2.getSelectedItem())).toString(),
							Double.parseDouble(textmoneda1.getText())));
			}
		});

		textmoneda2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if ((textmoneda2.getText().equals("0.00")) || (textmoneda2.getText().isEmpty())) {
					textmoneda2.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (textmoneda2.getText().isEmpty()) {
					textmoneda2.setText("0.00");
				}
			}
		});

		textmoneda2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if ((textmoneda2.getText().length() == 10) | Character.isLetter(validar)
						| (validar == '.' && textmoneda2.getText().contains(".")) | (validar == ',')
						| (validar == '.' && textmoneda2.getText().length() == 0)) {
					e.consume();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (!textmoneda2.getText().isEmpty())
					textmoneda1.setText(calculo(Objects.requireNonNull(comboBox2.getSelectedItem()).toString(),
							Objects.requireNonNull(comboBox.getSelectedItem()).toString(),
							Double.parseDouble(textmoneda2.getText())));
			}
		});

		lblCreditos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/Datos-color.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblCreditos.getWidth(),
						lblCreditos.getHeight(), Image.SCALE_DEFAULT));
				lblCreditos.setIcon(icono);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				realizado.frmConvertidorAluralatan.setVisible(true);
			}
		});

		comboBox.addActionListener(
				e -> textmoneda2.setText(calculo(Objects.requireNonNull(comboBox.getSelectedItem()).toString(),
						Objects.requireNonNull(comboBox2.getSelectedItem()).toString(),
						Double.parseDouble(textmoneda1.getText()))));

		comboBox2.addActionListener(
				e -> textmoneda1.setText(calculo(Objects.requireNonNull(comboBox2.getSelectedItem()).toString(),
						Objects.requireNonNull(comboBox.getSelectedItem()).toString(),
						Double.parseDouble(textmoneda2.getText()))));

		lblCreditos.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/Datos.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblCreditos.getWidth(),
						lblCreditos.getHeight(), Image.SCALE_DEFAULT));
				lblCreditos.setIcon(icono);
			}
		});

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
				Principal principal = new Principal();
				principal.frmConvertidorAluralatan.setVisible(true);
				frmConvertidorAluralatan.setVisible(false);
			}
		});

		comboBox2.addItemListener(e -> {
			if (comboBox2.getSelectedIndex() == 0) {
				lblMoneda2.setIcon(setIcono("Imagenes/Peso.png"));
			} else if (comboBox2.getSelectedIndex() == 1) {
				lblMoneda2.setIcon(setIcono("Imagenes/Dolar.png"));
			} else if (comboBox2.getSelectedIndex() == 2) {
				lblMoneda2.setIcon(setIcono("Imagenes/Euro.png"));
			} else if (comboBox2.getSelectedIndex() == 3) {
				lblMoneda2.setIcon(setIcono("Imagenes/Libra.png"));
			} else if (comboBox2.getSelectedIndex() == 4) {
				lblMoneda2.setIcon(setIcono("Imagenes/Yen.png"));
			} else if (comboBox2.getSelectedIndex() == 5) {
				lblMoneda2.setIcon(setIcono("Imagenes/Won.png"));
			}
		});

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

		comboBox.addItemListener(e -> {

			if (comboBox.getSelectedIndex() == 0) {
				lblMoneda1.setIcon(setIcono("Imagenes/Peso.png"));
			} else if (comboBox.getSelectedIndex() == 1) {
				lblMoneda1.setIcon(setIcono("Imagenes/Dolar.png"));
			} else if (comboBox.getSelectedIndex() == 2) {
				lblMoneda1.setIcon(setIcono("Imagenes/Euro.png"));
			} else if (comboBox.getSelectedIndex() == 3) {
				lblMoneda1.setIcon(setIcono("Imagenes/Libra.png"));
			} else if (comboBox.getSelectedIndex() == 4) {
				lblMoneda1.setIcon(setIcono("Imagenes/Yen.png"));
			} else if (comboBox.getSelectedIndex() == 5) {
				lblMoneda1.setIcon(setIcono("Imagenes/Won.png"));
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

	}

	// clases apartes

	public Icon setIcono(String ruta) {
		ImageIcon im = new ImageIcon(ruta);
		return new ImageIcon(im.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
	}

	public String calculo(String cmb1, String cmb2, double monto) {
		if (!cmb1.isEmpty() | !cmb1.isEmpty()) {
			HashMap<String, Double> tasas = new HashMap<>();
			tasas.put("Peso Colombiano", 4719.21);
			tasas.put("Dolar", 1.0);
			tasas.put("Euro", 0.94);
			tasas.put("Libra Esterlina", 0.83);
			tasas.put("Yen Japones", 134.98);
			tasas.put("Won Surcoreano", 1320.24);
			DecimalFormat rf = new DecimalFormat("0.00");
			double resultado = monto * (tasas.get(cmb2) / tasas.get(cmb1));
			return rf.format(resultado);
		}
		return null;
	}
}