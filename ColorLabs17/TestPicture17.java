
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*; // the color class is in awt lib
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /*
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
     */
     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     //relative path              dir/folder/file
     Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture moto = new Picture("images/blueMotorcycle.jpg");
     Picture kitty = new Picture("images/kitten2.jpg");
     Picture door = new Picture("images/thruDoor.jpg");
     Picture butterfly = new Picture("images/butterfly1.jpg");
     Picture snowman = new Picture("images/snowman.jpg");

     //apic.explore();!!!!!!!!!!!!!!!!! dispalys the picture
     //ferris1.explore();
     //kitty.explore();
     
     //to change color fo picture get all of the pixels!!!!!!!!!!!!!
     //makes an array of pixels
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     pixels = ferris1.getPixels();
     Pixel[] pixels1;
     pixels1 = kitty.getPixels();
     Pixel[] pixels2;
     pixels2 = apic.getPixels();
     Pixel[] pixels3;
     pixels3 = door.getPixels();
     Pixel[] pixels4;
     pixels4 = butterfly.getPixels();
     Pixel[] pixels5;
     pixels5 = snowman.getPixels();
    
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );


    /**/
        //access each index - array notation
    System.out.println(pixels[17]);
    //access each pixel - pic.methos.getPixel
    Pixel spot = ferris1.getPixel(100,100);
    Pixel spot50 = ferris1.getPixel(50,50);
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
    
    Pixel spot17 = pixels[17];
    spot17.setRed(200);
    spot17.setBlue(150);
    spot17.setGreen(170);
    ferris1.explore();
    
    spot.setColor(Color.yellow);
    //spot50.setColor();
    //ferris1.explore();
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
/*
   // loop to access indexes of array or collection
*/
    //for each loop spot  is a ?
    int blue;
    int red;
    int green;
    int rng;
    for (Pixel spot1 : pixels){
        //System.out.println( spot1 );
        blue = spot1.getBlue();
        rng = (int)(.25 * blue);
        spot1.setBlue(rng);
    }
    ferris1.explore();
    
    int iGreen;
    int iBlue;
    int iRed;
    for (Pixel spot1 : pixels1){
        //System.out.println( spot1 );
        green = spot1.getGreen();
        blue = spot1.getBlue();
        red = spot1.getRed();
        iGreen = (int)((green - 255) * -1);
        iBlue = (int)((blue - 255) * -1);
        iRed = (int)((red - 255) * -1);
        spot1.setGreen(iGreen);
        spot1.setBlue(iBlue);
        spot1.setRed(iRed);
    }
    kitty.explore();
    int avg;
    for (Pixel spot1 : pixels2){
        //System.out.println( spot1 );
        green = spot1.getGreen();
        blue = spot1.getBlue();
        red = spot1.getRed();
        avg = (red + blue + green) / 3;
        spot1.setGreen(avg);
        spot1.setBlue(avg);
        spot1.setRed(avg);
    }
    
    apic.explore();
    for (Pixel spot1 : pixels3){
        //System.out.println( spot1 );
        green = spot1.getGreen();
        blue = spot1.getBlue();
        red = spot1.getRed();
        iGreen = (int)(green + 80);
        iBlue = (int)(blue + 80);
        iRed = (int)(red + 80);
        spot1.setGreen(iGreen);
        spot1.setBlue(iBlue);
        spot1.setRed(iRed);
    }
    door.explore();
    for (Pixel spot1 : pixels4){
        //System.out.println( spot1 );
        green = spot1.getGreen();
        blue = spot1.getBlue();
        red = spot1.getRed();
        iGreen = (int)(green + 21);
        iBlue = (int)(blue + 67);
        iRed = (int)(red - 41);
        spot1.setGreen(iGreen);
        spot1.setBlue(iBlue);
        spot1.setRed(iRed);
    }
    butterfly.explore();
    for (Pixel spot1 : pixels5){
        //System.out.println( spot1 );
        green = spot1.getGreen();
        blue = spot1.getBlue();
        red = spot1.getRed();
        iGreen = (int)(green);
        iBlue = (int)(blue);
        iRed = (int)(red);
        if (red >= 215 && blue >= 230 && blue >=248){
            spot1.setGreen(green - 80);
            spot1.setBlue(blue - 80);
            spot1.setRed(red - 80);
        }
        spot1.setGreen(iGreen);
        spot1.setBlue(iBlue);
        spot1.setRed(iRed);
    }
    snowman.explore();
    
    
    
    /*
    int red;
    for (Pixel spot1 : pixels){
        //System.out.println( spot1 );
        red = spot1.getRed();
        rng = (int)(Math.random() * red);
        spot1.setRed(rng);
    }
    ferris1.explore();
    
    int green;
    int count = 0;
    
*/
   
 /**/

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
    ferris1.write("images/ferris11.jpg");

    /**/
  }//main
}//class
