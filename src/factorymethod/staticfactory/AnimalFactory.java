package factorymethod.staticfactory;

import factorymethod.factory.Animal;
import factorymethod.factory.Cat;
import factorymethod.factory.Dog;

public class AnimalFactory {

    private static Dog createDog() {
        return new Dog();
    }

    private static Cat createCat() {
        return new Cat();
    }

    public static Animal createAnimal(String type) {
        if ("dog".equals(type)) {
            return createDog();
        } else if ("cat".equals(type)) {
            return createCat();
        } else {
            return null;
        }
    }

}
