# ☕ JAVA
Arquivos de estudo ano 2022/2023, contendo exemplos e desafios concluidos...

Estudo realizado pela plataforma da Udemy

#### JAVA: 17 Oracle OpenJDK version 17.0.2

# Explicativo

Conteúdos bem colocados nas classes e bem sucinto para um facil entendimento visto por fora.
Anotações feitas diretamente relacionado a mim e com notações pessoais. (Desconsiderar qualquer erro de escrita momentâneo)
# Conteúdo

## Arrays

###### O que é?
Um array é um aestrutura de dados usada para armazenar dados do mesmo tipo. Os arrays armazenam seus elementos em localizações sequenciais contínuas de memória. Em Java, arrays são objetos. Todos os métodos da classe Object podem ser invocados em um array.

###### Como fazer ?
```java
Tipo [ ] Nome_Do_Array = new Tipo[numero de elementos]" ou "Tipo [ ] Nome_Do_Array = {Valor1, Valor2, Valor3, Valor4...}"
```
## CLasses

###### O que é?
Uma Classe é um elemento de códigos Java que ultilizamos para representar objetos do mundo "real". Dentro dela é comum declarar atributos e métodos, que representam, respectivamente, as características e comportamentos desses objetos. 

###### Como fazer ?
definindo uma classe: 
```java
<modificador de acesso> class Nome_Da_Classe{
  
  //local onde atributos, construtores e métodos são criados.
  
  }
  ```
exemplo mais rigido:
```java
public class SomaNumeros{

 //local onde atributos, construtores e métodos são criados.

}
```
## Coleções

###### O que é?
Em programação orientada a objetos, é comum trabalharmos com um conjunto de objetos. Com base nisso fica clara que uma collection é um objeto que agrupa múltiplos elementos (variáveis primitivas e objetos) dentro de uma única unidade, devido a isso uma coleção também pode ser chamada de container.

Coleções são usadas para armazenar, recuperar e manipular dados, assim como facilitar a transmissão de dados de um método para outro. Geralmente coleções representam itens de dados que formam no geral um grupo

##### -------------------------------------------------
##### Classes existentes desde antes do Java 1.2
##### * Vector;
##### * Stack;
##### * Hashtable;
##### * Array;
##### * BitSet.
##### -------------------------------------------------
A partir do Java 1.2 foi introduzido o Java Collections Frameworks, uma arquitetura unificada para fornecer uma manipulação mais eficiente de coleções de objetos, através de interfaces, algoritmos e implementações. Essas classes e interfaces estão localizadas no pacote java.util.

##### Collections disponibiliza componentes reutilizáveis, tais como: 
##### * Listas;
##### * Filas;
##### * Pilhas;
##### * Vetores, etc.
##### -------------------------------------------------
##### As operações básicas de uma Coleção são:
##### * Adicionar objetos a um conjunto;
##### * Remover objetos do conjunto;
##### * Saber se um (ou outro conjunto) está no conjunto;
##### * Recuperar um objeto do conjunto;
##### * Executar uma iteração no conjunto.
##### -------------------------------------------------
##### Operações que podem ser adquiridas atráves de métodos comuns na marioria dos conjuntos (coleções):
##### * Add;
##### * Remove;
##### * Contains;
##### * Size;
##### * Iterator.
##### -------------------------------------------------
##### Os três grupos do Java Collections são:
##### * Listas – Listas de itens, gerencia um grupo de elementos em sequência,como se fosse uma matriz, mas, a grande diferença é que List a quantidade de elementos é modificada dinamicamente. Classes que implementam java.util.List;
##### * Conjuntos - Itens exclusivos, não permitem duplicação de elementos, classes que implementam java.util.Set;
##### * Mapas – Itens com uma identificação exclusivaClasses que implementam java.util.Map.

## Controle
###### O que é?
Uma estrutura de controle é uma instrução na aplicação que analisa e escolhe direções que determinados blocos ou variáveis devem seguir baseando em seus parâmetros.
Trata-se das mesmas estruturas que podem ser encontradas em qualquer outra linguagem, tenha em conta que o único que necessitará aprender será a sintaxe e isso se consegue muito melhor programando.

##### Bifurcações: Permitem executar código em função de uma expressão avaliada

###### como fazer?
##### * if: Pode ser feito de três maneiras
```java
1 - if (ExpressãoBooleana) { Conjunto de Sentenças }

2 - if (ExpressãoBooleana) { Conjunto de Sentenças } else {Conjunto de Alternativo}

3 - if (ExpressãoBooleana) { Conjunto de Sentenças } else if {Conjunto de Alternativo1} else if{Conjunto de Alternativo2} else{Conjunto de Alternativo final}
```
Ele pode ser das três formas mas é flexível dependendo da sua necessidade.

##### * switch: São as que permitem realizar várias ações diferentes dependendo do estado de uma variável.
```java
Switch (Expressão) {
  Case Valor1: Conjunto de sentenças;
  Break;
  Case Valor2: Conjunto de sentenças;
  Break;
  Case Valor3: Conjunto de sentenças;
  Break;
  Case Valor4: Conjunto de sentenças;
  Break;
}
```
A sentença 'break' atrás de cada opção de case serve para que não avalie o resto de opções e sim que saia diretamente do Switch, dependendo do que quiser fazer, você colocará ou não.

## Exceção
###### O que é?
Há possibilidade de ocorrer erros imprevistos durante sua execução, esses erros são conhecidos como exceções e podem ser provenientes de erros de lógica ou acesso a dispositivos ou arquivos externos. Elas podem ser provenientes de erros recursos que talvez não estejam disponíveis.

##### Alguns possíveis motivos externos para ocorrer uma exceção são:

- Tentar abrir um arquivo que não existe.

- Tentar fazer consulta a um banco de dados que não está disponível.

- Tentar escrever algo em um arquivo sobre o qual não se tem permissão de escrita.

- Tentar conectar em servidor inexistente.

##### Alguns possíveis erros de lógica para ocorrer uma exceção são:

- Tentar manipular um objeto que está com o valor nulo.

- Dividir um número por zero.

- Tentar manipular um tipo de dado como se fosse outro.

- Tentar utilizar um método ou classe não existentes.

#### Tratando exceções

Uma maneira de tentar contornar esses imprevistos é realizar o tratamento dos locais no código que podem vir a lançar possíveis exceções, como por exemplo, campo de consulta a banco de dados, locais em que há divisões, consulta a arquivos de propriedades ou arquivos dentro do próprio computador.

Para tratar as exceções em Java são utilizados os comandos try e catch.

##### Sintaxe:
```java
try {

//trecho de código que pode vir a lançar uma exceção

}
catch(Tipo_De_Excecao){

//ação a ser tomada

}
```
#### Onde:

- try{ … } - Neste bloco são introduzidas todas as linhas de código que podem vir a lançar uma exceção.
- catch(tipo_excessao e) { … } - Neste bloco é descrita a ação que ocorrerá quando a exceção for capturada.

Pode-se usar varios catch em sequência

#### OBS:
existem algumas maneiras diferentes de tratar exceções podendo ser prevista e não prevista.

## Fundamentos
realizar uma pesquisa mais a fundo nos principais topicos...

- Console
- Conversão de tipos
- Imports
- Notação ponto 
- Primitivos 
- Objetos 
- Tipos 
- String 
- Wrapper
- Equals

## Generics
###### O que é?
É uma maneira de criar parâmetros para classes e definir tipos que podem ser substituídos em vários lugares do programa. Isso elimina o uso da classe Object para definirmos tipos que podem variar no decorrer do programa. Esta classe tem um método que retorna um array de qualquer tipo.
O uso de Generics faz-se necessário para evitar casts excessivos e erros que podem ser encontrados em tempo de compilação, antes mesmo de ir para a produção. Todo profissional da área deve ter o conhecimento de como utilizar este recurso tão poderoso, pois em muito se aumenta a produtividade utilizando-o.

Definir uma lista mas sem precisar definir um tipo especifico da lista, criando sem necessidade de uma conversão de tipo.
###### como fazer?
```java
public static <T> T getListaUtil2 (List<T> Lista){
        return Lista.get(Lista.size() - 1 );
}
```
pode ser visto que não foi definito um tipo, só se faz necessário definir um tipo quando for usada a lista, so vai ser necessário definir uma vez, para um tipo.

pode ser usando em uma classe diretamente também. 

exemplo:
```java
public class CaixaNumero <N extends Number>extends Caixa<N>{
}
``` 
## Lambdas
É uma função sem declaração, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado. As funções lambdas em Java tem a sintaxe definida como (argumento) -> (corpo).
```java
(int a, int b) -> {  return a + b; }
() -> System.out.println("Hello World");
(String s) -> { System.out.println(s); }
() -> 42
() -> { return 3.1415 };
a -> a > 10
```
#### Alem de varios outros, pode ser usado também em:
```java
BinaryOperator <Double> calc = (x, y) -> {return x + y; };
```
```java
Function<Integer, String> ParOuImpar = numero -> numero % 2 == 0? "Par" : "Impar";
```
```java
 UnaryOperator<Integer> MaisDois = n -> n + 2;
```
```java 
Predicate<Produto> IsExpensive = prod -> (prod.preco * (1 - prod.desconto)) >= 780;
```

## POO
###### O que é?
são compostos por atributos e métodos definidos a partir de classes, que por sua vez são organizadas em pacotes. Esses conceitos são tão centrais em Java que não se pode programar na linguagem sem utilizá-los.

Todo programa em Java usa classes e objetos, e compreender esses conceitos é fundamental para compreender a própria linguagem. Na prática, sistemas de software reais são grandes e precisam ser fatorados em partes relativamente independentes para serem viáveis. Como em Java isso é feito com classes e objetos, compreendê-los é imprescindível para escrever qualquer programa significativo.

Os programas são escritos em pequenos pedaços separados, chamados de objetos. Objetos são pequenos programas que guardam dentro de si os dados – em suma, as variáveis que precisam para executar suas tarefas. Os objetos também trazem em si, como sub-rotinas, as instruções para processar esses dados. As variáveis que um objeto guarda são chamadas de atributos, e as suas sub-rotinas são chamadas de métodos. Guarde bem esses nomes, pois você os verá ainda muitas vezes.

objetos são criados a partir de modelos que os descrevem. Esses modelos são chamados de classes. É dentro dessas classes que definimos que atributos os objetos conterão e que métodos os objetos fornecerão.

Os quatro pilares da programação orientada a objetos são:
- Abstração.
- Encapsulamento.
- Herança.
- Polimorfismo.

(Deve se estudar esse assunto mais a fundo e separadamente. Muito complexo para ser simplificado em poucas linhas)

## Streams
###### O que é?
abstração para expressar operações eficientes do estilo SQL em relação a uma coleção de dados. Além disso, essas operações podem ser parametrizadas sucintamente mediante expressões lambda.
A ideia é iterar sobre essas coleções de objetos e, a cada elemento, realizar alguma ação, seja ela de filtragem, mapeamento, transformação, etc. Caberá ao desenvolvedor apenas definir qual ação será realizada sobre o objeto.

Deixar de uma forma mais sucinta uma operação, seja ela qual for. 

###### como fazer?
```java
package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out :: print;
        Consumer<Integer> println = System.out :: println;

        Stream<String> Langs = Stream.of("Java ","Lua " ,"Js\n");
        Langs.forEach(print);

        String[] MaisLangs = {"Python ", "Lisp ", "Perl ", "Go\n "};

        Stream.of(MaisLangs).forEach(print);
        Arrays.stream(MaisLangs).forEach(print);
        Arrays.stream(MaisLangs, 1,3).forEach(print);

        List<String> OutrasLangs = Arrays.asList("\n C ", "PHP " , "Kotlin\n");
        OutrasLangs.stream().forEach(print);
        OutrasLangs.parallelStream().forEach(print);

//        Stream.generate(() -> "a").forEach(print);
//        Stream.iterate(0, n -> n + 1 ).forEach(println);

    }
}
```
#### outro exemplo: 

```java
package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {


        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> Aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> ApenasNota = a -> a.nota;

        BiFunction<Media, Double, Media> CalcularMedia = (media, nota) -> media.Adicionar(nota);
        BinaryOperator<Media> CombinarMedia = (m1,m2) -> Media.Combinar(m1,m2);

        Media media = alunos.stream()
                .filter(Aprovado)
                .map(ApenasNota)
                .reduce(new Media (), CalcularMedia, CombinarMedia);

        System.out.println("A media de todos os alunos aprovados é: " + media.getValor());
    }
}
```

###### IMPORTANTE: dados pegos diretamente da internet e explicação pessoal... inspiração para um melhor entendimento do conceito retirado da web, qualquer duvida ou exclarecimento entrar em contato.
