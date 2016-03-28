public class Javas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
            num1 = 300;
            num2 = 500;
        double dob1,dob2;
            dob1 = 25.35;
            dob2 = 33.56;
          double result = (num1 + num2 - dob1 ) * dob2;
        
        System.out.println("Vamos pegar " + num1 + " e somar com " + num2 + " depois iremos diminuir por " + dob1 + " na sequência multiplicar por " + dob2 + " isso resultará em um total de: " + result);
    }
}