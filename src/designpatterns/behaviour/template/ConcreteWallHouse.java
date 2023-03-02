package designpatterns.behaviour.template;

public class ConcreteWallHouse extends House{
    @Override
    public void decorateHouse() {
        System.out.println("decorating ConcreteWallHouse");
    }
    @Override
    public void paintHouse() {

        System.out.println("paint House ConcreteWallHouse");
    }

    @Override
    public void constructDoors() {

        System.out.println("constructing doors ConcreteWallHouse");
    }

    @Override
    public void constructWindows() {

        System.out.println("constructing windows ConcreteWallHouse");
    }

    @Override
    public void constructWalls() {

        System.out.println("constructing walls ConcreteWallHouse");
    }
}
