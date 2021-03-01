package p2utils;
import java.lang.*;
/** This class implements a "dynamic" array of elements of generic type.
 * The capacity of a dynamic array grows automatically, as needed.
 * It implements a random access abstract data type, with two main methods:
 * set and get.
 */
public class DynamicArray<E> {

  private E[] array;
  private int maxidx = -1;  // maximum index ever set

  private static final int BLOCK = 256;

  // Define the constructor to initialize the fields
  //...
  @SuppressWarnings("unchecked")
  public DynamicArray(){
	this.array = (E[]) new Object[0];
	  
  }
  /** Returns the length of the array.
   * The "length" is defined as 1 plus the maximum index that was set.
   * @return Number of elements in the array
   */
  public int length() { return 1+maxidx; }

  /** Set the element in position idx to given value.
   */
  @SuppressWarnings("unchecked")
  public void set(int idx, E value) {
    assert idx >= 0;
    //...
    if (idx < this.array.length)
		this.array[idx] = value;
	else{
		E[] tmp = (E[]) new Object[BLOCK];
		System.arraycopy(array, 0, tmp, 0, idx);
		tmp[idx] = value;
		array = tmp;
	}
  }


  /** Return the element in a given position in the list.
   * @param idx  the index of the element (0 is the first).
   * @return value at position idx of the array, or null, if not set yet.
   */
   
  public E get(int idx) {
    assert idx >= 0;
    //...
    if (idx < this.array.length)
		return this.array[idx];
	else return null;
  }

  // Define the second get method
  //...
  public E get(int idx, E d){
	assert idx >= 0;
	if (this.array[idx] != null)
		return this.array[idx];
	else if (this.array.length <= idx) return d;
		 else
			return d;
  }
}
