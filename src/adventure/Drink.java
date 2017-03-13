package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Drink 
{

	public static void drinkPath(String userName) 
	{
		JOptionPane.showMessageDialog(null, "Turns out that it is just dirty water, safe enough to drink but is quite gross but worth the price.");
		JOptionPane.showMessageDialog(null, "You continue on through the cave. You come to a wall of rubble and a narrow path in the other direction.");
		JOptionPane.showMessageDialog(null, "You look closer at the wall of rubble looks to be the other side of the rubble you saw at the beginning, and you see another pirate under some of it.");
		
		Object[] options = {"Check Pirate",
        "Continue down path"};
		Component frame = null;
		int checkorCont = JOptionPane.showOptionDialog(frame,
				"Check the Pirate or Continue down Narrow Path?",
				"Check or Cont. Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				null,  
				options,  
				options[0]);
		if(checkorCont == JOptionPane.YES_OPTION) // Check pirate
		{
			Check.checkPirate(userName);
		}
		if(checkorCont == JOptionPane.NO_OPTION) // Cont. down Narrow path
		{
			Narrow.narrowPath(userName);
		}
	}

}
