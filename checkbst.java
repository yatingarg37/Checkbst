package assignments;

class Node{
	int key;
	Node left,right;
	Node(int k){
		key=k;
		left=right=null;
	}
}
public class check_bst
{
	static Node root;
	check_bst()
    {
		root=null;
	}
	static void inOrder(Node root)
    {
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
		return;
	}
	static boolean checktree(Node root){
		if(root.left!=null || root.right!=null){
			if(root.key<root.left.key)
            {
				return false;
			}
			else if(root.key>root.right.key)
            {
				return false;
			}
			else{
				checktree(root.left);
				checktree(root.right);
			}
		}
		return true;
	}
	public static void main(String[] args){
		check_bst tree=new check_bst();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		if(checktree(root)){
			System.out.println("Yes its BST");
		}
		else{
			System.out.println("No its not bst");
			}

	}
}
