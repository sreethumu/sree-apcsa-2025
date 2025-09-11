package robot;

import kareltherobot.*;

public class Roomba implements Directions {


	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/basicRoom.wld";

		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 7, 6);
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
		World.setDelay(1);


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

		//Code runs until roomba gets stuck in top left corner
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

			//U-turn
			if(!roomba.frontIsClear() && roomba.facingEast()){
				roomba.turnLeft();
				roomba.move();
				height += 1;
				roomba.turnLeft();
				startingY += 1;

			}
			if(!roomba.frontIsClear() && roomba.facingWest()){
				turnRight(roomba);
				roomba.move();
				height += 1;
				startingY += 1;
				turnRight(roomba);
			}

		}

		//Print all the requirements
		totalArea = height*width;
		System.out.println("Max number of beepers was " + max + " at the coordinates (" + maxX + "," + maxY + ")");
		System.out.println("This is " + (maxY - startY) + " up and " + (maxX - startX) + " right from the left corner of the room." );
		System.out.println("Total number of beepers is " + totalBeepers);
		System.out.println("Total number of piles is " + totalPiles);
		System.out.println("The area of the box is: " + totalArea);
		System.out.println("The percentage dirty is: " + (double)totalPiles/totalArea);
		System.out.println("The average pile size is: " + (double) totalBeepers/totalPiles);
		/*for(int i=0;i<=10000000; i++){
			
			while(!roomba.nextToABeeper() && roomba.frontIsClear()){
				roomba.move();
			}
			while(roomba.nextToABeeper()){
				roomba.pickBeeper();
				max += 1;
			}
			if(!roomba.frontIsClear() && roomba.facingEast()){
				roomba.turnLeft();
				roomba.move();
				roomba.turnLeft();
			}
			if(!roomba.frontIsClear() && roomba.facingWest()){
				turnRight(roomba);
				roomba.move();
				turnRight(roomba);
			}
		
		}*/
		
		/*while(roomba.frontIsClear()){
			roomba.move();
			while(roomba.nextToABeeper()){
				roomba.pickBeeper();
			}
			if(!roomba.frontIsClear() && roomba.facingEast()){
				roomba.turnLeft();
			}
			if(!roomba.frontIsClear() && roomba.facingWest()){
				roomba.turnLeft();
			}
			if(!roomba.frontIsClear() && roomba.facingNorth()){
				roomba.turnLeft();
			}
			if(!roomba.frontIsClear() && roomba.facingSouth()){
				roomba.turnLeft();
			}
			


		}*/
		

		
		// the line below causes a null pointer exception
		// what is that and why are we getting it?
		/*roomba.move();
		turnRight(roomba);
		roomba.move();
		while(roomba.nextToABeeper()){
			roomba.pickBeeper();
		}
		roomba.move();
		roomba.move();
		turnRight(roomba);
		roomba.move();
		while(roomba.nextToABeeper()){
			roomba.pickBeeper();
		}
		roomba.move();
		turnRight(roomba);
		roomba.move();
		while(roomba.nextToABeeper()){
			roomba.pickBeeper();
		}
		roomba.turnLeft();
		roomba.move();
		roomba.turnLeft();
		roomba.move();
		while(roomba.nextToABeeper()){
			roomba.pickBeeper();
		}
		turnRight(roomba);
		roomba.move();
		roomba.move();
		roomba.move();
		while(roomba.nextToABeeper()){
			roomba.pickBeeper();
		}
		turnRight(roomba);
		roomba.move();
		roomba.move();
		turnRight(roomba);
		roomba.move();
		roomba.move();
		while(roomba.nextToABeeper()){
			roomba.pickBeeper();
		}
		roomba.turnLeft();
		roomba.move();
		while(roomba.nextToABeeper()){
			roomba.pickBeeper();
		}
		turnRight(roomba);
		roomba.move();
		roomba.move();
		roomba.turnLeft();
		roomba.move();
		while(roomba.nextToABeeper()){
			roomba.pickBeeper();
		}
		turnRight(roomba);
		roomba.move();
		while(roomba.nextToABeeper()){
			roomba.pickBeeper();
		}
		roomba.move();*/




		

		
        // This method should return the total number of beepers cleaned up.
		return totalBeepers;
	}
	public static void turnRight(Robot roomba){
			roomba.turnLeft(); 
			roomba.turnLeft(); 
			roomba.turnLeft(); 
	}
	public static void cleanUp(){

	}
}
