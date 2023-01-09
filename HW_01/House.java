public class House {
    private String  address;
    private int     yearBuilt;
    private double  numBaths;
    private boolean isRenovated;

    public House(String address, int yearBuilt, double numBaths, boolean isRenovated) {
        this.address     = address;
        this.yearBuilt   = yearBuilt;
        this.numBaths    = numBaths;
        this.isRenovated = isRenovated;
  
    }

    public House(String address, double numBaths) {
        this(address, 1984, numBaths, false);
    }

    public House() {
        this("North Ave NW, Atlanta, GA 30332", 1984, 1.0d, false);
    }


    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }



    public void setYearBuilt(int yearBuilt) {
        if (yearBuilt > 0) {
            this.yearBuilt = yearBuilt;
        } else {
            System.out.println("Invalid Parameters");
        }
    }
    public int getYearBuilt() {
        return yearBuilt;
    }



    public void setNumBaths(double numBaths) {
        if ((numBaths > 0) && (numBaths % 0.5 == 0)) {
            this.numBaths = numBaths;
        } else {
            System.out.println("Invalid Parameter");
        }
    }
    public double getNumBaths() {
        return numBaths;
    }

    public boolean isRenovatedBoolean() {
        return isRenovated;
    }


}
