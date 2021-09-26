/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.hamzah.ics4u.u4;

import java.util.ArrayList;

/**
 *
 * @author Rawasia
 */
public interface LocksInterface {

    public boolean isOpen();

    public void setOpen(boolean open);

    public boolean isLockedOut();

    public boolean tryCombo(ArrayList<Integer> attemptUnlock);

    public int getMaxValue();

    public void setMaxValue(int max);

    public int getComboLength();

    public void setComboLength(int length);

    public int getSerialNum();

    public void setSerialNum(int serialNum);

    public void setCombo(ArrayList<Integer> combo);

    public ArrayList<Integer> getCombo();

    public boolean equals(Object obj);

    public String toString();

}
