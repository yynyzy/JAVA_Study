package ExerciseProject.tankGame;

import javax.swing.*;
import java.awt.*;

public class TankGame extends JFrame {  // Jfame 是画框， jPanel 是画板
    public static void main(String[] args) {
        new TankGame();;
    }
    public TankGame() {
        MyPanel myPanel = new MyPanel();
        this.add(myPanel); // 将画板加入画框
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 点击叉号退出程序
        this.setSize(500, 500); // 设置窗口大小
        this.setVisible(true); // 允许显示
    }
}

class  MyPanel extends JPanel {
    // Graphics g 是一只画笔，有许多绘画方法
    @Override
    public void paint(Graphics g) {
        super.paint(g); // 调用父类的方法
        g.drawOval(200,200,100,100); // 画一个圆
    }
}
