import java.util.LinkedList;

class BST{
	protected static class Node{
		int data;
		Node left;
		Node right;

		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}

		public String toString() { // display subtree in order traversal
            String output = "[";
            LinkedList<Node> q = new LinkedList<>();
            q.add(this);
            while(!q.isEmpty()) {
                Node next = q.removeFirst();
                if(next.left != null) q.add(next.left);
                if(next.right != null) q.add(next.right);
                output += next.data;
                if(!q.isEmpty()) output += ", ";
            }
            return output + "]";
    	}
	}

	protected Node root = null;
	//Insert into BST
	BST(Node root){
		this.root = root;
	}

	public void insert(int data){

		//create a node for that data
		Node newNode = new Node(data); 

		if(root == null){
			root = newNode;
		}else{
			if(root.data > data){
				if(root.left == null)
					root.left = newNode;
				else
					insertHelper(data, root.left);
			}else{
				if(root.right == null)
					root.right = newNode;
				else 
					insertHelper(data,  root.right);
			}

		}
	}

	private void insertHelper(int data, Node subtree){
		if(subtree.data > data){
			if(subtree.left == null){
				subtree.left = new Node(data);
			}else{
				insertHelper(data, subtree.left);
			}
		}else{
			if(subtree.right == null)
				subtree.right = new Node(data);
			else
				insertHelper(data, subtree.right);
		}
	}

	public String toString(){
		return root.toString();
	}
	

	

	public static void main(String args[]){
		BST tree = new BST(new Node(20));
		tree.insert(18);
		tree.insert(16);
		tree.insert(17);
		tree.insert(19);
		tree.insert(23);
		tree.insert(25);
		tree.insert(24);
		tree.insert(23);
		tree.insert(26);
		System.out.println(tree.toString());
	}


}