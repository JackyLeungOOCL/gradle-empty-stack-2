/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        // Story 1
        System.out.println("------- Story 1 -------");
        Mobile mobile1 = new Mobile("story 1 mobile", "black", "Nokia");
        mobile1.call("Your mother is finding you.");

        // Story 2
        System.out.println();
        System.out.println("------- Story 2 -------");
        mobile1.printInfo();

        // Story 3
        System.out.println();
        System.out.println("------- Story 3 -------");
        IPhone iPhone8 = new IPhone("iPhone 8", "Silver", "Apple Inc.");
        Person iPhonePerson = new Person(iPhone8);
        iPhonePerson.call("Call me back la dllm");
        iPhonePerson.call("sdfkjshdfkjsdf xcjkv cxkjvhxdkfjh xcfk lsdk dllm osadfijsdijfsdlkjflkdzsjlxckjvzxlkcjvlxj klxjcfl xkcj gzlxkjf lxzkcj xlzkj fxlkjfxlkcjzlkjflkjdflskdjfslkfdj");

        Android meizu = new Android("Meizu Rubbish", "Black", "Meizu");
        Person androidPerson = new Person(meizu);
        androidPerson.call("I call you back la dim ah");
        androidPerson.call("sdlfjsaodfj sakdjlksj lskadjf laksd jflksjlskj flsadkjf lasjf lsadkjf lsakjf lsajf slajf lasjf ");

        IPhoneRobot iPhoneRobot = new IPhoneRobot(iPhone8);
        iPhoneRobot.getMobile().printInfo();

        // Story 4
        System.out.println();
        System.out.println("------- Story 4 -------");
        System.out.println("androidPerson's original phone:");
        androidPerson.getMobile().printInfo();
        String msg = "123456789012345678901234567890123456789012345678901234567";
        androidPerson.call(msg);
        androidPerson.changeMobile(iPhone8);
        System.out.println("androidPerson's new phone:");
        androidPerson.getMobile().printInfo();
        androidPerson.call(msg);
    }
}
