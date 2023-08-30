package Models;

public class Animal {
    protected  String name;
    protected String food;
    protected Integer age;
    protected String breed;

    public Animal(String name, String food, Integer age, String breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void Alimentarse(){
        System.out.println(this.food);
    }
}
