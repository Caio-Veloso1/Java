public class Maquina {

    private boolean occuped = false, needWater, needShampoo, isclean = true;
    private int water, shampoo;
    private Pet pet;
    public void bath(Pet pet){
        if(isOccuped()){
            System.out.println("Occuped");
            return;
        }
        if(!Isclean()){
            System.out.println("Maquina is dirty");
            return;
        }
        if(water < 10 || shampoo < 2){
            needWater = true;
            System.out.println("Need water or shampoo");
        }else {
            occuped = true;
            water -= 10;
            shampoo -= 2;
            pet.setClean(true);
            System.out.printf("O %s está limpo", pet.getName());
        }
    }
    public boolean isOccuped(){
        return occuped;
    }
    public void RemovePet(){
        occuped = false;
    }
    public boolean Isclean(){
        return isclean;
    }

    public void cleanMaquina(){
        if (water < 3 || shampoo < 1){
            System.out.println("No water or shampoo");
            return;
        }
        System.out.println("Maquina clean");
        water -= 3;
        shampoo -= 1;
        isclean = true;
    }
    public void supplyWater(){
        if((water+2) > 30 ){
            System.out.println("Water is full");
        }else water+=2;
    }
    public void supplyShampoo(){
        if((shampoo+2) > 10 ){
            System.out.println("Shampoo is full");
        }else shampoo+=2;
    }
    public int getShampoo(){
        return shampoo;
    }
    public int getWater(){
        return water;
    }

}
