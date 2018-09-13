/**
 * Created by jkx on 2018/9/13.
 */

import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
    //窗口加载
    void launchFrame(){
        setSize(300,300);
        setLocation(400,400);
        setVisible(true);
    }
    //main方法是程序执行的入口
    public static void main(String[] args){
        System.out.println("这是一个简单的桌球游戏");
        BallGame game = new BallGame();
        game.launchFrame();
    }
}
