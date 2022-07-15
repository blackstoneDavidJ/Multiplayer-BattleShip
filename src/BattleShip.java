import javax.swing.*;
import java.awt.*;

public class BattleShip extends JFrame
{
    private static final int WINDOW_DIM = 600;
    private final String playerId;
    private JFrame mainFrame;
    public BattleShip(String playerId) throws HeadlessException
    {
        initializeWindow();

        this.playerId = playerId;
        startGame();
    }
    private void initializeWindow()
    {
        JFrame mainFrame = new JFrame("BattleShip by David Blackstone");
        mainFrame.setSize(WINDOW_DIM, WINDOW_DIM);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }
    private void startGame() {
        Player p1 = new Player(playerId);
        p1.pickShipPlacements();
        p1.printPlayerBoard();
    }
}