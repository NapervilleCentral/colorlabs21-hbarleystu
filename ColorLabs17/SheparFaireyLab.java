
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture("images/cool.png");
         //pictObj.explore();
         
         
         //relative path
         Picture apic = new Picture("images\\beach.jpg");
         //change with selfie picture
         Picture me = new Picture("images/cool.png");
         Picture me1 = new Picture("images/cool.png");
         Picture me2 = new Picture("images/cool.png");
         
         Pixel[] pixels;
         pixels = me.getPixels();
         Pixel[] pixels1;
         pixels1 = me1.getPixels();
         
         int red, green, blue;
         int avg;
        for (Pixel spot1 : pixels){
            green = spot1.getGreen();
            blue = spot1.getBlue();
            red = spot1.getRed();
            avg = (red + blue + green) / 3;
            if (avg >= 191.25){
                spot1.setRed(253);
                spot1.setGreen(237);
                spot1.setBlue(203);
            }
            else if (avg >= 127.5){
                spot1.setRed(112);
                spot1.setGreen(150);
                spot1.setBlue(161);
            }
            else if (avg >= 63.75){
                spot1.setRed(217);
                spot1.setGreen(22);
                spot1.setBlue(33);
            }
            else if (avg >= 0){
                spot1.setRed(0);
                spot1.setGreen(51);
                spot1.setBlue(76);
            }
        }
         me.explore();
         /**
          * method 2 change
          * 
          */
         int max, min;
         for (Pixel spot1 : pixels1){
            green = spot1.getGreen();
            blue = spot1.getBlue();
            red = spot1.getRed();
            avg = (red + blue + green) / 3;
            if (avg >= max){
                spot1.setRed(253);
                spot1.setGreen(237);
                spot1.setBlue(203);
            }
            else if (avg >= max*.5){
                spot1.setRed(112);
                spot1.setGreen(150);
                spot1.setBlue(161);
            }
            else if (avg >= max*.25){
                spot1.setRed(217);
                spot1.setGreen(22);
                spot1.setBlue(33);
            }
            else if (avg >= 0){
                spot1.setRed(0);
                spot1.setGreen(51);
                spot1.setBlue(76);
            }
        }
         me1.explore();
         /**
          * custom color palette
          */

         
    }//main       
}//class
