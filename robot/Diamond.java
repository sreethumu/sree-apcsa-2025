package robot;
import kareltherobot.*;


public class Diamond implements Directions{

    public static void main(String[] args) {

        World.setVisible(true);// allows us to see the run output
        // the bigger the street, the farther north
        World.setSize(20,20);
        World.setDelay(1);


        // The line below creates a Robot that we will refer to as rob
        // Find out what the numbers and direction do!
        // Put rob in a better location for your initials.
        //Robot rob = new Robot(18,8,South,10000);
        Robot diam = new Robot(19,10,West,10000);
        Robot diam1 = new Robot(19,10,East,10000);
        // Want a second robot?  No prob.  They are cheap :)
        //Robot dude = new Robot(7,5,West,9);
        // examples of commands you can invoke on a Robot
        // move one step in the direction it is facing


        

        //Diamond
        diam.putBeeper();
        diam.move();
        diam.putBeeper();
        diam.move();
        diam.putBeeper();
        diam.move();
        diam.putBeeper();
        diam.move();
        diam.putBeeper();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.turnLeft();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.turnLeft();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        //copy and paste this
        diam.turnLeft();
        diam.turnLeft();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        //
        diam.turnLeft();
        diam.turnLeft();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.turnLeft();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.turnLeft();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.turnLeft();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.turnLeft();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        diam.turnLeft();
        diam.move();
        diam.putBeeper();
        //kill robot
        diam.move();
        diam.move();
        diam.move();
        diam.move();
        diam.move();
        diam.move();
        diam.move();
        diam.move();
        diam.move();
        diam.move();
        diam.move();
        diam.move();
        diam.move();
        //left side diamond
        diam1.putBeeper();
        diam1.move();
        diam1.putBeeper();
        diam1.move();
        diam1.putBeeper();
        diam1.move();
        diam1.putBeeper();
        diam1.move();
        diam1.putBeeper();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        ////copy and paste
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        //
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.turnLeft();
        diam1.move();
        diam1.putBeeper();
        diam1.move();
        diam1.move();
        diam1.move();
        diam1.move();
        diam1.move();
        diam1.move();
        diam1.move();
        diam1.move();
        diam1.move();
        diam1.move();
        diam1.move();
        diam1.move();
        diam1.move();

        //Square
        /*
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.turnLeft();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.turnLeft();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.turnLeft();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
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
        rob.turnLeft();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
        rob.turnLeft();
        rob.move();
        rob.putBeeper();
        rob.move();
        rob.putBeeper();
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
        rob.move();
        rob.putBeeper();
        rob.turnLeft();
        rob.move();
        rob.putBeeper();
        rob.turnLeft();
        rob.move();
        rob.putBeeper();
        */
    }
}
