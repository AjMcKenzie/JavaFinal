package adventure;

import javax.swing.JOptionPane;

/**
 * @author Andrew
 *
 */
public class Chest3 
{

	public static void chest3(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You walk over to the third chest and lift the lid up.");
		JOptionPane.showMessageDialog(null, "Inside on the bottom of the chest you see a note. You lift the note out and it says...");
		JOptionPane.showMessageDialog(null, "'Look behind you!'");
		JOptionPane.showMessageDialog(null, "Standing up from your crouch and glancing behind you. Suddenly a BIG stick is stucking in your chest and you die.");
		
		PlayAgain.playAgain(userName);

	}

}
