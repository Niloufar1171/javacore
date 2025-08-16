package dailypractice.Feb;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.Add(11);
        list.Add(22);
        list.Add(33);
        list.Add(44);
        list.Add(55);
        list.Add(66);
        list.print(list.head);
        System.out.println("*************************************************");

        list.delete(22);
        list.print(list.head);

        System.out.println("*************************************************");
        list.Reverse(list.head);
        list.print(list.head);

        System.out.println("*************************************************");
        list.GetEndOfFirstHalf();
        list.print(list.head);
    }
}
