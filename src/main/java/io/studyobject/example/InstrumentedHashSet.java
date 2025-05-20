package io.studyobject.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0;

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c) {
            if (add(e)) {
                modified = true;
            }
        }
        return modified;
    }

    public static void main(String[] args) {
        InstrumentedHashSet<String> languages = new InstrumentedHashSet<>();
        languages.addAll(Arrays.asList("Java", "Ruby", "Scala"));
        System.out.println("languages.size() = " + languages.size());
    }
}
