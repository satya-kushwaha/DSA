package Mixed;

import java.util.HashMap;

public class LRUCache {

    class Node {
        int key, value;
        Node next, previous;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node head = new Node(-1, -1);
    private Node tail = new Node(-1, -1);
    private HashMap<Integer, Node> m = new HashMap<>();
    private int limit;

    // constructor
    LRUCache(int capacity) {
        this.limit = capacity;
        head.next = tail;
        tail.previous = head;
    }

    // add node right after head (most recent)
    private void addNode(Node newNode) {
        Node oldNext = head.next;

        head.next = newNode;
        newNode.previous = head;

        newNode.next = oldNext;
        oldNext.previous = newNode;
    }

    // remove a node from linked list
    private void deleteNode(Node oldNode) {
        Node prevNode = oldNode.previous;
        Node nextNode = oldNode.next;

        prevNode.next = nextNode;
        nextNode.previous = prevNode;
    }

    // get value by key
    public int get(int key) {
        if (!m.containsKey(key))
            return -1;

        Node node = m.get(key);
        deleteNode(node);      // move node to front
        addNode(node);
        m.put(key, head.next); // update to new front

        return node.value;
    }

    // put key-value pair
    public void put(int key, int value) {
        if (m.containsKey(key)) { // key exists -> remove old
            Node oldNode = m.get(key);
            deleteNode(oldNode);
            m.remove(key);
        }

        if (m.size() == limit) { // remove LRU
            Node lru = tail.previous;
            deleteNode(lru);
            m.remove(lru.key);
        }

        Node newNode = new Node(key, value);
        addNode(newNode);
        m.put(key, newNode);
    }

    // test
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 10);
        cache.put(2, 20);
        System.out.println(cache.get(1)); // 10
        cache.put(3, 30);                 // removes key 2
        System.out.println(cache.get(2)); // -1
        cache.put(4, 40);                 // removes key 1
        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 30
        System.out.println(cache.get(4)); // 40
    }
}

