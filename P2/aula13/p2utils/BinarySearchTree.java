package p2utils;

import static java.lang.System.*;

public class BinarySearchTree<E>
{
  
  private  BSTNode<E> root = null;
  private int size=0; 
  
  @SuppressWarnings("unchecked")
  public BinarySearchTree() { }

  @SuppressWarnings("unchecked")
  public void set(String key, E elem) {
    assert key != null;

    // ........
    root = set(key, elem, root);

    assert contains(key);
    assert get(key) == elem;
  }
  @SuppressWarnings("unchecked")
  private BSTNode<E> set(String key, E elem, BSTNode n){
	if(n == null){
		size++;
		return new BSTNode(key, elem);
	}
	int i = key.compareTo(n.key);
	if(i<0){
		set(key, elem, n.left);
		return n;
	}
	else if(i==0){
		n.elem = elem;
		return n;
	}
	else{
		set(key, elem, n.right);
		return n;
	}
  }
  @SuppressWarnings("unchecked")
  public E get(String key) {
    assert key != null;
    assert contains(key);

    // ........
    return get(key, root);
  }
  @SuppressWarnings("unchecked")
  private E get(String key, BSTNode<E> n){
	int i = key.compareTo(n.key);
	if(i<0){
		return get(key, n.left);
	}
	else if(i>0){
		return get(key, n.right);
	}
	else
		return n.elem;
  }
  @SuppressWarnings("unchecked")
  public void remove(String key) {
    assert key != null;
    assert contains(key);

    // ........
	root = remove(key, root);
    assert !contains(key);
  }
  @SuppressWarnings("unchecked")
  private BSTNode<E> remove(String key, BSTNode<E> n){
	int i = key.compareTo(n.key);
	if(i < 0)
		n.left = remove(key, n.left);
	else if(i>0)
		n.right = remove(key, n.right);
	else if(n.left ==null)
		n = n.right;
	else if(n.right==null)
		n = n.left;
	else{
		n = n.subTreeMin();
		remove(n.key);
	}
		
	return n;
  }
  @SuppressWarnings("unchecked")
  public boolean contains(String key) {
    assert key != null;
    // ........
    return root != null && root.contains(key);
  }

  public boolean isEmpty() {
    // ........
    return size==0;
  }

  public int size() {
    // ........
    return size;
  }
  @SuppressWarnings("unchecked")
  public void clear() {
    // ........
    root.left = null;
    root.right = null;
    root = null;
    size = 0;
  }
  @SuppressWarnings("unchecked")
  public String[] keys() {
    // ........
    assert root != null;
    String[] keys = new String[0];
    return keys(keys, root);
     
  }
  @SuppressWarnings("unchecked")
  private String[] keys(String[] keys, BSTNode<E> n){
	if(n.left != null)		// searchs left subtrees first
		keys = keys(keys, n.left);
	if(n.right != null)
		keys = keys(keys, n.right);
	
	String[] tmp = new String[keys.length + 1];
	System.arraycopy(keys, 0, tmp, 0, keys.length);
	tmp[keys.length] = n.key;
	return tmp;
  }
  public String toString() {
    // ........
    String[] keys = keys();
    String str = "{";
    for(int i = 0; i < keys.length; i++){
		str += get(keys[i]).toString();
		if(i < keys.length - 1) str += " ";
	}
	return str + "}";
  }

}

