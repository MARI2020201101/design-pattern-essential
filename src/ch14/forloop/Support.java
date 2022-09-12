package ch14.forloop;

abstract class Support {

    protected Support next;

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }
    final void support(Trouble trouble){
        for(Support support = this;  ; support = support.next){
            if(support.resolve(trouble)) {
                support.done(trouble);break;
            }
            else if(support.next == null){
                fail(trouble);
                break;
            }
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
