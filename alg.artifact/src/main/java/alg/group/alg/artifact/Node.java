/**
 * 
 */
package alg.group.alg.artifact;

/**
 * @author maheshrajannan
 *
 *         A simple node class representing binary node element for any generic
 *         type <T>
 */
class Node<T extends Comparable<?>> {
	Node<T> left, right;
	T data;

	public Node(T data) {
		this.data = data;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public void setLeft(T t) {
		this.left = new Node<T>(t);
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public void setRight(T t) {
		this.right = new Node<T>(t);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String toString() {
		return "" + data;
	}

	/**
	 * 
	 * if both are null , then false
	 * 
	 * @param obj
	 * @return
	 */
	private boolean verify(Object obj) {
		boolean result = true;
		if (obj == null) {
			result = false;
		}
		if (result && obj.getClass() != this.getClass()) {
			result = false;
		}
		return result;
	}
	/**
	 * @param obj
	 * @return
	 */
	private boolean verify(Node<T> obj) {
		return obj != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return equalsNode(obj) && leftEqualsLeft(obj) && rightEqualsRight(obj);
	}

	/**
	 * @param t
	 * @return
	 */
	public boolean equalsNode(T t) {
		return equalsNode(new Node<T>(t));
	}

	/**
	 * if both are null then false..null has no comparison.
	 * 
	 * @param obj
	 * @return
	 */
	public boolean equalsNode(Object obj) {
		boolean result = verify(obj);
		if (result) {
			Node<?> that = (Node<?>) obj;
			if (this.data == null || that.data == null) {
				result = false;
			}
			if (result) {
				result = this.data.equals(that.data);
			}
		}
		return result;
	}

	/**
	 * @param that
	 * @return
	 */
	public boolean leftEqualsLeftNode(Node<T> that) {
		boolean result = verify(that);

		//Must break the pattern of return at last, here.
		// INFO: just check for no left case.
		if(result && this.getLeft() == null && that.getLeft() == null) {
			return true;
		}
		
		if(result){
			result = verify(this.getLeft());
		}
		if(result){
			result = verify(that.getLeft());
		}
		if(result){
			result = this.getLeft().equalsNode(that.getLeft());
		}
		return result;
	}

	/**
	 * @param obj
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public boolean leftEqualsLeft(Object obj) {
		boolean result = verify(obj);
		Node<T> that = null;
		if(result) {
			that = (Node<T>) obj;
		}
		if (result) {
			result = leftEqualsLeftNode(that);
		}
		return result;
	}

	/**
	 * @param t
	 * @return
	 */
	public boolean equalsRight(T t) {
		return equalsRight(new Node<T>(t));
	}

	/**
	 * @param that
	 * @return
	 */
	public boolean equalsRight(Node<T> that) {
		//INFO: must break the pattern here to account for null right nodes.
		if(that == null && this.getRight() == null) {
			return true;
		}
		boolean result = verify(that);
		if(result) {
			result = verify(this.getRight());
		}
		if (result) {
			result = this.getRight().equalsNode(that);
		}
		return result;
	}
	/**
	 * @param that
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public boolean equalsLeft(Object thatObject) {
		boolean result = verify(thatObject);
		Node<T> that = null;
		if(result) {
			that = (Node<T>) thatObject;
			result = equalsLeft(that);
		}
		return result;
	}

	/**
	 * @param t
	 * @return
	 */
	public boolean equalsLeft(T t) {
		return equalsLeft(new Node<T>(t));
	}

	/**
	 * @param node
	 * @return
	 */
	public boolean equalsLeft(Node<T> that) {
		//INFO: must break the pattern here to account for null right nodes.
		if(that == null && this.getLeft() == null) {
			return true;
		}
		boolean result = verify(that);
		if(result) {
			result = verify(this.getLeft());
		}
		if (result) {
			result = this.getLeft().equalsNode(that);
		}
		return result;
	}

	/**
	 * @param t
	 * @return
	 */
	public boolean rightEqualsRight(T t) {
		return rightEqualsRightNode(new Node<T>(t));
	}

	/**
	 * @param that
	 * @return
	 */
	public boolean rightEqualsRightNode(Node<T> that) {
		boolean result = verify(that);

		//Must break the pattern of return at last, here.
		// INFO: just check for no right case.
		if(result && this.getRight() == null && that.getRight() == null) {
			return true;
		}
		
		if(result){
			result = verify(this.getRight());
		}
		if(result){
			result = verify(that.getRight());
		}
		if(result){
			result = this.getRight().equalsNode(that.getRight());
		}
		return result;
	}

	/**
	 * @param thatObject
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public boolean rightEqualsRight(Object thatObject) {
		boolean result = verify(thatObject);
		Node<T> that = null;
		if (result) {
			that = (Node<T>) thatObject;
		}
		if (result) {
			result = rightEqualsRightNode(that);
		}
		return result;
	}

}
