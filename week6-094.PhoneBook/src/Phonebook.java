/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author cuongish
 */
public class Phonebook {
    private ArrayList<Person> list = new ArrayList<Person>();
    
    
    public void add(String name, String number){
        Person p = new Person(name, number);
        this.list.add(p);
    }
    
    public void printAll(){
        for(Person p : this.list){
            System.out.println(p);
        }
    }
    
    public String searchNumber(String Name){
        for(Person p : this.list){
            if(p.getName().equals(Name)){
                return p.getNumber();
            }
        }
        return "number not known";
    }
    
}