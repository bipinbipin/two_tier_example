/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package con;

import bo.*;
import dal.*;

/**
 *
 * @author bipin
 */
public class Con {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        house myHouse = new house();
        
        myHouse.setAddress("10404 Morgan");
        
        DAL.retrievePets(myHouse);
        
        for(pet p : myHouse.getPets())
        {
            System.out.println(p.getType() + " - " + p.getName());
            
        }

        DAL.retrieveRooms(myHouse);
        
        for(room r : myHouse.getRooms())
        {
            System.out.println(r.getFloor() + " - " + r.getName());
        }
        
        System.out.println(myHouse.getAddress());
    }
    
}
