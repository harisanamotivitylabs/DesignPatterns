package designpatterns.behaviour.template;

public class GlassWallHouse extends  House{
    @Override
    public void decorateHouse() {
        System.out.println("decorating   GlassWallHouse");
    }

    @Override
    public void paintHouse() {
        System.out.println("painting   GlassWallHouse");
    }

    @Override
    public void constructDoors() {
        System.out.println("constructing doors GlassWallHouse");
    }

    @Override
    public void constructWindows() {

        System.out.println("constructing windows GlassWallHouse");
    }

    @Override
    public void constructWalls() {

        System.out.println("constructing walls GlassWallHouse");
    }
}
