import javax.swing.JOptionPane;

public class Remarkable {
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your title?");
		if(name.equalsIgnoreCase("Emil")) {JOptionPane.showMessageDialog(null, "Sleep!");}
			
		else if(name.equalsIgnoreCase("Yasir")) {JOptionPane.showMessageDialog(null, "I don't actually care");}
		
		else if(name.equalsIgnoreCase("Victor")) {JOptionPane.showMessageDialog(null, "Noice Glasses");}
		
		else if(name.equalsIgnoreCase("Lauren")) {JOptionPane.showMessageDialog(null, "PoTaTo");}
		
		else if(name.equalsIgnoreCase("Max")) {JOptionPane.showMessageDialog(null, "No Net Neutrality");}
		
		else if(name.equalsIgnoreCase("Callum")) {JOptionPane.showMessageDialog(null, "Your just the Best");}
		
	}
}
