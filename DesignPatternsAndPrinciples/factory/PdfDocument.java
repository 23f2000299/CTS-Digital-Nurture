package DesignPatternsAndPrinciples.factory;

public class PdfDocument implements Document{
    
    public void create()
    {
        System.out.println("the pdf doc is created ");
    }
}
