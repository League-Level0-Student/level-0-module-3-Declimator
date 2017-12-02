
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot o = new Robot("batman");
		o.setSpeed(200);
		o.penDown();
		for(int d = 0; d < 100; d++) {
		//3. ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog(null,"What color do you want?");
		//4. use an if/else statement to set the pen color that the user requested

if(color.equalsIgnoreCase("red")) {
o.setPenColor(255, 0, 0);
}
else if(color.equalsIgnoreCase("green")) {
o.setPenColor(0, 255, 0);
}
else if(color.equalsIgnoreCase("blue")) {
o.setPenColor(0, 0, 255);
}
        //5. if the user doesn’t enter anything, choose a random color
else if(color.equalsIgnoreCase("")) {
o.setRandomPenColor();
}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		o.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)

for(int i = 0;i < 10; i++) {
	int x = 100 + i + 5;
o.turn(90);
o.move(x);

	}
		}
}
}
