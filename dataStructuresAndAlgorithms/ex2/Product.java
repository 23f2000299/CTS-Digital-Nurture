package dataStructuresAndAlgorithms.ex2;

public class Product {

    int id;
    String name;
    String category;

    Product(int id,String name,String category)
    {
        this.id=id;
        this.name=name;
        this.category=category;
    }

    void print()
    {
        System.out.println("id : "+id+" name: "+name+" category: "+category);
    }
    
}
