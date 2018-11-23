public class Person {
    private  Mobile mobile;

    public Person(Mobile mobile) {
        this.mobile = mobile;
    }

    public void call(String msg) {
        mobile.call(msg);
    }
}
