package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileOperation {

    static String start = "";
    static String end = "";

    public static void main(String[] args) {

        readFile("input.txt");

    }

    public static void readFile(String path) {

        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            int numCities = Integer.parseInt(scanner.nextLine());
            String[] cities = scanner.nextLine().split(", ");
            Map<String, City> cityMap = new HashMap<>();

            start = cities[0];
            end = cities[1];
            int count = 0 ;

            while (scanner.hasNextLine()) {

                String[] line = scanner.nextLine().split(", ");
                String cityFrom = line[0];

                if (count == 0){
                    checkFromCity(start, cityFrom);
                    count++;
                }

                List<Edge> neighbors = addAllNeighbors(line);

                City city = new City(cityFrom);
                city.setEdges(neighbors);
                cityMap.put(cityFrom, city);

            }
            scanner.close();

            for (Map.Entry<String, City> entry : cityMap.entrySet()) {
                System.out.print("City : " + entry.getKey() + " -> ");
                for (int i = 0 ; i < entry.getValue().getEdges().size() ; i++){
                    System.out.print(entry.getValue().getEdges().get(i) + " ");
                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static List<Edge> addAllNeighbors(String[] line) {

        List<Edge> edges = new ArrayList<>();
        for (int i = 1; i < line.length; i++) {

            String[] nodeInfoLine = line[i].split(",");
            String city = nodeInfoLine[0].replace("[","");
            String petrolCost = nodeInfoLine[1];
            String hotelCost = nodeInfoLine[2].replace("]", "");
            edges.add(new Edge(city, Integer.parseInt(petrolCost), Integer.parseInt(hotelCost)));

        }

        return edges;

    }

    private static void checkFromCity(String start, String from) {

        if (!from.equals(start))
            throw new IllegalArgumentException("Start city is not equal to from ");
    }
}