package ProjetoDeAlgoritmo;

public class Tree {
	private Node root;

	public Tree(Node root) 
	{
		this.root = root;
	}

	public void inOrder()
	{
		this.inOrder(this.root);
	}
	
	private void inOrder(Node node)
	{
		if (node != null)
		{
			inOrder(node.left);
			System.out.print(node.value+" ");
			inOrder(node.right);
		}
	}

	public void postOrder()
	{
		this.postOrder(this.root);
	}
	
	private void postOrder(Node node)
	{
		if (node != null)
		{
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.value+" ");
		}
	}
	
	public void preOrder()
	{
		this.preOrder(this.root);
	}
	
	private void preOrder(Node node)
	{
		if (node != null)
		{
			System.out.print(node.value+" ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	
	
	


}
