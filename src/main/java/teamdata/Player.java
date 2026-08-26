package teamdata;

public class Player {
    private final String name;
    private final Position position;
    private final Position secondaryPosition;
    private final int number;

    public Player(String name, Position position, Position secondaryPosition, int number) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.secondaryPosition = secondaryPosition;
    }

    public Player(String name, Position position, int number) {
        this(name, position, null, number); // delegates to the other constructor
    }

    public String getName() {
        return name;
    }

    public Position getPos() {
        return position;
    }

    public Position getSecondPos() { return secondaryPosition; }

    public int getNum() {
        return number;
    }
}
