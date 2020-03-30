package com.company;

import java.util.ArrayList;
import java.util.List;

public class RehearsalRoom {
    public static void main(String[] args) {

        Singer singer = new Singer("Marilyn Monroe", "Mortenson", "Norma Jean");
        Guitarrist guitarrist = new Guitarrist("Jime Hendrix", "Hendrix", "Johnny Allen");
        Bassist bassist = new Bassist("Mel Schacker", "Schacher", "Melvin George");
        Trumpeter trumpeter = new Trumpeter("Louis Armstrong", "Armstrong", "Louis Daniel");
        BackgroundSinger backgroundSinger = new BackgroundSinger("Brittney Westouver", "Westover", "Brittney");

        trumpeter.makeMusic();
        Musician musician1 = new Musician("Tom Bates", "Tom", "Bates");
        musician1.makeMusic();
        Band band1 = new Band("meineBand");
        band1.addMusician(musician1);
        band1.addMusician(singer);
        band1.addMusician(backgroundSinger);

        band1.printMusicians();
    }
}
