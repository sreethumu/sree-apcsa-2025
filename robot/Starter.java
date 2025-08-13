package robot;
import kareltherobot.*;


public class Starter implements Directions{

  public static void main(String[] args) {

    World.setVisible(true);// allows us to see the run output
    // the bigger the street, the farther north
    World.setSize(20,20);
    World.setDelay(20);

    // The line below creates a Robot that we will refer to as rob
    // Find out what the numbers and direction do!
    // Put rob in a better location for your initials.
    Robot rob = new Robot(15,8,West,100);
    Robot horiz = new Robot(15,12,East,100);
    Robot vert = new Robot(15,8,West,100);
    // Want a second robot?  No prob.  They are cheap :)
    //Robot dude = new Robot(7,5,West,9);
    // examples of commands you can invoke on a Robot


    // starting the letter S
    //First line
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    //Second line
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    //troubleshoot
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    // done with the line, now on the curve
    // rob.turnLeft();

  }
}
