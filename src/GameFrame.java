import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class GameFrame extends JFrame { // It is going to contain Our Cross, Min,Max btns, basically houses our GamePanel
    GamePanel panel;
    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setBackground(Color.BLACK);
        this.setResizable(false); // So that the window cannot be resized
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // For closing out window
        this.pack(); // It resizes the window to fit the components of our game automatically
        this.setVisible(true);
        this.setLocationRelativeTo(null); // It gets our window in the center of our screen
    }
}
