
/**
 * Ahmir Devezin
 *
 * @
 * @2/7/26
 */
public class Pet
{
    //private string name
    private String name;
    
    public Pet(){
        setName("Pet Name");
    }
    // adding setters and getters
    public void setName(String newName){
        name = newName;
    }
    
    public String getName(){
        return name;
    }
    // string output created
    public String toString(){
        String output = "Pet information:\n";
        output += "Name: " + this.getName() + "\n";
        return output;
    }
    // main method
    public static void main (String[] args){
        
        Pet p1 = new Pet();
        System.out.print(p1.toString());

        
        Pet p2 = new Pet();
        p2.setName("Rufus");
        System.out.print(p2.toString());
    
    }

}