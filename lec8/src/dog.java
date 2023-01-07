public class dog extends animal {

    public dog(String myName, int myid) {
        super(myName, myid);
    }

    public void extra() {
        System.out.println("ok");
    }
}

class test {
    public static void main(String args[]) {
        dog d = new dog("a", 666);
        d.eat();
        d.extra();
    }
}