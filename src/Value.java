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

    public Element asElement() { return (Element)value; }

    public List<Element> asListElem() {
        if(isListElem()){
            return (List<Element>)value;
        }else if(isListElem()){
            List<Element> result = new ArrayList<>();
            result.add((Element)value);
            return result;
        }else{
            List<Element> emptyList = new ArrayList<>();
            return emptyList;
        }

    }

    public Boolean asBoolean() { return (Boolean)value; }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isString() { return value instanceof String; }

    public boolean isBoolean() {
        return value instanceof Boolean;
    }

    public boolean isListElem() { return value instanceof List; }

    public boolean isElement() { return value instanceof Element; }

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

        if(isString() && that.isString()){
            return asString().equals(that.asString());
        }

        if(isElement() && that.isElement()){
            return asElement().equals(that.asElement());
        }

        if(isListElem() && that.isListElem()){
            if(this.asListElem().size() != that.asListElem().size()){
                return false;
            }
            List<Element> thisList = asListElem();
            List<Element> thatList = that.asListElem();
            for(int i = 0 ; i < asListElem().size() ; i++){
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

        if(isString()){
            return asString().equals(that.asString());
        }

        if(isElement()){
            return asElement().equals(that.asElement());
        }

        if(isListElem()){
            if(this.asListElem().size() != that.asListElem().size()){
                return false;
            }
            List<Element> thisList = asListElem();
            List<Element> thatList = that.asListElem();
            for(int i = 0 ; i < asListElem().size() ; i++){
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