
class vehicle{
    int milage;
    int price;
    String color;
    String brand;
    String model;
    
    public void data(int milage , int price){
        this.milage = milage;
        this.price = price;
    }
    
    public void model(String color , String brand , String model){
        this.color = color;
        this.brand = brand;
        this.model = model;
        
        
        System.out.println("vehicel milage is " + this.milage);
        System.out.println("vehicel price is " + this.price);
        System.out.println("vehicel color is " + this.color);
        System.out.println("vehicel brand is " + this.brand);
        System.out.println("vehicel model is " + this.model);
    }
    
    
};


class abc{
    public int a = 10;
}

class xyz{
    
}

public class sample {
    public static void main(String[] args){
        vehicle obj = new vehicle();

        obj.data(345, 900000);

        obj.model("black" , "ford" , "cv1245ij");
        
    }
}





// data member about milage and price of vehicle with the help of a  member function model print the color brand and the model of vehicle





// make a class named as abc 