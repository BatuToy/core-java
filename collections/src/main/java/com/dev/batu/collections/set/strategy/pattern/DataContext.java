package com.dev.batu.collections.set.strategy.pattern;

import java.util.Collection;
import java.util.Collections;

/*
 * @created 15/05/2025 ~~ 19:50
 * author: batu
 */
public class DataContext<E> {

    private final DataStrategy<E> dataStrategy;

    public DataContext(DataStrategy<E> dataStrategy) {
        this.dataStrategy = dataStrategy;
    }

    public Collection<E> createData(Collection<E> c){
        if( dataStrategy instanceof ConcreteHashSet){
            return dataStrategy.createData(c);
        } else if ( dataStrategy instanceof ConcreteTreeSet) {
            return dataStrategy.createData(c);
        } else if ( dataStrategy instanceof ConcreteLinkedSet) {
            return dataStrategy.createData(c);
        }
        throw new UnsupportedOperationException("Invalid operation");
    }
}
