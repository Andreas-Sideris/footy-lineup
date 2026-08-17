package teamdata;

public class Player {
    private String name;
    private Position position;
    private int number;

    public Player (String name, Position pos, int num) {
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
