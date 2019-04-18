/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Momen
 */
public class LinkedList {

	private  node head =null;
    
    public void add (char c, int index){
        node i=head;
        node c1=new node();
        if(index==0){
            c1.next=head;
            head=c1;
        }else{
           for(int count=0;count <index-1 ;count++){
                   i=i.next;
            }  
            c1.next=i.next;
            i.next=c1;
        }
    }
}
