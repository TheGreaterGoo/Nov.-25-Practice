package Robot;

import java.util.Scanner;

public class RobotContainer {
    Joystick joystick = new Joystick();
    Scanner scan = new Scanner(System.in);

    public RobotContainer() {

    }
    
    public void nextAction() {
        System.out.println("Please enter an input. Inputs are joystick, quit.");

        boolean running = true;
        while (running) {
            System.out.println("What action should the robot do?");
            String action = scan.nextLine();
            if (action.equals("joystick")) {
                System.out.println("Enter an angle from -1.0 to 1.0.");
                double angle = scan.nextDouble();
                scan.nextLine();
                joystick.angle = angle;
            } else if (action.equals("quit")) {
                running = false;
            } else {
                System.out.println("Sorry, I didn't understand that.");
                System.out.println("Please enter an input. Inputs are joystick, quit.");
            }

            System.out.println("\n----------");
            if (joystick.angle == 0.0) {
                System.out.println("The robot is not moving.");
            } else if (joystick.angle > 0) {
                System.out.println("The robot is moving forward with a power of " + joystick.angle);
            } else {
                System.out.println("The robot is moving backwards with a power of " + (-1.0 * joystick.angle));
            }
        }
        
        System.out.println("\n----------");
        System.out.println("Robot is off.");
    }
}
