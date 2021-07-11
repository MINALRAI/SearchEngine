package searchEngine;

class Node<UrlData> {
    UrlData data;
    Node<UrlData> left, right;
}

class BST {

    // BST() {
    // createNode(new UrlData("https://github.com/KejariwalAyush", "Ayush
    // Kejariwal", 0));
    // }

    public static Node<UrlData> createNode(UrlData k) {
        Node<UrlData> n = new Node<UrlData>();
        n.data = k;
        n.left = n.right = null;
        return n;
    }

    public static Node<UrlData> insert(Node<UrlData> node, UrlData val) {
        if (node==null || node.data == null) {
            return (createNode(val));
        }

        if (val.points < node.data.points) {
            node.left = insert(node.left, val);
        } else if (val.points > node.data.points) {
            node.right = insert(node.right, val);
        }
        return node;
    }

}