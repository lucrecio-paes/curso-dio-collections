
package br.edu.lucrecio.collections.map;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {
/*    Dadas as informações sobre meus livros favoritos e seus respectivos autores
    crie um dicionario e ordene este dicionario:
     exibindo: ( nome: Autor, nome: Livro )

    Autor = Joshua Fields, Livro = nome: Minimalismo , paginas: 262;
    Autor = William Zinsser, Livro = nome: Como Escrever Bem , paginas: 317 ;
    Autor = Austin Kleon, Livro = nome: Roube como um artista , paginas: 203;

    */
        System.out.println("Ordem Aleatoria");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put(" Joshua Fields ", new Livro("Minimalismo",262 ));
            put(" William Zinsser ", new Livro("Como Escrever Bem",317 ));
            put(" Austin Kleon ", new Livro("Roube Como Um Artistas",203 ));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Imprima Dicionario na Ordem de Inserção");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put(" Joshua Fields ", new Livro("Minimalismo",262 ));
            put(" William Zinsser ", new Livro("Como Escrever Bem",317 ));
            put(" Austin Kleon ", new Livro("Roube Como Um Artistas",203 ));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Imprima dicionario na ordem alfabetica autores");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Imprima dicionario na ordem alfabetica LIVROS");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        }


    }
}
