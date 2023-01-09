public class Witch extends TrickOrTreater {
    private String signatureSpell;
    private BlackCat companion = new BlackCat();


    public Witch(String name, String neighborhood, int numCandy, String signatureSpell, BlackCat companion) {
        System.out.println("Witch 4 arg");
        this.companion = companion;

        this.name           = name;
        this.neighborhood   = neighborhood;
        this.numCandy       = numCandy;
        this.signatureSpell = signatureSpell;
        totalCandy         += numCandy;
    }
    public Witch(String name, String signatureSpell, BlackCat companion) {
        this(name, "Godric's Hollow", 13, signatureSpell, companion);
    }
    public Witch(Witch copyWitch) {
        this.name           = copyWitch.getName();
        this.neighborhood   = copyWitch.getNeighborhood();
        this.numCandy       = copyWitch.getNumCandy();
        this.signatureSpell = copyWitch.getSignatureSpell();
        this.companion      = copyWitch.getCompanion();
    }

    public void castSpell() {
        System.out.printf("%s casts %s!\n", name, signatureSpell);
        this.setNumCandy(2 * numCandy);
    }

    public String getSignatureSpell() {
        return signatureSpell;
    }
    public void setSignatureSpell(String signatureSpell) {
        this.signatureSpell = signatureSpell;
    }

    public BlackCat getCompanion() {
        return companion;
    }
    public void setCompanion(BlackCat companion) {
        this.companion.setName(companion.getName());
        this.companion.setFamiliar(companion.getFamiliar());
    }

}