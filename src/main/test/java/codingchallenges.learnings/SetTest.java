package main.test.java.codingchallenges.learnings;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SetTest {

    private Set empty;
    private Set one;
    private Set many;


    @Before
    public void setUp() throws Exception {
        empty = new Set();
        one = new Set();
        many = new Set();

        one.add("a");

        many.add("a");
        many.add("b");
        many.add("c");
    }

    @Test
    public void testEmpty() {
        assertTrue(empty.isEmpty());
        assertFalse(one.isEmpty());
        assertFalse(many.isEmpty());
    }

    @Test
    public void testContains() {
        assertFalse(empty.contains("a"));

        assertTrue(one.contains("a"));
        assertFalse(one.contains("b"));

        assertTrue(many.contains("a"));
        assertTrue(many.contains("b"));
        assertTrue(many.contains("c"));
    }

    @Test
    public void testRemove() {
        Set set = new Set();
        set.add("a");
        set.add("b");

        set.remove("a");

        assertFalse(set.contains("a"));
        assertEquals(set.size(), 1);

    }
}