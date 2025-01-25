public class Item {
    private final String name;
    private Rarity rarity;
    private int upgradeCount;

    public Item(String name, Rarity rarity) {
        this.name = name;
        this.rarity = rarity;
        this.upgradeCount = 0;
    }

    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public int getUpgradeCount() {
        return upgradeCount;
    }

    public void upgrade() {
        if (rarity == Rarity.EPIC && upgradeCount < 2) {
            upgradeCount++;
        } else if (rarity.ordinal() < Rarity.LEGENDARY.ordinal()) {
            rarity = Rarity.values()[rarity.ordinal() + 1];
            upgradeCount = 0;
        }
    }

    @Override
    public String toString() {
        return name + " (" + rarity + (rarity == Rarity.EPIC ? " " + upgradeCount : "") + ")";
    }
}
