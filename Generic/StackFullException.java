class StackFullException extends Exception
{
    int size;
    StackFullException(int size)
    {
        super("Full");
        this.size=size;
    }
    public String toString()
    {
        return ("[Full-5]");
    }
}