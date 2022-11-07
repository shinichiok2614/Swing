import javax.swing.*;
import java.awt.*;

public class Main extends Frame {
    public Main() {
        JFrame frame=new JFrame();
        JButton b1=new JButton("SDFASDFSA");
        JButton b2=new JButton();
        JButton b3=new JButton();
        JButton b4=new JButton();
        JButton b5=new JButton();
        JPanel controlpanel=new JPanel();
        frame.add(b2,BorderLayout.SOUTH);
        frame.add(b3,BorderLayout.EAST);
        frame.add(b4,BorderLayout.NORTH);
        frame.add(b5,BorderLayout.CENTER);

        JButton b21=new JButton("sdfasdf");
        JButton b22=new JButton("sadfasdf");
        controlpanel.add(b21);
        controlpanel.add(b22);

        frame.add(controlpanel,BorderLayout.WEST);
        frame.setSize(500,400);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        Main border=new Main();
    }
}