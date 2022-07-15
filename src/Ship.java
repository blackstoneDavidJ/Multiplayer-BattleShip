//represents one ship for the player
public class Ship {
    private Coordinates[] shipCoords;
    private final int id;
    public Ship(Coordinates[] shipCoords, int id) {
        this.shipCoords = shipCoords;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Coordinates[] getCoordinates() {
        return shipCoords;
    }

    public void showCoordinates()
    {
        for (Coordinates cords : shipCoords) {
            System.out.println("[X: " +cords.getX() + " Y: " +cords.getY() +"]" +'\n');
        }
    }
    public int showId()
    {
        return id;
    }
}