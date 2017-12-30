package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot x = new Robot("mini");

public static void main(String[] args) {
String Draw = JOptionPane.showInputDialog("What shape do you want? Square, Triangle, or Circle?");
if(Draw.equalsIgnoreCase("Square")) {
	drawSquare();
	
}
else if(Draw.equalsIgnoreCase("Triangle")) {
	drawTriangle();
}
else if(Draw.equalsIgnoreCase("Circle")) {
	drawCircle();
}

}
 static void drawSquare() {
	x.setSpeed(100);
	x.penDown();
	String n =JOptionPane.showInputDialog("What Color do you want?");
	if(n.equalsIgnoreCase("red")) {
		x.setPenColor(255, 0, 0);
	}
	else if(n.equalsIgnoreCase("blue")) {
		x.setPenColor(0, 0, 255);
	}
	else if(n.equalsIgnoreCase("green")) {
		x.setPenColor(0, 255, 0);
	}
	else if(n.equalsIgnoreCase("Random")) {
		x.setRandomPenColor();
	}
	for(int i=0;i<4;i++) {

		if(n.equalsIgnoreCase("Random")) {
			x.setRandomPenColor();
		}
	x.move(100);
	x.turn(90);
	}
}
 static void drawTriangle() {
		String n =JOptionPane.showInputDialog("What Color do you want?");
		if(n.equalsIgnoreCase("red")) {
			x.setPenColor(255, 0, 0);
		}
		else if(n.equalsIgnoreCase("blue")) {
			x.setPenColor(0, 0, 255);
		}
		else if(n.equalsIgnoreCase("green")) {
			x.setPenColor(0, 255, 0);
		}
		else if(n.equalsIgnoreCase("Random")) {
			x.setRandomPenColor();
		}
	x.setSpeed(100);
	x.move(100);
	x.turn(60);
	x.penDown();
	for(int o=0;o<3;o++) {
	
	x.turn(120);
	if(n.equalsIgnoreCase("Random")) {
		x.setRandomPenColor();
	}
	x.move(100);
	}
}
 static void drawCircle() {
		String n =JOptionPane.showInputDialog("What Color do you want?");
		if(n.equalsIgnoreCase("red")) {
			x.setPenColor(255, 0, 0);
		}
		else if(n.equalsIgnoreCase("blue")) {
			x.setPenColor(0, 0, 255);
		}
		else if(n.equalsIgnoreCase("green")) {
			x.setPenColor(0, 255, 0);
		}
		else if(n.equalsIgnoreCase("Random")) {
			x.setRandomPenColor();
		}
	x.setSpeed(100);
	x.move(100);
	x.penDown();
	for(int z=0;z<360;z++) {
		x.turn(1);
		if(n.equalsIgnoreCase("Random")) {
			x.setRandomPenColor();
		}
		x.move(1);
	
}
 }
}
