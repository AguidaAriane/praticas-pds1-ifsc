package Questao2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Listanomes {
  
	public static void main(String[] args) {
		
      ArrayList<String> listaNomes = new ArrayList<String>();

		       
		        for (int i = 0; i < 10; i++) {
		            String nome = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + ":");
		            listaNomes.add(nome);
		        }

		        JOptionPane.showMessageDialog(null, "Nomes que foram digitados:\n" + listaNomes);
		    }
		}
