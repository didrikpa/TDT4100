package bigjava;


import javax.swing.JOptionPane;
public class Test1 
{
		
		public static void main(String[] args)
		{
			String name = JOptionPane.showInputDialog(null, "What is your name?");
			String action = JOptionPane.showInputDialog(null, "My name is Hal! What would you like me to do?");
			System.out.print("I'm sorry, ");
			System.out.print(name);
			System.out.print(". I'm afraid I can't do that. ");
		}
}
