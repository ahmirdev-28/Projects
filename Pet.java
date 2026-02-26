/**
 * Ahmir Devezin
 * 2/7/26
 */

public class Pet {

    //  data fields
    private String name;
    private String type;
    private int age;

    // Default constructor
    public Pet() {
        setType("Animal");
        setName("Pet Name");
        setAge(1);
    }

    // Custom constructor
    public Pet(String type, String name, int age) {
        setType(type);
        setName(name);
        setAge(age);
    }

    // Setters
    public void setName(String newName) {
        name = newName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    // Custom speak method
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        }
        else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        }
        else {
            return "Yowl";
        }
    }

    // toString method
    public String toString() {
        String output = "Pet information:\n";
        output += "Type: " + type + "\n";
        output += "Name: " + name + "\n";
        output += "Sound: " + speak() + "\n";
        output += "Age:  " + age + "\n";
        return output;
    }
}