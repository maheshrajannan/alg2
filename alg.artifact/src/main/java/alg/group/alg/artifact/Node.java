/**
 * 
 */
package alg.group.alg.artifact;

/**
 * @author maheshrajannan
 *
 */
class Node<T extends Comparable<?>> {
	Node<T> left, right;
	T data;

	public Node(T data) {
		this.data = data;
	}
	
	public String toString() {
		return ""+data;
	}
	
}
