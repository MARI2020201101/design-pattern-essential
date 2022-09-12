package ch14.chainofresponsibility;

import java.util.Arrays;

abstract class Support {

    protected Support next;

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }
    final void support(Trouble trouble){
        if(resolve(trouble)){
            done(trouble);
        }else if(next != null){
            next.support(trouble);
        }else{
            fail(trouble);
        }
    }
    protected abstract boolean resolve(Trouble trouble);
    void done(Trouble trouble){
        System.out.println(trouble + " resolved by "+ this.getClass().toString());
    }
    void fail(Trouble trouble){
        System.out.println(trouble + " resolving failed....");
    }
}
