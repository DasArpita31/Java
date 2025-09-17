class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;
    
    public Pizza(String size,int cheeseToppings,int pepperoniToppings,int hamToppings){
        this.size=size.toLowerCase();
        this.cheeseToppings=cheeseToppings;
        this.pepperoniToppings=pepperoniToppings;
        this.hamToppings=hamToppings;
    }
    
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size=size.toLowerCase();
    }
    public int getCheeseToppings(){
        return cheeseToppings;
    }
    public void setCheeseToppings(int cheeseToppings){
        this.cheeseToppings=cheeseToppings;
    }
    public int getPepperoniTopppings(){
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }
    
    public double calcCost(){
        int totalToppings =cheeseToppings+pepperoniToppings+hamToppings;
         switch (size) {
            case "small": return 10 + (2 * totalToppings);
            case "medium": return 12 + (2 * totalToppings);
            case "large": return 14 + (2 * totalToppings);
            default: return 0;
        }
    }
    
    public String getDescription(){
        return "Pizza size: "+size+",Cheese: "+cheeseToppings+", Pepperoni: "+pepperoniToppings+",Ham: "+hamToppings+",Cost: $"+calcCost();   
    }
}
class PizzaOrder {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    
    public void setPizza1(Pizza pizza1){
        this.pizza1=pizza1;
    }
    public void setPizza2(Pizza pizza2){
        this.pizza2=pizza2;
    }
    public void setPizza3(Pizza pizza3){
        this.pizza3=pizza3;
    }
    
    public double calcTotal(){
        double total = 0;
        if(pizza1!=null)
            total+=pizza1.calcCost();
        if(pizza2!=null)
            total+=pizza2.calcCost();
        if(pizza3!=null)
            total+=pizza3.calcCost();
        return total;
    }
}
public class Main {
    public static void main(String Args[]){
        Pizza p1 = new Pizza("large",1,1,2);
        Pizza p2 =new Pizza("medium",2,1,1);
        
        System.out.println(p1.getDescription());
        System.out.println(p2.getDescription());
        
        PizzaOrder order = new PizzaOrder();
        order.setPizza1(p1);
        order.setPizza2(p2);
        
        System.out.println("Total order cost: %"+ order.calcTotal());
    }
}
