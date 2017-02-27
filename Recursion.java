public class Recursion{ 
  
/*  public static double root (double x, double acceptedError){
    
    double guess = x / 2;
    double error = x - guess * guess;
    acceptedError = acceptedError;
    return squareRoot(x, guess, error);
    
  }*/
  
  public static double squareRoot(double x, double guess, double error, double acceptedError){
    error = guess * guess - x;
    System.out.println("guess: " + guess);
    System.out.println("error: " + error);
    System.out.println();
    
    if (error <= acceptedError)
      return guess;
    else {
      double newGuess = 0.5 * (guess + x / guess);
      return squareRoot(x, newGuess, error, acceptedError);
    }
  }
  
  
  public static void main(String[] args){
    double x = 64;
    double acceptedError = 0.25;
    System.out.println(squareRoot(x, x/2, 1, acceptedError));
  
  }
    

}