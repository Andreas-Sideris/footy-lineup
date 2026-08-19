import teamdata.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FormationBuilder builder = new FormationBuilder();

        List<Integer> nums = new ArrayList<>();
        nums.add(31);
        nums.add(3);
        nums.add(5);
        nums.add(6);
        nums.add(8);
        nums.add(9);
        nums.add(11);
        nums.add(14);
        nums.add(15);
        nums.add(16);
        nums.add(20);

        builder.readLineupNums(nums);
        List<Player> lineup = builder.getLineup();
        Player current;
        for (int i = 0; i < lineup.size(); i++) {
            current = lineup.get(i);
            System.out.println(current.getName() + " " + current.getPos() + " #" + current.getNum());
        }
    }
}