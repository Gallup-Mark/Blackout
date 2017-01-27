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
public class Door implements Serializable{
    
    //Class instance variables or attributes
    private boolean locked;
    private boolean unlocked;
    private String window;
    private String key;

    public Door() {
    }
    
    

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.locked ? 1 : 0);
        hash = 37 * hash + (this.unlocked ? 1 : 0);
        hash = 37 * hash + Objects.hashCode(this.window);
        hash = 37 * hash + Objects.hashCode(this.key);
        return hash;
    }

    @Override
    public String toString() {
        return "Door{" + "locked=" + locked + ", unlocked=" + unlocked + ", window=" + window + ", key=" + key + '}';
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
        final Door other = (Door) obj;
        if (this.locked != other.locked) {
            return false;
        }
        if (this.unlocked != other.unlocked) {
            return false;
        }
        if (!Objects.equals(this.window, other.window)) {
            return false;
        }
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        return true;
    }
    
    
    
}
