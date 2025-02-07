public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        
        System.out.println("Do I like nature? " + Main.isALike("nature"));
        System.out.println("Do I like running? " + Main.isALike("running"));


        Main.printAboutMe();
    }

    public static void printAboutMe() {
        System.out.println("I like traveling, food, cooking, photography, nature, and animals.");
    }

    public static boolean isALike(String topic) {
        String myLikes = "I like traveling, food, cooking, photography, nature, and animals.";

        return myLikes.contains(topic);
    }
}