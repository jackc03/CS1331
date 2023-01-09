/**
 * Battlefield class to house main.
 * @author jcochran66
 * @version 1
 */
public class PetBattlefield {
    private Pet[] firstTeam  = new Pet[5];
    private Pet[] secondTeam = new Pet[5];

    /**
     * 2 arg constructor.
     * @param firstTeam Pet array
     * @param secondTeam Pet array
     */
    public PetBattlefield(Pet[] firstTeam, Pet[] secondTeam) {
        if (firstTeam.length > 5 || secondTeam.length > 5) {
            for (int i = 0; i < 5; ++i) {
                this.firstTeam[i]  = null;
                this.secondTeam[i] = null;
            }
        } else {
            this.firstTeam = firstTeam;
            this.secondTeam = secondTeam;
        }
    }

    @Override
    public String toString() {

        String convert = "First Team: ";
        for (int i = 0; i < firstTeam.length; ++i) {
            if (firstTeam[i] == null) {
                convert += "Empty";
            } else {
                convert += firstTeam[i].toString();
            }
            if (i != 4) {
                convert += ", ";
            }
        }

        convert += " vs Second Team: ";
        for (int i = 0; i < secondTeam.length; ++i) {
            if (secondTeam[i] == null) {
                convert += "Empty";
            } else {
                convert += secondTeam[i].toString();
            }
            if (i != 4) {
                convert += ", ";
            }
        }

        return convert;
    }

    /**
     * Compare teams method.
     */
    public void compareTeams() {
        int firstTeamScore = 0;
        for (int i = 0; i < (firstTeam.length <= secondTeam.length ? firstTeam.length : secondTeam.length); ++i) {
            firstTeamScore += firstTeam[i].compareTo(secondTeam[i]);
        }
        if (firstTeamScore > 0) {
            System.out.println("The first team will probably win.");
        } else if (firstTeamScore < 0) {
            System.out.println("The second team will probably win.");
        } else {
            System.out.println("It is an even match.");
        }
    }

    /**
     * Battle method.
     */
    public void battle() {
        boolean loopVar = true;
        //int currentTeam = -1; //current winner, 0 for first team, 1 for second team
        int currentIndex1 = 0; // current index on team one
        int currentIndex2 = 0; // current index on team two

        while (loopVar) {
            for (int i = 0; i < (firstTeam.length <= secondTeam.length ? firstTeam.length : secondTeam.length); ++i) {



                //check for win
                if (firstTeam[4] == null && secondTeam[4] == null) {
                    System.out.println("Both teams fainted.");
                    loopVar = false;
                } else if (secondTeam[4] == null) {
                    System.out.println("The first team won!");
                    loopVar = false;
                } else if (firstTeam[4] == null) {
                    System.out.println("The second team won!");
                    loopVar = false;
                    break;
                }

                //fight
                //System.out.println(currentIndex1 + " " + currentIndex1);
                firstTeam[currentIndex1].attackPet(secondTeam[currentIndex2]);
                secondTeam[currentIndex2].attackPet(firstTeam[currentIndex1]);


                //check for null entry, if not check if it should be null
                if (firstTeam[currentIndex1] != null) {
                    if (firstTeam[currentIndex1].hasFainted()) {
                        firstTeam[currentIndex1] = null;
                        ++currentIndex1;
                    }
                } else {
                    ++currentIndex1;
                }

                //check for null entry, if not check if it should be null
                if (firstTeam[currentIndex2] != null) {
                    if (secondTeam[currentIndex2].hasFainted()) {
                        secondTeam[currentIndex2] = null;
                        ++currentIndex2;
                    }
                } else {
                    ++currentIndex2;
                }
            }
        }
    }


}
