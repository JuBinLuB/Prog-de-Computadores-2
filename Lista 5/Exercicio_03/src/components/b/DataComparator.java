package components.b;

import java.util.Comparator;

public class DataComparator implements Comparator<Empregados> {

    @Override
    public int compare(Empregados e1, Empregados e2) {
        return e1.getData().compareTo(e2.getData());
    }
}
