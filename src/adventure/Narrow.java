package adventure;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Narrow 
{

 static void narrowPath(String userName) 
	{
		JOptionPane.showMessageDialog(null, "He might be an enemy so you continue down the narrow path with out checking him.");
		
		Cont.contPath(userName);

	}

}
