/**
 * Created by liuche on 2/28/17.
 */
import org.w3c.dom.*;

public class NodeWrapper{
    private Node n;

    NodeWrapper(Node node){
        n = node;
    }

    public Node getNode(){
        return n;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (!(o instanceof NodeWrapper)) {
            return false;
        }

        return n.getTextContent().hashCode() == ((NodeWrapper) o).getNode().getTextContent().hashCode();
    }

    @Override
    public int hashCode(){
        return n.getTextContent().hashCode();
    }

}
