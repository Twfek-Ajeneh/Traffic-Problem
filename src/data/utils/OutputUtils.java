package data.utils;

import domain.models.Player;

import java.util.ArrayList;
import java.util.Collections;

public class OutputUtils {
    public static void printPath(Player player) {
        ArrayList<Player> path = new ArrayList<>();
        path.add(player);
        while (player.getParent() != null) {
            path.add(player.getParent());
            player = player.getParent();
        }
        Collections.reverse(path);
        for (Player playerTemp : path) {
            System.out.println("Station: " + playerTemp.getStation().getStationName());
            System.out.println("Time: " + playerTemp.getTime());
            System.out.println("Health spent: " + playerTemp.getTakenHealth());
            System.out.println("Money spent: " + playerTemp.getTakenMoney());
            if(playerTemp.getPreviousTransmissionWay() != null) {
                System.out.println("Transmission Way: " + playerTemp.getPreviousTransmissionWay().getMessage());
            }
            System.out.println("===================================================");
        }
    }
}
