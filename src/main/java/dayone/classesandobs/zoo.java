package dayone.classesandobs;

public class zoo {
    public static void main(String[] args) {
   // dataType of thing we want to create is an animal
        Animal animal1 = new Animal("jackie", 2,"woof woof");
        Animal animal2 = new Animal("mikey", 3,"raawwrrr");
String result = animal1.makeNoise();
        System.out.println(result);
        int eyes = animal1.returnEyes();
        System.out.println(eyes);

    }
}
