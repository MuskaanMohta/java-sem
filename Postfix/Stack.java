import java.util.*;
class Stack
{
    int arr[];
    int top;
    Stack()
    {
        arr=new int[50];
        top=-1;
    }
    public boolean isEmpty()
    {
        return top==-1?true:false;
    }
    public boolean isFull()
    {
        return top==arr.length?true:false;
    }
    public void push(int item)
    {
        arr[++top]=item;
    }
    public int pop()
    {
        int value = arr[top--];
        return value;
    }

}