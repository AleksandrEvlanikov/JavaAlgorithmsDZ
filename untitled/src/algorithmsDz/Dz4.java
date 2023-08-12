package algorithmsDz;

public class Dz4 {

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        int[] elements = {10, 5, 15, 3, 7, 12, 18, 1, 6};
        for (int element : elements) {
            tree.insert(element);
            System.out.println(element);
        }
    }

    public static class RedBlackTree {
        private static final boolean RED = true;
        private static final boolean BLACK = false;

        private class Node {
            int key;
            Node left, right;
            boolean color;

            Node(int key, boolean color) {
                this.key = key;
                this.color = color;
            }
        }

        private Node root;

        private boolean isRed(Node node) {
            if (node == null) {
                return false;
            }
            return node.color == RED;
        }

        private Node rotateLeft(Node node) {
            Node x = node.right;
            node.right = x.left;
            x.left = node;
            x.color = node.color;
            node.color = RED;
            return x;
        }

        private Node rotateRight(Node node) {
            Node x = node.left;
            node.left = x.right;
            x.right = node;
            x.color = node.color;
            node.color = RED;
            return x;
        }

        private void flipColors(Node node) {
            node.color = RED;
            node.left.color = BLACK;
            node.right.color = BLACK;
        }

        public void insert(int key) {
            root = insert(root, key);
            root.color = BLACK;
        }

        private Node insert(Node node, int key) {
            if (node == null) {
                return new Node(key, RED);
            }

            if (key < node.key) {
                node.left = insert(node.left, key);
            } else if (key > node.key) {
                node.right = insert(node.right, key);
            }

            if (isRed(node.right) && !isRed(node.left)) {
                node = rotateLeft(node);
            }
            if (isRed(node.left) && isRed(node.left.left)) {
                node = rotateRight(node);
            }
            if (isRed(node.left) && isRed(node.right)) {
                flipColors(node);
            }

            return node;
        }
    }
}
