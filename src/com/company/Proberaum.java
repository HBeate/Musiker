package com.company;

public class Proberaum {
    public static void main(String[] args) {

        Saenger saenger = new Saenger("Marilyn Monroe", "Mortenson", "Norma Jean");
        Gitarrist gitarrist = new Gitarrist("Jime Hendrix", "Hendrix", "Johnny Allen");
        Bassist bassist = new Bassist("Mel Schacker", "Schacher", "Melvin George");
        Trompeter trompeter = new Trompeter("Louis Armstrong", "Armstrong", "Louis Daniel");
        BackgroundSaengerin backgroundSaengerin = new BackgroundSaengerin("Brittney Westouver", "Westover", "Brittney");
        machtMusik(saenger, gitarrist, bassist, trompeter, backgroundSaengerin);
    }
    public static void machtMusik(Musiker... gruppe){
        for(Musiker musiker : gruppe){
            musiker.musizieren();
        }
    }
}
