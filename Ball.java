// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
  private int xSpeed;
  private int ySpeed;

  public Ball()
  {
    super(200,200);
    xSpeed = 3;
    ySpeed = 1;
  }

  // add the other Ball constructors
  // like block look at BallTestOne and BallTestTwo to determine what constructors you need

   public Ball(int xp, int yp)
   {
      super(xp, yp);
      xSpeed = 3;
      ySpeed = 1;
   }

   public Ball(int xp, int yp, Color c)
   {
     super(xp, yp, c);
     xSpeed = 3;
     ySpeed = 1;
   }

   public Ball (int xp, int yp, int w, int h)
   {
      super(xp, yp, w, h);
      xSpeed = 3;
      ySpeed = 1;
   }

   public Ball (int xp, int yp, int w, int h, Color c) {
      super(xp, yp, w, h, c);
      xSpeed = 3;
      ySpeed = 1;
   }

   public Ball (int xp, int yp, int w, int h, Color c, int xs, int ys) {
      super (xp, yp, w, h, c);
      xSpeed = xs;
      ySpeed = ys;
   }

  // add the set methods

  public void setXSpeed(int x) {
   xSpeed = x;
  }

  public void setYSpeed (int y) {
   ySpeed = y;
  }

  public void setSpeed (int x, int y) {
   xSpeed = x;
   ySpeed = y;
  }

  public void moveAndDraw(Graphics window)
  {
    //draw a white ball at old ball location
    draw(window, Color.black);

    setX(getX() + xSpeed);
    setY(getY() + ySpeed);

    //draw the ball at its new location
    draw(window);
  }

  public boolean equals(Object obj)
  {
      Ball tmp = (Ball)obj;
      if (tmp.getX() == getX() && tmp.getY() == getY() && tmp.getWidth() == getWidth() && tmp.getHeight() == getHeight() &&
         tmp.getColor().equals(getColor()) && tmp.getXSpeed() == getXSpeed() && tmp.getYSpeed() == getYSpeed()) {
         return true;
      }
      else {
		   return false;
      }

  }

  //add the get methods

  public int getXSpeed() {
   return xSpeed;
  }

  public int getYSpeed() {
   return ySpeed;
  }

  //add a toString() method

  public String toString() {
   return super.toString() + " " + xSpeed + " " + ySpeed;
  }

}
