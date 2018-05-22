/*
LISTA DE MATRICULAS APROVADAS
 */
public class MatriculasEfetivadas {

    private int inicio;
    private int quantidade, fim;
    public Matricula vet[];

    public MatriculasEfetivadas(int tamanho) {
        this.inicio = this.fim = -1;
        this.quantidade = 0;
        this.vet = new Matricula[tamanho];
    }

    public boolean isEmpty() {
        return inicio == -1;
    }

    public int size() {
        return quantidade;
    }

    public boolean isFull() {
        return quantidade == vet.length;
    }

    //if isFull mandar pra fila espera
    public void add(Matricula matricula, int indice) {
        if (!isFull()) {
            if (!isFull() && indice >= 0 && indice <= quantidade) {
                if (quantidade == 0) {
                    vet[0] = matricula;
                    inicio = fim = 0;
                    System.out.println("foi inicio");
                } else if (indice == fim + 1) {
                    vet[indice] = matricula;
                    fim = indice;
                    System.out.println("foi no fim");
                } else {
                    for (int i = fim; i > indice - 1; i--) {
                        vet[i + 1] = vet[i];
                    }
                    fim++;
                    vet[indice] = matricula;
                    System.out.println("Foi no meio");
                }
                quantidade++;
            }
        } else {
            FilaEspera fila = new FilaEspera();
            fila.enqueue(matricula);
            System.out.println("Mandou pra fila !");
        }
    }

    public Matricula remove(int indice) {
        if (!isEmpty() && indice >= 0 && indice < quantidade) {
            Matricula aux = vet[indice];
            if (quantidade == 1) {
                inicio--;
            } else {
                for (int i = indice; i < fim; i++) {
                    vet[i] = vet[i + 1];
                }
            }
            fim--;
            quantidade--;
            retorno(aux);
            return aux;
        }
        return null;
    }

    public String retorno(Matricula matricula) {
        Matricula matricul = new Matricula(matricula);
        return matricul.nome;
    }
}
