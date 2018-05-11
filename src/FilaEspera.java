/*
LISTA DE MATRICULAS EM ESPERA
 */
public class FilaEspera {

    private Matricula inicio, fim;
    private int quantidade;

    public FilaEspera() {
        inicio = fim = null;
        quantidade = 0;
    }

    public void enqueue(Matricula matricula) {
        Matricula novo = new Matricula(matricula);
        fim.proximo = novo;
        fim = novo;
        quantidade++;
    }

    public Matricula dequeue() {
        if (!isEmpty()) {
            Matricula aux = inicio;
            inicio = inicio.proximo;
            aux = null;
        }
        return new Matricula("erro", "erro", "erro", "erro");
    }
    
    public Matricula peek(){
        if(!isEmpty()){
            return inicio;
        }
        return new Matricula("erro", "erro", "erro", "erro");
    }
    
    public boolean isEmpty() {
        return inicio == null;
    }

    public int size() {
        return quantidade;
    }
}
