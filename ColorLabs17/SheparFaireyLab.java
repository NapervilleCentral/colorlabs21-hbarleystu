
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
         Pixel[] pixels2;
         pixels2 = me2.getPixels();
         
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
         // me.explore();
         /**
          * method 2 change
          * 
          */
         int max = 0, min = 256;
         for (Pixel spot1 : pixels1){
            green = spot1.getGreen();
            blue = spot1.getBlue();
            red = spot1.getRed();
            avg = (red + blue + green) / 3;
            if (avg>max){
                max = avg;
            }
            if (avg<min){
                min = avg;
            }
        }
         for (Pixel spot1 : pixels1){
            green = spot1.getGreen();
            blue = spot1.getBlue();
            red = spot1.getRed();
            avg = (red + blue + green) / 3;
            if (avg >= (max-min)*.75){
                spot1.setRed(253);
                spot1.setGreen(237);
                spot1.setBlue(203);
            }
            else if (avg >= (max-min)*.5){
                spot1.setRed(112);
                spot1.setGreen(150);
                spot1.setBlue(161);
            }
            else if (avg >= (max-min)*.25){
                spot1.setRed(217);
                spot1.setGreen(22);
                spot1.setBlue(33);
            }
            else if (avg >= min){
                spot1.setRed(0);
                spot1.setGreen(51);
                spot1.setBlue(76);
            }
        }
         // me1.explore();
         /**
          * custom color palette
          */
        /*
         me2.explore();
         for (Pixel spot1 : pixels2){
            green = spot1.getGreen();
            blue = spot1.getBlue();
            red = spot1.getRed();
            avg = (red + blue + green) / 3;
            if (avg >= 191.25){
                spot1.setRed(175);
                spot1.setGreen(164);
                spot1.setBlue(217);
            }
            else if (avg >= 127.5){
                spot1.setRed(50);
                spot1.setGreen(16);
                spot1.setBlue(177);
            }
            else if (avg >= 63.75){
                spot1.setRed(67);
                spot1.setGreen(47);
                spot1.setBlue(144);
            }
            else if (avg >= 0){
                spot1.setRed(14);
                spot1.setGreen(1);
                spot1.setBlue(65);
            }
        }
        me2.write("images/SFtry1.jpg");
        */
       /*
        for (Pixel spot1 : pixels2){
            green = spot1.getGreen();
            blue = spot1.getBlue();
            red = spot1.getRed();
            avg = (red + blue + green) / 3;
            if (avg >= 191.25){
                spot1.setRed(192);
                spot1.setGreen(188);
                spot1.setBlue(197);
            }
            else if (avg >= 127.5){
                spot1.setRed(124);
                spot1.setGreen(103);
                spot1.setBlue(153);
            }
            else if (avg >= 63.75){
                spot1.setRed(75);
                spot1.setGreen(45);
                spot1.setBlue(115);
            }
            else if (avg >= 0){
                spot1.setRed(18);
                spot1.setGreen(1);
                spot1.setBlue(41);
            }
        }
        me2.write("images/SFtry2.jpg");
         */
        /*
        for (Pixel spot1 : pixels2){
            green = spot1.getGreen();
            blue = spot1.getBlue();
            red = spot1.getRed();
            avg = (red + blue + green) / 3;
            if (avg >= 177.25){
                spot1.setRed(192);
                spot1.setGreen(188);
                spot1.setBlue(197);
            }
            else if (avg >= 127.5){
                spot1.setRed(124);
                spot1.setGreen(103);
                spot1.setBlue(153);
            }
            else if (avg >= 63.75){
                spot1.setRed(75);
                spot1.setGreen(45);
                spot1.setBlue(115);
            }
            else if (avg >= 0){
                spot1.setRed(18);
                spot1.setGreen(1);
                spot1.setBlue(41);
            }
        }
        me2.write("images/SFtry3.jpg");
        */
       me2.explore();
       for (Pixel spot1 : pixels2){
            green = spot1.getGreen();
            blue = spot1.getBlue();
            red = spot1.getRed();
            avg = (red + blue + green) / 3;
            if (avg >= 177.25){
                spot1.setRed(192);
                spot1.setGreen(188);
                spot1.setBlue(197);
            }
            else if (avg >= 144 && avg <= 150){
                spot1.setRed(163);
                spot1.setGreen(129);
                spot1.setBlue(208);
            }
            else if (avg >= 127.5){
                spot1.setRed(124);
                spot1.setGreen(103);
                spot1.setBlue(153);
            }
            else if (avg >= 63.75){
                spot1.setRed(75);
                spot1.setGreen(45);
                spot1.setBlue(115);
            }
            else if (avg >= 0){
                spot1.setRed(18);
                spot1.setGreen(1);
                spot1.setBlue(41);
            }
        }
        me2.explore();
    }//main       
}//class
