public class Android extends Mobile {
    private int lengthLimit = 50;

    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String inputMsg) {
        if (inputMsg.length() <= lengthLimit) {
            super.call(inputMsg);
        } else {
            System.out.println("<Android> Message cannot be sent");
        }
    }
}
