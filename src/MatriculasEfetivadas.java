/*
LISTA DE MATRICULAS APROVADAS
 */
public class MatriculasEfetivadas {

    private int inicio;
    private int quantidade, fim;
    private Matricula vet[];
    FilaEspera fila;

    public MatriculasEfetivadas(int tamanho) {
        this.inicio = this.fim = -1;
        this.quantidade = 0;
        this.vet = new Matricula[tamanho];
        this.fila = new FilaEspera();
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
    public void add(Matricula matricula) {
        if (!isFull()) {
            if (quantidade == 0) {
                vet[0] = matricula;
                inicio = fim = 0;
            } else if (vet[fim].nome.toLowerCase().compareTo(matricula.nome.toLowerCase()) < 0 && vet[fim].nome.toLowerCase().compareTo(matricula.nome.toLowerCase()) != 0) {
                vet[fim + 1] = matricula;
                fim++;
            } else {
                int x = 0;
                for (int i = fim; i > -1; i--) {
                    if (vet[i].nome.toLowerCase().compareTo(matricula.nome.toLowerCase()) == 0) {
                        if (Integer.parseInt(vet[i].ra) > Integer.parseInt(matricula.ra)) {
                            vet[i + 1] = vet[i];
                        }
                        break;
                    } else if (vet[i].nome.toLowerCase().compareTo(matricula.nome.toLowerCase()) > 0) {
                        vet[i + 1] = vet[i];
                        x = i;
                    }
                }
                fim++;
                vet[x] = matricula;
            }

            quantidade++;
        } else {
            fila.enqueue(matricula);
        }
    }

    public Matricula remove(int indice) {
        if (!isEmpty() && indice >= 0 && indice < quantidade) {
            Matricula aux = vet[indice];
            if (quantidade == 1) {
                inicio--;
            } else {
                if (indice == fim) {
                    vet[indice] = null;
                } else {
                    for (int i = indice; i < fim; i++) {
                        vet[i] = vet[i + 1];
                    }
                }
            }
            vet[fim] = null;
            fim--;
            quantidade--;
            return aux;
        }
        return null;
    }

    public Matricula get(int indice) {
        if (!isEmpty() && indice >= 0 && indice < quantidade) {
            return vet[indice];
        }
        return new Matricula("null","null","null","null");
    }
}
