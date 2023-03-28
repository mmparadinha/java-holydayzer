import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    List<String> datas = new ArrayList<>(Arrays.asList("01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023",
        "01/05/2023", "08/06/2023", "07/09/2023", "12/10/2023", "02/11/2023", "15/11/2023", "25/12/2023"));
    List<String> feriados = new ArrayList<>(Arrays.asList("Confraternização mundial", "Carnaval", "Páscoa",
        "Tiradentes", "Dia do trabalho", "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida",
        "Finados", "Proclamação da República", "Natal"));

    Feriados lista = new Feriados(datas, feriados);

    Scanner dataInput = new Scanner(System.in);
    System.out.println("Qual data deseja conferir se existe feriado? (DD/MM/AAAA)");

    try {
      String data = dataInput.nextLine();
      lista.getNome(data);
    } catch (Exception e) {
      System.out.println("A informação inserida deve ser uma string!");
    }
    dataInput.close();
  }
}
