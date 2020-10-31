package Day11;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/10/31
 **/

public class Student {
    private String name;
    private int age;
    private int stature;
    private SpecialityEnum specialities;

    public Student(String name, int age, int stature) {
        this.name = name;
        this.age = age;
        this.stature = stature;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStature() {
        return stature;
    }

    public SpecialityEnum getSpecialities() {
        return specialities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}