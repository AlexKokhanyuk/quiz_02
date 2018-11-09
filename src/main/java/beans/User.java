package beans;

/**
 * Created by Kokhaniuk
 * on 26.10.2018 15:36
 */
public class User {


    private String name;
    private String surName;
    private int thunderClan;
    private int riverClan;
    private int skyClan;
    private int windClan;
    private int shadowClan;
    private int Pers06;
    private int Pers07;
    private int Pers08;

    public int getKittyPet() {
        return kittyPet;
    }

    private int kittyPet;



    public void incrThunderClan(){
        thunderClan++;
    }

    public void incrRiverClan(){
        riverClan++;
    }

    public void incrWindClan(){
        windClan++;
    }

    public void incrShadowClan(){
        shadowClan++;
    }


    public void incrKittyPet(){
        kittyPet++;
    }

    public void incrPers06(){
        Pers06++;
    }





    public void incrSkyClan(){
        skyClan++;
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
                "thunderClan=" + thunderClan +
                ", riverClan=" + riverClan +
                ", skyClan=" + skyClan +
                ", windClan=" + windClan +
                ", shadowClan=" + shadowClan +
                ", Pers06=" + Pers06 +
                ", Pers07=" + Pers07 +
                ", kittyPet=" + kittyPet +
                '}';
    }
}
