package Assignment1;

public class Car {
    String company;
    String model;
    short year;
    String color;
    String engineType;
    String initialGearNo;

    public int changeGear(int initialGearNo, int toChangeGearNo ){
        if (initialGearNo != toChangeGearNo){
            return 1;
        }
        else{
            return 0;
        }
    }

    public String getCompany(String company){
        return company;
    }

    public static void main(String[] args){

    }
}
