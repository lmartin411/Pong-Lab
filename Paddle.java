// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
  private int speed;

  public Paddle()
  {
    super(10,10);
    speed = 5;
  }


  //add the other Paddle constructors

   public Paddle(int x, int y) {
      super(x, y);
      speed = 5;
   }
   
   public Paddle(int x, int y, int s) {
      super(x, y);
      speed = s;
  }
  
   public Paddle (int x, int y, int w, int h) {
      super(x, y, w, h);
      speed = 5;
   }
   
   public Paddle (int x, int y, int w, int h, int s) {
      super(x, y, w, h);
      speed = s;
   }

   public Paddle (int x, int y, int w, int h, Color c) {
      super(x, y, w, h, c);
      speed = 5;
   }
   
   public Paddle (int x, int y, int w, int h, Color c, int s) {
      super (x, y, w, h, c);
      speed = s;
   }

  public void moveUpAndDraw(Graphics window)
  {
      draw(window, Color.white);
      setY(getY() + speed);
      draw(window);
  }

  public void moveDownAndDraw(Graphics window)
  {
      draw(window, Color.white);
      setY(getY() - speed);
      draw(window);
  }

  //add get methods
   public int getSpeed() {
      return speed;
   }

  //add a toString() method
  
  public String toString() {
     return super.toString() + " " + speed;
  }
}
