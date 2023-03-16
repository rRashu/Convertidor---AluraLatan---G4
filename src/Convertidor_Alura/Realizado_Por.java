package Convertidor_Alura;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;

public class Realizado_Por extends Operaciones_General implements Utilitario_General {

    JFrame frmConvertidorAluralatan;


    public Realizado_Por () {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    void initialize () {
        frmConvertidorAluralatan = new JFrame();
        frmConvertidorAluralatan.addWindowFocusListener(new WindowFocusListener() {
            public void windowGainedFocus (WindowEvent e) {
            }

            public void windowLostFocus (WindowEvent e) {
               frmConvertidorAluralatan.setVisible(false);
            }
        });
        frmConvertidorAluralatan.setTitle("Convertidor - AluraLatan");
        frmConvertidorAluralatan.setBounds(100, 100, 315, 354);
        frmConvertidorAluralatan.setAlwaysOnTop(true);
        Operaciones_formulario(frmConvertidorAluralatan);

        JLabel lblSalir = new JLabel("");
        lblSalir.setToolTipText("Volver");
        lblSalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited (MouseEvent e) {
               volverc(lblSalir);
            }
            @Override
            public void mouseEntered (MouseEvent e) {
                volver(lblSalir);
            }
            @Override
            public void mouseClicked (MouseEvent e) {
                frmConvertidorAluralatan.setVisible(false);
            }
        });
        lblSalir.setBounds(272, 11, 33, 41);
        lblSalir.setIcon(volverc(lblSalir));
        frmConvertidorAluralatan.getContentPane().add(lblSalir);

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

        JLabel lblNewLabel_2_2 = new JLabel("Realizado Por");
        lblNewLabel_2_2.setForeground(Color.RED);
        lblNewLabel_2_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 27));
        lblNewLabel_2_2.setBounds(39, 70, 169, 41);
        frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_2);

        JLabel lblNewLabel_2_1_1 = new JLabel("Robinson Rezabala");
        lblNewLabel_2_1_1.setForeground(Etiquetas_titulos);
        lblNewLabel_2_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
        lblNewLabel_2_1_1.setBounds(113, 122, 180, 30);
        frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1_1);

        JLabel lblgithub = new JLabel("");
        lblgithub.setToolTipText("GitHub");
        lblgithub.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                StringSelection stringSelection = new StringSelection("https://github.com/rRashu");
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
                JOptionPane.showMessageDialog(null, "GitHub - Copiado al portapapeles", "Copiado Correctamente",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        lblgithub.setBounds(39, 256, 50, 50);
        ImageIcon imgit = new ImageIcon("Imagenes/github.png");
        Icon iconogit = new ImageIcon(
                imgit.getImage().getScaledInstance(lblgithub.getWidth(), lblgithub.getHeight(), Image.SCALE_DEFAULT));
        lblgithub.setIcon(iconogit);
        frmConvertidorAluralatan.getContentPane().add(lblgithub);

        JLabel lblgmail = new JLabel("");
        lblgmail.setToolTipText("Gmail");
        lblgmail.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                StringSelection stringSelection = new StringSelection("robinsonstalinr@gmail.com");
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
                JOptionPane.showMessageDialog(null, "Gmail - Copiado al portapapeles", "Copiado Correctamente",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        lblgmail.setBounds(185, 256, 50, 50);
        ImageIcon imgmail = new ImageIcon("Imagenes/gmail.png");
        Icon iconogmail = new ImageIcon(
                imgmail.getImage().getScaledInstance(lblgmail.getWidth(), lblgmail.getHeight(), Image.SCALE_DEFAULT));
        lblgmail.setIcon(iconogmail);
        frmConvertidorAluralatan.getContentPane().add(lblgmail);

        JLabel lblNewLabel_2_1_1_1 = new JLabel("One G4");
        lblNewLabel_2_1_1_1.setForeground(Etiquetas_titulos);
        lblNewLabel_2_1_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
        lblNewLabel_2_1_1_1.setBounds(236, 324, 79, 30);
        frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1_1_1);
    }
}
