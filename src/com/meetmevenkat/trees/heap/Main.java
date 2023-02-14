package com.meetmevenkat.trees.heap;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap heap = new Heap(9);

        heap.insert(43);
        heap.insert(58);
        heap.insert(49);
        heap.insert(67);
        heap.insert(55);
        heap.insert(46);
        heap.insert(53);
        heap.insert(62);
        heap.insert(54);

        heap.printHeap();

        heap.delete(3);

        heap.printHeap();
    }
}
