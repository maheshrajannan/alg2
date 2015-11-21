package alg.group.alg.artifact;

import java.util.Arrays;

/**
 * @author maheshrajannan
 * Ref: http://www.code2learn.com/2011/09/heapsort-array-based-implementation-in.html
 */
public class HeapSort {
	private static int[] a;
	private static int n;
	private static int left;
	private static int right;
	private static int largest;
	static int iteration = 0;
	private static String printTabs = "\t";

	// Build-Heap Function
	public static void buildheap(int[] a) {
		System.out.println("buildheap" + Arrays.toString(a));
		int i = -1;
		System.out.println("i=" + i);
		System.out.println("Buidling Heap");
		System.out.println("n = a.length - 1");
		n = a.length - 1;
		System.out.println(n + " = " + a.length + " - 1");
		System.out.println(n + " = " + (a.length - 1));
		for (i = n / 2; i >= 0; i--) {
			printTabs="\t";
			System.out.println(printTabs+"int i = n / 2; i >= 0; i--");
			System.out.println(printTabs+"int i = " + n / 2 + "; " + i + " >= 0; i --");
			System.out.println(printTabs+"i=" + i);
			System.out.println(printTabs+"*********************maxheap(a, i)***********");
			System.out.println(printTabs+"***********maxheap(" + Arrays.toString(a) + ", " + i + ")***********");
			maxheap(a, i);
			System.out.println(printTabs+"***********After building maxheap(" + Arrays.toString(a) + ", " + i + ")");
			show(a, new int[] { -1, -1 });
		}
	}

	// Max-Heap Function
	public static void maxheap(int[] a, int i) {
		left = 2 * i;
		right = 2 * i + 1;
		iteration++;
		printTabs = printTabs + "\t";
		System.out.println(printTabs + "Sorting nodes below ith element a[i] till nth element");
		System.out.println(printTabs + "Sorting nodes below " + i + "th element a[" + i + "] till " + n + "th element");
		System.out
				.println(printTabs + "Sorting nodes below " + i + "th element " + a[i] + " till " + n + "th element");
		System.out.println(printTabs + "iteration" + iteration);
		System.out.println(printTabs + "child nodes left=a[2*i]<----a[i]--->right=a[2*i+1]");
		BTreePrinter.convertAndPrint(a);
		System.out.println(printTabs + "child nodes left=a[" + left + "]<----a[" + i + "]--->right=a[" + right
				+ "] till " + n + "th element");
		System.out.println(printTabs + "child nodes left=a[" + left + "]<----a[" + i + "]--->right=a[" + right
				+ "] till " + n + "th element");
		//Just having a check for printing.
		if(left<a.length && right < a.length) {
			System.out.println(printTabs + "child nodes left="+a[left] + "<----"+a[i]+"--->right="+a[ right]
					+ "till " + n + "th element");
		}else if(left < a.length) {
			System.out.println(printTabs + "child nodes left="+a[left] + "<----"+a[i]+"--->right=a["+ right
					+ "]till " + n + "th element");
		}else if(right < a.length) {
			System.out.println(printTabs + "child nodes left=a[left] <----"+a[i]+"--->right="+a[ right]
					+ "till " + n + "th element");
		}
		if (left <= n && a[left] > a[i]) {
			largest = left;
			System.out.println(printTabs + +left + " <= " + n + " && " + a[left] + " > " + a[i] + "");
		} else {
			System.out.println(printTabs + +left + " <= " + n + " && "
					+ ((left < a.length) ? a[left] + "" : "a[" + left + "]") + " !> " + a[i] + "");
			largest = i;
			System.out.println(printTabs + "largest = i");
			System.out.println(printTabs + "" + largest + " = " + i);
		}
		System.out.println(printTabs + "right <= n");
		System.out.println(printTabs + right + " <= " + n);

		if (right <= n && a[right] > a[largest]) {
			System.out.println(printTabs + "a[right] > a[largest]");
			System.out.println(printTabs + "a[" + right + "] > a[" + largest + "]");
			System.out.println(printTabs + +a[right] + " > " + a[largest]);
			if (a[right] > a[largest]) {
				System.out.println(printTabs + "largest = right");
				System.out.println(printTabs + largest + " = " + right);
				largest = right;
			} else {
				System.out.println(printTabs + largest + " <> " + right);
			}
		} else {
			System.out.println(printTabs + "a[right] !> a[largest]");
			System.out.println(printTabs + "a[" + right + "] !> a[" + largest + "]");
			System.out.println(printTabs + (right < a.length ? "" + a[right] : "a[" + right + "]") + " !> "
					+ a[largest]);
		}
		System.out.println(printTabs + "largest != i");
		System.out.println(printTabs + largest + " != " + i);
		if (largest != i) {
			System.out.println(printTabs + "exchange(i, largest)");
			System.out.println(printTabs + "exchange(" + i + ", " + largest + ")");
			exchange(i, largest);
			System.out.println(printTabs + "After Iteration " + iteration);
			show(a, new int[] { -1, -1 });
			System.out.println(printTabs + "recursive maxheap(" + Arrays.toString(a) + ", " + largest + ")");
			maxheap(a, largest);
		} else {
			System.out.println(printTabs + "After Iteration " + iteration);
			show(a, new int[] { -1, -1 });
		}
	}

	// Exchange Function
	public static void exchange(int i, int j) {
		System.out.println("Before swapping");
		show(a, new int[] { i, j });
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
		System.out.println("After swapping");
		show(a, new int[] { i, j });
	}

	// Sort Function
	public static void sort(int[] a0) {
		System.out.println("a = a0");
		System.out.println("a = " + Arrays.toString(a0));
		a = a0;
		System.out.println("************buildheap(a)************");
		System.out.println("buildheap(" + Arrays.toString(a) + ")");
		buildheap(a);
		System.out.println("************DONE buildheap(a)********");

		for (int i = n; i > 0; i--) {
			System.out.println("exchange(0, i)");
			System.out.println("exchange(0, " + i + ")");
			exchange(0, i);
			System.out.println("n = " + n + " -1");
			n = n - 1;
			System.out.println("n = " + n);
			System.out.println("maxheap(a, 0)");
			System.out.println("maxheap(" + Arrays.toString(a) + ", 0)");
			maxheap(a, 0);
		}
	}

	// print array to standard output
	private static void show(int[] a, int[] highlights) {
		//Instead of this use B Tree printer.
		System.out.println("");
		for (int i = 0; i < a.length; i++) {
			System.out.print(printTabs+ a[i] + "(" + i + (i == highlights[0] || i == highlights[1] ? "*" : " ") + ")");
		}
		System.out.println("");
		BTreePrinter.convertAndPrint(a);

	}

	public static void main(String[] args) {
		int[] a1 = { 5, 3, 1, 7 };
		System.out.println("sort(a1)");
		System.out.println("sort(" + Arrays.toString(a1) + ")");
		sort(a1);
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
	}
}
