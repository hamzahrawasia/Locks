/*

 */
package edu.hdsb.gwss.hamzah.ics4u.u4;

import java.util.ArrayList;

/**
 *
 * @author Rawasia
 */
public class MasterULock extends LocksParent {

    // set values of each master u lock 
    private static int MAX = 9;
    private static int LENGTH = 4;

    // pass value and set combo to constructor in the parent
    public MasterULock() {
        super(MAX, LENGTH, new ArrayList<Integer>());
    }

    // method that allows the user to configure the combo of the lock created
    public void setCombo(int a, int b, int c, int d) {

        ArrayList<Integer> combo = new ArrayList<Integer>();
        if (a > 9 || b > 9 || c > 9 || d > 9 || a < 0 || b < 0 || c < 0 || d < 0) {
            System.out.println("INVALID INPUT FOR COMBO.");

        } else {

            combo.add(a);
            combo.add(b);
            combo.add(c);
            combo.add(d);

            this.combo = combo;

        }

    }
}
