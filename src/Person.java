/**
 *
 * @author Aryan Inamdar
 * @version 4/28/21
 */

public class Person {
    private String name;
    private int heightinCm;

    public Person() {

    }

    public Person(String name, int heightinCm) {
        this.name = name;
        this.heightinCm = heightinCm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeightinCm() {
        return heightinCm;
    }

    public void setHeightinCm(int heightinCm) {
        this.heightinCm = heightinCm;
    }
}
