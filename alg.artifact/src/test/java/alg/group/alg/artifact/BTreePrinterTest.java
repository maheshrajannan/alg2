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
public class BTreePrinterTest {

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
	 * Test method for {@link alg.group.alg.artifact.BTreePrinter#printNode(alg.group.alg.artifact.Node)}.
	 */
	@Test
	public final void testPrintNode() {
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link alg.group.alg.artifact.BTreePrinter#convert(int[])}.
	 */
	@Test
	public final void testConvert() {
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link alg.group.alg.artifact.BTreePrinter#convertAndPrint(int[])}.
	 */
	@Test
	public final void testConvertAndPrint() {
		//fail("Not yet implemented"); // TODO
	}

	private static Node<Integer> test1() {
		Node<Integer> root = new Node<Integer>(2);
		Node<Integer> n11 = new Node<Integer>(7);
		Node<Integer> n12 = new Node<Integer>(5);
		Node<Integer> n21 = new Node<Integer>(2);
		Node<Integer> n22 = new Node<Integer>(6);
		Node<Integer> n23 = new Node<Integer>(3);
		Node<Integer> n24 = new Node<Integer>(6);
		Node<Integer> n31 = new Node<Integer>(5);
		Node<Integer> n32 = new Node<Integer>(8);
		Node<Integer> n33 = new Node<Integer>(4);
		Node<Integer> n34 = new Node<Integer>(5);
		Node<Integer> n35 = new Node<Integer>(8);
		Node<Integer> n36 = new Node<Integer>(4);
		Node<Integer> n37 = new Node<Integer>(5);
		Node<Integer> n38 = new Node<Integer>(8);
	
		root.left = n11;
		root.right = n12;
	
		n11.left = n21;
		n11.right = n22;
		n12.left = n23;
		n12.right = n24;
	
		n21.left = n31;
		n21.right = n32;
		n22.left = n33;
		n22.right = n34;
		n23.left = n35;
		n23.right = n36;
		n24.left = n37;
		n24.right = n38;
	
		return root;
	}

	private static Node<Integer> test2() {
		Node<Integer> root = new Node<Integer>(2);
		Node<Integer> n11 = new Node<Integer>(7);
		Node<Integer> n12 = new Node<Integer>(5);
		Node<Integer> n21 = new Node<Integer>(2);
		Node<Integer> n22 = new Node<Integer>(6);
		Node<Integer> n23 = new Node<Integer>(9);
		Node<Integer> n31 = new Node<Integer>(5);
		Node<Integer> n32 = new Node<Integer>(8);
		Node<Integer> n33 = new Node<Integer>(4);
	
		root.left = n11;
		root.right = n12;
	
		n11.left = n21;
		n11.right = n22;
	
		n12.right = n23;
		n22.left = n31;
		n22.right = n32;
	
		n23.left = n33;
	
		return root;
	}

	private static Node<Integer> test3() {
		return BTreePrinter.convert(new int[] { 5, 3, 1, 7 });
	}

}
