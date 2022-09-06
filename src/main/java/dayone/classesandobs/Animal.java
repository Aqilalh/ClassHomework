package dayone.classesandobs;
///Blueprint making objects
public class Animal {
    // default constructor
    public String animalName;
    public int eyes;
    public String animalSound;

public Animal(String animalName, int eyes, String animalSound){
this.animalName = animalName;
this.eyes = eyes;
this.animalSound = animalSound;
}
//Overloaded constructor
public Animal(String animalName){
    this.animalName = animalName;
}
//Method
/*
accessModifier | return Data type | name () | {}
 */
 // when u use public void u need to add a sout but when U use a date type like a String, Boolean, double in the method you have to use return
    public String makeNoise(){
    return this.animalName + "=========> " + this.animalSound; // return a data type value
    }
    public int returnEyes(){
        return this.eyes;
    }
}
