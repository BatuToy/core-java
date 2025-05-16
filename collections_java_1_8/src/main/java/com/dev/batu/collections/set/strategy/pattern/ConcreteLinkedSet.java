package com.dev.batu.collections.set.strategy.pattern;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * @created 15/05/2025 ~~ 19:49
 * author: batu
 */
public class ConcreteLinkedSet<E> implements DataStrategy<E> {

    @Override
    public Set<E> createData(Collection<E> c) {
        return new LinkedHashSet<>(c);
    }

}
