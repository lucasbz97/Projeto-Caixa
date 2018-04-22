
public class Pilha {

    Node topo;
    int quantidade;

    public Pilha(int elemento) {
        topo = null;
        quantidade = 0;
    }

    public boolean isEmpty() {
        return quantidade == 0;
    }

    public int size() {
        return quantidade;
    }

    public void push(int elemento) {
        Node novo = new Node(elemento);

        topo.elemento = elemento;
        topo = novo;
    }

    public int pop() {
        if (!isEmpty()) {
            Node aux = topo;
            topo = topo.proximo;

            aux.proximo = null;
            return topo.elemento;
        }
        return -1;
    }
    
    public int top(){
        if(!isEmpty()){
        return topo.elemento;
        }
        return -1;
    }
}
