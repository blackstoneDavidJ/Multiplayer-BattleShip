import javax.swing.*;
import java.awt.*;

public class BattleShip extends JFrame
{

    public BattleShip() throws HeadlessException
    {
    }

    public static void main(String[] args) {
        Player p1 = new Player("David");
        p1.printShips();

        Coordinates[] coords = { new Coordinates(1,1), new Coordinates(2,2) };
        Ship ship = new Ship(coords, "SHIP TEST");
        p1.placeShip(ship);
        p1.printShips();

        Coordinates[] coords2 = { new Coordinates(4,5), new Coordinates(1,9) };
        Ship ship2 = new Ship(coords2, "SHIP TEST 2");
        p1.placeShip(ship2);
        p1.printShips();
    }
}
