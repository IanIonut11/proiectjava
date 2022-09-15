class Wizard extends Fighter {
    private boolean prePared = false;
    @Override
    boolean isVulnerable() {
        return !prePared;
    }
    @Override
    int damagePoints(Fighter warrior) {
        return prePared ? 12 : 3;
    }
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
    void prepareSpell() {
        prePared = true;
    }
}

