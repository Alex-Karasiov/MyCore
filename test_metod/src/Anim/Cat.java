package Anim;

public class Cat {
    int id;
    String breed_of_pet; //парода домашнего животного
    String id_pet_breeder; //заводчик домашнего животного
    int age;

    public Cat() {
    }

    public Cat(int id, String breed_of_pet, String id_pet_breeder, int age) {
        this.id = id;
        this.breed_of_pet = breed_of_pet;
        this.id_pet_breeder = id_pet_breeder;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed_of_pet() {
        return breed_of_pet;
    }

    public void setBreed_of_pet(String breed_of_pet) {
        this.breed_of_pet = breed_of_pet;
    }

    public String getId_pet_breeder() {
        return id_pet_breeder;
    }

    public void setId_pet_breeder(String id_pet_breeder) {
        this.id_pet_breeder = id_pet_breeder;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", breed_of_pet='" + breed_of_pet + '\'' +
                ", id_pet_breeder='" + id_pet_breeder + '\'' +
                ", age=" + age +
                '}';
    }


}
