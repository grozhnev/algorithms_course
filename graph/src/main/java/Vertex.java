import java.util.List;

public interface Vertex {
    Integer number = null;
    String name = null;

    List<Edge> edges = null;

    List<Edge> getListOfEdges();

    void setName();
    String getName();

    void setNumber();
    Integer getNumber();

    void pushEdge();
    Edge popEdge();
}
