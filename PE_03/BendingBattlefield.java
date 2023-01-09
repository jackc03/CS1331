import java.util.Random;

public class BendingBattlefield {
    public static void main(String[] args) {
        //variable declaration
        Random rand = new Random();
        double averageFirePower, averageFireHealth, averageAlliancePower, averageAllianceHealth;
        int numFire, numAlliance; //count of fire heroes & count of all others
        //double health, power;

        //variable initialization
        averageFireHealth     = 0;
        averageFirePower      = 0;
        averageAllianceHealth = 0;
        averageAlliancePower  = 0;
        numFire               = 0;
        numAlliance           = 0;
        int numHeroes = rand.nextInt(51) + 50;
        double boomerangBoost = rand.nextDouble() * 4 + 3.0;
        boomerangBoost = Math.round(boomerangBoost * 100.0) / 100.0;
        System.out.printf("Selecting %d heroes.\n", numHeroes);


        //do the stuff now
        for (int i = 0; i < numHeroes; ++i) {
            BendingType heroType = BendingType.values()[rand.nextInt(5)];

            double health = rand.nextDouble() * 100 + 50;
            health = Math.round(health * 100.0) / 100.0;
            //System.out.println("rand loop num " + i + " " + health);

            double power = rand.nextDouble() * 80 + 40;
            power = Math.round(power * 100.0) / 100.0;
            //System.out.println("rand loop num " + i + " " + power);

            //System.out.println(heroType);


            //tha if statements
            if (heroType == BendingType.FIRE) {
                averageFireHealth += health;
                averageFirePower  += power;
                ++numFire;
            }
            if (heroType == BendingType.NON_BENDER) {
                power *= boomerangBoost;
                power = Math.round(power * 100.0) / 100.0;
            }
            if (heroType == BendingType.NON_BENDER || heroType == BendingType.AIR || heroType == BendingType.WATER || heroType == BendingType.EARTH) {
                averageAllianceHealth += health;
                averageAlliancePower  += power;
                ++numAlliance;
            }

            //hero status printout
            System.out.printf("%s hero has been summoned by his army, adding %.2f power and %.2f health to the army.\n", heroType, (double) power, (double) health);
        }

        //some clean alignment
        averageAllianceHealth = averageAllianceHealth / numAlliance;
        averageAlliancePower  = averageAlliancePower / numAlliance;
        averageFireHealth     = averageFireHealth   / numFire;
        averageFirePower      = averageFirePower   / numFire;


        //print final status
        System.out.printf("The Fire Nation has an average of %.2f power and %.2f health.\n", averageFirePower, averageFireHealth);
        System.out.printf("The Alliance has an average of %.2f power and %.2f health.\n", averageAlliancePower, averageAllianceHealth);

        double allianceScore = 2 * averageAlliancePower + 3 * averageAllianceHealth;
        double fireScore     = 2 * averageFirePower     + 3 * averageFireHealth;
        //System.out.println(fireScore + "\n" + allianceScore + "\n");

        //declare winner
        if (allianceScore < fireScore) {
            System.out.println("The Fire Nation Won!");
        }
        if (allianceScore >= fireScore) {
            System.out.println("The Alliance Won!");
        }

    }
}