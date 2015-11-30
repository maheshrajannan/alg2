/**
 * 
 */
package alg.group.alg.artifact;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    // Define a static logger variable so that it references the
    // Logger instance named "MyApp".
    private static final Logger logger = LogManager.getLogger(NodeTest.class);
    
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		logger.debug("Testing node as a POJO");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		logger.debug("DONE Testing node as a POJO");
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
		logger.debug("testing if 2 nodes are equal");
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
		logger.debug("testing if 2 nodes, with no left are equal");
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
		logger.debug("testing if 2 nodes with no right are equal");
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
		logger.debug("testing if 2 nodes with no left and no right are equal");
		Node<Integer> root = new Node<Integer>(2);
		Node<Integer> root2 = new Node<Integer>(2);
		assertTrue("it is supposed to be equal"+ root +"" + root2,root.equals(root2));
	}	
	/**
	 * Test method for {@link alg.group.alg.artifact.Node#equals(java.lang.Object)}.
	 */
	@Test
	public final void testNotEqualsObject() {
		logger.debug("ensuring 2 nodes with different left and right are not equal");
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
		logger.debug("ensuring 2 nodes have same left");
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
		logger.debug("ensuring 2 nodes have same left, with left being null");
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
		logger.debug("ensuring 2 nodes do NOT have same left");
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
		logger.debug("ensuring 2 nodes have same right");
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
		logger.debug("ensuring 2 nodes have same right, with right being null");
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
		logger.debug("ensuring 2 nodes do NOT have same right");
		Node<Integer> root = new Node<Integer>(2);
		root.setLeft(7);
		root.setRight(1);
		Node<Integer> root2 = new Node<Integer>(2);
		root2.setLeft(3);
		root2.setRight(5);
		assertFalse("it is Not supposed to be equal"+ root +"" + root2,root.rightEqualsRight(root2));
	}
}
