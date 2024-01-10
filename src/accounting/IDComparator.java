package accounting;

import java.util.Comparator;

public class IDComparator implements Comparator<Employee> {

    public int compare(Employee id1, Employee id2){
        return Integer.compare(id1.getiD(), id2.getiD());
    }
}
