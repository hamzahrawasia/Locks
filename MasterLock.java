/*

 */
package edu.hdsb.gwss.hamzah.ics4u.u4;

import java.util.ArrayList;

/**
 *
 * @author Rawasia
 */
public class MasterLock extends FixedLockParent {

    // set the constant values of each Master Lock
    private static int MAX = 39;
    protected static int LENGTH = 3;

    // constructor that passes the max and lengt to its paren to set the random combo and make the lock
    public MasterLock() {
        super(MAX, LENGTH);
        super.setCombo(MAX);
    }

}
