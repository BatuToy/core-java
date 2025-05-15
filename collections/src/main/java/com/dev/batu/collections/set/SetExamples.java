package com.dev.batu.collections.set;

import com.dev.batu.collections.set.model.Foo;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/*
 * @created 14/05/2025 ~~ 22:13
 * author: batu
 */

public class SetExamples {

    private static final Logger log = Logger.getLogger(SetExamples.class.getName());

    Foo[] fooArr = {new Foo("bar1"),
            new Foo("bar2"),
            new Foo("bar3"),
            new Foo("bar4"),
            new Foo("bar5")};

    Foo[] fooListArr = { new Foo("bar6"), new Foo("bar7") };


    private final Collection<Foo> fooList = new ArrayList<>(Arrays.asList(fooListArr));
    private final Set<Foo> fooSet = new HashSet<>(Arrays.asList(fooArr));

    public void setExample(){
        log.log(Level.INFO, "Initial foo set= " + fooSet.stream().map(Foo::getBar).collect(Collectors.joining(" ~~~ ")));
        addListToSet();
        log.log(Level.INFO, "After the list added in to foo set= " + fooSet.stream().map(Foo::getBar).collect(Collectors.joining(" ~~~ ")));
        addToSet();
        log.log(Level.INFO, "After element is inserted in to the foo set= " + fooSet.stream().map(Foo::getBar).collect(Collectors.joining(" ~~~ ")));
        boolean success = retainListFromSet();
        if(!success) {
            log.log(Level.WARNING, "List with elements= " + fooList.stream().map(Foo::getBar).collect(Collectors.joining(" ~~~")));
        } else {
            log.log(Level.INFO, "After retaining the list in the foo set= " + fooSet.stream().map(Foo::getBar).collect(Collectors.joining(" ~~~ ")));
        }
        removeAllTheAddedList();
        log.log(Level.INFO, "No elements left in the set after removing list from the Set too= " + fooSet.stream().map(Foo::getBar).collect(Collectors.joining(" ~~~ ")));
        addToSet();
        log.log(Level.INFO, "After element is inserted in to the foo set= " + fooSet.stream().map(Foo::getBar).collect(Collectors.joining(" ~~~ ")));
        remove();
        log.log(Level.INFO, "After removing the only element from the foo set= " + fooSet.stream().map(Foo::getBar).collect(Collectors.joining(" ~~~ ")));

    }

    private void addToSet() {
        // Add an element in to the Set !
        fooSet.add(new Foo("bar8"));
    }

    private void addListToSet() {
        // Add a collection in to the Set !
        fooSet.addAll(fooList);
    }

    private boolean retainListFromSet() {
        // @Param ? extends Collection @Output Boolean (Success/Failure)
        // Retains the elements from input list that matches with Set. @Returns boolean
        return fooSet.retainAll(fooList);
    }

    private void removeAllTheAddedList() {
        // Removing the provided elements if the element are existing in the target Set data type !
        fooSet.removeAll(fooList);
    }

    private void remove() {
        fooList.stream().findFirst().ifPresent(fooSet::remove);
    }

    private Foo[] toArray() {
        // Casting cause ClassCastException if fooSet is null !
        // @Input: T[] arr, @Output: Object []
        return (Foo[]) fooSet.toArray();
    }

    private Foo[] toArr() {
        // Take a fooSet + arr -> returns new arr
        Foo[] arr = toArray();
        return fooSet.toArray(arr);
    }

    private Set<Foo> immutableSet() {
        // Initialize an immutable Set.
        Set<Foo> immutableSet = Set.of(toArr());
        log.log(Level.INFO, fooSet.stream().map(Foo::getBar).collect(Collectors.joining(" ~~~ ")));
        return immutableSet;
    }

    public Set<Foo> fromMutableToImmutable() {
        // @input modifiable Collection @output Immutable Collection.
        return Set.copyOf(fooSet);
    }


}
