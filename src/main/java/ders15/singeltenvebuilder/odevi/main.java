package ders15.singeltenvebuilder.odevi;

public class main {
    public static void main(String[] args) {

        GameManager manager = GameManager.getInstance();
        manager.startGame();

        GameCharacter character = new GameCharacter.Builder()
                .name("Hasan")
                .armor(40)
                .damage(25)
                .race("Elf")
                .build();


        System.out.println(character);

        manager.startGame();
    }
}
