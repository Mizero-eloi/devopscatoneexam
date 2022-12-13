package main.java.com.devopscatoneexam.devopscatoneexam.model;

@Data
@AllArgsConstructor
public class DoMathRequest {
    private double operand1;
    private double operand2;
    private double operation;

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public double getOperation() {
        return operation;
    }

    public void setOperation(double operation) {
        this.operation = operation;
    }
}
