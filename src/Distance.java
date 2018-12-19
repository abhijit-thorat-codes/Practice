
public class Distance {
	//DISQ
	static double lat1=19.97428742;
	static double lon1=73.79120345;
	//Mumbai
	static double lat2=19.0895595;
	static double lon2=73.8656144;
	//TQ
	static double lat3=19.97366675;
	static double lon3=73.78992535;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(""+calculationBydistance(lat1,lon1,lat3,lon3));
	}
    /*public static double distance(double lat1, double lng1, double lat2, double lng2) {
        double earthRadius = 6371; //meters
        double dLat = Math.toRadians(lat2 - lat1);
        double dLng = Math.toRadians(lng2 - lng1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
        Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
        Math.sin(dLng / 2) * Math.sin(dLng / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        float dist = (float) (earthRadius * c);
        
        return dist*1000;
       }
    /*
    public static double distance(double lat1, double lon1, double lat2, double lon2) {
	        double radius = 6371;
	        double dLat = lat2 - lat1;
	        double dLon =lon2 - lon1;
	        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
	                Math.cos(lat1) * Math.cos(lat2) *
	                        Math.sin(dLon / 2) * Math.sin(dLon / 2);
	        double c = 2 * Math.asin(Math.sqrt(a));
	        return (radius * c)*1000;
	    }
	
	public static double distance(double lat1, double lat2, double lon1,
	        double lon2, double el1, double el2) {

	    final int R = 6371; // Radius of the earth
	    double latDistance = Math.toRadians(lat2 - lat1);
	    double lonDistance = Math.toRadians(lon2 - lon1);
	    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)+ Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
	            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    double distance = R * c * 1000; // convert to meters

	    double height = el1 - el2;

	    distance = Math.pow(distance, 2) + Math.pow(height, 2);

	    return Math.sqrt(distance);
	}
*/
    public static double calculationBydistance(double lat1, double lon1, double lat2, double lon2) {
        double radius = 6371;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return radius * c;
}
    }
