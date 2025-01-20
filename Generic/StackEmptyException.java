class StackEmptyException extends Exception
{
    StackEmptyException()
    {
        super("Empty");

    }
    public String toString()
    {
        return ("[EMPTY]");
    }
}