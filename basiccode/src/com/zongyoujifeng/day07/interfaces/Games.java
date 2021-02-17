package com.zongyoujifeng.day07.interfaces;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Games
 * @description 工厂模式在相同棋盘上下国际象棋和西洋跳棋
 * @date 2021/2/17 10:02
 */
public class Games {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move()) {

        }
    }

    public static void main(String[] args) {
        playGame(new CheckFactory());
        playGame(new ChessFactory());
    }
}

interface Game {
    /**
     * 是否移动
     *
     * @return 布尔值
     */
    boolean move();
}

interface GameFactory {
    /**
     * 加载游戏
     *
     * @return 加载的游戏
     */
    Game getGame();
}

class Checkers implements Game {

    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        print("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

class CheckFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new Checkers();
    }
}


class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        print("Chess move " + moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Chess();
    }
}