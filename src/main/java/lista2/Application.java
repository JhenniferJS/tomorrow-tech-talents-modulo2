package lista2;

public class Application {

    public static void main(String[] args) {

        Estoque estoque = new Estoque("Estoque de Frutas");

        estoque.create("Laranja", "Hortifruti", "Fruta", 10, "Pera");
        estoque.create("Maçã", "Hortifruti", "Fruta", 1, "Gala");

        System.out.println("Todos produtos: ");
        estoque.readAllProducts();
        System.out.println("--------------------------------------");

        System.out.println("Leitura por id");
        estoque.read(0);
        System.out.println("--------------------------------------");

        System.out.println("Atualizar produto");
        estoque.update(1, "Maçã", "Hortifruti", "Fruta", 2, "Fuji");
        estoque.readAllProducts();
        System.out.println("--------------------------------------");

        System.out.println("Criar produto existente");
        estoque.create("Laranja", "Frutas", "Fruta", 2, "Pera");
        estoque.readAllProducts();
        System.out.println("--------------------------------------");

        System.out.println("Deletar produto");
        estoque.delete(1);
        estoque.readAllProducts();
    }
}
