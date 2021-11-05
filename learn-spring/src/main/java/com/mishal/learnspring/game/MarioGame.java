package com.mishal.learnspring.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("JUMP");
    }

    @Override
    public void down() {
        System.out.println("DODGE");
    }

    @Override
    public void left() {
        System.out.println("GO LEFT");
    }

    @Override
    public void right() {
        System.out.println("DO RIGHT");
    }
}
