//write a java program  create class Dog with name and breed attribute 
//create two instances of dog class set attributes using constructor and modify the attributes using setter methods and print the updated values.


class dog12
{
    public static void main(String[] args) 
  {

        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Labrador");

        System.out.println("Before modifying attributes:");
        dog1.display();
        dog2.display();

        dog1.setName("Charlie");
        dog1.setBreed("Beagle");

        dog2.setName("Rocky");
        dog2.setBreed("German Shepherd");

        System.out.println("\nAfter modifying attributes:");
        dog1.display();
        dog2.display();
    }
}

class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setBreed(String breed) 
    {
        this.breed = breed;
    }

    public String getName()
    {
        return name;
    }

    public String getBreed() 
    {
        return breed;
    }
    public void display() 
    {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
}
