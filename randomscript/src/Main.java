import java.util.Random;

//          ___ _   _ ____  ____ ___ ____      _  _____ ___ ___  _   _    _    _
//         |_ _| \ | / ___||  _ \_ _|  _ \    / \|_   _|_ _/ _ \| \ | |  / \  | |
//          | ||  \| \___ \| |_) | || |_) |  / _ \ | |  | | | | |  \| | / _ \ | |
//          | || |\  |___) |  __/| ||  _ <  / ___ \| |  | | |_| | |\  |/ ___ \| |___
//        |___|_| \_|____/|_|__|___|_|_\_\/_/   \_\_|_|___\___/|_| \_/_/   \_\_____|
//        / ___| / ___|  _ \|_ _|  _ \_   _| | | |  _ \| ____|
//        \___ \| |   | |_) || || |_) || | | | | | |_) |  _|
//        ___) | |___|  _ < | ||  __/ | | | |_| |  _ <| |___
//        |____/ \____|_| \_\___|_|    |_|  \___/|_| \_\_____|
//
//        Written under the direction and by the power of her majesties special command,
//        the great, crazy, Sergeant Marbury II

public class Main {
    public static void printScript() {
        Random r = new Random();
//        System.out.println(r.nextInt((Main.length - 0) + 1) + 0);

//        Added line decorations for separators
        System.out.println("\n  ___ _   _ ____  ____ ___ ____      _  _____ ___ ___  _   _    _    _     \n" +
                " |_ _| \\ | / ___||  _ \\_ _|  _ \\    / \\|_   _|_ _/ _ \\| \\ | |  / \\  | |    \n" +
                "  | ||  \\| \\___ \\| |_) | || |_) |  / _ \\ | |  | | | | |  \\| | / _ \\ | |    \n" +
                "  | || |\\  |___) |  __/| ||  _ <  / ___ \\| |  | | |_| | |\\  |/ ___ \\| |___ \n" +
                " |___|_| \\_|____/|_|__|___|_|_\\_\\/_/   \\_\\_|_|___\\___/|_| \\_/_/   \\_\\_____|\n" +
                " / ___| / ___|  _ \\|_ _|  _ \\_   _| | | |  _ \\| ____|                      \n" +
                " \\___ \\| |   | |_) || || |_) || | | | | | |_) |  _|                        \n" +
                "  ___) | |___|  _ < | ||  __/ | | | |_| |  _ <| |___                       \n" +
                " |____/ \\____|_| \\_\\___|_|    |_|  \\___/|_| \\_\\_____|                      ");

        System.out.println("\n"+"*********************************************************\n");

        System.out.println(Scriptures.scriptures[r.nextInt((Scriptures.length - 2) + 1)]);

        // Another line decoration
        System.out.println("\n*********************************************************" +"\n\n");
    }

    public static void main(String[] args) {
        printScript();
        // Sergeant Marianne's code goes here --> If she ever writes any... haha :)

    }
}