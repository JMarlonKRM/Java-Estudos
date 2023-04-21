import com.google.gson.*;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Contexto {
    public List <Produto> Produtos;
    public List<Produto> getProdutos(){
        return Produtos;
    }
    public void setProdutos(List<Produto> Produtos){
        this.Produtos = Produtos;
    }

    public List<Vendedor> Vendedores;
    public List<Vendedor> getVendedores (){
        return Vendedores;
    }
    public void setVendedores (List<Vendedor> Vendedores){
        this.Vendedores = Vendedores;
    }

    public List<Cliente> Clientes;
    public List<Cliente> getClientes() {
        return Clientes;
    }
    public void setClientes(List<Cliente> clientes) {
        Clientes = clientes;
    }

    public Contexto(){
        Produtos = new ArrayList<>();
        Vendedores = new ArrayList<>();
        Clientes = new ArrayList<>();
    }

    public void Salvar() {
        JSONArray produtosArray = new JSONArray();
        JSONObject produtosJson = new JSONObject();

        for (Produto produto : Produtos) {
            JSONObject produtoJson = new JSONObject();
            produtoJson.put("id", produto.getId());
            produtoJson.put("descricao", produto.getDescriçao());
            produtoJson.put("valor", produto.getValor());
            produtoJson.put("Quantidade",produto.getQuantidade());
            produtosArray.put(produtoJson);
        }
        produtosJson.put("produtos", produtosArray);
        String jsonString = produtosArray.toString(4);
        try (FileWriter writer = new FileWriter("Produtos.json")) {
            writer.write(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Restaurar() {
        try {
            String json = new String(Files.readAllBytes(Paths.get("Produtos.json")), StandardCharsets.UTF_8);
            if (!json.isEmpty()) {
                List<Produto> produtos = new Gson().fromJson(json, new TypeToken<List<Produto>>(){}.getType());
                if (produtos != null)
                    Produtos = produtos;
            }
            int maxId = Produtos.stream().mapToInt(Produto::getId).max().orElse(0);
            Produto.UpdateNextId(maxId);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void SalvarCliente(){
        Gson gson = new Gson(); // cria o objeto Gson
        JSONObject clienteJson = new JSONObject();
        for (Cliente cliente : Clientes) {
            clienteJson.put("Id", cliente.getId());
            clienteJson.put("Nome", cliente.getNome());
            clienteJson.put("CPF", cliente.getCPF());
            clienteJson.put("Senha", cliente.getSenha());
            clienteJson.put("Gmail", cliente.getGmail());
            gson.toJson(clienteJson);

        }
        clienteJson.put("clientes",gson);
        String jsonString = gson.toJson(Clientes); // converte os objetos Clientes em JSON
        try (FileWriter writer = new FileWriter("Clientes.json")){
            writer.write(jsonString); // salva o JSON no arquivo
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
