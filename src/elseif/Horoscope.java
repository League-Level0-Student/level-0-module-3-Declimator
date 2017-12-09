package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String i = JOptionPane.showInputDialog("What's your star sign?");
	if(i.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null,"The Ram. A Fire sign, ruled by Mars...");
	}
	else if(i.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null,"The Bull. An Earth sign, ruled by Venus...");
	}
	else if(i.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null,"The Twins. An Air sign, ruled by Mercury...");
	}
	else if(i.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null,"The Crab. A Water sign, ruled by the Moon...");
	}
	else if(i.equalsIgnoreCase("Lion")) {
		JOptionPane.showMessageDialog(null,"The Lion. A Fire sign, ruled by the Sun...");
	}
	else if(i.equalsIgnoreCase("Maiden")) {
		JOptionPane.showMessageDialog(null,"The Maiden. An Earth sign, ruled by Mercury...");
	}
	else if(i.equalsIgnoreCase("Scales")) {
		JOptionPane.showMessageDialog(null,"The Scales. An Air sign, ruled by Venus...");
	}
	else if(i.equalsIgnoreCase("Scorpian")) {
		JOptionPane.showMessageDialog(null,"The Scorpion. A Water sign, ruled by Pluto...");
	}
	else if(i.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null,"The Centaur. A Fire sign, ruled by Jupiter...");
	}
	else if(i.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null,"The Mountain Goat. An Earth sign, ruled by Saturn...");
	}
	else if(i.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null,"The Man who Carries Water. An Air sign, ruled by Uranus...");
	}
	else if(i.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null,"The Fish. A Water sign, ruled by Neptune...");
	}
	else {
		JOptionPane.showMessageDialog(null, "That's not a star sign!");
	}

}
}
