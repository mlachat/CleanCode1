package de.lv1871.cleancode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CleanQueueTest {


    private CleanQueue queue;

    @BeforeEach
    void setUp() {
        queue = new CleanQueue(3);
    }

    @Test
    void createEmptyQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void afterPush_NotEmpty() {
        queue.push(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    void afterPushAndPop_IsEmpty() {
        queue.push(1);
        queue.pop();
        assertTrue(queue.isEmpty());
    }

    @Test
    void afterTwoPushesandOnePop_isNotEmpty() {
        queue.push(1);
        queue.push(2);
        queue.pop();
        assertFalse(queue.isEmpty());
    }

    @Test
    void popReturnsValueFromPush() {
        queue.push(42);
        assertEquals(42, queue.pop());

    }

    @Test
    void popReturnesOtherValueFromPush() {
        queue.push(45);
        assertEquals(45, queue.pop());

    }

    @Test
    void twoPushesAndTwoPops_ReturnValuesInCorrectOrder() {
        queue.push(29);
        queue.push(51);
        assertEquals(29, queue.pop());
        assertEquals(51, queue.pop());
    }

    @Test
    void threePushesAndThreePops_ReturnValuesInCorrectOrder() {
        queue.push(29);
        queue.push(51);
        queue.push(99);
        assertEquals(29, queue.pop());
        assertEquals(51, queue.pop());
        assertEquals(99, queue.pop());
    }
    @Test
    void pushMoreThanQueueSize() {
        queue.push(29);
        queue.push(51);
        queue.push(51);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> queue.push(99));
    }
}
