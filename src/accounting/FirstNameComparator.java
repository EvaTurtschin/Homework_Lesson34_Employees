package accounting;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Employee> {

    public int compare (Employee n1, Employee n2){
        if (n1.getFirstName().equals(n2.getFirstName())){
            return Integer.compare(n1.getiD(), n2.getiD());
        }
        else
        return n1.getFirstName().compareTo(n2.getFirstName());
    }
}
