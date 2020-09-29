public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {

        return Math.PI * Math.pow(radius, 2.);
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {

        return ((double) 4 / 3) * Math.PI * Math.pow(radius, 3.);
    }

    public static double isTriangleRightAngled(Double a, Double b, Double c) {
        Double ab = a + b;
        Double ac = a + c;
        Double bc = b + c;
        if (a == 0. || b == 0. || c ==0.) {
            return -1.0;
        }
        else if(ab.compareTo(c) == -1. || c.compareTo(b) == -1. || bc.compareTo(a) == -1.) {
            return -1.0;
        }
        else {
            return 0.0;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double p = (a + b +c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
