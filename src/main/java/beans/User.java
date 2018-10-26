package beans;

/**
 * Created by Kokhaniuk
 * on 26.10.2018 15:36
 */
public class User {
    int thunderClan;
    int riverClan;
    int skyClan;
    int windClan;
    int shadowClan;
    int Pers06;
    int Pers07;
    int Pers08;
    int kittyPet;



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
