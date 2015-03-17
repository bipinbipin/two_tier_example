/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dal;

import java.util.Collection;
import bo.*;
import java.util.ArrayList;

/**
 *
 * @author bipin
 */
public class DAL {

    public static void retrievePets(house h) {
        
        //build the collection of pets
        Collection<pet> pets = new ArrayList<>();
        
        pet p = new pet();
        p.setType("cat");
        p.setName("Reni");
        
        pet q = new pet();
        q.setType("cat");
        q.setName("Oscar");
        
        pet r = new pet();
        r.setType("lizard");
        r.setName("Ben");
      
        pets.add(p);
        pets.add(q);
        pets.add(r);
        
        //attach pets to house
        h.setPets(pets);
        
    }
    public static void retrieveRooms(house h){
        
        //build the collection of pets
        Collection<room> rooms = new ArrayList<>();
        
        for(int i=0; i < 10; i++) {
         
            room a = new room();
            a.setFloor(Integer.toString(i));
            a.setName("room" + i);
            
            rooms.add(a);
        }
        
        h.setRooms(rooms);
        
    }
    
}
