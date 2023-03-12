package Convertidor_Alura;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class Realizado_Por {

	JFrame frmConvertidorAluralatan;


	public Realizado_Por() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frmConvertidorAluralatan = new JFrame();
		frmConvertidorAluralatan.setTitle("Convertidor - AluraLatan");
		frmConvertidorAluralatan.setBounds(100, 100, 315, 354);
		frmConvertidorAluralatan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConvertidorAluralatan.getContentPane().setLayout(null);
		frmConvertidorAluralatan.setResizable(false);
		frmConvertidorAluralatan.setLocationRelativeTo(null); // centra la ventana
		frmConvertidorAluralatan.setUndecorated(true); // efecto de trasparencia unido con el color de fondo
		frmConvertidorAluralatan.setBackground(new Color(198, 190, 238, 230)); // color de fondo de la ventana

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

		lblSalir.setBounds(272, 11, 33, 41);
		ImageIcon im = new ImageIcon("Imagenes/volver-color.png");
		Icon icono = new ImageIcon(
				im.getImage().getScaledInstance(lblSalir.getWidth(), lblSalir.getHeight(), Image.SCALE_DEFAULT));
		lblSalir.setIcon(icono);
		frmConvertidorAluralatan.getContentPane().add(lblSalir);

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

		JLabel lblNewLabel_2_2 = new JLabel("Realizado Por");
		lblNewLabel_2_2.setForeground(Color.MAGENTA);
		lblNewLabel_2_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 27));
		lblNewLabel_2_2.setBounds(39, 70, 169, 41);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_1_1 = new JLabel("Robinson Rezabala");
		lblNewLabel_2_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_2_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBounds(113, 122, 180, 30);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1_1);

		JLabel lblgithub = new JLabel("");
		lblgithub.setToolTipText("GitHub");
		lblgithub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
			public void mouseClicked(MouseEvent e) {
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
		lblNewLabel_2_1_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_2_1_1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1.setBounds(236, 324, 79, 30);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1_1_1);
	}
}
