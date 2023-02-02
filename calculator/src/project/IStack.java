package project;

public interface IStack <T>{
	public T Pop();
	public void Push(T item);
	public T Peek();
	public int Size();
}
