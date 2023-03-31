package game.rpg.logics;

import game.rpg.graphics.GamePanel;
import game.rpg.graphics.GameWindow;

public class Game {

    private GameWindow gameWindow;
    private GamePanel gamePanel;

    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
    }

}
