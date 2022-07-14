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
    }

    public String getPlayerId() {
        return playerId;
    }
}
