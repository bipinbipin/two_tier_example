/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bo;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author bipin
 */
public class house {
        
    private String address;
    private String phone;
    Collection<room> rooms = new ArrayList<>();
    Collection<pet> pets = new ArrayList<>();
    
    public void setAddress(String n) {
        address = n;
    }
    public void setPhone(String n) {
        phone = n;
    }
    public void setRooms(Collection<room> r) {
        rooms = r;
    }
    public void setPets(Collection<pet> p) {
        pets = p;
    }
    
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public Collection<room> getRooms() {
        return rooms;
    } 
    public Collection<pet> getPets() {
        return pets;
    } 
}
