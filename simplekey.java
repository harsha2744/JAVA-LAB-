import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="SimpleKey" width=400 height=200>
</applet>
*/

public class SimpleKey extends Applet implements KeyListener 
{
    String msg = "";
    int X = 10, Y = 20; // output coordinates
    public void init() 
    {
        addKeyListener(this);
        //requestFocus();
    }

    public void keyPressed(KeyEvent ke) 
    {
        showStatus("Key Down");
    }

    public void keyReleased(KeyEvent ke) 
    {
        showStatus("Key Up");
    }
        
    public void keyTyped(KeyEvent ke) 
    {
        msg += ke.getKeyChar();
        repaint();
    }
    
    // Display keystrokes.
    public void paint(Graphics g) 
    {
        g.drawString(msg, X, Y);
    }
}

