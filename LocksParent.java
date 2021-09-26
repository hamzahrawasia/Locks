/*
    Hamzah Rawasia 
    October 23 2020
    Version 1.0
    This program can create 4 different types of locks and perform a vareity of methods on them

 */
package edu.hdsb.gwss.hamzah.ics4u.u4;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Rawasia
 */
public class LocksParent implements LocksInterface {

    // VARIABLES
    private int maxValue;
    private int comboLength;
    private boolean lockedOut;
    private boolean open;
    protected ArrayList<Integer> combo;

    private static int serialNumCounter;
    private int serialNum;

    private static final int ATTEMPTS_ALLOWED = 3;
    private int attempts = 0;

    boolean getComboCalled;

    //CONSTRUCTOR
    public LocksParent(int max, int length, ArrayList<Integer> combo) {
        this.maxValue = max;
        this.comboLength = length;
        this.combo = combo;

        this.serialNum = serialNumCounter + 1;
        LocksParent.serialNumCounter++;

    }

    // GETTERS AND SETTERS
    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getComboLength() {
        return comboLength;
    }

    public void setComboLength(int comboLength) {
        this.comboLength = comboLength;
    }

    public boolean isLockedOut() {
        return lockedOut;
    }

    public void setLockedOut(boolean lockedOut) {
        this.lockedOut = lockedOut;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public void setCombo(ArrayList<Integer> combo) {
        this.combo = combo;
    }

    public ArrayList<Integer> getCombo() {
        if (!getComboCalled) {
            getComboCalled = true;
            return combo;
        } else {
            System.out.println("COMBO ALREADY REVEALED ONCE");
            return null;
        }
    }

// METHOD TO ATTEMPT TO GUESS/UNLOCK LOCK COMBO
    public boolean tryCombo(ArrayList<Integer> attemptUnlock) {

        if (combo.isEmpty()) {
            System.out.println("ERROR - COMBINATION NOT SET YET");
        } else {
            if (!open) {
                if (attempts < ATTEMPTS_ALLOWED) {
                    if (combo.equals(attemptUnlock)) {
                        System.out.println("you guessed it at attempt #" + (attempts + 1));
                        open = true;
                        return true;
                    } else if (!open) {
                        System.out.println("Incorrect guess");
                        attempts++;
                        return false;
                    }
                } else {

                    System.out.println("ATTEMPTS REACHED. LOCKED OUT");

                    return false;
                }
            }

        }
        return false;
    }

    // EQUALS METHOD USED TO COMPARE LOCKS
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
        final LocksParent other = (LocksParent) obj;
        if (this.maxValue != other.maxValue) {
            return false;
        }
        if (this.comboLength != other.comboLength) {
            return false;
        }
        if (this.serialNum != other.serialNum) {
            return false;
        }
        if (!Objects.equals(this.combo, other.combo)) {
            return false;
        }
        return true;
    }

    // toString METHOD
    @Override
    public String toString() {
        return "Lock with max value of " + maxValue + ", A combination length of " + comboLength + ", the combination is " + combo + ", the serial number is " + serialNum + '.';
    }

}
