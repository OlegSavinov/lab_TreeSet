/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_treeset;

/**
 *
 * @author olegsavinov
 * 
 */
public class Item implements Comparable<Item>{
    String str;
    
    Item(String i){
        str = i;
    }
    
    /**
     *
     * @param i
     * @return
     *
    @Override
    public int compareTo(Item i){
        
        return this.str.length() > i.str.length()? 1 : -1;
    }
    
    */
    
    @Override
    public int compareTo(Item i){
        
        return this.str.charAt(this.str.length()-1) < i.str.charAt(i.str.length()-1)? -1:1;
    }
    
   // */
    
    @Override
    public String toString(){
        return this.str;
    }
}
