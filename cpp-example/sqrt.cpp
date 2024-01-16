#include <iostream>

/**
 * This program calculates the square root of a number using the Newton-Raphson method.
 * 
 * The Newton-Raphson method is an iterative algorithm that starts with an initial guess
 * for the square root and then repeatedly improves that guess until it is good enough.
 * The improvement step involves averaging the current guess with the number divided by the guess.
 * 
 * The function `squareRoot(double x, double epsilon)` implements this method. It takes two parameters:
 * `x`, the number to calculate the square root of, and `epsilon`, the desired level of accuracy.
 * The function returns the square root of `x` to within `epsilon`.
 * 
 * The `main` function prompts the user to enter a number, then calls `squareRoot` to calculate
 * the square root of that number and prints the result.
 * 
 * @param x The number to calculate the square root of.
 * @param epsilon The desired level of accuracy.
 * @return The square root of x.
 */

double squareRoot(double x, double epsilon) {
    double guess = x / 2.0;
    double prevGuess;
    
    do {
        prevGuess = guess;
        guess = (guess + x / guess) / 2.0;
    } while ((guess > prevGuess ? guess - prevGuess : prevGuess - guess) > epsilon);
    
    return guess;
}

int main() {
    double number;
    std::cout << "Enter a number: ";
    std::cin >> number;
    
    double result = squareRoot(number, 0.0001);
    std::cout << "Square root of " << number << " is " << result << std::endl;
    
    return 0;
}