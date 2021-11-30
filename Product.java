
public class Product
{
    private String name;
    private boolean isVege;
    
    public Product(String name, boolean isVege){
        this.name = name;
        this.isVege = isVege;
    }
    public String getName(){
        return this.name;
    }
    public boolean getIsVege(){
        return this.isVege;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setIsVege(boolean isVege){
        this.isVege = isVege;
    }
    public void display(){
        System.out.println(name + " is vege: " + true);
    }
    public static void main(String[] args){
        Product p1 = new Product("apple", true);
        p1.display();
    }
}
