package comments.document_implementation_decisions;

import java.util.Objects;

public class Supply implements Comparable<Supply> {

    private final String name;

    public Supply(String name) {
        this.name = Objects.requireNonNull(name);
    }

    @Override
    public int compareTo(Supply o) {
        return this.name.compareTo(o.name);
    }
}
