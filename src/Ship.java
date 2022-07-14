//represents one ship for the player
public class Ship {
    private Coordinates[] shipCoords;
    private final String id;
    public Ship(Coordinates[] shipCoords, String id) {
        this.shipCoords = shipCoords;
        this.id = id;
    }

    public String getId() {
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
    public String showId()
    {
        return id;
    }
}