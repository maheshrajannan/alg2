/**
 * 
 */
package alg.group.alg.artifact;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author maheshrajannan
 *
 */
public class NodeTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link alg.group.alg.artifact.Node#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject() {
		Node<Integer> root = new Node<Integer>(2);
		root.setLeft(7);
		root.setRight(5);
		Node<Integer> root2 = new Node<Integer>(2);
		root2.setLeft(7);
		root2.setRight(5);
		assertTrue("it is supposed to be equal"+ root +"" + root2,root.equals(root2));
	}
	/**
	 * Test method for {@link alg.group.alg.artifact.Node#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObjectNoLeft() {
		Node<Integer> root = new Node<Integer>(2);
		root.setRight(5);
		Node<Integer> root2 = new Node<Integer>(2);
		root2.setRight(5);
		assertTrue("it is supposed to be equal"+ root +"" + root2,root.equals(root2));
	}
	/**
	 * Test method for {@link alg.group.alg.artifact.Node#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObjectNoRight() {
		Node<Integer> root = new Node<Integer>(2);
		root.setLeft(7);
		Node<Integer> root2 = new Node<Integer>(2);
		root2.setLeft(7);
		assertTrue("it is supposed to be equal"+ root +"" + root2,root.equals(root2));
	}
	/**
	 * Test method for {@link alg.group.alg.artifact.Node#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObjectNoLeftAndRight() {
		Node<Integer> root = new Node<Integer>(2);
		Node<Integer> root2 = new Node<Integer>(2);
		assertTrue("it is supposed to be equal"+ root +"" + root2,root.equals(root2));
	}	
	/**
	 * Test method for {@link alg.group.alg.artifact.Node#equals(java.lang.Object)}.
	 */
	@Test
	public final void testNotEqualsObject() {
		Node<Integer> root = new Node<Integer>(2);
		root.setRight(7);
		root.setLeft(5);
		Node<Integer> root2 = new Node<Integer>(2);
		root2.setLeft(7);
		root2.setRight(5);
		assertFalse("it is NOT supposed to be equal"+ root +"" + root2,root.equals(root2));
	}
	/**
	 * Test method for {@link alg.group.alg.artifact.Node#leftEqualsLeft(java.lang.Object)}.
	 */
	@Test
	public final void testLeftEqualsLeft() {
		Node<Integer> root = new Node<Integer>(2);
		root.setLeft(7);
		root.setRight(1);
		Node<Integer> root2 = new Node<Integer>(2);
		root2.setLeft(7);
		root2.setRight(2);
		assertTrue("it is supposed to be equal"+ root +"" + root2,root.leftEqualsLeft(root2));
	}
	/**
	 * Test method for {@link alg.group.alg.artifact.Node#leftEqualsLeft(java.lang.Object)}.
	 */
	@Test
	public final void testLeftEqualsLeftNull() {
		Node<Integer> root = new Node<Integer>(2);
		root.setRight(1);
		Node<Integer> root2 = new Node<Integer>(2);
		root2.setRight(2);
		assertTrue("it is supposed to be equal"+ root +"" + root2,root.leftEqualsLeft(root2));
	}	
	/**
	 * Test method for {@link alg.group.alg.artifact.Node#leftEqualsLeft(java.lang.Object)}.
	 */
	@Test
	public final void testNotLeftEqualsLeft() {
		Node<Integer> root = new Node<Integer>(2);
		root.setLeft(7);
		root.setRight(1);
		Node<Integer> root2 = new Node<Integer>(2);
		root2.setLeft(1);
		root2.setRight(7);
		assertFalse("it is supposed to be equal"+ root +"" + root2,root.leftEqualsLeft(root2));
	}
	/**
	 * Test method for {@link alg.group.alg.artifact.Node#rightEqualsRight(java.lang.Object)}.
	 */
	@Test
	public final void testRightEqualsRight() {
		Node<Integer> root = new Node<Integer>(2);
		root.setLeft(7);
		root.setRight(1);
		Node<Integer> root2 = new Node<Integer>(2);
		root2.setLeft(3);
		root2.setRight(1);
		assertTrue("it is supposed to be equal"+ root +"" + root2,root.rightEqualsRight(root2));
	}
	/**
	 * Test method for {@link alg.group.alg.artifact.Node#rightEqualsRight(java.lang.Object)}.
	 */
	@Test
	public final void testRightEqualsRightNull() {
		Node<Integer> root = new Node<Integer>(2);
		root.setLeft(7);
		Node<Integer> root2 = new Node<Integer>(2);
		root2.setLeft(3);
		assertTrue("it is supposed to be equal"+ root +"" + root2,root.rightEqualsRight(root2));
	}	
	/**
	 * Test method for {@link alg.group.alg.artifact.Node#rightEqualsRight(java.lang.Object)}.
	 */
	@Test
	public final void testNotRightEqualsRight() {
		Node<Integer> root = new Node<Integer>(2);
		root.setLeft(7);
		root.setRight(1);
		Node<Integer> root2 = new Node<Integer>(2);
		root2.setLeft(3);
		root2.setRight(5);
		assertFalse("it is Not supposed to be equal"+ root +"" + root2,root.rightEqualsRight(root2));
	}
}
