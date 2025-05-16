package com.dev.batu.collections.set.strategy.pattern;

import java.util.Collection;
import java.util.Set;

/*
 * @created 15/05/2025 ~~ 19:39
 * author: batu
 */
public interface DataStrategy<E> {

    Collection<E> createData(Collection<E> c);
}
