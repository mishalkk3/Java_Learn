package gaming;

public class RunGame {
    public static void main(String[] args) {
        /* GamingConsole game1 = new MarioGame();
        System.out.println("Mario");
        game1.up();
        game1.down();
        game1.left();
        game1.right();
        System.out.println("Frogger");
        GamingConsole game2 = new Frogger();
        game2.up();
        game2.down();
        game2.left();
        game2.right(); */

        GamingConsole[] games = {new MarioGame(), new Frogger()};

        for (GamingConsole game : games) {
            game.up();
            game.down();
            game.left();
            game.right();
            System.out.println();
        }
    }
}
