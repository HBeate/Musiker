package com.company;

public class RehearsalRoom {
    public static void main(String[] args) {

        Singer singer = new Singer("Marilyn Monroe", "Mortenson", "Norma Jean");
        Guitarrist guitarrist = new Guitarrist("Jime Hendrix", "Hendrix", "Johnny Allen");
        Bassist bassist = new Bassist("Mel Schacker", "Schacher", "Melvin George");
        Trumpeter trumpeter = new Trumpeter("Louis Armstrong", "Armstrong", "Louis Daniel");
        BackgroundSinger backgroundSinger = new BackgroundSinger("Brittney Westouver", "Westover", "Brittney");
        makesMusic(singer, guitarrist, bassist, trumpeter, backgroundSinger);
    }

    // Liste wäre hier besser, da es mehrere Singer,.. geben kann.
    public static void makesMusic(Musician... gruppe) {
        for (Musician musician : gruppe) {
            musician.makeMusic();
        }
    }
}
