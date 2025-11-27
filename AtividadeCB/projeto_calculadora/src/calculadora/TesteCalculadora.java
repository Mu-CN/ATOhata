package calculadora;

public class TesteCalculadora {

    public static void main (String[] args) {
        calculadora calc = new calculadora ();

        // Testes Rápidos
        calc.calc(2, 3, "+");   // esp: 5
        calc.calc(10, 4, "-");  // esp: 6
        calc.calc(3, 5, "*");   // esp: 15
        calc.calc(8, 2, "/");   // esp: 4
        calc.calc(8, 0, "/");   // esp: div por 0
        calc.calc(5, 5, "x");   // esp: operacao invalida
    
    }

}
