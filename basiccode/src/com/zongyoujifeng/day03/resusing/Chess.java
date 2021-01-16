package com.zongyoujifeng.day03.resusing;

import static net.mindview.util.Print.print;

/**
 * @author 10451
 * @version 1.0
 * @ClassName Chess
 * @description 使用super调用带参数构造器
 * @date 2021/1/16 13:07
 */
public class Chess extends BoardGame{

    Chess() {
        super(11);
        print("Chess constructor");

    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}


class Game {
    Game(int i) {
        print("Game constructor");
    }
}

class BoardGame extends Game {

    BoardGame(int i) {
        super(i);
        print("BoardGame constructor");
    }
}