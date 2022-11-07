import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {
    Button buttons[];

    public Main() {
        buttons = new Button[5];
        buttons[0]=new Button();
        buttons[1]=new Button();
        buttons[0].setSize(50,50);
        add(buttons[0]);
        add(buttons[1]);
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        setVisible(true);
        setSize(400,500);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Main box=new Main();
    }
}
