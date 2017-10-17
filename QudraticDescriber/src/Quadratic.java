//Ava Chen
//APCS Per2
//October 17, 2017
//This is part 5 of Calculate Project. This code will calculate the intercepts using the quadratic formula 
public class Quadratic {
	public static String quadForm(double a, double b, double c){
		if (discriminant(a,b,c) < 0){
			throw new IllegalArgumentException("no real roots");

		}
		if (discriminant(a,b,c) == 0){
			 String roots = round2(-b /(2*a)) + " ";
			 return roots;
		}
		
		else {
			double root1 =  round2((-b + sqrt(discriminant(a, b, c)))/(2*a));
			double root2 =  round2((-b - sqrt(discriminant(a, b, c)))/(2*a));
			if (root1 > root2 || root1 < root2){
				String roots = root2 + " and " + root1;
				return roots;
			}
			
			}
		return null;		
	}

	public static double round2 (double number1) {
		if ((number1*1000) % 10 < 5) {
			return ((number1*1000)-((number1*1000)%10))/1000;
		} else {
			return ((10-((number1*1000)%10))+(number1*1000))/1000;
		}
	}
		public static double discriminant (double a, double b, double c) {
			return ((b*b)- (4*a*c));
		}
		public static double sqrt(double square){
			if (square<0) {
				throw new IllegalArgumentException("Cannot root negatives"); 
			}
			double number; 
			double squareRoot = square/2; 
			do {
				number = squareRoot;
				squareRoot = (number + (square/number)) / 2; 
			} while((number - squareRoot)!= 0);
			return round2(squareRoot);
			}


		public static void  quadrDescriber(double a, double b, double c) {
			String direction;
			String vertex;
			if(a>0) { 
			direction = "up"; 
		}else {
			 direction = "down";	
			}
		double symmetry = (-b)/(2*a);
		double yInt = c;
		double x = (-b/2*a);
				double y = (a*(-b/2*a)*(-b/2*a)) + b*(-b/2*a) + c;
		vertex = "(" + x + "," + y + ")";
		System.out.println ("the graph opens: " + direction + '\n' + " the x-intercepts are: " + quadForm(a, b, c) + "\n" + " the y-intercepts are: " + yInt + "\n" + " the symmetry of the graph is x = " + symmetry + "\n" + "the vertex is: " + vertex); 
		}
		}
