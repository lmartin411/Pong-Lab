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
  private int scoreR = 0, scoreL = 0;
  private Block score;

  public Pong()
  {
    //set up all variables related to the game
    ball = new Ball(335, 200, Color.white);
    leftPaddle = new Paddle(20, 350, 20, 100, Color.white);
    rightPaddle = new Paddle(740, 350, 20, 100, Color.white);
    score = new Block(340, 10, 150, 60, Color.black);
  }

  public void render(Graphics window)
  {
    ball.moveAndDraw(window);
    leftPaddle.draw(window);
    rightPaddle.draw(window);
    window.drawString("Left: " + scoreL + "      Right: " + scoreR, 360, 40);

    //see if ball hits left wall or right wall
    if(ball.getX() <= 20) {
      scoreR++;
      score.draw(window);
      window.drawString("Left: " + scoreL + "      Right: " + scoreR, 360, 40);
      ball.setXSpeed(0);
      ball.setYSpeed(0);
      ball.reset(window);
    }
    
    else if (ball.getX() >= 780) {
      scoreL++;
      score.draw(window);
      window.drawString("Left: " + scoreL + "      Right: " + scoreR, 360, 40);
      ball.setXSpeed(0);
      ball.setYSpeed(0);
      ball.reset(window);
    }

    //see if the ball hits the top or bottom wall
    if (ball.getY() <= 550) //Find height
    {
      ball.setYSpeed(-ball.getYSpeed());
    }

    if (ball.getY() >= 20)
    {
      ball.setYSpeed(-ball.getYSpeed());
    }



    //see if the ball hits the left paddle
    if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed()) //if the ball is to the left of the left paddle's right side
    && (ball.getY() >= leftPaddle.getY() || //if the ball is above the paddle's base
    ball.getY() + ball.getHeight() >= leftPaddle.getY()) && //if the ball is above the paddle's base
    ball.getY() + ball.getHeight() <= leftPaddle.getY() + leftPaddle.getHeight()) //ball is below paddle's top
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
    if ((ball.getX() + ball.getWidth() >= rightPaddle.getX() + Math.abs(ball.getXSpeed()) &&
    (ball.getY() >= rightPaddle.getY() ||
    ball.getY() + ball.getHeight() >= rightPaddle.getY()) &&
    ball.getY() + ball.getHeight() <= rightPaddle.getY() + rightPaddle.getHeight()))
    {
    
      //Set Y speed to negative of current
      if(ball.getX() >= rightPaddle.getX() + rightPaddle.getWidth() - Math.abs(ball.getXSpeed()))
      {
        ball.setYSpeed(-ball.getYSpeed());
      }

      //Set X speed to negative of current
      else
      {
        ball.setXSpeed(ball.getXSpeed() * -1);
      }
    }

    //see if the paddles need to be moved
    if(keyIsPressed('Z') == true)
    {
      leftPaddle.moveDownAndDraw(window);
    }

    if(keyIsPressed('W') == true)
    {
      leftPaddle.moveUpAndDraw(window);
    }

    if(keyIsPressed('M') == true)
    {
      rightPaddle.moveDownAndDraw(window);
    }

    if(keyIsPressed('I') == true)
    {
      rightPaddle.moveUpAndDraw(window);
    }

    if(keyIsPressed('B') == true)
    {
      ball.reset(window);
    }

  }
}
