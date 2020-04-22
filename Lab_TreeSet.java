/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_treeset;

import java.util.TreeSet;

/**
 *
 * @author olegsavinov
 */
public class Lab_TreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item it = new Item("Oleg");
        ItemComparator cmp = new ItemComparator();
        
        TreeSet<Item> ts = new TreeSet<>(cmp);
        
        ts.add(it);
        ts.add(new Item("aaaaaaaa"));
        ts.add(new Item("aa"));
        ts.add(new Item("1"));
        ts.add(new Item("111"));
        ts.add(new Item("111111111111111110"));
        ts.add(new Item("111"));
        System.out.println(ts);
    }
    
}
