/*
 */
package edu.hdsb.gwss.hamzah.ics4u.u4;

import java.util.ArrayList;

/**
 *
 * @author Rawasia
 */
public class Android extends LocksParent {

    // set values of each android lock
    private static int MAX = 9;
    private static int LENGTH = 3;

    // passes values to constructor in the parent class
    public Android() {
        super(MAX, LENGTH, new ArrayList<Integer>());
    }

    // method that allows user to configure the combo of the lock they have created
    public void setCombo(int x, int y, int z) {
        ArrayList<Integer> combo = new ArrayList<Integer>();
        if (x > 9 || y > 9 || z > 9 || x < 0 || y < 0 || z < 0) {
            System.out.println("INVALID INPUT FOR COMBO.");

        } else {

            combo.add(x);

            combo.add(y);

            combo.add(z);

            this.combo = combo;

        }

    }
}
