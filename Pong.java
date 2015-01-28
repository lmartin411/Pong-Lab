// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math.*;

// JFrame Height: 600 Width: 800

public class Pong extends AbstractPong
{
  private Ball ball;
  private Paddle leftPaddle;
  private Paddle rightPaddle;

  public Pong()
  {
    //set up all variables related to the game
    ball = new Ball(335, 200, Color.white);
    leftPaddle = new Paddle(20, 350, 20, 100, Color.white);
    rightPaddle = new Paddle(760, 350, 20, 100, Color.white);
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
    if (ball.getY() >= 780) //Find height
    {
      ball.setYSpeed(0);
    }

    if (ball.getY() <= 0)
    {
      ball.setYSpeed(0);
    }



    //see if the ball hits the left paddle
    if((ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed()) &&
    (ball.getY() >= leftPaddle.getY() + leftPaddle.getHeight() ||
    ball.getY() + ball.getHeight() >= leftPaddle.getY() &&
    ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight())))
    {
        //Set Y speed to negative of current
        if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
        {
          ball.setYSpeed(ball.getYSpeed() * -1);
        }

        //Set X speed to negative of current
        else
        {
          ball.setXSpeed(ball.getXSpeed() * -1);
        }
    }

    //see if the ball hits the right paddle
    if ((ball.getX() <= rightPaddle.getX() + Math.abs(ball.getXSpeed()) &&
    (ball.getY() >= rightPaddle.getY() + rightPaddle.getHeight() ||
    ball.getY() + ball.getHeight() >= rightPaddle.getY() &&
    ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight())))
    {
      //Set Y speed to negative of current
      if(ball.getX() <= rightPaddle.getX() + rightPaddle.getWidth() - Math.abs(ball.getXSpeed()))
      {
        ball.setYSpeed(ball.getYSpeed() * -1);
      }

      //Set X speed to negative of current
      else
      {
        ball.setXSpeed(ball.getXSpeed() * -1);
      }
    }

    //see if the paddles need to be moved
    if(keyIsPressed('W') == true)
    {
      leftPaddle.moveDownAndDraw(window);
    }

    if(keyIsPressed('Z') == true)
    {
      leftPaddle.moveUpAndDraw(window);
    }

    if(keyIsPressed('I') == true)
    {
      rightPaddle.moveDownAndDraw(window);
    }

    if(keyIsPressed('M') == true)
    {
      rightPaddle.moveUpAndDraw(window);
    }

    if(keyIsPressed('B') == true)
    {
      ball.reset(window);
    }

  }
}
