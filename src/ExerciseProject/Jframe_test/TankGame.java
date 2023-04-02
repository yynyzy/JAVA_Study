package ExerciseProject.Jframe_test;

import javax.swing.*;
import java.awt.*;

public class TankGame extends JFrame {
    MyPanel_ mp = null;

    public static void main(String[] args) {
        TankGame tankGame = new TankGame();
    }
    public TankGame() {
        mp = new MyPanel_();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
