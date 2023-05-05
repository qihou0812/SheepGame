package com.sheepgame.view;

import com.sheepgame.model.Brand;

import javax.swing.*;
import java.awt.*;

/*
        游戏的启动入口
 */
public class Start extends JFrame {
    public Start() throws HeadlessException {
        this.setTitle("SheepGame by Billy");
        this.setSize(400,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //The method add components and add to the recent frame
        //this.getContentPane().add(brand);
    }

    public static void main(String[] args) {
        new Start();
    }
}
