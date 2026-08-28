package teamdata;

import java.util.*;

public class FormationBuilder {

    private SquadData spursSquad;
    private Player[] correctLineup;

    public FormationBuilder() {
        spursSquad = new SquadData();
        correctLineup = new Player[11];
    }

    public List<Player> readLineupNums(List<Integer> lineupIn) {
        List<Player> numOrderLineup = new ArrayList<Player>();
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
        Set<Player> remainingPlayers = new HashSet<>(lineupIn);

        Player current;


        for (int i = 0; i < lineupIn.size(); i++) {
            current = lineupIn.get(i);
            switch (current.getPos()) {
                case GK -> {
                    correctLineup[0] = current;
                    remainingPlayers.remove(current);
                }
                case LB -> {
                    correctLineup[1] = current;
                    remainingPlayers.remove(current);
                }
                case RB -> {
                    correctLineup[4] = current;
                    remainingPlayers.remove(current);
                }
                case CAM -> {
                    correctLineup[6] = current;
                    remainingPlayers.remove(current);
                }
                case ST -> {
                    correctLineup[9] = current;
                    remainingPlayers.remove(current);
                }
                case LW -> {
                    correctLineup[8] = current;
                    remainingPlayers.remove(current);
                }
                case RW -> {
                    correctLineup[10] = current;
                    remainingPlayers.remove(current);
                }
            }
        }

        fillEmptySecondPos(4, remainingPlayers, Position.RB);

        fillEmptySecondPos(1, remainingPlayers, Position.LB);

        fillEmptyMainPos(2, remainingPlayers, Position.CB);

        fillEmptyMainPos(3, remainingPlayers, Position.CB);

        fillEmptyMainPos(5, remainingPlayers, Position.CDM);

        fillEmptyMainPos(7, remainingPlayers, Position.CDM);

        fillEmptySecondPos(6, remainingPlayers, Position.CAM);

        fillEmptyMainPos(5, remainingPlayers, Position.CM);

        fillEmptyMainPos(7, remainingPlayers, Position.CM);


        return correctLineup;
    }

    private void fillEmptySecondPos(int index, Set<Player> remainingPlayers, Position pos) {
        if (correctLineup[index] == null) {
            for (Player p : remainingPlayers) {
                if (p.getSecondPos() == pos) {
                    correctLineup[index] = p;
                    remainingPlayers.remove(p);
                    break;
                }
            }
        }
    }

    private void fillEmptyMainPos(int index, Set<Player> remainingPlayers, Position pos) {
        if (correctLineup[index] == null) {
            for (Player p : remainingPlayers) {
                if (p.getPos() == pos) {
                    correctLineup[index] = p;
                    remainingPlayers.remove(p);
                    break;
                }
            }
        }
    }
}
