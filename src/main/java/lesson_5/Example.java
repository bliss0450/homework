/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_5;

import java.util.HashSet;
import java.util.Set;

/**
 * "7. In the Solution class, correct a couple of equals / hashCode methods in
 * accordance with the rules for implementing these methods (check details with
 * your favorite search engine). Both the first and last strings should
 * participate in the comparison using the equals method and the hashcode
 * calculation. public class Example { private final String first, last;
 *
 * public Example(String first, String last) { this.first = first; this.last =
 * last; }
 *
 * @Override public boolean equals(Object o) { return false; }
 *
 * @Override public int hashCode() { return 0; }
 *
 * public static void main(String[] args) { Set<Example> s = new HashSet<>();
 * s.add(new Example(""Donald"", ""Duck"")); System.out.println(s.contains(new
 * Example(""Donald"", ""Duck""))); } } "
 */
public class Example {

    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Example)) {
            return false;
        }

        Example ex = (Example) o;

        return ex.first.equals(first)
                && ex.last.equals(last);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + first.hashCode();
        hash = 31 * hash + last.hashCode();
        return hash;
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }
}
