import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Ball extends Rectangle {
    Random random;
    int xVelocity;
    int yVelocity;
    Ball(int x,int y,int BALL_DIAMETER,int Ball_Diameter){
        super(x,y,BALL_DIAMETER,Ball_Diameter);
    }
    public void setXDirection(int randomXDirection){

    }
    public void setYDirection(int randoYDirection){

    }
    public void move(){

    }
    public void draw(Graphics g){
            g.setColor(Color.white);
            g.fillOval(x,y,width,height);
    }
}
