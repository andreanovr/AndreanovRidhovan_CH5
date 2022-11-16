public class vehicle {
    String Engine;
    boolean isSunroof;
    int Tyre;

    vehicle(){
        this.Engine = Engine;
        this.isSunroof = isSunroof;
        this.Tyre =Tyre;
    }

    public String toString() {
        return ("\nEngine     : " + Engine +
                "\nSunroof    : " + isSunroof +
                "\nNo of Tyre : " + Tyre);
    }
}
