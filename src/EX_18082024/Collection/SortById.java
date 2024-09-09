package EX_18082024.Collection;

import java.util.Comparator;

public class SortById implements Comparator <Employee> {

    @Override
    public int compare(Employee s1, Employee s2) {
        return Integer.compare(s1.getId(),s2.getId());
    }

}

class SortByName implements Comparator <Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }
}
