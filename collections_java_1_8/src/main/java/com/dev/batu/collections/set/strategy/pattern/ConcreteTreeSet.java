package com.dev.batu.collections.set.strategy.pattern;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/*
 * @created 15/05/2025 ~~ 19:41
 * author: batu
 */
public class ConcreteTreeSet<E> implements DataStrategy<E> {

    @Override
    public Set<E> createData(Collection<E> c) {
        return new TreeSet<>(c);
    }
}
