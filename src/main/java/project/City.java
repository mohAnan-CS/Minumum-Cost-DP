package project;

import java.util.ArrayList;
import java.util.List;

public class City {

    private String name;
    private List<Edge> edges;

    City(String name) {
        this.name = name;
        edges = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", edges=" + edges +
                '}';
    }
}
