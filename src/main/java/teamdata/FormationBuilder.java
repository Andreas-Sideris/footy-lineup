package teamdata;

import java.util.*;

public class FormationBuilder {

    private SquadData spursSquad;
    private List<Player> lineupIn;
    private List<Player> correctLineup;

    public FormationBuilder() {
        spursSquad = new SquadData();
    }

    public List<Player> readLineupNums(List<Integer> lineupIn) {
        this.lineupIn = new ArrayList<Player>();
        Player current;
        Integer num;

        for (int i = 0; i < lineupIn.size(); i++) {
            num = lineupIn.get(i);
            current = spursSquad.getPlayer(num);
            this.lineupIn.add(current);
        }

        return this.lineupIn;
    }

    public void buildFormation(String form) {
        if (form.equals("4231")) {

        }
        else {
            System.out.println("Invalid Formation Inputted");
        }
    }

    public List<Player> getLineupIn() {
        return lineupIn;
    }
}
