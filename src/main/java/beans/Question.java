package beans;

/**
 * Created by Kokhaniuk
 * on 09.11.2018 16:33
 */
public class Question {
    private int quesno;
    private String body;
    private String thunderClan;
    private String riverClan;
    private String skyClan;
    private String windClan;
    private String shadowClan;
    private String kittyPet;
    private String tribeOfFallingWater;
    private String bloodClan;
    private String tramp;

    public int getQuesno() {
        return quesno;
    }

    public void setQuesno(int quesno) {
        this.quesno = quesno;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getThunderClan() {
        return thunderClan;
    }

    public void setThunderClan(String thunderClan) {
        this.thunderClan = thunderClan;
    }

    public String getRiverClan() {
        return riverClan;
    }

    public void setRiverClan(String riverClan) {
        this.riverClan = riverClan;
    }

    public String getSkyClan() {
        return skyClan;
    }

    public void setSkyClan(String skyClan) {
        this.skyClan = skyClan;
    }

    public String getWindClan() {
        return windClan;
    }

    public void setWindClan(String windClan) {
        this.windClan = windClan;
    }

    public String getShadowClan() {
        return shadowClan;
    }

    public void setShadowClan(String shadowClan) {
        this.shadowClan = shadowClan;
    }

    public String getKittyPet() {
        return kittyPet;
    }

    public void setKittyPet(String kittyPet) {
        this.kittyPet = kittyPet;
    }

    public String getTribeOfFallingWater() {
        return tribeOfFallingWater;
    }

    public void setTribeOfFallingWater(String tribeOfFallingWater) {
        this.tribeOfFallingWater = tribeOfFallingWater;
    }

    public String getBloodClan() {
        return bloodClan;
    }

    public void setBloodClan(String bloodClan) {
        this.bloodClan = bloodClan;
    }

    public String getTramp() {
        return tramp;
    }

    public void setTramp(String tramp) {
        this.tramp = tramp;
    }

    @Override
    public String toString() {
        return "Question{" +
                "quesno=" + quesno +
                ", body='" + body + '\'' +
                ", thunderClan='" + thunderClan + '\'' +
                ", riverClan='" + riverClan + '\'' +
                ", skyClan='" + skyClan + '\'' +
                ", windClan='" + windClan + '\'' +
                ", shadowClan='" + shadowClan + '\'' +
                ", kittyPet='" + kittyPet + '\'' +
                ", tribeOfFallingWater='" + tribeOfFallingWater + '\'' +
                ", bloodClan='" + bloodClan + '\'' +
                ", tramp='" + tramp + '\'' +
                '}';
    }
}
