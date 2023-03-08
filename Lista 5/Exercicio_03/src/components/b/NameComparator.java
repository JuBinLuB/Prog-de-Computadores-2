package components.b;

import java.util.Comparator;

public class NameComparator implements Comparator<Empregados> {

    @Override
    public int compare(Empregados e1, Empregados e2) {
        return e1.getNome().compareTo(e2.getNome());
    }
}
