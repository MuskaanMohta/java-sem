class GenSimpleStack<T> implements IGenSimpleStack<T>
{
    private T stack[];
    private int tos;
    GenSimpleStack(T arr[])
    {
        stack=arr;
        tos=0;
    }
    public void push(T obj)throws StackFullException
    {
        if(isFull())
            throw new StackFullException(stack.length);
        stack[tos]=obj;
        tos++;
    }
    public T pop()throws StackEmptyException
    {
        if(isEmpty())
            throw new StackEmptyException();
        return stack[--tos];
    }
    public boolean isEmpty()
    {
        return tos==0;
    }
    public boolean isFull()
    {
        return tos==stack.length;
    }
}