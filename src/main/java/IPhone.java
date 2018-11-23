public class IPhone extends Mobile {
    private int lengthLimit = 80;

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String inputMsg) {
        if (inputMsg.length() <= lengthLimit) {
            super.call(inputMsg);
        } else {
            System.out.println("<iPhone> Message cannot be sent");
        }
    }
}
