public class Punto2_1 {
    //factorial
    public int factorial(int n){
        if(n == 1 || n == 2){
            return n;
        } else if(n > 0){
          return n * factorial(n - 1);
        }
    return 0;
    }
    //bunyEars
    public int bunnyEars(int bunnies){
        if(bunnies == 0){
          return 0;
        } 
    return bunnyEars(bunnies - 1) + 2;
    }
    //fibonacci
    public int fibonacci(int n){
        if(n <= 1){
            return n;
        } 
    return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //bunnyEars2
    public int bunnyEars2(int bunnies) {
        if(bunnies == 0){
            return 0;
        } else if(bunnies % 2 == 0){
          return bunnyEars2(bunnies - 1) + 3;
        }
    return bunnyEars2(bunnies - 1) + 2;
    }
    //triangle
    public int triangle(int rows) {
        if(rows == 0){
            return 0;
        }
    return triangle(rows - 1) + rows;
    }
}
