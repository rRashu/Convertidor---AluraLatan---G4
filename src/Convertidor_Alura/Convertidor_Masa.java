package Convertidor_Alura;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Objects;
//aun pendiente
public class Convertidor_Masa extends Operaciones_General implements Utilitario_General {

    JFrame frmConvertidorAluralatan;
    Realizado_Por realizado = new Realizado_Por();
    String[] unidad = {"Microgramo", "Gramo", "Onza", "Libra", "Kilogramo", "Tonelada"};

    public Convertidor_Masa () {

        initialize();
    }

    void initialize () {
        frmConvertidorAluralatan = new JFrame();
        frmConvertidorAluralatan.setTitle("Convertidor de Masa - AluraLatan");
        frmConvertidorAluralatan.setBounds(100, 100, 622, 300);
        Operaciones_formulario(frmConvertidorAluralatan);

        JLabel lblSalir = new JLabel("");
        lblSalir.setToolTipText("Volver");
        lblSalir.setBounds(579, 0, 33, 41);
        frmConvertidorAluralatan.getContentPane().add(lblSalir);

        JLabel lblmover = new JLabel("");
        lblmover.setForeground(new Color(0, 0, 255));
        lblmover.setBounds(0, 0, 562, 56);
        lblSalir.setIcon(volverc(lblSalir));
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

        JLabel lblNewLabel_2_1_1 = new JLabel("Convertidor De Masa");
        lblNewLabel_2_1_1.setForeground(Etiquetas_titulos);
        lblNewLabel_2_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 30));
        lblNewLabel_2_1_1.setBounds(153, 67, 372, 56);
        frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1_1);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBackground(Combo_Box);
        comboBox.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
        comboBox.setModel(new DefaultComboBoxModel<>(unidad));
        comboBox.setBounds(119, 151, 155, 20);
        comboBox.setSelectedItem(comboBox.getItemAt(3));
        frmConvertidorAluralatan.getContentPane().add(comboBox);

        JLabel lblMoneda2 = new JLabel("");
        lblMoneda2.setBounds(324, 128, 60, 60);
        lblMoneda2.setIcon(setIcono("Imagenes/Gramo.png"));
        frmConvertidorAluralatan.getContentPane().add(lblMoneda2);

        JComboBox<String> comboBox2 = new JComboBox<>();
        comboBox2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
        comboBox2.setBackground(Combo_Box);
        comboBox2.setModel(new DefaultComboBoxModel<>(unidad));
        comboBox2.setBounds(392, 151, 155, 20);
        comboBox2.setSelectedItem(comboBox.getItemAt(1));
        frmConvertidorAluralatan.getContentPane().add(comboBox2);

        JTextField textmoneda1 = new JTextField();
        textmoneda1.setForeground(Texto_text);
        textmoneda1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        textmoneda1.setBounds(129, 182, 145, 34);
        textmoneda1.setColumns(10);
        textmoneda1.setBorder(new LineBorder(Borde_text, Borde_Grosor));
        textmoneda1.setOpaque(false);
        textmoneda1.setText("0");
        textmoneda1.setCaretColor(Puntero_text);
        frmConvertidorAluralatan.getContentPane().add(textmoneda1);

        JTextField textmoneda2 = new JTextField();
        textmoneda2.setColumns(10);
        textmoneda2.setForeground(Texto_text);
        textmoneda2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        textmoneda2.setBounds(391, 182, 145, 34);
        textmoneda2.setBorder(new LineBorder(Borde_text, Borde_Grosor));
        textmoneda2.setOpaque(false);
        textmoneda2.setText("0");
        textmoneda1.setCaretColor(Puntero_text);
        frmConvertidorAluralatan.getContentPane().add(textmoneda2);

        JLabel lblNewLabel_2_1_1_1 = new JLabel("One G4");
        lblNewLabel_2_1_1_1.setForeground(Etiquetas_titulos);
        lblNewLabel_2_1_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
        lblNewLabel_2_1_1_1.setBounds(543, 259, 79, 30);
        frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1_1_1);

        JLabel lblMoneda1 = new JLabel("");
        lblMoneda1.setBounds(48, 128, 60, 60);
        lblMoneda1.setIcon(setIcono("Imagenes/Libra-masa.png"));
        frmConvertidorAluralatan.getContentPane().add(lblMoneda1);

        // eventos

        textmoneda1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained (FocusEvent e) {
                if ((textmoneda1.getText().equals("0")) || (textmoneda1.getText().isEmpty())) {
                    textmoneda1.setText("");
                }
            }

            @Override
            public void focusLost (FocusEvent e) {
                if (textmoneda1.getText().isEmpty()) {
                    textmoneda1.setText("0");
                }
                }
        });

        textmoneda1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped (KeyEvent e) {
                char validar = e.getKeyChar();
                if ((textmoneda1.getText().length() == 10) | Character.isLetter(validar)
                        | (validar == '.' && textmoneda1.getText().contains(".")) | (validar == ',')
                        | (validar == '.' && textmoneda1.getText().length() == 0)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased (KeyEvent e) {
                if (!textmoneda1.getText().isEmpty())
                    textmoneda2.setText(calculo((Objects.requireNonNull(comboBox.getSelectedItem())).toString(),
                            (Objects.requireNonNull(comboBox2.getSelectedItem())).toString(),
                            Double.parseDouble(textmoneda1.getText())));
            }
        });

        textmoneda2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained (FocusEvent e) {
                if ((textmoneda2.getText().equals("0")) || (textmoneda2.getText().isEmpty())) {
                    textmoneda2.setText("");
                }
            }

            @Override
            public void focusLost (FocusEvent e) {
                if (textmoneda2.getText().isEmpty()) {
                    textmoneda2.setText("0");
                }
              }
        });

        textmoneda2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped (KeyEvent e) {
                char validar = e.getKeyChar();
                if ((textmoneda2.getText().length() == 10) | Character.isLetter(validar)
                        | (validar == '.' && textmoneda2.getText().contains(".")) | (validar == ',')
                        | (validar == '.' && textmoneda2.getText().length() == 0)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased (KeyEvent e) {
                if (!textmoneda2.getText().isEmpty())
                    textmoneda1.setText(calculo(Objects.requireNonNull(comboBox2.getSelectedItem()).toString(),
                            Objects.requireNonNull(comboBox.getSelectedItem()).toString(),
                            Double.parseDouble(textmoneda2.getText())));
            }
        });

        lblCreditos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited (MouseEvent e) {
                ImageIcon im = new ImageIcon("Imagenes/Datos-color.png");
                Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblCreditos.getWidth(),
                        lblCreditos.getHeight(), Image.SCALE_DEFAULT));
                lblCreditos.setIcon(icono);
            }

            @Override
            public void mouseClicked (MouseEvent e) {
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
            public void mouseMoved (MouseEvent e) {
                ImageIcon im = new ImageIcon("Imagenes/Datos.png");
                Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblCreditos.getWidth(),
                        lblCreditos.getHeight(), Image.SCALE_DEFAULT));
                lblCreditos.setIcon(icono);
            }
        });

        lblSalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited (MouseEvent e) {
                volverc(lblSalir);
            }

            @Override
            public void mouseClicked (MouseEvent e) {
                Principal principal = new Principal();
                principal.frmConvertidorAluralatan.setVisible(true);
                frmConvertidorAluralatan.setVisible(false);
            }
        });

        comboBox2.addItemListener(e -> Asignar_icono_combo_masa(comboBox2, lblMoneda2));

        lblmover.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged (MouseEvent e) {
                mover(frmConvertidorAluralatan,e);
            }
        });

        lblmover.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered (MouseEvent e) {
                lblmover.setCursor(new Cursor(Cursor.MOVE_CURSOR));
            }

            @Override
            public void mousePressed (MouseEvent e) {
                xOffset = e.getX();
                yOffset = e.getY();
            }
        });

        comboBox.addItemListener(e -> Asignar_icono_combo_masa(comboBox, lblMoneda1));

        lblSalir.addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseMoved (MouseEvent e) {
                volver(lblSalir);
            }
        });
    }

    public String calculo (String cmb1, String cmb2, double monto) {
        if (!cmb1.isEmpty() | !cmb1.isEmpty()) {
            HashMap<String, Double> tasas = new HashMap<>();
            tasas.put("Microgramo", 1000000.0);
            tasas.put("Gramo", 1.0);
            tasas.put("Onza", 0.03527396);
            tasas.put("Libra", 0.00220462);
            tasas.put("Kilogramo", 0.001);
            tasas.put("Tonelada", 0.000001);
            DecimalFormat rf = new DecimalFormat("0.00000");
            double resultado = monto * (tasas.get(cmb2) / tasas.get(cmb1));
            return rf.format(resultado);
        }
        return null;
    }
}