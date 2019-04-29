package de.lv1871.cleancode;

public class CleanQueue {

    private int upperBound = 0;
    private int lowerBound = 0;
    private int elements[];

    public CleanQueue(int initialQueueSize) {
        elements = new int[initialQueueSize];
    }

    public boolean isEmpty() {
        return upperBound -lowerBound == 0;
    }

    public void push(int i) {
        elements[upperBound++] = i;
    }

    public int pop() {
        return elements[lowerBound++];
    }

}
