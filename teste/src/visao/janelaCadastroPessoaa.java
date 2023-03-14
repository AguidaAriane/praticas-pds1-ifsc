package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janelaCadastroPessoaa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaCadastroPessoaa frame = new janelaCadastroPessoaa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public janelaCadastroPessoaa() {
		setBackground(new Color(255, 228, 225));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 214);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtNome = new JLabel("Nome");
		txtNome.setBounds(34, 23, 56, 28);
		contentPane.add(txtNome);
		
		JLabel txtSenha = new JLabel("Senha");
		txtSenha.setBounds(34, 69, 46, 14);
		contentPane.add(txtSenha);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(129, 27, 128, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBackground(new Color(245, 255, 250));
		textField.setBounds(129, 66, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton txtSalvar = new JButton("Salvar");
		txtSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String nome = txtNome.getText();
			String senha = txtSenha.getText();
			
			if(!nome.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhum nome preenchido");
			
			}
			if(!senha.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Nenhuma senha preenchida");
				
			}
			
			Funcionario func = new Funcionario();
			func.setNome(nome);
			func.setSenha(senha);
			
			FuncionarioDAO banquinhoDeDados = FuncionarioDAO.getInstance();
			bdPessoa.inserir(func);
			
		txtSalvar.setBounds(77, 123, 128, 23);
		contentPane.add(txtSalvar);
	}
		}
