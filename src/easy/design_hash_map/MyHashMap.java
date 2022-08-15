package easy.design_hash_map;


public class MyHashMap {
    static class Node {
        int key;
        int value;
        Node next;
        Node() {}
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
        Node(int key, int value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private Node[] table;
    public static final int size = 16;

    public MyHashMap() {
        this(size);
    }
    private MyHashMap(int size) {
        this.table = new Node[size];
    }

    public void put(int key, int value) {
        if (key == -1) return;
        Node node = new Node(key, value);
        int index = index(key);
        if (table[index] == null) {
            table[index] = node;
        } else {
            Node current = table[index];
            Node prev = null;
            while (current != null) {
                if (current.key == node.key) {
                    current.value = node.value;
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = node;
        }
    }

    public int get(int key) {
        int index = index(key);
        if (table[index] == null) return -1;
        Node current = table[index];
        while (current != null) {
            if (current.key == key) return current.value;
            current = current.next;
        }
        return -1;
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
