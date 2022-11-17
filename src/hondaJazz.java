class hondaJazz extends car {
    hondaJazz() {
        super("Honda Jazz");
    }

    public String toString() {
        return ("\n========================\n"+Type+
                "\n========================"
                +super.toString());
    }
}