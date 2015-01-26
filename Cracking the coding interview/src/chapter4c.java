import java.lang.reflect.Array;


public class chapter4c {
	static TreeNode minHeightTree(int[] sorted){
		int mid = sorted.length/2;
		final TreeNode tree = new TreeNode(sorted[mid]);
		if (mid>0){
			mHt(sorted, 0,mid-1,tree);
		}
		if (mid<sorted.length-1)mHt(sorted, mid+1, sorted.length-1, tree);
		return tree;
		
	}
	
	static void mHt(int[] sorted, int start, int end, TreeNode tree){
		int mid = (start+end)/2;
		tree.add(sorted[mid]);
		if(start<mid){
			mHt(sorted,start,mid-1,tree);
		}
		if(mid<end){
			mHt(sorted,mid+1,end,tree);
		}
	}
	
	public static int maxHeight(TreeNode tree){
		if(tree == null){
			return 0;
		}else{
			return Math.max(maxHeight(tree.left), maxHeight(tree.right))+1;
		}
	}
	
	public static void main(String[] args){
		int[] sorted= {1,2,3,4,5,6};
		TreeNode minTree= minHeightTree(sorted);
		minTree.inOrderTraversal(minTree);
		System.out.println("Height is "+maxHeight(minTree));
	}
}
