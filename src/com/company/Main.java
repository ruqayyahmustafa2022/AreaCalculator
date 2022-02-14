package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	(1) Create instance of class Calculator
	(2) Test calculateArea method
	 */


        //create new instance of Calculator
        Calculator areaCalc = new Calculator();


        Scanner userInput = new Scanner(System.in);

        //ask the user which shape they want to calculate and set it
        System.out.println("Which shape would you like to calculate? Enter Triangle or Rectangle.");
        areaCalc.setShapeType(userInput.next());

        //ask for the height and width and set the height & width
        System.out.println("Enter height: ");
        areaCalc.setShapeWidth(userInput.nextDouble());

        System.out.println("Enter width: ");
        areaCalc.setShapeHeight(userInput.nextDouble());

        //Calculate the area
        if(areaCalc.getShapeType().equals("triangle")) {
            System.out.print("Area of Triangle: " + areaCalc.calculateAreaTriangle() );

        }
        else if(areaCalc.getShapeType().equals("rectangle"))
        {
            System.out.println("Area of Rectangle: " + areaCalc.calculateAreaRectangle());

        }
        else
            System.out.println("enter a valid input");




    }
}
