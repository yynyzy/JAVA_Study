package ExerciseProject.Jframe_test;

import javax.swing.*;
import java.awt.*;

public class Panel_ extends JPanel {
    MyTank myTank = null;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(0,0,1000,750);
        g.fillRect();
    }
}
