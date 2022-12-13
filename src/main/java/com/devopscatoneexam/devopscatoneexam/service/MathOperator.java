package main.java.com.devopscatoneexam.devopscatoneexam.service;


import main.java.com.devopscatoneexam.devopscatoneexam.exceptions.InvalidOperationException;

public interface MathOperator {
    public double doMath (double operand1, double operand2, String operation) throws InvalidOperationException;
}
