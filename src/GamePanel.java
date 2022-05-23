import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
 public class GamePanel extends JPanel implements Runnable {

    /* We are using static so that is multiple instances of GamePanel class is created than they all have
    the same value and final keyword is so that we do not change it's value accidently */

    // All the values are in px
    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH*(5/9.0));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);
    static final int BALL_DIAMETER = 20;
    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGHT= 100;

    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Paddle paddle1;
    Paddle paddle2;
    Ball ball;
    Score score;



    GamePanel(){
         newPaddles();
         newBall();
         score = new Score(GAME_WIDTH, GAME_HEIGHT);
         this.setFocusable(true);
         this.addKeyListener(new AL());
         this.setPreferredSize(SCREEN_SIZE);
         gameThread = new Thread();
         gameThread.start();


    }
    public void newBall(){
        ball = new Ball((GAME_WIDTH/2)-(BALL_DIAMETER/2),(GAME_HEIGHT/2)-(BALL_DIAMETER/2),BALL_DIAMETER,BALL_DIAMETER);

    }
    public void newPaddles(){
        paddle1 = new Paddle(0,(GAME_HEIGHT/2)-(PADDLE_HEIGHT/2),PADDLE_WIDTH,PADDLE_HEIGHT,1);
        paddle2 = new Paddle(GAME_WIDTH-PADDLE_WIDTH,(GAME_HEIGHT/2)-(PADDLE_HEIGHT/2),PADDLE_WIDTH,PADDLE_HEIGHT,2);

    }
    public void paint(Graphics g){
        image = createImage(getWidth(),getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image,0,0,this); // drawing the image

    }
    public void draw(Graphics g){
        paddle1.draw(g); // For drawing the paddle 1
        paddle2.draw(g);// for drawing the paddle 2
        ball.draw(g); // For drawing the ball

    }
    public void move(){

    }
    public void checkCollision(){

    }
    public void run(){

    }

    public class AL extends KeyAdapter{  // Our Action Listener
        public void keyPressed(KeyEvent e){

        }
        public void keyReleased(KeyEvent e){

        }
    }
}
