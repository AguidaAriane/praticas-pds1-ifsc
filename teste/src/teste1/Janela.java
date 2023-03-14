package teste1;

import javax.swing.JOptionPane;

public class Janela {

	public static void main(String[] args) {
		 //JOptionPane.showMessageDialog(null, "Olá,mundo");
		
		String digitado = JOptionPane.showInputDialog("Digite algo:");
		
		if(!digitado.isEmpty()) {
		
		JOptionPane.showMessageDialog(null, digitado);
	}
	
		JOptionPane.showConfirmDialog(null,"Quer café");
	}
}
	


