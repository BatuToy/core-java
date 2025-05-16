package com.dev.batu.collections.set.strategy.pattern;

import com.dev.batu.collections.set.model.Foo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

/*
 * @created 15/05/2025 ~~ 19:42
 * author: batu
 */
public class ConcreteHashSet<E> implements DataStrategy<E> {

    @Override
    public Set<E> createData(Collection<E> c) {
        return new HashSet<>(c);
    }

}
