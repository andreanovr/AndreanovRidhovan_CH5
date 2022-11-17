class car extends vehicle {
    String Type;

    car(String Type) {
        super();
        super.Engine= "Gasoline";
        super.Tyre= 4;
        super.isSunroof=true;
        this.Type = Type;
    }

    public String toString() {
        return (super.toString())+
                "\n========================";
    }
}
