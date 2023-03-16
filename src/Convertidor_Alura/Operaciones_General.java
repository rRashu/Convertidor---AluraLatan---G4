package Convertidor_Alura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Operaciones_General implements Utilitario_General {
    int xOffset, yOffset;

    public void Operaciones_formulario (JFrame frmConvertidorAluralatan) {
        frmConvertidorAluralatan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmConvertidorAluralatan.getContentPane().setLayout(null);
        frmConvertidorAluralatan.setResizable(false);
        frmConvertidorAluralatan.setLocationRelativeTo(null);  //centra la ventana
        frmConvertidorAluralatan.setUndecorated(true);         //efecto de trasparencia unido con el color de fondo
        frmConvertidorAluralatan.setBackground(FondoVentana); // color de fondo de la ventana
        ImageIcon iconoAlura = new ImageIcon("Imagenes/Alura.png");
        frmConvertidorAluralatan.setIconImage(iconoAlura.getImage());
    }

    public void Asignar_icono_combo_moneda (JComboBox<String> comboBox, JLabel lbl) {
        if (comboBox.getSelectedIndex() == 0) {
            lbl.setIcon(setIcono("Imagenes/Peso.png"));
        } else if (comboBox.getSelectedIndex() == 1) {
            lbl.setIcon(setIcono("Imagenes/Dolar.png"));
        } else if (comboBox.getSelectedIndex() == 2) {
            lbl.setIcon(setIcono("Imagenes/Euro.png"));
        } else if (comboBox.getSelectedIndex() == 3) {
            lbl.setIcon(setIcono("Imagenes/Libra.png"));
        } else if (comboBox.getSelectedIndex() == 4) {
            lbl.setIcon(setIcono("Imagenes/Yen.png"));
        } else if (comboBox.getSelectedIndex() == 5) {
            lbl.setIcon(setIcono("Imagenes/Won.png"));
        }
    }
    public void Asignar_icono_combo_masa(JComboBox<String> comboBox, JLabel lbl) {
if (comboBox.getSelectedIndex() == 0) {
        lbl.setIcon(setIcono("Imagenes/Microgramo.png"));
    } else if (comboBox.getSelectedIndex() == 1) {
        lbl.setIcon(setIcono("Imagenes/Gramo.png"));
    } else if (comboBox.getSelectedIndex() == 2) {
        lbl.setIcon(setIcono("Imagenes/Onza.png"));
    } else if (comboBox.getSelectedIndex() == 3) {
        lbl.setIcon(setIcono("Imagenes/Libra-masa.png"));
    } else if (comboBox.getSelectedIndex() == 4) {
        lbl.setIcon(setIcono("Imagenes/Kilogramo.png"));
    } else if (comboBox.getSelectedIndex() == 5) {
        lbl.setIcon(setIcono("Imagenes/Tonelada.png"));
    }
}
    public Icon setIcono(String ruta) {
        ImageIcon im = new ImageIcon(ruta);
        return new ImageIcon(im.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
    }

    public void volver(JLabel lbl){
        ImageIcon im = new ImageIcon("Imagenes/volver.png");
        Icon icono = new ImageIcon(im.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),
                Image.SCALE_DEFAULT));
        lbl.setIcon(icono);
    }
    public Icon volverc(JLabel lbl){
        ImageIcon im = new ImageIcon("Imagenes/volver-color.png");
        Icon icono = new ImageIcon(im.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),
                Image.SCALE_DEFAULT));
        lbl.setIcon(icono);
        return icono;
    }

    public void mover(JFrame frmConvertidorAluralatan, MouseEvent e){
        int x = frmConvertidorAluralatan.getLocation().x;
        int y = frmConvertidorAluralatan.getLocation().y;
        frmConvertidorAluralatan.setLocation(x + e.getX() - xOffset, y + e.getY() - yOffset);
        frmConvertidorAluralatan.setLocation(x + e.getX() - xOffset, y + e.getY() - yOffset);
    }
}
