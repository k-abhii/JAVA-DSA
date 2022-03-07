import java.util.*;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int nstars = 1, nspaces = n / 2, row = 1;
        while (row <= n) {
            for (int i = 1; i <= nspaces; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= nstars; i++) {
                System.out.print("*\t");
            }
            // move to new line 
            System.out.println();
            if (row <= n / 2) { // first half
                nspaces = nspaces - 1;
                nstars = nstars + 2;
                
            } else {// Second half
                nspaces = nspaces + 1;
                nstars = nstars - 2;
                
            }
            row++;
    }

    }
    
}
