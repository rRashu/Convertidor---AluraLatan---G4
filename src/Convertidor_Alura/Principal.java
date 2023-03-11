package Convertidor_Alura;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Principal {

	private JFrame frmConvertidorAluralatan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmConvertidorAluralatan.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConvertidorAluralatan = new JFrame();
		frmConvertidorAluralatan.setTitle("Convertidor - AluraLatan");
		frmConvertidorAluralatan.setBounds(100, 100, 315, 181);
		frmConvertidorAluralatan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConvertidorAluralatan.getContentPane().setLayout(null);
		
		JRadioButton monedabtn = new JRadioButton("");
		monedabtn.setBounds(61, 25, 109, 23);
		frmConvertidorAluralatan.getContentPane().add(monedabtn);
		
		JRadioButton longitudbtn = new JRadioButton("");
		longitudbtn.setBounds(214, 25, 109, 23);
		frmConvertidorAluralatan.getContentPane().add(longitudbtn);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(105, 94, 89, 23);
		frmConvertidorAluralatan.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Monedas");
		lblNewLabel.setBounds(46, 55, 46, 14);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Longitud");
		lblNewLabel_1.setBounds(205, 55, 46, 14);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_1);
	}
}
