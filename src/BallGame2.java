/**
 * Created by jkx on 2018/9/13.
 */

import javax.swing.*;
import java.awt.*;

public class BallGame2 extends JFrame {

    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
    double x = 100; //小球的横坐标
    double y = 100; //小球的纵坐标
    double degree = 3.14/3; //弧度,此时指代60度角



    //画窗口的方法
    public void paint(Graphics g){
        System.out.println("窗口被画了一次！");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball, (int)x, (int)y,null);

        x = x + 10*Math.cos(degree);
        y = y + 10*Math.sin(degree);

        if(y>500-40-15 || y < 40+10){
            degree = -degree;
        }

        //碰到左右边界
        if(x<40||x>854-40-40){
            degree = 3.14 - degree;
        }

    }


    //窗口加载
    void launchFrame() {
        setSize(856, 500);
        setLocation(50, 50);
        setVisible(true);

        //重画窗口
        while (true) {
            repaint();
            try {
                Thread.sleep(30); //30ms
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }


    //main方法是程序执行的入口
    public static void main(String[] args){
        System.out.println("这是一个简单的桌球游戏,哈哈哈");
        BallGame2 game = new BallGame2();
        game.launchFrame();
    }
}


