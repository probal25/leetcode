package easy.design_hash_set;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    static class Node {
        int key;
        Node next;
        Node() {}
        Node(int key) {
            this.key = key;

        }
        Node(int key, Node next) {
            this.key = key;
            this.next = next;
        }
    }

    private Node[] table;
    public static final int size = 16;

    public MyHashSet() {
        this(size);
    }
    private MyHashSet(int size) {
        this.table = new Node[size];
    }

    public void add(int key) {
        if (key == -1) return;
        Node node = new Node(key);
        int index = index(key);
        if (table[index] == null) {
            table[index] = node;
        } else {
            Node current = table[index];
            Node prev = null;
            while (current != null) {
                if (current.key == node.key) {
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = node;
        }
    }

    public boolean contains(int key) {
        int index = index(key);
        if (table[index] == null) return false;
        Node current = table[index];
        while (current != null) {
            if (current.key == key) return true;
            current = current.next;
        }
        return false;
    }

    public void remove(int key) {
        if (key == -1) return;
        int index = index(key);
        if (table[index] == null) return;

        Node current = table[index];
        Node prev = null;
        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    table[index] = current.next;
                    return;
                }
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    private int index(int key) {
        return Math.abs(key % 16);
    }
}
