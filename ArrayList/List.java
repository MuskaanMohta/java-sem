import java.util.*;
public class List{
    public static void populateList(Scanner sc,ArrayList<Integer>al)
    {
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        for(String num:arr)
        {
            al.add(Integer.parseInt(num));
        }

    }
    public static void display(String title,ArrayList<Integer>al)
    {
        Iterator<Integer> itr = al.iterator();
        System.out.print(title+":");
        while(itr.hasNext())
        {
            int n = itr.next();
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void sortList(ArrayList<Integer>al)
    {
        al.sort(Comparator.reverseOrder());
    }
    public static int binSearch(ArrayList<Integer>al,int key)
    {
        int index=Collections.binarySearch(al,key,Collections.reverseOrder());
        return index;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int key,index;
        ArrayList<Integer>al=new ArrayList<Integer>();
        populateList(sc,al);
        display("List",al);
        sortList(al);
        display("Sorted ",al);
        key=sc.nextInt();
        index=binSearch(al,key);
        if(index>=0)
        {
            System.out.println("Position:"+index);
        }
        else{
            System.out.println("Positiont not found");
        }
    }
}