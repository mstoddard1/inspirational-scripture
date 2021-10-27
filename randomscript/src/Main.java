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
    public static String[] scriptures = {". . . and whoso would hearken unto the word " +
            "of God, and would hold fast unto it, they would never perish; neither could the temptations and the fiery" +
            " darts of the adversary overpower them unto blindness, to lead them away to destruction. - 1 Nephi 15:24",
            "Be strong and of a good courage; be not afraid, neither be thou dismayed: for the Lord thy " +
                    "God is with thee whithersoever thou goest. Joshua 1:9", "Wherefore, be not weary in well-doing, " +
            "for ye are laying the foundation of a great work. And out of small things proceedeth that which is great. - D&C 64:33",
            "Behold, I am God; give heed to my word, which is quick and powerful, sharper than a two-edged sword, to the " +
                    "dividing asunder of both joints and marrow; therefore, give heed unto my word. - D&C 12:2",
            "Therefore, if you will ask of me you shall receive; if you will knock it shall be opened unto you. - D&C 12:5"};
    public static int length = scriptures.length + 1;


    public static void printScript() {
        Random r = new Random();
//        System.out.println(r.nextInt((Main.length - 0) + 1) + 0);
        // Added line decorations for separators
        System.out.println("  ___ _   _ ____  ____ ___ ____      _  _____ ___ ___  _   _    _    _     \n" +
                " |_ _| \\ | / ___||  _ \\_ _|  _ \\    / \\|_   _|_ _/ _ \\| \\ | |  / \\  | |    \n" +
                "  | ||  \\| \\___ \\| |_) | || |_) |  / _ \\ | |  | | | | |  \\| | / _ \\ | |    \n" +
                "  | || |\\  |___) |  __/| ||  _ <  / ___ \\| |  | | |_| | |\\  |/ ___ \\| |___ \n" +
                " |___|_| \\_|____/|_|__|___|_|_\\_\\/_/   \\_\\_|_|___\\___/|_| \\_/_/   \\_\\_____|\n" +
                " / ___| / ___|  _ \\|_ _|  _ \\_   _| | | |  _ \\| ____|                      \n" +
                " \\___ \\| |   | |_) || || |_) || | | | | | |_) |  _|                        \n" +
                "  ___) | |___|  _ < | ||  __/ | | | |_| |  _ <| |___                       \n" +
                " |____/ \\____|_| \\_\\___|_|    |_|  \\___/|_| \\_\\_____|                      ");

        System.out.println("\n"+"*********************************************************\n");

        System.out.println(Main.scriptures[r.nextInt((Main.length - 2) + 1)]);

        // Another line decoration
        System.out.println("\n*********************************************************" +"\n\n");
    }

    public static void main(String[] args) {
        printScript();
        // Marianne's code goes here --> If she ever writes any... haha :)


    }
}