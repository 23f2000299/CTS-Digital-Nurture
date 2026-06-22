package DesignPatternsAndPrinciples.factory;

public class ExcelDocument implements Document{
    
    public void create()
    {
        System.out.println("the excel doc is created ");
    }
}
