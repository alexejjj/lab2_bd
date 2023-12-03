public class Main {
    public static void main(String[] args) {
        Racer player;
        player = new Racer("Alex", "1999-02-22", 2, 149);
        String nameOfPlayer = player.getName();
        System.out.println(nameOfPlayer);
    }
}