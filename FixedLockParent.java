/*
 * 
 */
package edu.hdsb.gwss.hamzah.ics4u.u4;

import java.util.ArrayList;

/**
 *
 * @author Rawasia
 */
public abstract class FixedLockParent extends LocksParent implements FixedLockInterface { //extends LockParent

    // takes the max and length given from its child classes, and generates the random combo to pass to the main parent
    public FixedLockParent(int m, int l) {
        super(m, l, new ArrayList<>());
    }

    // method to generate random combo
    public void setCombo(int MAX) {
        ArrayList<Integer> combo = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            combo.add((int) (Math.random() * MAX));
        }

        this.combo = combo;
    }
}
