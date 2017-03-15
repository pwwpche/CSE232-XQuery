import java.util.ArrayList;

/**
 * Created by liuche on 3/14/17.
 */
public class JoinTable {
    ArrayList< Pair<String, String>> vars;
    ArrayList<String> whereStats;
    int index;


    JoinTable(int idx){
        vars = new ArrayList<>();
        whereStats = new ArrayList<>();
        index = idx;
    }

}
