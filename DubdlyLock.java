/*
 * 
 */
package edu.hdsb.gwss.hamzah.ics4u.u4;

/**
 *
 * @author Rawasia
 */
public class DubdlyLock extends FixedLockParent {
    // set the constant values of each dubdly lock

    private static int MAX = 59;
    protected static int LENGTH = 3;

    // constructor that passes the max and lengt to its paren to set the random combo and make the lock
    public DubdlyLock() {
        super(MAX, LENGTH);
        super.setCombo(MAX);

    }
}
