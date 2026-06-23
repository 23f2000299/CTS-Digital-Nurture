package dataStructuresAndAlgorithms.ex2;

public class BinarySearch {
    
    public static Product binarySearch(Product[] p,int id)
    {
        int i=0;
        int j=p.length-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(p[mid].id==id)
            {
                return p[mid];
            }
            if(p[mid].id<id)
            {
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return null;
    }
}
