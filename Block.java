// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

	public Block()
	{
      xPos = 100;
      yPos = 150;
      width = 10;
      height = 10;
      color = Color.white;
	}

	// add other Block constructors - x , y , width, height, color
   // you can find what constructors you need by looking at BlockTestOne and BlockTestTwo

   public Block (int x, int y) {
      xPos = x;
      yPos = y;
      width = 10;
      height = 10;
      color = Color.white;
   }

	public Block (int x, int y, Color c) {
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = c;
	}

   public Block( int x, int y, int w, int h )
   {
      xPos = x;
      yPos = y;
      width = w;
      height = h;
      color = Color.black;
   }

   public Block ( int x, int y, int w, int h, Color c)
   {
      xPos = x;
      yPos = y;
      width = w;
      height = h;
      color = c;
   }


	public void setColor( Color col )
	{
      color = col;

	}

	public void setPos( int x, int y )
	{
	   xPos = x;
      yPos = y;
	}

	public void setX( int x )
	{
	   xPos = x;
	}

	public void setY( int y )
	{
	   yPos = y;
	}

	// add the other set methods
   // you can see what modifier methods to add by looking at the instance variables

   public void setWidth ( int w )
   {
      width = w;
   }

   public void setHeight ( int h )
   {
      height  = h;
   }

	public int getX()
	{
	   return xPos;
	}

	public int getY()
	{
	   return yPos;
	}

	//add the other get methods
   // you can see what accessor methods to add by looking at the instance variables

   public int getWidth()
	{
	   return width;
	}

   public int getHeight()
	{
	   return height;
	}

   public Color getColor()
	{
	   return color;
	}



	public void draw(Graphics window)
	{
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

   // use the draw method provided about to figure out how to complete this method
	public void draw(Graphics window, Color col)
	{
      window.setColor(col);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

   // review the equals method from book and library
   // show me your completed equals method please
	public boolean equals(Object obj)
	{
      Block tmp = (Block)obj;
      if (tmp.getX() == getX() && tmp.getY() == getY() && tmp.getWidth() == getWidth() && tmp.getHeight() == getHeight() && tmp.getColor().equals(getColor())) {
         return true;
      }
      else {
		   return false;
      }
	}



	//add a toString() method  - x , y , width, height, color

   public String toString()
   {
      return "" + xPos + " " + yPos + " " + width + " " + height + " " + color;
   }
}
