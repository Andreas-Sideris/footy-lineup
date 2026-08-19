package teamdata;

import java.util.*;

public class FormationBuilder {

    private SquadData spursSquad;
    private List<Player> lineup;

    public FormationBuilder() {
        spursSquad = new SquadData();
    }

    public void readLineupNums(List<Integer> lineupIn) {
        lineup = new ArrayList<Player>();
        Player current;
        Integer num;

        for (int i = 0; i < lineupIn.size(); i++) {
            num = lineupIn.get(i);
            current = spursSquad.getPlayer(num);
            lineup.add(current);
        }
    }

    public List<Player> getLineup() {
        return lineup;
    }
}
