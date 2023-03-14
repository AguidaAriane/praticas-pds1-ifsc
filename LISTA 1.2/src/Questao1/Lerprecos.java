package Questao1;

import javax.swing.JOptionPane;

public class Lerprecos {
  
	public static void main(String[] args) {
	
	  double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do litro:"));

		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de litros:"));

     double totalPagamento = calcularTotalPagamento(preco, quantidade);


		
		JOptionPane.showMessageDialog(null, "Total a pagar: R$ " + totalPagamento);

	}

   public static double calcularTotalPagamento(double preco, int quantidade) {

		return preco * quantidade;

	}
}
