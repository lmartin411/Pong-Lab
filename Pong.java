// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Pong extends AbstractPong
{
  private Ball ball;
  private Paddle leftPaddle;
  private Paddle rightPaddle;

  public Pong()
  {
    //set up all variables related to the game
  }

  public void render(Graphics window)
  {
    ball.moveAndDraw(window);
    leftPaddle.draw(window);
    rightPaddle.draw(window);

    //see if ball hits left wall or right wall
    if(!(ball.getX()>=10 && ball.getX()<=780))
    {
      ball.setXSpeed(0);
      ball.setYSpeed(0);
    }


    //see if the ball hits the top or bottom wall




    //see if the ball hits the left paddle



    //see if the ball hits the right paddle





    //see if the paddles need to be moved
    if(keyIsPressed('W') == true)
    {
      leftPaddle.moveUpAndDraw(window);
    }
  }
}
