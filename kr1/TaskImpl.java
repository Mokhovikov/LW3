package kr1;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.HashMap;
import org.omg.CORBA.ORB;

class TaskImpl extends TaskPOA {
    private ORB orb;

    TaskImpl() {
    }

    public void setORB(ORB orb_val) {
        this.orb = orb_val;
    }



    @Override
    public String _do() {
        HashMap<Integer, Integer> a = new HashMap();

        for(int i = 0; i < 10; ++i) {
            a.put(i, (int)(Math.random() * 20.0) + -10);
        }

        return a.values().toString();
    }

    public void shutdown() {
        this.orb.shutdown(false);
    }
}
