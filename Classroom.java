public class Classroom {
    
    public static void main(String[] args) {
        Wilder jean = new Wilder("Jean", false);
        Wilder claude = new Wilder("Claude", true);
        Wilder henry = new Wilder("Henry", true);

        System.out.println(jean.whoAmI());
        System.out.println(claude.whoAmI());
        System.out.println(henry.whoAmI());
    }
}
