interface IGenSimpleStack<T>
{
    public void push(T item)throws StackFullException;
    public T pop()throws StackEmptyException;
    public boolean isEmpty();
    public boolean isFull();

}