import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Paddle extends Rectangle {
    int id; // 1 for Player 1 and 2 for Player 2
    int yVelocity;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT,int id){  // x coordinate, y coordinate, Paddle width, paddle height, player id
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id = id;
    }
    public void keyPressed(KeyEvent e){

    }
    public void keyReleased(KeyEvent e){

    }
    public void setYDirection(int yDirection){

    }
    public void move(){

    }
    public void draw(Graphics g){
        if(id == 1)
            g.setColor(Color.blue);
        else
            g.setColor(Color.yellow);
        g.fillRect(x,y,width,height);
    }
}
