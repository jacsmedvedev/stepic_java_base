package Integral;

import java.util.function.DoubleUnaryOperator;

public class Integral {

	public static void main(String[] args) {
		System.out.println(integrate(x -> 1, 0, 10));
	}

	public static double integrate(DoubleUnaryOperator f, double a, double b) {

		double n = 1e6; 			// колличество участков интегрирования (точность)
		double h = (b - a) / n; 	// шаг сетки
		double s = 0;				// площадь
		for (int i = 0; i < n; i++) {
			s += f.applyAsDouble(a + h * (i));
		}

		s *= h;
		return s;
	}

}
