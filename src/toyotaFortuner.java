class toyotaFortuner extends car {
    toyotaFortuner() {
        super("Toyota Fortuner");
    }

    public String toString() {
        return ("\n========================\n"+Type+
                "\n========================"
                +super.toString());
    }
}