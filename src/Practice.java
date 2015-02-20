import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by jyotsna on 18/02/15.
 */
public class Practice {
    public static void main(String[] args)throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    // calling easy
        Easy e = new Easy();
        e.display();
        // input n for straight line
        System.out.println("Enter the value of n");
        int n= Integer.parseInt(read.readLine());
        Hori_line h = new Hori_line();
        h.display(n);

        // vertical line

        Verti_line v = new Verti_line();
        v.display(n);

        // right traingle

        System.out.println("enter no of rows for right triangle");
        int row = Integer.parseInt(read.readLine());
        Rt_triangle rt = new Rt_triangle();
        rt.display(row);

        // iscoceles triangle

        System.out.println("enter no of rows for isoscles triangle");
        int Irow = Integer.parseInt(read.readLine());
        I_triangle it = new I_triangle();
        it.display(Irow);

        System.out.println("enter no of rows for diamond");
        int drow = Integer.parseInt(read.readLine());
        Diamond di = new Diamond();
        di.display(drow);

        //diamond name
        System.out.println("diamond with name");
        Diamondname dn = new Diamondname();
        dn.display(drow);

        //fizzbuzz example
        System.out.println("Fizzbuzz Example");
        fizzbuzz();

        //prime factor
        System.out.println("Enter the number n for prime factor");
        int p = Integer.parseInt(read.readLine());
        generate(p);


    }
    static  void  fizzbuzz(){
        for(int i=1;i<=20;i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
                i++;
            }
            if(i%3==0){
                System.out.println("fizz");
                i++;
            }
            if(i%5==0){
                System.out.println("buzz");

            }

            else System.out.println(i);
        }
    }

static void generate(int n){
    int ctr;
    for(int i=1;i<=n;i++){
        ctr=0;
        for(int j=1;j<=i;j++){
            if(i%j==0)
                ctr++;
            }
            if(ctr==2 && n%i==0)
                System.out.println(i);
        }

    }

}



