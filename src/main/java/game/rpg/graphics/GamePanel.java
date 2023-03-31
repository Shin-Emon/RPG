package game.rpg.graphics;

import game.rpg.logics.KeyboardInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel() {

        addKeyListener(new KeyboardInputs());

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(200, 200, 200, 50);
    }

}
