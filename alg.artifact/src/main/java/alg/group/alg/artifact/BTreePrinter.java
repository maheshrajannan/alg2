/**
 * 
 */
package alg.group.alg.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author maheshrajannan
 * 
 *         Ref:
 *         https://github.com/justutkarsh/java-interview-codes/blob/master/ctci-
 *         java/src/treesngraphs/BTreePrinterTest.java
 */
public class BTreePrinter {

	/**
	 * @param root
	 */
	public static <T extends Comparable<?>> void printNode(Node<T> root) {
		if (root != null) {
			int maxLevel = BTreePrinter.maxLevel(root);
			printNodeInternal(Collections.singletonList(root), 1, maxLevel);
		} else {
			System.err.println("input is null " + root);
		}
	}

	/**
	 * @param nodes
	 * @param level
	 * @param maxLevel
	 */
	private static <T extends Comparable<?>> void printNodeInternal(List<Node<T>> nodes, int level, int maxLevel) {
		if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes)) {
			System.err.println("nodes : " + nodes);
			return;
		}

		// INFO: if floor is 0,maxLevel = currentLevel
		// then edgeLines = 1, firstSpaces = 0, betweenSpaces=1
		int floor = maxLevel - level;
		// INFO: 2^(n-1) (or) 2^0, if n-1 < 0
		int edgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
		// INFO: 2^(n) - 1
		int firstSpaces = (int) Math.pow(2, (floor)) - 1;
		// INFO: 2^(n+1) - 1
		int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

		BTreePrinter.printWhitespaces(firstSpaces);

		// INFO: print current level of nodes and put the next level of nodes in
		// to a list.
		List<Node<T>> newNodes = new ArrayList<Node<T>>();
		for (Node<T> node : nodes) {
			if (node != null) {
				System.out.print(node.data);
				newNodes.add(node.left);
				newNodes.add(node.right);
			} else {
				newNodes.add(null);
				newNodes.add(null);
				System.out.print("*");
			}
			//INFO: printing each node, print spaces between nodes.
			BTreePrinter.printWhitespaces(betweenSpaces);
		}
		// INFO: after printing one line of nodes print an empty line.
		System.out.println("");

		for (int i = 1; i <= edgeLines; i++) {
			for (int j = 0; j < nodes.size(); j++) {
				BTreePrinter.printWhitespaces(firstSpaces - i);
				if (nodes.get(j) == null) {
					BTreePrinter.printWhitespaces(edgeLines + edgeLines + i + 1);
					continue;
				}

				if (nodes.get(j).left != null)
					System.out.print("/");
				else
					BTreePrinter.printWhitespaces(1);

				BTreePrinter.printWhitespaces(i + i - 1);

				if (nodes.get(j).right != null)
					System.out.print("\\");
				else
					BTreePrinter.printWhitespaces(1);

				BTreePrinter.printWhitespaces(edgeLines + edgeLines - i);
			}

			System.out.println("");
		}

		printNodeInternal(newNodes, level + 1, maxLevel);
	}

	/**
	 * prints white spaces for the given count.
	 * 
	 * @param count
	 */
	private static void printWhitespaces(int count) {
		for (int i = 0; i < count; i++)
			System.out.print("*");
	}

	/**
	 * 
	 * recursively computes the max
	 * 
	 * @param node
	 * @return
	 */
	private static <T extends Comparable<?>> int maxLevel(Node<T> node) {
		if (node == null)
			return 0;

		return Math.max(BTreePrinter.maxLevel(node.left), BTreePrinter.maxLevel(node.right)) + 1;
	}

	/**
	 * @param list
	 * @return
	 */
	private static <T> boolean isAllElementsNull(List<T> list) {
		for (Object object : list) {
			if (object != null)
				return false;
		}

		return true;
	}

	public static Node<Integer> convert(int[] a) {
		int n = a.length - 1;
		Node<Integer> root = null;
		Node<Integer> current = null;
		for (int i = 0; i <= n / 2; i++) {
			current = new Node<Integer>(a[i]);
			if (i != 0) {
				current.left = new Node<Integer>(a[2 * i]);
			}
			current.right = new Node<Integer>(a[(2 * i) + 1]);
			if (root == null) {
				root = current;
			} else if (root != null && root.left != null && root.left.data.equals(current.data)) {
				root.left = current;
			} else if (root != null && root.right != null && root.right.data.equals(current.data)) {
				root.right = current;
			}
	
		}
		return root;
	}

	public static void convertAndPrint(int[] a) {
		BTreePrinter.printNode(convert(a));
	}

}
