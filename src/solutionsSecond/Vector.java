package solutionsSecond;

import java.util.Random;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // длинна вектора
    public double length(){
        return Math.sqrt( (x * x) + (y * y) + (z * z) );
    }

    // скалярное произведение вектора
    public double scalarProduct(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }

    // векторное произведение
    public Vector crossProduct(Vector vector){
        return new Vector (
                y * vector.z - x * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    // косинус угла между векторами
    public double cos(Vector vector){
        return scalarProduct(vector) / ( length() + vector.length() );
    }

    // сумма и разность
    public Vector add(Vector vector){
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z);
    }

    public Vector subtract(Vector vector){
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z);
    }

    // создаём массив размерностью в N векторов и заполняем рандомными значениями векторы
    public static Vector[] randomVectors(int N){
        Random r = new Random();
        Vector[] vectors = new Vector[N];

        for (int i = 0; i < N; i++){
            vectors[i] = new Vector(r.nextInt(),r.nextInt(),r.nextInt());
        }

        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
