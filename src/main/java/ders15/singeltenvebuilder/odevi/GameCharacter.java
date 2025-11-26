package ders15.singeltenvebuilder.odevi;

public class GameCharacter {

    private String name;
    private int armor;
    private int damage;
    private String race;

    private GameCharacter (String name, int armor, int  damage, String race) {
        this.name = name;
        this.armor = armor;
        this.damage = damage;
        this.race = race;
    }

    public static class Builder {

        private String name;
        private int armor;
        private int damage;
        private String race;

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder armor(int armor) {
            this.armor = armor;
            return this;
        }
        public Builder damage(int damage) {
            this.damage = damage;
            return this;
        }
        public Builder race(String race) {
            this.race = race;
            return this;
        }
        public GameCharacter build() {
            return new GameCharacter(name, armor, damage, race);
        }
    }

    @Override
    public String toString() {
        return "Character => " +
                "name='" + name + '\'' +
                ", armor=" + armor +
                ", race='" + race + '\'' +
                ", damage=" + damage;
    }

}
