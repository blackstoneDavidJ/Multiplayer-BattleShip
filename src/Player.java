import org.junit.jupiter.api.ClassOrderer;

import java.util.Scanner;

public class Player
{
    private static final int SHIP_NUM = 5;
    private static final int BATTLE_DIM = 10;
    private final String playerId;
    private Ship[] ships;

    private int[][] battleGrid;
    public Player(String playerId)
    {
        this.playerId = playerId;
        ships = new Ship[SHIP_NUM];
        battleGrid = new int[BATTLE_DIM][BATTLE_DIM];
    }

    public void printShips()
    {
        for (Ship ship : ships) {
            if(ship != null) {
                System.out.println(ship.showId());
                ship.showCoordinates();
            }
            else {
                System.out.println("null");
            }
        }
    }

    public void printPlayerBoard()
    {
        System.out.println(playerId);
        for (int i = 0; i < BATTLE_DIM; i++) {
            for (int j = 0; j < BATTLE_DIM; j++) {
                System.out.print(battleGrid[i][j]);
            }
            System.out.println();
        }
    }
    public void placeShip(Ship ship)
    {
        int index = 0;
        boolean notPlaced = true;
        while(notPlaced && (index < SHIP_NUM))
        {
            if(ships[index] != null)
            {
                index++;
            }

            else
            {
                ships[index] = ship;
                notPlaced = false;
            }
        }

        addShipToGrid(ship);
    }
    public void pickShipPlacements()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Choose where to place your battleships--");
        int[] ships = new int[] {2,3,3,4,5};
        Coordinates[] shipCoords = new Coordinates[0];
        int index = 0;
        for (int ship : ships) {
            System.out.println("Ship #" +ship);
            while (index < ship) {
                shipCoords = new Coordinates[ship];
                System.out.print("x: ");
                int x = scanner.nextInt();
                System.out.print("y: ");
                int y = scanner.nextInt();
                if (!isValidPlacement(x, y)) {
                    System.out.println("Placement is not valid!");
                } else {
                    System.out.println("Valid Placement!");
                    Coordinates coords = new Coordinates(x, y);
                    shipCoords[index] = coords;
                    index++;
                }
            }
            placeShip(new Ship(shipCoords, ship));
        }
    }

    private boolean isValidPlacement(int x, int y)
    {
        return true;
    }

    private void addShipToGrid(Ship ship)
    {
        Coordinates[] coords = ship.getCoordinates();
        for(Coordinates c : coords)
        {
            battleGrid[c.getX()][c.getY()] = ship.getId();
        }
    }

    public String getPlayerId() {
        return playerId;
    }
}
