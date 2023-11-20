package chapterEight;

public enum GeoPoliticalZone {
    northCentral("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    northEast("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    northWest("Kaduna","Katsina","Kano","Kebbi","Sokoto", "Jigawa","Zamfara"),
    southEast("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    southSouth("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    southWest("Ekiti", "Lagos","Osun","Ondo", "Ogun","Oyo");
    private String[] states;
    GeoPoliticalZone(String... states){
       this.states = states;
    }

    public String[] getStates() {
        return states;
    }
}
