public class StackImplementationOnArray
{
    int arr[];
    int top;
    public StackImplementationOnArray()
    {
        arr =new int[5];
        top=-1;

    }
    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else
            return false;
    }
    public boolean isFull()
    {
        if(top==arr.length-1)
        {
            return true;
        }
        else
            return false;
    }
    public void push(int num)
    {
        if(isEmpty())
        {
            top++;
            arr[top]=num;
        }
        else if(top<arr.length)
        {
            top++;
            arr[top] = num;
        }
        else
            System.out.println("Stack overflow");

    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println(arr[top]);
            top--;
        }
    }

}
class Test89
{
    public static void main(String[] args)
    {
        StackImplementationOnArray obj=new StackImplementationOnArray();
        obj.push(45);
        obj.push(78);
        obj.push(45);
        obj.pop();
        obj.pop();
        obj.pop();

    }
}
