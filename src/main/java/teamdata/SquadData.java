package teamdata;

import java.util.*;

public class SquadData {

    private final Map<Integer, Player> squad;

    public SquadData() {
        squad = new HashMap<>();

        // Goalkeepers
        squad.put(39, new Player("Martin Dubravka", Position.GK, 39));
        squad.put(31, new Player("Antonin Kinsky", Position.GK, 31));
        squad.put(40, new Player("Brandon Austin", Position.GK, 40));

        // Defenders
        squad.put(4, new Player("Kevin Danso", Position.CB, 4));
        squad.put(13, new Player("Destiny Udogie", Position.LB, 13));
        squad.put(23, new Player("Pedro Porro", Position.RB, 23));
        squad.put(33, new Player("Ben Davies", Position.CB, Position.LB,33));
        squad.put(37, new Player("Micky van de Ven", Position.CB, Position.LB, 37));
        squad.put(6, new Player("Jean Paul van Hecke", Position.CB, 6));
        squad.put(5, new Player("Marcos Senesi", Position.CB, 5));
        squad.put(3, new Player("Andrew Robertson", Position.LB, 3));

        // Midfielders
        squad.put(14, new Player("Archie Gray", Position.CDM, Position.RB, 14));
        squad.put(16, new Player("Sandro Tonali", Position.CDM, 16));
        squad.put(7, new Player("Xavi Simons", Position.CAM, 7));
        squad.put(10, new Player("James Maddison", Position.CAM, 10));
        squad.put(15, new Player("Lucas Bergvall", Position.CM, Position.CAM, 15));
        squad.put(21, new Player("Dejan Kulusevski", Position.CAM, 21));
        squad.put(29, new Player("Pape Matar Sarr", Position.CM, 29));
        squad.put(30, new Player("Rodrigo Bentancur", Position.CDM, 30));
        squad.put(18, new Player("Mateus Fernandes", Position.CDM, 18));
        squad.put(8, new Player("Conor Gallagher", Position.CM, Position.CAM, 8));

        // Forwards
        squad.put(9, new Player("Richarlison", Position.ST, Position.LW, 9));
        squad.put(19, new Player("Dominic Solanke", Position.ST, 19));
        squad.put(20, new Player("Mohammed Kudus", Position.RW, 20));
        squad.put(28, new Player("Wilson Odobert", Position.LW, 28));
        squad.put(11, new Player("Mathys Tel", Position.LW, 11));
        squad.put(44, new Player("Dane Scarlett", Position.ST, 44));
    }

    public Player getPlayer(int num) {
        return squad.get(num);
    }
}
