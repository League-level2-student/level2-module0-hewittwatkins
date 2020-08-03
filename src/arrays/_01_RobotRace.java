package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method

	public static void main(String[] args) {
		
	
	//2. create an array of 5 robots.

	Robot[] robots = new Robot[5];
	
		
	//3. use a for loop to initialize the robots.
	

	for (int i = 0; i < 5; i++) {
		robots[i] = new Robot();
		robots[i].setX(50+(100*i));
		robots[i].setY(450);
		
	}

		//4. make each robot start at the bottom of the screen, side by side, facing up
	
	// in one above
	

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	
	for (int robot = 0; robot < 5; robot++) {
		Random num = new Random();
		int integer = num.nextInt(51);
		robots[robot].setY(integer + 50);
	}
	

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	
	int lowNum = 100;
	int highestRobot = 0;
	while (lowNum > 0) {
		
		for (int robot = 0; robot < 5; robot++) {
			
			Random num = new Random();
			int integer = num.nextInt(51);
			robots[robot].setY(integer);
			
			if ((integer) < lowNum) {
				lowNum = integer;
				highestRobot = robot;
			}
		}
		
	}

	//7. declare that robot the winner and throw it a party!
	
	robots[highestRobot].sparkle();

	//8. try different races with different amounts of robots.
	
	// did

	//9. make the robots race around a circular track.
	
	for (int i = 0; i < 5; i++) {
		robots[i].setX(300);
		robots[i].setY(300);
	}
	
	for (int i = 0; i < 5; i++) {
		robots[i].move(50);
		robots[i].turn(90);
		robots[i].move(50);
		robots[i].turn(90);
		robots[i].move(50);
		robots[i].turn(90);
		robots[i].move(50);
		robots[i].turn(90);
		robots[i].move(50);
	}
	
	
}

	
}