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
    private int Pers06;
    private int Pers07;
    private int Pers08;
    private int countKittyPet;


    public int getKittyPet() {
        return countKittyPet;
    }





    public void incrThunderClan(){
        countThunderClan++;
    }

    public void incrRiverClan(){
        countRiverClan++;
    }

    public void incrWindClan(){
        countWindClan++;
    }

    public void incrShadowClan(){
        countShadowClan++;
    }


    public void incrKittyPet(){
        countKittyPet++;
    }

    public void incrPers06(){
        Pers06++;
    }





    public void incrSkyClan(){
        countSkyClan++;
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




    @Override
    public String toString() {
        return "User{" +
                "thunderClan=" + countThunderClan +
                ", riverClan=" + countRiverClan +
                ", skyClan=" + countSkyClan +
                ", windClan=" + countWindClan +
                ", shadowClan=" + countShadowClan +
                ", Pers06=" + Pers06 +
                ", Pers07=" + Pers07 +
                ", kittyPet=" + countKittyPet +
                '}';
    }
}
