import java.sql.SQLOutput;
import java.util.*;
public class Linkedlizt {
     Node head;
    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    //Add first
    public  void addfirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
    }
        newNode.next=head;
        head=newNode;}
    //Add last
    public void addlast( String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
           currNode=currNode.next;
        }
        currNode.next=newnode;
    }
    //Print Linkedlist
    public void print(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode=head;
        while(currNode  != null){
            System.out.println(currNode.data + "-->");
            currNode=currNode.next;
        }
    }
    //delete in first
    public void deletefirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    // delete in last
    public void deletelast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next != null){
            lastnode= lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;

    }

    public static void main(String[] args) {
        Linkedlizt l=new Linkedlizt();
       l.addlast("a");
      l.addlast("b");
        //l.addfirst("a");
        //l.addfirst("b");
        l.addlast("c");

        l.print();
    //    l.deletefirst();
      //  l.print();
        l.deletelast();
        l.print();

    }
}
