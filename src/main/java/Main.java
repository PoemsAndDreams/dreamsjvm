/**
 * @author PoemsAndDreams
 * @date 2023-10-11 23:30
 */
public class Main {
    public static void main(String[] args) {
        switch (args[0]){
            case "-help":
            case "-?":
                help();
                break;
            case "-version":
                System.out.println("java version \"1.8.0_131\"");
                System.out.println("Java(TM) SE Runtime Environment (build 1.8.0_131-b11)");
                System.out.println("Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)");
                break;
            case "-classpath":
            case "-cp":
                JvmArguments.parseJVM(args);
                break;
            default:
                System.out.println("Unrecognized option: " + args[0]);
                System.out.println("Error: Could not create the Java Virtual Machine.");
                System.out.println("Error: A fatal exception has occurred. Program will exit.");
                help();

        }
    }

    private static void help() {
        System.out.println("java [-options] class [args...]");
        System.out.println("java [-options] -jar jarfile [args...]");
    }
}