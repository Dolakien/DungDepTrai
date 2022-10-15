/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demothrowexcep;

/**
 *
 * @author PC
 */
public class DemoThrowExcep {

    public static int divide1(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static int divide2(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Hey, Denominator: 0");
        }

        return a / b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DemoThrowExcep obj = new DemoThrowExcep();
        try {
            System.out.println(obj.divide2(6, 0));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
