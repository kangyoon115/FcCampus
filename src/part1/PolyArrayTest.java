package part1;

import poly.Animal;
import poly.Cat;
import poly.Dog;

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
