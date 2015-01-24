

public class TreeNode {
		public int key;
		
		public TreeNode left;
		public TreeNode right;
		public TreeNode(int k){
			key=k;
			left= null;
			right = null;
		}
	
	void add(int k){
		TreeNode newNode = new TreeNode(k);
		//System.out.println(tree.key+" is smaller than "+k);
		TreeNode focusNode=this;
		TreeNode parent;
		while(true){
			parent=focusNode;
			if (focusNode.key>k){
				focusNode=focusNode.left;
				if(focusNode==null){
					parent.left=newNode;
					return;
				}
			}else{
				focusNode=focusNode.right;
				if(focusNode==null){
					parent.right=newNode;
					return;
				}
			}
		}
		}
	
	public void inOrderTraversal(TreeNode tree){
		if (tree != null){
			inOrderTraversal(tree.left);
			System.out.println(tree.key);
			inOrderTraversal(tree.right);
			
		}
	}
	
	public static void main(String[] args){
		TreeNode tree = new TreeNode(3);
		tree.add(2);
		tree.add(4);
		tree.add(8);
		tree.add(1);
		tree.inOrderTraversal(tree);
	}
}