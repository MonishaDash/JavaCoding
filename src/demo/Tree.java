package demo;

class TreeNode
{
    int data;
    TreeNode left, right;
 
    public TreeNode(int item)
    {
        data = item;
        left = right = null;
    }
}
 
/* Class to print the left view */
public class Tree
{
	TreeNode root;
    static int  max_level = 0;
 
    // recursive function to print left view
    void leftViewUtil(TreeNode node, int level)
    {
        // Base Case
        if (node==null) return;
 
        // If this is the first node of its level
        if (max_level < level)
        {
            System.out.print(" " + node.data);
            max_level = level;
        }
 
        // Recur for left and right subtrees
        leftViewUtil(node.left, level+1);
        leftViewUtil(node.right, level+1);
    }
 
    // A wrapper over leftViewUtil()
    void leftView()
    {
        leftViewUtil(root, 1);
    }
    
    int height(){
    	return findHeight(root);
    }
    
    int findHeight(TreeNode node){
    	if(node == null){
    		return 0;
    	}
    	return(1+Math.max(findHeight(node.left), findHeight(node.right)));
    }
 
    /* testing for example nodes */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        Tree tree = new Tree();
        tree.root = new TreeNode(12);
        tree.root.left = new TreeNode(10);
        tree.root.right = new TreeNode(30);
        tree.root.right.left = new TreeNode(25);
        tree.root.right.right = new TreeNode(40);
        tree.root.right.right.right = new TreeNode(50);
 
        //tree.leftView();
        System.out.println(tree.height());
    }
}