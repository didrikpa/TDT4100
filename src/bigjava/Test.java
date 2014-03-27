package bigjava;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) throws Exception
	{
		URL imageLocation = new URL(
				"http://24.media.tumblr.com/b49bc5e0e760e7773ed5c95357bd676d/tumblr_mpqrbxwhAJ1qc6m0yo1_500.jpg");
		JOptionPane.showMessageDialog(null,  "Welcom to the internet", "Title",
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
		
	}
}
