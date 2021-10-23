class CTest
{
    void test(int n)
    {
        if(n%2==1)
        System.out.println("n="+n+",此數為奇數");
        else if(n==0)
        System.out.println("n="+n+",此數為0");
        else
        System.out.println("n="+n+",此數為偶數");
    }
}
public class hw8_7 {
public static void main (String args[]){
CTest a = new CTest();
a.test(3);
a.test(8);
a.test(0);
}
}
