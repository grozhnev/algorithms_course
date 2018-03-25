import java.util.List;

public interface Graph extends Iterable<Vertex> {

    List<Vertex> graph = null;

    void pushVertex();
    void popVertex();

    void pushEdge();
    void popEdge();

}
