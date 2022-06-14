package command;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class VentanaMenu {

	private JFrame frmCalculadoraCommand;
	private JTextField txtN1;
	private JTextField txtN2;
	private static JLabel lblResultado2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenu window = new VentanaMenu();
					window.frmCalculadoraCommand.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Creamos el invocador
		Invocador objMenu = new Invocador();
		
		//Creamos el receptor
		Receptor objReceptor = new Receptor();
		
		//Creamos los distintos comandos concretos
		Command objOpcionSumar = new ItemSumar( objReceptor );
        Command objOpcionRestar = new ItemRestar( objReceptor );
        Command objOpcionMultiplicar = new ItemMultiplicar( objReceptor );
        Command objOpcionDividir = new ItemDividir( objReceptor );
        
        //Los añadimos al array de opciones del invocador
        objMenu.add( objOpcionSumar );
        objMenu.add( objOpcionRestar );
        objMenu.add( objOpcionMultiplicar );
        objMenu.add( objOpcionDividir );
		
		frmCalculadoraCommand = new JFrame();
		frmCalculadoraCommand.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaMenu.class.getResource("/com/sun/java/swing/plaf/windows/icons/HardDrive.gif")));
		frmCalculadoraCommand.setTitle("Calculadora Command");
		frmCalculadoraCommand.setBounds(100, 100, 450, 300);
		frmCalculadoraCommand.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraCommand.getContentPane().setLayout(null);
		
		txtN1 = new JTextField();
		txtN1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtN1.setBounds(107, 11, 86, 44);
		frmCalculadoraCommand.getContentPane().add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtN2.setBounds(220, 11, 86, 44);
		frmCalculadoraCommand.getContentPane().add(txtN2);
		txtN2.setColumns(10);
		
		JButton btnSumar = new JButton("+");
		btnSumar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnSumar.setBounds(123, 79, 77, 57);
		frmCalculadoraCommand.getContentPane().add(btnSumar);
		
		JLabel lblResultado1 = new JLabel("Resultado : ");
		lblResultado1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblResultado1.setBounds(99, 218, 139, 32);
		frmCalculadoraCommand.getContentPane().add(lblResultado1);
		lblResultado1.setVisible(false);
		
		lblResultado2 = new JLabel("");
		lblResultado2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblResultado2.setBounds(248, 218, 101, 32);
		frmCalculadoraCommand.getContentPane().add(lblResultado2);
		
		JButton btnRestar = new JButton("-");
		btnRestar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnRestar.setBounds(210, 79, 77, 57);
		frmCalculadoraCommand.getContentPane().add(btnRestar);
		
		JButton btnMultiplicar = new JButton("x");
		btnMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnMultiplicar.setBounds(123, 143, 77, 57);
		frmCalculadoraCommand.getContentPane().add(btnMultiplicar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnDividir.setBounds(210, 143, 77, 57);
		frmCalculadoraCommand.getContentPane().add(btnDividir);
		
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtN1.getText().equals("") && !txtN2.getText().equals("")){
					objMenu.get(0).ejecutar(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
					lblResultado1.setVisible(true);
				}
			}
		});
		
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtN1.getText().equals("") && !txtN2.getText().equals("")){
					objMenu.get(1).ejecutar(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
					lblResultado1.setVisible(true);
				}
			}
		});
		
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtN1.getText().equals("") && !txtN2.getText().equals("")){
					objMenu.get(2).ejecutar(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
					lblResultado1.setVisible(true);
				}
			}
		});
		
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtN1.getText().equals("") && !txtN2.getText().equals("")){
					objMenu.get(3).ejecutar(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
					lblResultado1.setVisible(true);
				}
			}
		});
	}
	
	public static void setResultado(int resultado){
		lblResultado2.setText(String.valueOf(resultado));
	}
}
