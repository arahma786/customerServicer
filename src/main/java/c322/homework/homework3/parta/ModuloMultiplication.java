package c322.homework.homework3.parta;

public class ModuloMultiplication implements Calculator{
    @Override
    public int execute(int num1, int num2) {
        return (num1 % 2 * num2 % 2);
    }
}
