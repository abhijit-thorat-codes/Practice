
public class Speed {

	   final static double lat[]={19.9958587,19.9966983,19.9949567,19.994035,19.993605,19.992445,19.9910817,19.9892017,19.9887483,19.9884483};
	    final static double longi[] ={73.8001825,73.80206,73.80206,73.797915,73.7970583,73.7947983,73.793585,73.7931233,73.7931533,73.7929483};
	    final static int time=2;
	    static double rho[]=new double[10];
	    static double x[]=new double[10];
	    static double y[]=new double[10];
	    static double z[]=new double[10];
	    static double speed[]=new double[10];
	    static double rSpeed[]=new double[10];
	    static long radius=6378100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		speed[0]=0;
        rSpeed[0]=0;

     for(int i=0;i<10;i++)
        {
            double lati=covertInRad(lat[i]);
            double longii=covertInRad(longi[i]);
            rho[i]=(double)radius*(Math.cos(lat[i]));
            z[i]=radius*Math.sin(lati);
            x[i]=rho[i]*Math.cos(longii);
            y[i]=rho[i]*Math.sin(longii);
        }
        for(int i=1;i<10;i++)
        {
            double dot= (x[i]*x[i-1])+ (y[i]*y[i-1])+(z[i]*z[i-1]) ;
            double theta= dot/(radius*radius);
            double angle=Math.acos(theta);
            double distance=radius*angle;
            speed[i]=distance/time;
        }
        calculateRelativeSpeed();
        for(int i=0;i<10;i++){
            System.out.println(""+speed[i]);
        }

    }

    private static void calculateRelativeSpeed() {
        for(int i=1;i<10;i++){
            rSpeed[i]=speed[i]-speed[i-1];
        }
}

    private static double covertInRad(double v) {
    return v*(3.14/180);
    }

}
