package Exercise1;

//player
class player {
    String name;
    double health;
    int level;
//object / data member
    weapon weapon;
    armor armor;

    player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(weapon weapon){
            this.weapon = weapon;
    }
    void equipArmor(armor armor){
            this.armor = armor;
    }
    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health + "hp");
            //this.weapon.display();
           // this.armor.display();
    }
}
//senjata
class weapon {
    double attackPower;
    String name;
//constructor
    weapon(String name, double attackPower){
        this.attackPower = attackPower;
        this.name = name;
    }

    void display(){
        System.out.print("Weapon : " + this.name + " " + this.attackPower + " ");
    }

}
//armor
class armor {
    double defensePower;
    String name;
//constructor
    armor(String name, double defensePower){
        this.name = name;
        this.defensePower = defensePower;
    }
    void display(){
        System.out.println("Armor : " + this.name + " " + this.defensePower);
    }
}

public class Main{

public static void main(String[] args) {
    
    //object player 
    player player1 = new player("Abian", 100);

    //object weapon
    weapon pedang = new weapon("pedang",50);

    //object armor
    armor chainmal = new armor("Chainmail", 10);

    //equip weapon dan armor
    player1.equipWeapon(pedang);
    player1.equipArmor(chainmal);

    player1.display();
    player1.weapon.display();
    player1.armor.display();
    

    }
    
}