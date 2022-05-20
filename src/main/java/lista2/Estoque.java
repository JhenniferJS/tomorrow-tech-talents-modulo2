package lista2;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    public String nome;
    private List<Produto> produtos;
    private int id;
    private int cont = 0;

    public Estoque(String nome) {
        this.nome = nome;
        produtos = new ArrayList<>();
        this.id = cont;
        cont++;
    }

    public int getId() {
        return id;
    }

    public void create(String nome, String sessao, String tipo, int qtdEstoque, String marca){
        boolean exist = false;
        if(!produtos.isEmpty()){
            for(Produto p: produtos){
                if(nome.equals(p.getNome()) && marca.equals(p.getMarca())){
                    p.setSessao(sessao);
                    p.setQtdEstoque(qtdEstoque + p.getQtdEstoque());
                    exist = true;
                }
            }
        }
        if(!exist){
            produtos.add(new Produto(nome, sessao, tipo, qtdEstoque, marca));
        }
    }

    public void read(int id){
        if(isExist(id)) {
            for(Produto p: produtos){
                if(p.getId() == id){
                    System.out.println(p);
                }
            }
        }
        else{
            System.out.println("Produto nao encontrado");
        }
    }

    public void readAllProducts(){
        for(Produto p: produtos){
            System.out.println(p);
        }
    }

    public void update(int id, String nome, String sessao, String tipo, int qtdEstoque, String marca){
        if(isExist(id)){
            for(Produto p: produtos){
                if(p.getId() == id){
                    p.setNome(nome);
                    p.setSessao(sessao);
                    p.setTipo(tipo);
                    p.setQtdEstoque(qtdEstoque);
                    p.setMarca(marca);
                }
            }
        }
        else{
            System.out.println("Produto nao encontrado");
        }
    }

    public void delete(int id){
        if(isExist(id)){
            produtos.removeIf(p -> p.getId() == id);
        }
        else{
            System.out.println("Produto nao encontrado");
        }
    }

    private boolean isExist(int id){
        boolean exist = false;
        for(Produto p: produtos){
            if(p.getId() == id) {
                exist = true;
            }
        }
        return exist;
    }
}
