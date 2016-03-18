package ProjetoDeAlgoritmo;

public class TestTree {

	public static void main(String[] args)
	{
		
		Node node10 = new Node(10);
		Node node7 = new Node(7);
		Node node15 = new Node(15);
		Node node5 = new Node(5);
		Node node8 = new Node(8);
		Node node6 = new Node(6);
		Node node11 = new Node(11);
		Node node23 = new Node(23);
		
		node10.left = node7;
		node10.right = node15;
		node7.left = node5;
		node7.right = node8;
		node5.right = node6;
		node15.left = node11;
		node15.right = node23;
		Tree tree = new Tree(node10);
		
		System.out.println("The print about tree in Order:");
		tree.inOrder();
		System.out.println("\nThe print about tree post Order:");
		tree.postOrder();
		System.out.println("\nThe print about tree pre Order:");
		tree.preOrder();
		
		
	}

}
