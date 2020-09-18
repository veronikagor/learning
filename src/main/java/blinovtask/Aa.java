package blinovtask;

import java.util.Objects;

public class Aa {
    int a;
    Aa(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aa aa = (Aa) o;
        return a == aa.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
