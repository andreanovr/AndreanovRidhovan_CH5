class suzukiKatana extends car {
    suzukiKatana() {
        super("Suzuki Katana");
    }

    public String toString() {
        return ("\n========================\n"+Type+
                "\n========================"
                +super.toString());
    }
}