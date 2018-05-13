/*
LISTA DE MATRICULAS APROVADAS
 */
public class MatriculasEfetivadas {
    
    private int inicio;
    private int quantidade,fim;
    private int vet[];
    
    public MatriculasEfetivadas(int tamanho) {
        inicio = fim = -1;
        quantidade = 0;
        vet = new int [tamanho];
    }

    public boolean isEmpty() {
        return inicio == -1;
    }

    public int size() {
        return quantidade ;
    }
    
    public boolean isFull(){
        return quantidade == vet.length ;
    }
    //if isEmpty mandar pra fila espera
    public void add(Matricula matricula, int indice) {
        if(!isFull()){
            
        }
        
    }
    
    public int remove(int indice) {
        if(!isEmpty()&&indice>0&&indice < vet.length+1){
            int aux = vet[indice];
            if (quantidade == 1) {
                inicio--;
            } else {
                for (int i = indice; i < fim; i++) {
                    vet[i] = vet[i + 1];
                }
            }
            fim--;
            quantidade--;
            return aux;
        }
        return -1;
            
            }
        
    }

