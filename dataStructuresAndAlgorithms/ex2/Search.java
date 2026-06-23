package dataStructuresAndAlgorithms.ex2;

public class Search {
    
    public static Product search(Product[] p,int id)
    {
        for(int i=0;i<p.length;i++)
        {
            if(p[i].id==id)
            {
                return p[i];
            }
        }
        return null;
    }
}
