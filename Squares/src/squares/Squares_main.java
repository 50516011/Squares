package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double x[] = {0.0,0.2,0.4,0.6,0.8,1.0,1.2};
		//double y[] = {1.0,1.9,3.2,4.3,4.8,6.1,7.2};
		double x[] = {0.0,0.1,0.2,0.3,0.4,0.5,0.6};
		double y[] = {0.2,1.0,2.0,3.0,4.2,5.1,6.0};
		double theta[] = new double[2];
		Squares_lib slib = new Squares_lib(x,y);
		
		for(int i=0;i<1000;i++){
			theta = slib.getDx();
			System.out.println(i+":theta[0] = "+theta[0]);
			System.out.println(i+":theta[1] = "+theta[1]);
			System.out.println(i+":Objective function = "+slib.getRx());
		}
		//���_�l�̓�0=0.0929�A��1=9.9286
	}

}
