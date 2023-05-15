package project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelCost {

    static Map<String, List<Node>> graph = new HashMap<>();
    static Map<String, Integer> dp = new HashMap<>();

    public static int getMinCost(String start, String end){

        if (start.equals(end)) return 0;
        if (dp.containsKey(start)) return dp.get(start);

        int minCost = Integer.MAX_VALUE;
        for (Node neighbor : graph.get(start)) {
            int cost = neighbor.getPetrolCost() + neighbor.getHotelCost() + getMinCost(neighbor.getName(), end);
            minCost = Math.min(minCost, cost);
        }

        dp.put(start, minCost);
        return minCost;

    }
}
