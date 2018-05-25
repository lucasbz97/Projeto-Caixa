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
    
    public void add(Matricula matricula) {
        //verifica se é a primeira entrada
        if (!isFull()) {
            if (quantidade == 0) {
                vet[0] = matricula;
                inicio = 0;
            } else {
                //x é usado com ponteiro para gravação
                int x = fim + 1;
                for (int i = fim; i > -1; i--) {
                    //verifica se o nome é igual
                    if (vet[i].nome.toLowerCase().compareTo(matricula.nome.toLowerCase()) == 0) {
                        //caso sim, a matricula é organizada por ra
                        if (Integer.parseInt(vet[i].ra) > Integer.parseInt(matricula.ra)) {
                            vet[i + 1] = vet[i];
                        }
                        //caso chegue até um elemento igual, sai do for, pois o ponteiro ja está no lugar certo
                        break;
                        //verifica se o elemento de indice i no vetor é "menor" alfabeticamente que o elemento a ser inserido
                    } else if(vet[i].nome.toLowerCase().compareTo(matricula.nome.toLowerCase()) < 0)  {
                        //caso o elemento a ser inserido seja maior, o ponteiro ja estara no lugar certo
                        break;
                        //verifica se o elemento de indice i no vetor é "maior" alfabeticamente
                    } else if (vet[i].nome.toLowerCase().compareTo(matricula.nome.toLowerCase()) > 0) {
                        //caso for maior, o elemento é deslocado e o ponteiro é gravado o lugar que estava este elemento
                        vet[i + 1] = vet[i];
                        x = i;
                        //#na proxima verificação, o elemento pode ser menor que o valor a ser inserido,
                        //#então a repetição será interrompida e o ponteiro estará no lugar certo
                    }
                }
                //elememento inserido no vetor pelo controle de ponteiro x
                vet[x] = matricula;
            }
            //adiciona 1 ao fim e 1 à quantidade
            fim++;
            quantidade++;
        } else {
            //caso o vetor esteja cheio, a matricula é mandada pra espera
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
        return new Matricula("null", "null", "null", "null");
    }
}
