import java.util.List;

public class Feriados implements InterfaceFeriados {
  private List<String> data;
  private List<String> nome;

  public Feriados(List<String> data, List<String> nome) {
    this.data = data;
    this.nome = nome;
  }

  public void getNome(String data) {
    int index = this.data.indexOf(data);
    if (index == -1) {
      System.out.println("Não existe feriado registrado nesta data! Confira os feriados do ano:");
      printFeriados();
      return;
    }
    System.out.println(this.nome.get(index));
  }

  public void printFeriados() {
    for (int i = 0; i < this.data.size(); i++) {
      String resultado = this.data.get(i) + " - " + this.nome.get(i);
      System.out.println(resultado);
    }
  }
}
