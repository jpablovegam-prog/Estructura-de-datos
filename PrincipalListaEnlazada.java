public class PrincipalListaEnlazada {
    static void main() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarNodoInicio("E");
        lista.agregarNodoInicio("D");
        lista.agregarNodoInicio("C");
        lista.agregarNodoInicio("B");
        lista.agregarNodoInicio("A");
        lista.recorrido();
        lista.agregarFinal("x");
        lista.recorrido();
        lista.eliminarNodo("D");
        lista.recorrido();
        lista.actualizarNodo("e", "j");
        lista.recorrido();
        lista.buscarNodo("c");
    
    }

}