package com.dev.batu.collections.set;

import com.dev.batu.collections.set.model.Foo;
import com.dev.batu.collections.set.strategy.pattern.DataContext;
import com.dev.batu.collections.set.strategy.pattern.DataStrategy;
import com.sun.source.tree.Tree;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
 * @created 15/05/2025 ~~ 19:33
 * author: batu
 */
public class TreeSetExamples {

    private final DataContext context;
    private final DataStrategy<Foo> dataStrategy;

    public TreeSetExamples(DataContext context, DataStrategy<Foo> dataStrategy) {
        this.context = context;
        this.dataStrategy = dataStrategy;
    }

    public TreeSet<Foo> data(){
        return new TreeSet<>(context.createData(Set.of(new Foo("bar1"),
                new Foo("bar2"),
                new Foo("bar3"),
                new Foo("bar4"),
                new Foo("bar5")), dataStrategy));
    }

    public void


}
