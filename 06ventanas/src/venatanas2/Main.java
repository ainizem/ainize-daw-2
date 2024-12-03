package venatanas2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		JFrame ventana = new JFrame("Ventana prueba");
		ventana.setSize(400, 300);
		ventana.setBounds(50, 50, 400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // variables de clase accedemos a ella a trav�s del
		ventana.setLayout(null); // nombre de la clase

		JLabel etiqueta = new JLabel("Dime tu nombre");
		etiqueta.setBounds(50, 50, 150, 30);
		ventana.add(etiqueta);

		JTextField txtNombre = new JTextField();
		txtNombre.setBounds(50, 80, 200, 30);
		ventana.add(txtNombre);

		JButton btnSaludar = new JButton("Saludo");
		btnSaludar.setBounds(50, 110, 100, 30);
		ventana.add(btnSaludar);

		JLabel lblSaludo = new JLabel();
		lblSaludo.setBounds(50, 150, 200, 30);
		ventana.add(lblSaludo);

		btnSaludar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lblSaludo.setText("Hola, " + txtNombre.getText());
			}
		});
		ventana.setVisible(true);
	}

}