package p2utils;

public class BSTNode<E> {
	
	final String key;
	E elem;
	BSTNode<E> left;
	BSTNode<E> right;
	
	public BSTNode(String key, E elem){
		this.key = key;
		this.elem = elem;
	}
	
	public BSTNode<E> subTreeMin(){
		return subTreeMin(this);
	}
	
	private BSTNode<E> subTreeMin(BSTNode<E> n){
		if(n.left == null)
			return n;
		
		return subTreeMax(n.left);
	}
	
	//If we search only the right childs of the
	//nodes we will come across one that won't
	//have a right child. That node is the MAXIMUM
	//of that subtree
	public BSTNode<E> subTreeMax(){
		return subTreeMax(this);
	}
	
	private BSTNode<E> subTreeMax(BSTNode<E> n){
		if(n.right == null)
			return n;
		
		return subTreeMax(n.right);
	
	}
	
	public boolean contains(String key){
		if(this==null)
			return false;
		int i = key.compareTo(this.key);
		if(i < 0)
			return this.left.contains(key);
		else if(i>0)
			return this.right.contains(key);
		else
			return true;	
	}
}
	
