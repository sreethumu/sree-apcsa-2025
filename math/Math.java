package math;

class Math {

    public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    System.out.println("Hello world!");

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!






    //ANSWER:



    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer):
    //double:
    //boolean:

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES
      int age = 15;
      int grade = 10;
      int year = 2025;

      double money = 8.75;
      double shoeSize = 9.5;
      double height = 5.8;

      boolean isIndian = true;
      boolean likesBasketball = true;
      boolean likesAPWorld = false;




    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %

    //Try doing some math operations with numbers. How can we check to see if the math worked?
    System.out.println(age*2);
    System.out.println(money/24);

    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both
      for(int i=1;i<=100;i+=2){
        System.out.println(i);
      }
      System.out.println(100);


    //All multiples of 3 from 1 to 100
    for(int i=1; i<=33; i++){
      System.out.println(3*i);
    }




    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
    for(int i=1000; i>=0; i-=100){
      System.out.print(i +"-");
    }
  }
}
