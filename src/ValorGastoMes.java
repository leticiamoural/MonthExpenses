import java.util.Scanner;

public class ValorGastoMes {

    public static void main(String[] args) {

        //recebe valor do mês
        System.out.println("Write a month: (January/February/March/April/May/June/July/August/September/October/November/December)");
        Scanner input = new Scanner(System.in);
        String monthRequired = input.next();

        String monthAdapted = monthRequired.toUpperCase();

        float valor = Anual.getValorEspecifico(monthAdapted);
        System.out.println(monthAdapted +" = R$"+valor);
    }
}
