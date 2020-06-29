public enum HornSound {
    LONG_HORN("HOOONNNKKK!"), SHORT_HORN("HONK!"), SQUEAKY_HORN("SQUEAK!"), BROKEN_HORN("OOF!");

    private String sound;
    HornSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }


    @Override
    public String toString() {
        return getSound();
    }
}
