

import java.io.IOException;
import java.util.*;

public class Menu {
    Scanner input = new Scanner(System.in);
    private Contexto _db;

    public Menu(Contexto db){
        _db = db;
    }

    public void MenuSistema(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("                   LOJÃO DO SAPIRON");
        System.out.println("  onde o seu desempenho escolar é a nossa moeda de troca");
        System.out.println("----------------------------------------------------------------");
        System.out.println();
        System.out.println("                     [1] - Produtos");
        System.out.println("                     [2] - Vendedores");
        System.out.println("                     [3] - Venda");
        System.out.println("                     [4] - Relatório");
        System.out.println("                     [5] - Clientes");
        System.out.println("                     [0] - Sair do Sistema");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Informe sua opção: ");
        int Opcao = input.nextInt();
//        clearTela();
        if(Opcao == 1 ){
            ProdutoListar();
        }
        if (Opcao == 0){
            SairDoSistema();
        }
        if (Opcao == 5){
            ClienteTela();
        }
    }

    public void MenuPrincipal(){
//        clearTela();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("--------------------------------");
        System.out.println("  Lojão do Sapiron -- Produtos");
        System.out.println("--------------------------------");
        System.out.println("         [1] - Listar ");
        System.out.println("         [2] - Inserir ");
        System.out.println("         [3] - Pesquisar ");
        System.out.println("         [4] - Alterar   ");
        System.out.println("         [5] - Excluir   ");
        System.out.println(" \n      [0] - Menu do Sistema");

        System.out.print("Informe sua opção: ");
        int Opcao = input.nextInt();
        if(Opcao == 1){ProdutoListar();}
        if(Opcao == 2){ProdutoInserir();}
        if(Opcao == 3){ProdutoPesquisar();}
        if(Opcao == 4){ProdutoEditar();}
        if(Opcao == 5){ProdutoExcluir();}
        else{
            MenuSistema();
        }




    }


    public static void clearTela() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void ProdutoListar(){
//        clearTela();

        System.out.println("--------------------------------------------------");
        System.out.println("Lojão do Sapiron -- LISTA DE PRODUTOS: ");
        System.out.println("--------------------------------------------------");

        Collections.sort(_db.getProdutos(), Comparator.comparing(Produto::getDescriçao));
        for (Produto produto : _db.getProdutos()) {
            System.out.println(produto);
        }
        System.out.println("\nPressione ENTER para voltar ao menu de produtos.");
        new java.util.Scanner(System.in).nextLine();
        MenuSistema();
    }
    public void ProdutoInserir() {
        input.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.println("     Lojão Sapiron -- INSERIR PRODUTO: ");
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println("Descrição: ");
        String Descricao = input.nextLine();

        System.out.println("Valor: ");
        double Valor = Double.parseDouble(input.nextLine());
        _db.Produtos.add(new Produto(Descricao, Valor));
        _db.Salvar(); // adiciona essa linha para salvar o produto no arquivo
        input.nextLine();
        MenuPrincipal();
    }

    public void ProdutoPesquisar(){
//        clearTela();
        input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("----------------------------------------------------------------");
        System.out.println("          Lojão Sapiron -- PESQUISA DE PRODUTOS: ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Parâmetro de pesquisa: ");
        String Parametro = input.nextLine();
        if (Parametro != null) {
            Produto produto = _db.Produtos.stream()
                    .filter(p -> p.getDescriçao().toLowerCase().equals(Parametro.toLowerCase()))
                    .findFirst()
                    .orElse(null);
            if (produto != null) {
                System.out.println(produto);
            } else {
                System.out.println("Nenhum produto encontrado com essa descrição.");
            }
        }
        System.out.println();
        MenuPrincipal();

    }
    public void ProdutoEditar(){
//        clearTela();
        input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("----------------------------------------------------------------");
        System.out.println("            Lojão Sapiron -- EDITAR PRODUTO: ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Código produto: ");
        String Parametro = input.nextLine();

        if(Parametro != null && !Parametro.isEmpty()){
            int Codigo = Integer.parseInt(Parametro);
            Produto produto = _db.Produtos.stream()
                    .filter(c -> c.Id == Codigo)
                    .findFirst()
                    .orElse(null);
            if(produto != null){
                System.out.printf("Descrição: %s%n", produto.Descriçao);
                System.out.printf("Quantidade: %d%n", produto.Quantidade);
                System.out.printf("Valor: %.2f%n", produto.Valor);
                System.out.printf("Ativo: %s%n", produto.Ativo);

                System.out.println("\n NOVOS ATRIBUTOS: \n");
                System.out.print("Descrição: ");
                String Descricao = input.nextLine();
                if(!Descricao.isEmpty()){
                    produto.Descriçao = Descricao;
                }
                System.out.print("Valor: ");
                String Valor = input.nextLine();
                if(!Valor.isEmpty()){
                    produto.Valor = Double.parseDouble(Valor);
                }
                else{
                    System.out.println("PRODUTO INEXISTENTE!!!!!!!!!!!");
                }
            }
            System.out.println();
            MenuPrincipal();
        }
    }

    public void ProdutoExcluir(){

//        clearTela();
        input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("----------------------------------------------------------------");
        System.out.println("            Lojão Sapiron  -- EXCLUIR PRODUTOS: ");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Código do produto: ");
        String parametro = input.nextLine();
        if(parametro != null && !parametro.isEmpty()){
            int Codigo = Integer.parseInt(parametro);
            Produto produto = _db.Produtos.stream()
                    .filter(id -> id.getId() == Codigo)
                    .findFirst()
                    .orElse(null);
            if(produto != null){
                System.out.println("EXCLUIDO: "+ produto);
                _db.Produtos.remove(produto);
            }
        }
        else{
            System.out.println("Produto inexistente!! ");
        }
        System.out.println();
        MenuPrincipal();
    }
    public void SairDoSistema(){
//        clearTela();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("------------------------");
        System.out.println("      Lojão sapiron");
        System.out.println("      Volte sempre");
        System.out.println("------------------------");
    }



    public void ClienteTela(){
        input.nextLine();
        System.out.println("----------------------------------------------------------------");
        System.out.println("              BEM VINDO AO LOJÃO DO SAPIRON");
        System.out.println("                    [1] Cadastrar-se");
        System.out.println("                      [2] Entrar");
        System.out.println("----------------------------------------------------------------");
        String Valor = input.nextLine();

        // condições nas quais determinarão a proxima ação do sistema
        if(Valor.equals("1")){
            ClienteCadastro();
        }
        if(Valor.equals("2")){
            System.out.println("Nome: ");
            String Name = input.nextLine();
            System.out.println("Senha: ");
            int Password = input.nextInt();

            Cliente cliente = _db.Clientes
                    .stream()
                    .filter(NC -> NC.getNome().equals(Name))
                    .filter(PC -> PC.getSenha() == Password)
                    .findFirst()
                    .orElse(null);
            if(cliente != null && Name != null && Password == cliente.getSenha()){
                System.out.println("----------------------------------------------------------------");
                System.out.println("              BEM VINDO " + Name);
                System.out.println("----------------------------------------------------------------");
                TelaCliente();
            } else {
                System.out.println("Usuario invalido !!");
                ClienteTela();
            }

        }
    }
    public void ClienteCadastro(){
        input.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.println("                -- Lojão Sapiron -- ");
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println("(Somente letras) Nome: ");
        String Nome = input.nextLine();

        System.out.println("(Somente números inteiros) Senha: ");
        int Senha = input.nextInt();
        _db.Clientes.add(new Cliente(Nome,Senha));
        _db.SalvarCliente(); // adiciona essa linha para salvar o produto no arquivo
       TelaCliente();
    }

    public void TelaCliente(){
        input.nextLine();
        System.out.println("----------------------------------------------------------------");
        System.out.println("                 [1] Lista de Produtos");
        System.out.println("                  [2] Comprar Produto");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Sua opção: ");
        String opcao = input.nextLine();
        if (opcao.equals("1".replace(" ", ""))){
            System.out.println("--------------------------------------------------");
            System.out.println("    Lojão do Sapiron -- LISTA DE PRODUTOS: ");
            System.out.println("--------------------------------------------------");

            Collections.sort(_db.getProdutos(), Comparator.comparing(Produto::getDescriçao));
            for (Produto produto : _db.getProdutos()) {
                System.out.println(produto);
            }
            System.out.println("\nPressione ENTER para voltar ao menu de produtos.");
            new java.util.Scanner(System.in).nextLine();
            TelaCliente();
        }
        if (opcao.equals("2".replace(" ",""))){
            input.nextLine();
            System.out.println("----------------------------------------------------------------");
            System.out.println("         Lojão Sapiron -- PESQUISA/COMPRA DE PRODUTOS: ");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Descrição do Produto: ");
            String Parametro = input.nextLine();
            if (Parametro != null) {
                Produto produto = _db.Produtos.stream()
                        .filter(p -> p.getDescriçao().toLowerCase().equals(Parametro.toLowerCase()))
                        .findFirst()
                        .orElse(null);
                if (produto != null) {
                    System.out.println(produto);
                    System.out.println("Comprar esse produto:");

                    System.out.println("[S] Sim // [N] não");
                    String Comp = input.nextLine();
                    if(Comp.equalsIgnoreCase("S".replace(" ",""))){
                        System.out.println("-------------------------------------");
                        System.out.println("       PRODUTO COMPRADO !!!!!!");
                        System.out.println("-------------------------------------");
                        try{
                            Thread.sleep(1500); // Pausa a execução por 5 segundos
                        }catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else if(Comp.equalsIgnoreCase("N".replace(" ", ""))){
                        TelaCliente();
                    }else{
                        System.out.println("Solicitação invalida");
                        TelaCliente();
                    }
                } else {
                    System.out.println("Nenhum produto encontrado com essa descrição.");
                }
            }
            System.out.println();
            MenuSistema();
        }



    }

}
