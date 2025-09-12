package robot;

import kareltherobot.*;

public class Roomba implements Directions {


	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/TestWorld-1.wld";

		Roomba cleaner = new Roomba();
		//7, 6
		//25, 11
		//5, 6
		//26, 101
		int totalBeepers = cleaner.cleanRoom(worldName, 25, 11);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");

	}

	// declared here so it is visible in all the methods!
	private Robot roomba;
	// You will need to add many variables!!


	public int cleanRoom(String worldName, int startY, int startX) {

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location.

		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(0);


		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */
		//Robot roomba = new Robot(8,8,West,100);
		int startingY = startY;
		int startingX = startX;
		int maxX = 0;
		int maxY = 0;
		Robot roomba = new Robot(startY, startX, East, 100);
		int max = 0;
		int totalPiles = 0;
		int totalBeepers = 0;
		int totalArea = 0;
		boolean firstRound = true;
		int width = 1;
		int height = 0;
		boolean roombaWorking = true;
		//Code runs until roomba gets stuck in top left corner
		while(roombaWorking){
			while(roomba.frontIsClear()){
			roomba.move();

			//To calculate area, find width
			if(firstRound){
				width ++;
				if(!roomba.frontIsClear()){
					firstRound = false;
				}
			}

			//X coordinate of roomba
			if(roomba.facingEast()){
				startingX += 1;
			}
			if(roomba.facingWest()){
				startingX -= 1;
			}
			int max2 = 0;

			//Pick up beepers
			while(roomba.nextToABeeper()){
				roomba.pickBeeper();
				totalBeepers += 1;
				max2 += 1;
				//Count number of piles
				if(max2 == 1){
					totalPiles += 1;
				}
				//Find max beepers
				if(max2 >= max){
					max = max2;
					maxX = startingX;
					maxY = startingY;
				}
			}

			//U-turn and find height
			if(!roomba.frontIsClear() && roomba.facingEast()){
				roomba.turnLeft();
				if(!roomba.frontIsClear()){
					roombaWorking = false;
					height += 1;
				} else{
					roomba.move();
					startingY += 1;
					height += 1;
					roomba.turnLeft();
				}
				
				

			}
			if(!roomba.frontIsClear() && roomba.facingWest()){
				turnRight(roomba);
				if(!roomba.frontIsClear()){
					roombaWorking = false;
					height += 1;
				} else {
					roomba.move();
					startingY += 1;
					height += 1;
					turnRight(roomba);
				}
				
			}

		}
		}
		

		//Print all the requirements
		totalArea = height*width;
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("Max number of beepers was " + max + " at the coordinates (" + maxX + "," + maxY + ")");
		System.out.println("This is " + (maxY - startY) + " up and " + (maxX - startX) + " right from the left corner of the room." );
		System.out.println("Total number of beepers is " + totalBeepers);
		System.out.println("Total number of piles is " + totalPiles);
		System.out.println("The area of the box is: " + totalArea);
		System.out.println("The percentage dirty is: " + (double)totalPiles/totalArea);
		System.out.println("The average pile size is: " + (double) totalBeepers/totalPiles);
        // This method should return the total number of beepers cleaned up.
		return totalBeepers;
	}

	//Turn right method
	public static void turnRight(Robot roomba){
			roomba.turnLeft(); 
			roomba.turnLeft(); 
			roomba.turnLeft(); 
	}
	public static void cleanUp(){

	}
}
