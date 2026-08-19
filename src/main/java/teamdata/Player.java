package teamdata;

public class Player {
    private final String name;
    private final Position position;
    private final int number;

    public Player(String name, Position pos, int num) {
        this.name = name;
        this.position = pos;
        this.number = num;
    }

    public String getName() {
        return name;
    }

    public Position getPos() {
        return position;
    }

    public int getNum() {
        return number;
    }
}
