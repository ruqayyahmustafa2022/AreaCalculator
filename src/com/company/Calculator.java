package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    /* (a) Accept width & height parameters
       (b) calculate area of a rectangle
       (c) returns area
     */

    private double shapeWidth;
    private double shapeHeight;
    private String shapeType;
    private double shapeArea;


   //set the width parameter
    public void setShapeWidth(double width)
    {
            shapeWidth = width;

    }

    //set the height parameter
    public void setShapeHeight(double height)
    {

        shapeHeight = height;
    }



    //set the shape Type
    public void setShapeType(String shape){
        shapeType = shape.toLowerCase(Locale.ROOT);
    }

    //***********declare the get**********************
    //get the width parameter
    public double getShapeWidth()
    {
        return shapeWidth;

    }

    //get the height parameter
    public double getShapeHeight()
    {

        return shapeHeight;
    }


    //get the shape Type
    public String getShapeType(){

        return shapeType;
    }


    public double calculateAreaTriangle(){
            shapeArea = 0.5 * shapeHeight * shapeWidth;
            return shapeArea;
    }

    public double calculateAreaRectangle(){
        shapeArea = shapeHeight * shapeWidth;
        return shapeArea;
    }

}
