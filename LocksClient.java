/*
    Hamzah Rawasia 
    October 23 2020
    Version 1.0
    This program can create 4 different types of locks and perform a vareity of methods on them
 */
package edu.hdsb.gwss.hamzah.ics4u.u4;

import java.util.ArrayList;

/**
 *
 * @author Rawasia
 */
public class LocksClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // USED TO TEST CODE
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(8);
        c.add(7);

        // TEST CODE FOR EACH LOCK
        System.out.println("MASTER LOCK:");

        System.out.println("CREATE NEW MASTER LOCK, AND GET THE COMBO: ");
        MasterLock m = new MasterLock();
        System.out.println("MASTER LOCK FIXED COMBO: " + m.getCombo());
        System.out.println("SHOULDNT SEE IT IF YOU ATTEMPT TO GET COMBO AGAIN: ");
        m.getCombo();

        System.out.println("TRY TO UNLOCK THE LOCK WITH WRONG COMBO, SHOULD FAIL 3 TIMES THEN LOCK OUT.: ");
        m.tryCombo(c);
        m.tryCombo(c);
        m.tryCombo(c);
        m.tryCombo(c);

        System.out.println("CHECK IF COMBO IS THE SAME ON 2ND ATTEMPT; SHOULD SAY INCORRECT FIRST THEN SAY IT WAS CORRECT SECOND");
        MasterLock m2 = new MasterLock();
        m2.tryCombo(c);
        m2.tryCombo(m2.getCombo());

        System.out.println(m.toString());

        System.out.println("-----------------------------------------");

        System.out.println("DUBDLY LOCK:");

        System.out.println("CREATE NEW DUBDLY LOCK, AND GET THE COMBO: ");
        DubdlyLock d = new DubdlyLock();
        System.out.println("MASTER LOCK FIXED COMBO: " + d.getCombo());
        System.out.println("SHOULDNT SEE IT IF YOU ATTEMPT TO GET COMBO AGAIN: ");
        d.getCombo();

        System.out.println("TRY TO UNLOCK THE LOCK WITH WRONG COMBO, SHOULD FAIL 3 TIMES THEN LOCK OUT.: ");
        d.tryCombo(c);
        d.tryCombo(c);
        d.tryCombo(c);
        d.tryCombo(c);

        System.out.println("CHECK IF COMBO IS THE SAME ON 2ND ATTEMPT; SHOULD SAY INCORRECT FIRST THEN SAY IT WAS CORRECT SECOND");
        DubdlyLock d2 = new DubdlyLock();
        d2.tryCombo(c);
        d2.tryCombo(d2.getCombo());

        System.out.println(d.toString());
        System.out.println("-----------------------------------------");

        System.out.println("ANDROID:");

        System.out.println("CREATE NEW ANDROID LOCK, AND SET THE COMBO: ");
        Android a = new Android();
        a.setCombo(1, 2, 3);
        System.out.println("ANDROID CONFIGURED COMBO: " + a.getCombo());
        System.out.println("SHOULDNT SEE IT IF YOU ATTEMPT TO GET COMBO AGAIN: ");
        a.getCombo();

        System.out.println("TRY TO UNLOCK THE LOCK WITH WRONG COMBO, SHOULD FAIL 3 TIMES THEN LOCK OUT.: ");
        a.tryCombo(c);
        a.tryCombo(c);
        a.tryCombo(c);
        a.tryCombo(c);

        System.out.println("TRY TO COMPARE BEFORE SETTING COMBO- SHOULD GIVE ERROR MESSAGE");
        Android a2 = new Android();
        a2.tryCombo(c);

        System.out.println("CHECK IF COMBO IS THE SAME ON 2ND ATTEMPT; SHOULD SAY INCORRECT FIRST THEN SAY IT WAS CORRECT SECOND");

        a2.setCombo(4, 1, 5);
        a2.tryCombo(c);
        a2.tryCombo(a2.getCombo());

        System.out.println(a.toString());

        System.out.println("-----------------------------------------");

        System.out.println("MASTER ULOCK:");

        System.out.println("CREATE NEW MASTER ULOCK, AND SET THE COMBO: ");
        MasterULock u = new MasterULock();
        u.setCombo(1, 2, 3, 4);
        System.out.println("MASTER ULOCK CONFIGURED COMBO: " + u.getCombo());
        System.out.println("SHOULDNT SEE IT IF YOU ATTEMPT TO GET COMBO AGAIN: ");
        u.getCombo();

        System.out.println("TRY TO UNLOCK THE LOCK WITH WRONG COMBO, SHOULD FAIL 3 TIMES THEN LOCK OUT.: ");
        u.tryCombo(c);
        u.tryCombo(c);
        u.tryCombo(c);
        u.tryCombo(c);

        System.out.println("TRY TO COMPARE BEFORE SETTING COMBO- SHOULD GIVE ERROR MESSAGE");
        MasterULock u2 = new MasterULock();
        u2.tryCombo(c);

        System.out.println("CHECK IF COMBO IS THE SAME ON 2ND ATTEMPT; SHOULD SAY INCORRECT FIRST THEN SAY IT WAS CORRECT SECOND");

        u2.setCombo(4, 1, 5, 7);
        u2.tryCombo(c);
        u2.tryCombo(u2.getCombo());

        System.out.println(u.toString());

        System.out.println("-----------------------------------------");

    }

}
