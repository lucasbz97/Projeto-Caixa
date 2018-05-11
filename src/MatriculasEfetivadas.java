/*
LISTA DE MATRICULAS APROVADAS
 */
public class MatriculasEfetivadas {
    
    private Matricula inicio, fim;
    private int quantidade;

    public MatriculasEfetivadas() {
        inicio = fim = null;
        quantidade = 0;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public int size() {
        return quantidade;
    }

    //if isEmpty mandar pra fila espera
    public void add(Matricula matricula) {
        if (indice >= 0 && indice <= quantidade) {
            Matricula novo = new Matricula();
            if (indice == 0) {
                novo.proximo = inicio;
                inicio = novo;
                if (inicio.proximo == null) {
                    fim = novo;
                }
            } else if (quantidade == indice) {
                fim.proximo = novo;
                fim = novo;
            } else {
                Matricula aux = inicio;
                for (int i = 0; i < indice - 1; i++) {
                    aux = aux.proximo;
                }
                novo.proximo = aux.proximo;
                aux.proximo = novo;
            }
            quantidade++;
        }
    }
    
    public int remove(int indice) {
        if (indice >= 0 && indice < quantidade) {
            quantidade--;
            Matricula retorno = inicio;
            if (indice == 0) {
                inicio = inicio.proximo;
                if (inicio == null) {
                    fim = null;
                }
                retorno.proximo = null;
                return retorno.elemento;
            } else {
                Matricula aux = inicio;
                for (int i = 0; i < indice - 1; i++) {
                    aux = aux.proximo;
                }
                retorno = aux.proximo;
                aux.proximo = aux.proximo.proximo;
                if (aux.proximo == null) {
                    fim = aux;
                }
                retorno.proximo = null;
                return retorno.elemento;
            }
        }
        return -1;
    }
    
    public void addStack(int elemento){
        if(!isEmpty()){
            Matricula novo = new Matricula(elemento);
            
        }
    }


}
