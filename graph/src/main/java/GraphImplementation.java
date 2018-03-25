import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GraphImplementation implements Graph {

    List<Vertex> listOfVertex = new ArrayList<Vertex>();

    public void pushVertex() {

    }

    public void popVertex() {

    }

    public void pushEdge() {

    }

    public void popEdge() {

    }

    public Iterator<Vertex> iterator() {
        return null;
    }


    public static void main(String[] args) {
        GraphImplementation graph = new GraphImplementation();

        graph.listOfVertex.add(new VertexImplementation());
    }
}
