package ExerciseProject.MTank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLOutput;
import java.util.Vector;

public class MyPanel_ extends JPanel implements KeyListener, Runnable{
    MyTank myTank = null;
    EnemyTank enemyTank = null;
    int enemyTankSize = 3;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    Vector<Bomb> bombs = new Vector<>();
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;
    public MyPanel_() {
        this.myTank = new MyTank(700,100);
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank et = new EnemyTank((i+1) * 100, 0);
            et.setDirect(2);
            et.setSpeed(2);
            new Thread(et).start();
            Shot shot = new Shot(et.getX() + 20, et.getY() + 60, et.getDirect());
            et.enemyShots.add(shot);
            new Thread(shot).start();
            enemyTanks.add(et);
        }
        myTank.setSpeed(10);
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel_.class.getResource("./images/bomb1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel_.class.getResource("./images/bomb2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel_.class.getResource("./images/bomb3.png"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        if(myTank != null && myTank.isLive){
            drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), 1);
        }

        if ( myTank.shot != null && myTank.shot.isLive) {
            g.draw3DRect(myTank.shot.x, myTank.shot.y, 1,1,false);
        }
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank  = enemyTanks.get(i);
            if(enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
                for (int j = 0; j< enemyTank.enemyShots.size(); j++) {
                    Shot shot = enemyTank.enemyShots.get(j);
                    if (shot.isLive) {
                        g.draw3DRect(shot.x, shot.y, 1, 1, false);
                    } else {
                        enemyTank.enemyShots.remove(shot);
                    }
                }
            }
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if(bomb.life > 6) {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            }
            bomb.lifeDown();
            if(bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

    }

    public void drawTank(int x, int y , Graphics g, int direction, int type) {
        switch (type) {
            case 0: // 我方
                g.setColor(Color.GREEN);
                break;
            case 1: //敌方
                g.setColor(Color.yellow);
                break;
            default:
                g.setColor(Color.red);
                break;
        }

        switch (direction) {
            case 0:// 向上
                g.fill3DRect(x, y, 10, 60,false);
                g.fill3DRect(x+30, y, 10, 60, false);
                g.fill3DRect(x+10, y+10, 20, 40, false);
                g.drawOval(x+10, y+20, 20, 20);
                g.drawLine(x+20, y + 30, x + 20, y);
                break;
            case 1:// 向右
                g.fill3DRect(x, y, 60, 10,false);
                g.fill3DRect(x, y+30, 60, 10, false);
                g.fill3DRect(x+10, y+10, 40, 20, false);
                g.drawOval(x+20, y+10, 20, 20);
                g.drawLine(x+30, y + 20, x + 60, y+20);
                break;
            case 2:// 向下
                g.fill3DRect(x, y, 10, 60,false);
                g.fill3DRect(x+30, y, 10, 60, false);
                g.fill3DRect(x+10, y+10, 20, 40, false);
                g.drawOval(x+10, y+20, 20, 20);
                g.drawLine(x+20, y + 30, x + 20, y+60);
                break;
            case 3:// 向左
                g.fill3DRect(x, y, 60, 10,false);
                g.fill3DRect(x, y+30, 60, 10, false);
                g.fill3DRect(x+10, y+10, 40, 20, false);
                g.drawOval(x+20, y+10, 20, 20);
                g.drawLine(x+30, y + 20, x , y+20);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    public void hitEnemy() {
        if (myTank.shot != null && myTank.shot.isLive ) {
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                hitTank(myTank.shot, enemyTank);
            }
        }
    }

    public void hitTank(Shot shot, Tank enemyTank) {
        if(shot != null && shot.isLive) {
            switch (enemyTank.getDirect()){
                case 0:
                case 2:
                    if (shot.x > enemyTank.getX() && shot.x <enemyTank.getX()+ 40 && shot.y > enemyTank.getY()
                            && shot.y < enemyTank.getY() + 60) {
                        shot.isLive = false;
                        enemyTank.isLive = false;
                        enemyTanks.remove(enemyTank);
                        Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                        bombs.add(bomb);
                    }
                case 1:
                case 3:
                    if (shot.x > enemyTank.getX() && shot.x <enemyTank.getX()+ 60 && shot.y > enemyTank.getY()
                            && shot.y < enemyTank.getY() + 40) {
                        shot.isLive = false;
                        enemyTank.isLive = false;
                        enemyTanks.remove(enemyTank);
                        Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                        bombs.add(bomb);
                    }
            }
        }
    }
    public void hitHero() {

        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.enemyShots.size(); j++) {
                Shot shot = enemyTank.enemyShots.get(j);
                if (shot.isLive && myTank.isLive) {
                        hitTank(shot, myTank);
                }
            }
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            myTank.setDirect(0);
            if(myTank.getY() > 0) {
                myTank.moveUp();
            }
        }else if (e.getKeyCode() == KeyEvent.VK_D) {
            myTank.setDirect(1);
            if(myTank.getX() + 60 < 750) {
                myTank.moveRight();
            }
        }else if (e.getKeyCode() == KeyEvent.VK_S) {
            System.out.println(e);
            myTank.setDirect(2);
            if(myTank.getY() + 60 < 1000) {
                myTank.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            myTank.setDirect(3);
            if(myTank.getX() > 0) {
                myTank.moveLeft();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            if(myTank.shot == null || !myTank.shot.isLive) {
                myTank.shotElement();
            }
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hitEnemy();
            hitHero();
            this.repaint();
        }
    }
}
