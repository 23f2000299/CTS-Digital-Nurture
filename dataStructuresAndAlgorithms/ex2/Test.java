package dataStructuresAndAlgorithms.ex2;

public class Test {


    public static void main(String[] args){


        Product products[] = {

            new Product(101,"Laptop","Electronics"),

            new Product(102,"Phone","Electronics"),

            new Product(103,"Shoes","Fashion"),

            new Product(104,"Watch","Accessories"),

            new Product(105,"Bag","Fashion")

        };


        Product result1 =
        Search.search(products,103);


        System.out.println("Linear Search Result:");

        result1.print();



        Product result2 =
        BinarySearch.binarySearch(products,105);


        System.out.println("Binary Search Result:");

        result2.print();


    }

}