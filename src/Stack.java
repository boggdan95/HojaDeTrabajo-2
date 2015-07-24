
public interface Stack {
	
	public void empty();
	public boolean isEmpty();
	public <E> void push(E x) ;
	public <E> E pop() throws Exception;
	public int size();
	public <E> E peek() throws Exception;
	
}
