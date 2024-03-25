package fc.java.part1;

import fc.java.poly.Dog;
import fc.java.poly.Animal;
import fc.java.poly.Cat;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Animal[] ani=new Animal[2];
        ani[0]=d;
        ani[1]=c;
        display(ani);
    }

    public static void display(Animal[] ani){
        for(int i=0;i<ani.length;i++){
            ani[i].eat(); // ani[0]=Dog, ani[1]=Cat
            if(ani[i] instanceof Cat){
                ((Cat)ani[i]).night();
            }
        }
    }
}
