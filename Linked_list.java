import java.io.*; 

public class Linked_list
{ 
    public static void main(String[] args) 
    { 
        int data[] = {10,20,30,40,60,84,38,57};
        Node head = null;  
        for(int i = 0 ; i < data.length; i++)
        {
            head = insert(head , data[i]); 
        } 
        System.out.print("Linked_list: "); 
        printList(head); 

        System.out.print("Linked_list After deleting: "); 
        delete(head,20);
        printList(head); 

        System.out.print("Linked_listby adding after: "); 
        insertAfter(head, 59, 60);
        printList(head); 

        System.out.print("Linked_list by adding before: "); 
        insertBefore(head, 47, 60);
        printList(head); 
    } 

    static class Node 
    { 
        int data; 
        Node next;  
        Node(int data, Node next) 
        { 
            this.data = data; 
            this.next = next; 
        } 
    } 
  
    public static Node insert(Node head, int data) 
    {   
        Node new_node = new Node(data,null); 

        if (head == null) 
        { 
            head = new_node; 
        } 
        else 
        {  
            Node tmp = head; 
            while (tmp.next != null) 
            { 
                tmp = tmp.next; 
            } 
            tmp.next = new_node; 
        } 
        return head; 
    } 
  
    public static void printList(Node head) 
    { 
        Node currNode = head; 
   
        while (currNode != null) 
        { 
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
        System.out.print("\n"); 
    } 

    public static void delete(Node head, int key) 
    { 
        Node temp = head;
        Node prev = null; 
        //if 1st node, i.e head is the kep to be deleted
        if (temp != null && temp.data == key) 
        { 
            head = temp.next; 
            return; 
        }  
        //else
        while (temp != null ) 
        { 
            if(temp.data != key)
            {
                prev = temp; 
                temp = temp.next; 
            }
            else
            {
                prev.next = temp.next;
                return;
            }
        }     
        if (temp == null) return;
    } 

    public static void insertAfter(Node head, int key, int loc) 
    { 
        Node temp = head;
        Node newnode = new Node(key, null);
        while (temp != null ) 
        { 
            if(temp.data != loc)
            {
                temp = temp.next; 
            }
            else
            {
                newnode.next = temp.next;
                temp.next = newnode;
                return;
            }
        }     
        if (temp == null) return;
    } 

    public static void insertBefore(Node head, int key, int loc) 
    { 
        Node temp = head;
        Node prev = null;
        Node newnode = new Node(key, null);
        while (temp != null ) 
        { 
            if(temp.data != loc)
            {
                prev = temp; 
                temp = temp.next; 
            }
            else
            {
                newnode.next = prev.next;
                prev.next = newnode;
                return;
            }
        }     
        if (temp == null) return;
    } 
}