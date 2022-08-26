package medium.design_browser;

class BrowserNode {
    String name;
    BrowserNode previous;
    BrowserNode next;

    public BrowserNode(String name) {
        this.name = name;
    }
}

public class BrowserHistory {

    BrowserNode head;

    public BrowserHistory(String homepage) {
        head = new BrowserNode(homepage);
    }

    public void visit(String url) {
        BrowserNode currentNode = new BrowserNode(url);

        currentNode.previous = head;
        head.next = currentNode;
        head = currentNode;
    }

    public String back(int steps) {
        while (steps != 0 && head != null) {
            if (head.previous == null) return head.name;
            steps--;
            head = head.previous;
        }
        return head.name;
    }

    public String forward(int steps) {
        while (steps != 0 && head != null) {
            if (head.next == null) return head.name;
            steps--;
            head = head.next;
        }

        return head.name;
    }
}

