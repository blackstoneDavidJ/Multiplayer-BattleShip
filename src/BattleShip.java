import javax.swing.*;
import java.awt.*;

public class BattleShip extends JFrame
{

    public BattleShip() throws HeadlessException
    {
    }

    public static void main(String[] args) {
        Player p1 = new Player("David");
        p1.pickShipPlacements();
        p1.printPlayerBoard();
    }
}