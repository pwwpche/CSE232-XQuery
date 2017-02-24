import org.w3c.dom.*;
import java.util.*;

/**
 * Created by liuche on 1/12/17.
 */
public class Value {

    public static Value VOID = new Value(new Object());

    final Object value;

    public Value(Object value) {
        this.value = value;
    }


    public List<Node> asListNode(){
        if(isListNode()){
            return (List<Node>) value;
        }else if(isNode()){
            List<Node> result = new ArrayList<>();
            result.add((Node)value);
            return result;
        }else{
            List<Node> emptyList = new ArrayList<>();
            return emptyList;
        }


    }

    public Boolean asBoolean() { return (Boolean)value; }

    public boolean isBoolean() {
        return value instanceof Boolean;
    }

    public boolean isListNode() { return value instanceof List; }

    public boolean isNode() {return value instanceof Node;}

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    public boolean compareValue(Value that){
        if(isBoolean()&& that.isBoolean()){
            return asBoolean().equals(that.asBoolean());
        }


        if(isListNode() && that.isListNode()){
            if(this.asListNode().size() != that.asListNode().size()){
                return false;
            }
            List<Node> thisList = asListNode();
            List<Node> thatList = that.asListNode();
            for(int i = 0 ; i < asListNode().size() ; i++){
                if(! thisList.get(i).equals(thatList.get(i)) ){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        if(isBoolean()){
            return asBoolean().equals(that.asBoolean());
        }


        if(isListNode()){
            if(this.asListNode().size() != that.asListNode().size()){
                return false;
            }
            List<Node> thisList = asListNode();
            List<Node> thatList = that.asListNode();
            for(int i = 0 ; i < asListNode().size() ; i++){
                if(! thisList.get(i).equals(thatList.get(i)) ){
                    return false;
                }
            }
            return true;
        }

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}