package packer;


/** changes made to this file so far
 * 
 *  Commented out duplicated add product function
 * Changed everything from getWeight() to getTotalWeight() because manifest did not have the function getWeight()
 * 
 * 
 * 
 * 
 * 
 */

/**
 *
 * @author I.M.Bad
 */
public class Box {
    
    
    private Manifest contents;
    private Customer customer;
    private Depot depot; 

    public Box(Customer customer, Depot depot) {
        this.customer = customer;
        this.depot = depot;
        contents = new Manifest();
    }
    
//    public void addProduct(Product product) {
//        if (canFit(product)) {
//            contents.addProduct(product, 1);
//        }
//    }
//    
    
    
//    public void addProduct(Product product, int quantity) {
//        if (canFit(product,quantity)); {
//            contents.addProduct(product, quantity);
//        }
//    }
   
    public String getLabel() {
        StringBuilder label = new StringBuilder();
        label.append(customer);
        label.append("\n");
        label.append(customer.getClosestAddressTo(depot));
        label.append("\n");
        label.append(contents.toString());
        label.append("\n");
        if (this.isFragile()) {
            label.append("FRAGILE\n");
        }
        return label.toString();
    }
    
    public String toString() {
        return getLabel();
    }
    
    public double getTotalWeight() {
        return contents.getTotalWeight();
    }
    
    public void addProduct(Product product, int quantity) {
        if (canFit(product)) {
            contents.addProduct(product, quantity);
        }
    }
    
    public boolean canFit(Product p) {
        return p.getWeight() < 40;
    }
    
    public boolean canFit(Product p, int quantity) {
        return (p.getWeight() * quantity) < 40;
    }
    
    public double remainingCapacity() {
        return 40 - this.getTotalWeight();
    }
    
    public boolean isFragile() {
        return contents.hasFragileItems();
    }
    
//    public boolean isHazardous() {
//        return false;
//    }
}
