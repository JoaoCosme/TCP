package tela;

import projeto.src.main.java.enums.Comando;
import tocador.AdaptadorMusical;

import javax.swing.JOptionPane;

public class Interface {
	private final AdaptadorMusical adaptadorMusical;

	public Interface(final AdaptadorMusical adaptadorMusical) {
		this.adaptadorMusical = adaptadorMusical;
	}

	public void abrirTela() {
		
		String A, c;
		int x, y;
		
		A = JOptionPane.showInputDialog("Entre um numero: ");
		
		try {
			
			x = Integer.parseInt(A);

			JOptionPane.showMessageDialog(null,x,"teste input",JOptionPane.INFORMATION_MESSAGE); 
			
		
		} catch (Exception e) {
			
			System.out.println(e);
			JOptionPane.showMessageDialog(null,"Invalid"); 
			
		}
		

	}

}
