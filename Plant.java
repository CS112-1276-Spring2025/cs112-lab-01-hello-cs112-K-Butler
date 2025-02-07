public class Plant {
    //INSTANCE VARIABLES
    private String commonName;
    private String family;
    private String color;
    private String shape;
    private int maxFeetWidth;

    //DEFAULT CONSTRUCTORS
    public Plant(String commonName, String family, String color, String shape, int maxFeetWidth) {
        this.setCommonName(commonName);
        this.setFamily(family);
        this.setColor(color);
        this.setShape(shape);
        this.setMaxFeetWidth(maxFeetWidth);
    }

    //FULL CONSTRUCTORS
    public Plant() {
        this("hibiscus", "mallows", "red", "trumpet", 5);
    }

    //MUTATORS+ACCESSORS
    //Setter and getter for commonName
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getCommonName() {
        return commonName;
    }

    //Setter and getter for family
    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    //Setter and getter for color
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //Setter and getter for shape
    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    //Setter and getter for maxFeetWidth
    public void setMaxFeetWidth(int maxFeetWidth) {
        this.maxFeetWidth = maxFeetWidth;
    }

    public int getMaxFeetWidth() {
        return maxFeetWidth;
    }

    //Override toString method to provide a string representation of the Plant
    //object
    @Override
    public String toString() {
        return "Plant{" +
                "commonName='" + commonName + '\'' +
                ", family='" + family + '\'' +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", maxFeetWidth='" + maxFeetWidth + '\'' +
                '}';
    }

    //Equals method
    public boolean equals(Plant other) {
        //Error checking for equal method
        if (other == null) {
            return false;
        }
        
        return this.commonName.equals(other.commonName) &&
                this.family.equals(other.family) &&
                this.color.equals(other.color) &&
                this.shape.equals(other.shape) &&
                this.maxFeetWidth == other.maxFeetWidth;
    }

}
