
public class chapter4a {
	static int maxHeight(TreeNode tree){
		if(tree == null){
			return 0;
		}else{
			return Math.max(maxHeight(tree.left), maxHeight(tree.right))+1;
		}
	}
	
	public static Boolean isBalanced(TreeNode tree){
		if (tree == null){
			return true;
		}
		int difference = Math.abs(maxHeight(tree.left)-maxHeight(tree.right));
		if (difference > 1){
			return false;
		}else{
			return isBalanced(tree.left)&&isBalanced(tree.right);
		}
	}
	
	int maxHeight2(TreeNode tree){
		if(tree == null){
			return 0;
		}
		int leftHeight = maxHeight2(tree.left);
		if (leftHeight==-1){
			return -1;
		}
		int rightHeight = maxHeight2(tree.right);
		if(rightHeight==-1){
			return -1;
		}
		
		int difference = Math.abs(leftHeight-rightHeight);
		if (difference >1){
			return -1;
		}else{
			return Math.max(leftHeight, rightHeight)+1;
		}
	}
	boolean isBalanced2(TreeNode tree){
		if(maxHeight2(tree)==-1){
			return false;
		}else{
			return true;
		}
	}
	
	public static void main(String[] args){
		TreeNode tree = new TreeNode(3);
		tree.add(2);
		tree.add(4);
		tree.add(8);
		tree.add(1);
		
		TreeNode tree1 = new TreeNode(1);
		tree1.add(2);
		tree1.add(3);
		tree1.add(4);
		if(isBalanced(tree1)){
			System.out.println("balanced");
		}else{
			System.out.println("Not balanced");
		}
	}
}

