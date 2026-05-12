
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
   public static Picture rPic = new Picture("images\\skarmy.jpg");
   public static Picture regu = new Picture("images\\skarmy.jpg");
   public static  Picture canvas = new Picture("images\\canvas.jpg");
   public static  Picture temple = new Picture("images\\temple.jpg");
    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
    
    copyKatie(reg,canvas,0,0);
    mirrorVertical(mirror);
     copyKatie(mirror,canvas,200,0);
     greySet(grey);
     copyKatie(grey,canvas,400,0);
     cChange(cPic);
     copyKatie(cPic,canvas,0,240);
     holySet(holyPic);
     rotate(holyPic);
     copyKatie(holyPic,canvas,200,240);
     copyKatie(regu,canvas,400,240);
     smaller(rPic,regu);
     canvas.explore();
    // templeMirror(temple);
     //temple.explore();
  
  }//main
  public static void rotate(Picture apic){
    Picture extra = new Picture(apic);
    Pixel sourcePixel = null;
    Pixel targetPixel = null;

      for (int x = 0; x < apic.getWidth(); x++)
    {
        for (int y = 0; y < apic.getHeight(); y++)
        {
            sourcePixel = extra.getPixel(x, y);
            targetPixel = apic.getPixel(apic.getWidth() -1 -x, apic.getHeight() -1 -y);
            targetPixel.setColor(sourcePixel.getColor());
        }
    }
  }
  public static void smaller(Picture apic, Picture reg){
    
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
      for (int x = 0; x < apic.getWidth(); x+=2)
    {
        for (int y = 0; y < apic.getHeight(); y+=2)
        {
            sourcePixel = reg.getPixel(x, y);
            targetPixel = apic.getPixel(x/2, y/2);
            targetPixel.setColor(sourcePixel.getColor());
            
        }
    }
    copyKatie(apic,canvas,400,240);
    
    if (apic.getWidth()/2> 50){
        Picture rec = new Picture(apic.getWidth()/2, apic.getHeight()/2);
        smaller(rec,apic);
        /**
        for (int x = 0; x < rec.getWidth(); x+=2)
        {
            for (int y = 0; y < rec.getHeight(); y+=2)
            {
                sourcePixel = apic.getPixel(x, y);
                targetPixel = rec.getPixel(x/2, y/2);
                targetPixel.setColor(sourcePixel.getColor());
            
            }
        }
        copyKatie(rec,canvas,400,240);
        smaller(rec,apic);
        */
    }
    else{
        return;
    }
    
     
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
      int avg, red, blue, green, count = 0, mult = 2;
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
