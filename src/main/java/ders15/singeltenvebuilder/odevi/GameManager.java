package ders15.singeltenvebuilder.odevi;

public class GameManager {
    private static GameManager instance;

    private GameManager() {
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void startGame() {
        System.out.println("Oyun başlatıldı!");
    }

    public void stopGame() {
        System.out.println("Oyun durduruldu!");
    }
}
