package designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Resume resumeBuilder = new Resume.ResumeBuilder(102, "hari", "b.tech", 9859655, "vizag").setExperience(9).build();
        System.out.println(resumeBuilder.toString());
    }
}
