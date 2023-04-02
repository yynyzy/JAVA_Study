package ExerciseProject.Jframe_test;

import javax.swing.*;
import java.awt.*;

public class MyPanel_ extends JPanel {
    MyTank myTank = null;

    public MyPanel_() {
        this.myTank = new MyTank(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        drawTank(myTank.getX(), myTank.getY(), g,0 ,0);
//        drawTank(myTank.getX() , myTank.getY(), g,0 ,0);
//        drawTank(myTank.getX(), myTank.getY()+ 10, g,0 ,0);
//        drawTank(myTank.getX() , myTank.getY()+ 10, g,0 ,0);
    }

    public void drawTank(int x, int y , Graphics g, int direction, int type) {

        switch (type) {
            case 0: // 我方
                g.setColor(Color.GREEN);
            case 1: //敌方
                g.setColor(Color.yellow);
            default:
                g.setColor(Color.GREEN);
        }

        switch (direction) {
            case 0:// 我方
                g.fill3DRect(x, y, 10, 60,false);
                g.fill3DRect(x+30, y, 10, 60, false);
                g.fill3DRect(x+10, y+10, 20, 40, false);
                g.drawOval(x+10, y+20, 20, 20);
                g.drawLine(x+20, y + 30, x + 20, y);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

}
