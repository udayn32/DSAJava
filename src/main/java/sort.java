public class sort {
    int i,j,t;
    int a[]={1,2,3,-7,9};
    void sorting(){
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(a[i]<a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;

                }
            }
        }
    }


    public static void main(String[] args){


    }
}
