public class IPhoneRobot {
    private  Mobile mobile;

    public IPhoneRobot(IPhone mobile) {
        this.mobile = mobile;
    }

    public void call(String msg) {
        mobile.call(msg);
    }

    public Mobile getMobile() {
        return mobile;
    }
}
