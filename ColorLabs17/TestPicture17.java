
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
   public static Picture mirror = new Picture("images\\skarmy.jpg");
   public static Picture apic = new Picture("images\\skarmy.jpg");
   public static  Picture canvas = new Picture("images\\canvas.jpg");
   public static  Picture temple = new Picture("images\\temple.jpg");
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
     //Picture apic = new Picture("images\\skarmy.jpg");
     //Picture canvas = new Picture("images\\canvas.jpg");
     //relative path              dir/folder/file
     //Picture apic = new Picture("images\\beach.jpg");
     //Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
    //     Picture moto = new Picture("images/blueMotorcycle.jpg");
     //Picture kitty = new Picture("images/kitten2.jpg");
    // Picture door = new Picture("images/thruDoor.jpg");
    // Picture butterfly = new Picture("images/butterfly1.jpg");
    // Picture snowman = new Picture("images/snowman.jpg");

    mirrorVertical(mirror);
     mirror.explore();
     copytoCanvas(mirror,canvas);
     canvas.explore();
    // templeMirror(temple);
     //temple.explore();
     
     //!!!!!!!!!!!!!!!!! dispalys the picture
     //ferris1.explore();
     //kitty.explore();
     
     //to change color fo picture get all of the pixels!!!!!!!!!!!!!
     //makes an array of pixels
    // Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
    // pixels = ferris1.getPixels();
    // Pixel[] pixels1;
    // pixels1 = kitty.getPixels();
    // Pixel[] pixels2;
    // pixels2 = apic.getPixels();
    // Pixel[] pixels3;
    // pixels3 = door.getPixels();
    // Pixel[] pixels4;
    // pixels4 = butterfly.getPixels();
    // Pixel[] pixels5;
    // pixels5 = snowman.getPixels();
    
     //how many pixels or how large array
   // System.out.println("This is a large array"+pixels.length  );


    /**/
        //access each index - array notation
   // System.out.println(pixels[17]);
    //access each pixel - pic.methos.getPixel
   // Pixel spot = ferris1.getPixel(100,100);
   // Pixel spot50 = ferris1.getPixel(50,50);
   // System.out.println(pixels[17].getColor());
   // System.out.println(spot);
    
   // Pixel spot17 = pixels[17];
  //  spot17.setRed(200);
   // spot17.setBlue(150);
   // spot17.setGreen(170);
   // ferris1.explore();
    
   // spot.setColor(Color.yellow);
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
    /**
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
        iGreen = (int)(green + 23);
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
        if (red >= 207 && blue >= 230 && blue >=243){
            spot1.setGreen(121);
            spot1.setBlue(105);
            spot1.setRed(9);
        }
    }
    snowman.explore();
    **/
    
    
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
    inal double  FACTOR = .5;
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
    //ferris1.write("images/ferris11.jpg");

    /**/
  }//main
  public static void templeMirror(Picture apic){
      int width = apic.getWidth();
      int mirrorPoint = (width/2)+5;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      //loop through all the rows
      for(int y = 0; y < 96; y++){
          
          //loop from 0 to the middle (mirror point)
          for (int x = 0; x < mirrorPoint; x++){
              leftPixel = apic.getPixel(x,y);
              rightPixel = apic.getPixel(width -1 -x,y);
              rightPixel.setColor(leftPixel.getColor());
          }
          
      }
  }
  /**
   * method to mirror abound a vertical line in the middle
   * of the picture based on width
   */
  public static void mirrorVertical(Picture apic){
      int width = apic.getWidth();
      int mirrorPoint = width/2;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      //loop through all the rows
      for(int y = 0; y < apic.getHeight(); y++){
          
          //loop from 0 to the middle (mirror point)
          for (int x = 0; x < mirrorPoint; x++){
              leftPixel = apic.getPixel(x,y);
              rightPixel = apic.getPixel(width -1 -x,y);
              rightPixel.setColor(leftPixel.getColor());
          }
          
      }
  }
  public static void greySet(Picture apic){
      Pixel[] pix;
      pix = apic.getPixels();
      int avg, red, blue, green, count = 0;
      for(Pixel spot : pix){
          red = spot.getRed();
          blue = spot.getBlue();
          green = spot.getGreen();
          avg = (red + blue + green)/3;
          spot.setRed(avg);
          spot.setBlue(avg);
          spot.setGreen(avg);
          count++;
      }
  }
  /**
   * add two int to the params and place you want target to go onto the canvas
   */
  
  public static void copytoCanvas(Picture source, Picture target){
      //recursive copy to a x,y on the source
      Pixel sourcePixel = null;
      Pixel targetPixel = null;
      
      //loop through the columns (targetX is starting point on Canvas) source+=2   (larger sourcex= sourcex +.5)
      for (int sourceX = 0, targetX = 0; sourceX<source.getWidth(); sourceX++, targetX++){
          
          //loop thru the rows                                          source+=2  (larger sourcey= sourcey +.5)
          for (int sourceY = 0, targetY = 0; sourceY<source.getHeight(); sourceY++, targetY++){
              sourcePixel = source.getPixel(sourceX,sourceY);
              targetPixel = target.getPixel(targetX,targetY);
              targetPixel.setColor(sourcePixel.getColor());
          }
      }
  }
}//class
