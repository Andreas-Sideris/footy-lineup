package teamdata;

import java.util.*;

public class FormationBuilder {

    private SquadData spursSquad;
    private List<Player> numOrderLineup;
    private Player[] correctLineup;

    public FormationBuilder() {
        spursSquad = new SquadData();
        correctLineup = new Player[11];
    }

    public List<Player> readLineupNums(List<Integer> lineupIn) {
        numOrderLineup = new ArrayList<Player>();
        Player current;
        Integer num;

        for (int i = 0; i < lineupIn.size(); i++) {
            num = lineupIn.get(i);
            current = spursSquad.getPlayer(num);
            numOrderLineup.add(current);
        }

        return numOrderLineup;
    }

    public Player[] buildFormation(List<Player> lineupIn) {
        Player current;
        for (int i = 0; i < lineupIn.size(); i++) {
            current = lineupIn.get(i);
            switch (current.getPos()) {
                case GK -> {
                    correctLineup[0] = current;
                }
                case LB -> {
                    correctLineup[1] = current;
                }
                case CB -> {
                    if (correctLineup[2] == null) {
                        correctLineup[2] = current;
                    } else {
                        correctLineup[3] = current;
                    }
                }
                case RB -> {
                    correctLineup[4] = current;
                }
                case CAM -> {
                    correctLineup[8] = current;
                }
                case CDM -> {
                    if (current.getNum() != 14) {
                        if (correctLineup[5] == null) {
                            correctLineup[5] = current;
                        } else {
                            correctLineup[6] = current;
                        }
                    }
                }
                case ST -> {
                    correctLineup[10] = current;
                }
                case LW -> {
                    correctLineup[7] = current;
                }
                case RW -> {
                    correctLineup[9] = current;
                }
            }
        }
        Player gray = spursSquad.getPlayer(14);
        if (lineupIn.contains(gray)) {
            if (correctLineup[4] == null) {
                correctLineup[4] = gray;
            }
            else {
                if (correctLineup[5] == null) {
                    correctLineup[5] = gray;
                } else {
                    correctLineup[6] = gray;
                }
            }
        }
        for (int i = 0; i < lineupIn.size(); i++) {
            current = lineupIn.get(i);
            if (current.getPos() == Position.CM) {
                if (correctLineup[8] == null) {
                    correctLineup[8] = current;
                }
                else if (correctLineup[5] == null) {
                    correctLineup[5] = current;
                }
                else {
                    correctLineup[6] = current;
                }
            }
        }

        return correctLineup;
    }

    public List<Player> getNumOrderLineup() {
        return numOrderLineup;
    }
}
