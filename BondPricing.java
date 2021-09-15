import java.lang.Math.*;
/**
 * @author Kazi
 * Special thanks to Brian Bryne from University of Dublin
 * */



public class BondPricing {
    public static void main(String[] args) {
        double Face = 1000;
        double cr = 0.06;
        double r = 0.056;
        int m = 2;
        double T = 3;

        System.out.println(PVB(Face, cr, r, m, T) + " final increment");
    }


    //PVB stands for Present value bond price

    public static double PVB(double Face, double cr, double r, int m, double T){


        double BV = 0; //where BV is bond value

        double TNC = T*m;
        double cpn = (cr/m)*Face;
        for(int i = 1; i <= (int) TNC; i++){
            double ti = (double) (i/m);
            BV = BV + cpn*Math.pow((1+r/m), -ti*m);
            System.out.println(BV + " annual increment");
        }


        BV = BV + Face*Math.pow((1+r/m), -T*m);

        return BV;
    }

}
