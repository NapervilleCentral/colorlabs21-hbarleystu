
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
   public static Picture grey = new Picture("images\\skarmy.jpg");
   public static Picture reg = new Picture("images\\skarmy.jpg");
   public static Picture cPic = new Picture("images\\skarmy.jpg");
   public static Picture holyPic = new Picture("images\\skarmy.jpg");
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
    copyKatie(reg,canvas,0,0);
    mirrorVertical(mirror);
     copyKatie(mirror,canvas,200,0);
     greySet(grey);
     copyKatie(grey,canvas,400,0);
     cChange(cPic);
     copyKatie(cPic,canvas,0,240);
     holySet(holyPic);
     copyKatie(holyPic,canvas,200,240);
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
  public static void rSet(Picture apic){
      
  }
  public static void cChange(Picture apic){
      Pixel[] pixelso;
      pixelso = apic.getPixels();
      int avg, red, blue, green, count = 0;
      for (Pixel spot1 : pixelso){
            
            green = spot1.getGreen();
            blue = spot1.getBlue();
            red = spot1.getRed();
            avg = (red + blue + green) / 3;
            if (avg >= 189){
                spot1.setRed(192);
                spot1.setGreen(188);
                spot1.setBlue(197);
            }
            else if (avg >= 135 && avg <= 148 && red > 160 && red < 183 && green < 130 && green > 124 ){
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
  }
  public static void copyKatie( Picture sourcePic, Picture targetPic, int xt, int yt)
{
    Pixel sourcePix = null;
    Pixel targetPix = null;
    //width of the source must be <= to the canvas I am
    //going to copy to
    for (int sourceX = 0, targetX = xt;
    sourceX<sourcePic.getWidth();
    sourceX++, targetX ++)
    {
        for (int sourceY = 0, targetY = yt;
        sourceY<sourcePic.getHeight();
        sourceY++, targetY ++)
        {
            //set the target pix color of the source pix
            sourcePix = sourcePic.getPixel(sourceX,sourceY);
            targetPix = targetPic.getPixel(targetX,targetY);
            targetPix.setColor(sourcePix.getColor());
        }//loop
    }//loop
}//end of copyKatie 
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
      Pixel[] pixels;
      pixels = apic.getPixels();
      int avg, red, blue, green, count = 0;
      for(Pixel spot : pixels){
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
  public static void holySet(Picture apic){
      Pixel[] pixels;
      pixels = apic.getPixels();
      int avg, red, blue, green, count = 0, mult = 3;
      for(Pixel spot : pixels){
          red = spot.getRed();
          blue = spot.getBlue();
          green = spot.getGreen();
          avg = (red + blue + green)/3;
          spot.setRed(red*mult);
          spot.setBlue(blue*mult);
          spot.setGreen(green*mult);
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
