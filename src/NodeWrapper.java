/**
 * Created by liuche on 2/28/17.
 */
import org.w3c.dom.*;

import java.util.ArrayList;

public class NodeWrapper{
    private ArrayList<Node> n;

    NodeWrapper(){
        n = new ArrayList<>();
    }

    ArrayList<Node> getNodes(){
        return n;
    }
    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (!(o instanceof NodeWrapper)) {
            return false;
        }
        NodeWrapper other = (NodeWrapper)o;
        if(n.size() != other.getNodes().size()){
            return false;
        }

        for(int i = 0 , size = other.getNodes().size() ; i < size ; i++){
            if(!n.get(i).getFirstChild().isEqualNode(other.getNodes().get(i).getFirstChild())){
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode(){
        String totStr = "";
        for(Node node : n){
            totStr += node.getFirstChild().getTextContent();
        }
        return totStr.hashCode();
    }

}
