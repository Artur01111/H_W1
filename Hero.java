class Hero {
    private String name;
    private int health;
    private int damage;
    private String superpower;
    public Hero(String name, int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    public String getSuperpower() {
        return superpower;
    }
}
