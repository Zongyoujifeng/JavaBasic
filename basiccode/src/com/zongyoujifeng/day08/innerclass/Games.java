package com.zongyoujifeng.day08.innerclass;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Games
 * @description 使用匿名内部类改造工厂模式在相同棋盘上下国际象棋和西洋跳棋
 * @date 2021/2/17 9:32
 */
public class Games {

}

interface Game {
    /**
     * 是否移动
     * @return 布尔值
     */
    boolean move();
}

interface GameFactory {
    /**
     * 获得Game
     * @return 下哪种棋
     */
    Game getGame();
}

class Checkers implements Game {
    private Checkers() {
    }

    private int moves = 0;

    private static final int MOVES = 3;


    @Override
    public boolean move() {
        print("Checkers move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game {
    private Chess() {
    }

    private int moves = 0;

    private static final int MOVES = 4;

    @Override
    public boolean move() {
        print("Chess move " + moves );
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}

