/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.blackout.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Matthew
 */
public class Item implements Serializable{
    //Class instance variables or attributes
    private String description;
    private String name;
    private int locationX;
    private int locationY;
    private boolean hasItem;

    public Item() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public boolean isHasItem() {
        return hasItem;
    }

    public void setHasItem(boolean hasItem) {
        this.hasItem = hasItem;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.locationX;
        hash = 53 * hash + this.locationY;
        hash = 53 * hash + (this.hasItem ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Item{" + "description=" + description + ", name=" + name + ", locationX=" + locationX + ", locationY=" + locationY + ", hasItem=" + hasItem + '}';
    }
  
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.locationX != other.locationX) {
            return false;
        }
        if (this.locationY != other.locationY) {
            return false;
        }
        if (this.hasItem != other.hasItem) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }




    
    
    
    
}
