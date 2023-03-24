import java.util.List;

public class Feriados implements InterfaceFeriados {
  private List<String> data;
  private List<String> nome;

  public Feriados(List<String> data, List<String> nome) {
    this.data = data;
    this.nome = nome;
  }

  public String getNome(String data) {
    int index = this.data.indexOf(data);
    if (index == -1) {
      return "Não existe feriado registrado nesta data!";
    }
    return this.nome.get(index);
  }
}
