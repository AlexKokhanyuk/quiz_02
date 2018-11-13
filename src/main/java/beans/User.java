package beans;

/**
 * Created by Kokhaniuk
 * on 26.10.2018 15:36
 */
public class User {


    private String name;
    private String surName;
    private int countThunderClan;
    private int countRiverClan;
    private int countSkyClan;
    private int countWindClan;
    private int countShadowClan;
    private int countKittyPet;
    private int countTroubleOfFallingWater;
    private int countBloodClan;
    private int countTramp;


    public void incrThunderClan() {
        countThunderClan++;
    }

    public void incrRiverClan() {
        countRiverClan++;
    }

    public void incrWindClan() {
        countWindClan++;
    }

    public void incrShadowClan() {
        countShadowClan++;
    }


    public void incrKittyPet() {
        countKittyPet++;
    }

    public void incrSkyClan() {
        countSkyClan++;
    }

    public void incrPers06() {
        countTroubleOfFallingWater++;
    }

    public void incrPers07() {
        countBloodClan++;
    }

    public void incrPers08() {
        countTramp++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getCountThunderClan() {
        return countThunderClan;
    }

    public void setCountThunderClan(int countThunderClan) {
        this.countThunderClan = countThunderClan;
    }

    public int getCountRiverClan() {
        return countRiverClan;
    }

    public void setCountRiverClan(int countRiverClan) {
        this.countRiverClan = countRiverClan;
    }

    public int getCountSkyClan() {
        return countSkyClan;
    }

    public void setCountSkyClan(int countSkyClan) {
        this.countSkyClan = countSkyClan;
    }

    public int getCountWindClan() {
        return countWindClan;
    }

    public void setCountWindClan(int countWindClan) {
        this.countWindClan = countWindClan;
    }

    public int getCountShadowClan() {
        return countShadowClan;
    }

    public void setCountShadowClan(int countShadowClan) {
        this.countShadowClan = countShadowClan;
    }

    public int getCountKittyPet() {
        return countKittyPet;
    }

    public void setCountKittyPet(int countKittyPet) {
        this.countKittyPet = countKittyPet;
    }

    public int getCountTribeofFallingWater() {
        return countTroubleOfFallingWater;
    }

    public void setCountTribeofFallingWater(int countTribeofFallingWater) {
        this.countTroubleOfFallingWater = countTribeofFallingWater;
    }

    public int getCountBloodClan() {
        return countBloodClan;
    }

    public void setCountBloodClan(int countBloodClan) {
        this.countBloodClan = countBloodClan;
    }

    public int getCountTramp() {
        return countTramp;
    }

    public void setCountTramp(int countTramp) {
        this.countTramp = countTramp;
    }
}
