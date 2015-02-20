/**
 * Created by jyotsna on 18/02/15.
 */
public class I_triangle {
    void display(int n){
        int x=n/2;
        for(int i=1;i<=n;i+=2){
            for(int k=x;k>0;k--){
                System.out.print(" ");
            }
            x--;
            for(int j=0;j<i;j++){

                System.out.print("*");
            }
            System.out.println();
        }


    }
}
