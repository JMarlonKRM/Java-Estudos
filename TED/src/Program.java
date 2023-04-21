public class Program{
    public static void main(String[] args) {
        Contexto contexto = new Contexto();
        contexto.Restaurar();

        Menu menu = new Menu(contexto);

        menu.MenuSistema();

        contexto.Salvar ();
        contexto.SalvarCliente();
    }

}
