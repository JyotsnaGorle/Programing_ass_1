/**
 * Created by jyotsna on 18/02/15.
 */
public class Diamondname {
    void display(int n){
        int x=n/2;
        for(int i=1;i<=n-1;i+=2){
            for(int k=x;k>0;k--){
                System.out.print(" ");
            }
            x--;
            for(int j=0;j<i;j++){

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Jyotsna");
        x=1;
        for(int i=n-2;i>0;i-=2){
            for(int k=1;k<=x;k++)
            {
                System.out.print(" ");
            }
            x++;
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
