package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	int LevelOfHappiness = JOptionPane.showConfirmDialog(null, "Are you happy?");
	if(LevelOfHappiness == 0) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");

	}
	else {
		int Depression = JOptionPane.showConfirmDialog(null, "Do you want to be happy?");
		if(Depression == 1) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");

		}
		else {
			JOptionPane.showMessageDialog(null, "You need to change something");

		}
	}
}
}
