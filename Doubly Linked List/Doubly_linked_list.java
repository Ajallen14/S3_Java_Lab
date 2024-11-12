import java.util.Scanner;

public class D_Linked_List {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    public Node head;
    public Node tail;

    public void insert(int data){
        Node temp = new Node(data);

        if(head == null){
            head = temp;
        }else{
            Node ptr = head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = temp;
            temp.prev = ptr;
        }
        System.out.println("Element Added");
    }

    public void delete(){
        head = head.next;
        head.prev = null;
        System.out.println("Deleted");
    }

    public void display(){
        if(head == null){
            System.out.println("EMpty");
        }else{
            Node ptr = head;
            while(ptr != null){
                System.out.print(ptr.data+"\t");
                ptr = ptr.next;
            }
        }
    }
    public static void main(String[] args) {
        D_Linked_List d = new D_Linked_List();

        d.insert(5);
        d.insert(6);
        d.insert(7);
        d.display();
        d.delete();
        d.display();

    }
}
