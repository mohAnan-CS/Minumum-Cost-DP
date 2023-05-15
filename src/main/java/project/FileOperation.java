package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FileOperation {

    public static void main(String[] args) {

        readFile("input.txt");

    }

    public static void readFile(String path) {

        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            int numCities = Integer.parseInt(scanner.nextLine());
            String[] cities = scanner.nextLine().split(", ");
            String start = cities[0], end = cities[1];
            int count = 0 ;
            while (scanner.hasNextLine()) {

                String[] line = scanner.nextLine().split(", ");

                String cityFrom = line[0];
                System.out.println(cityFrom);
                if (count == 0){
                    checkFromCity(start, cityFrom);
                    count++;
                }

                List<Node> neighbors = addAllNeighbors(line);
                TravelCost.graph.put(cityFrom, neighbors);

            }
            scanner.close();


            for (Map.Entry<String, List<Node>> entry : TravelCost.graph.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
            System.out.println(TravelCost.graph.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static List<Node> addAllNeighbors(String[] line) {

        List<Node> neighbors = new ArrayList<>();
        for (int i = 1; i < line.length; i++) {

            String[] nodeInfoLine = line[i].split(",");
            System.out.println(line[i]);
            String city = nodeInfoLine[0].replace("[","");
            String petrolCost = nodeInfoLine[1];
            String hotelCost = nodeInfoLine[2].replace("]", "");

            neighbors.add(new Node(city, Integer.parseInt(petrolCost), Integer.parseInt(hotelCost)));

        }

        return neighbors;

    }

    private static void checkFromCity(String start, String from) {

        if (!from.equals(start))
            throw new IllegalArgumentException("Start city is not equal to from ");
    }
}