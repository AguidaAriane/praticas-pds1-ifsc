package Questao3;

import javax.swing.JOptionPane;

public class MediaFinal {
  public static void main(String[] args) {
	  
	  
	  double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota:"));
      double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota:"));
      double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota:"));
      
     
      double media = (nota1 + nota2 + nota3) / 3;
      
     
      if (media >= 6) {
          JOptionPane.showMessageDialog(null, "Aprovado(a)");
      } else if (media >= 4 && media < 6) {
          JOptionPane.showMessageDialog(null, "Recuperação");
      } else {
          JOptionPane.showMessageDialog(null, "Reprovado(a)");
      }
  }


}

