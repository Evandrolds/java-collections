# O que é Collections Framework?
## Resulmo
### Collections Framework é um conjunto bem definido de interfaces e classes para representar e tratar grupos de dados como uma única unidade, que pode ser chamada de coleção, ou collection em inglês.

#### A plataforma Java inclui uma estrutura de coleções.
Uma coleção é um objeto que representa um grupo de objetos, ou seja, uma coleção seja ela do que for, no java é um objeto, e tudo que estiver incluso nesta coleção para o java são objetos, por isso que uma coleção é um objeto que representa um grupo de objetos.
Uma estrutura de coleções é uma arquitetura unificada para representar e manipular coleções, permitindo que as coleções sejam manipuladas independentemente dos detalhes de implementação.
### As principais vantagens das estruturas de coleções são:

* Reduz o esforço de programação fornecendo estruturas de dados e algoritmos para que você não precise escrevê-los sozinho.
* Aumenta o desempenho fornecendo implementações de alto desempenho de estruturas de dados e algoritmos.
  Como as várias implementações de cada interface que pode ser trocada, os programas podem ser ajustados alternando as implementações.
* Fornece interoperabilidade entre APIs não relacionadas, estabelecendo uma linguagem comum para passar coleções de um lado para o outro.
* Reduz o esforço necessário para aprender APIs, exigindo que você aprenda várias APIs de coleta ad hoc.
* Reduz o esforço necessário para projetar e implementar APIs, não exigindo que você produza APIs de coleções ad hoc.
* Promove a reutilização de software fornecendo uma interface padrão para coleções e algoritmos para manipulá-los.
  
## A Collections Framework contém os seguintes elementos:
## Interfaces:
* Interface são tipos abstratos que representam as coleções. Permitem que coleções sejam manipuladas tendo como base o conceito “Programar para interfaces e não para implementações”, desde que o acesso aos objetos se restrinja apenas ao uso de métodos definidos nas interfaces;
## Implementações:
* São as implementações concretas das interfaces;
## Vou dar um exemplo bem simples de implementação em Java :

A palavra reservada ( Implements ) faz a chamada de qualquer interface que foi criada ou que ja exista na sua aplicação,
nesse exemplo eu criei uma intercafe que tem um método que carrega a assinatura (nome) de IMC,
então eu precisei ultilizar o metodo que essa interface tem em seu corpo,
e para eu não ter que criar outro, eu implemento esse interface e com isso eu sou obrigado e implementar o(os) metodo(s) dela.
A imagem a baixo mostra a Interface e seu método. Lembrando este é um exemplo mais simples que consegui.
<p align="center">
<img  width="400" height="125" src="https://github.com/Evandrolds/java-collections/assets/57682675/776f3205-af76-4dbc-a331-79b25de40c54">
</p>
Aqui na classe Pessoa eu implemento a interface PessoaImpl, observe logo no topo da imagem a palavra reservado do java ( implements + o nome da interface que é PessoaImpl.
Com isso eu acabo de realizar uma implemetação concreta da interface PessoaImpl.

 <p align="center">
 <img  width="480" height="170"  src="https://github.com/Evandrolds/java-collections/assets/57682675/fde0a6bd-aee5-4c1d-9dd2-7fd849257246">
 </p>

## Algoritmos: 
<h4>Os algoritmos do Collections Framework são operações úteis que podem ser aplicadas a diferentes tipos de coleções para realizar tarefas comuns, como ordenação, busca, filtragem e muito mais. Esses algoritmos são definidos como métodos estáticos nas classes utilitárias da classe `Collections`. Aqui estão alguns exemplos de algoritmos comuns:

1. **Ordenação (`Collections.sort()`):** O método `sort()` é usado para ordenar elementos em uma lista. Ele utiliza a ordem natural dos elementos ou pode ser fornecido um comparador personalizado para a ordenação.

2. **Cópia (`Collections.copy()`):** O método `copy()` é usado para copiar os elementos de uma lista para outra. Ele requer que a lista de destino tenha tamanho igual ou maior que a lista de origem.

3. **Preenchimento (`Collections.fill()`):** O método `fill()` é usado para preencher todos os elementos de uma lista com um valor específico.

4. **Mistura (`Collections.shuffle()`):** O método `shuffle()` é usado para embaralhar aleatoriamente os elementos de uma lista.

5. **Busca (`Collections.binarySearch()`):** O método `binarySearch()` é usado para realizar uma busca binária em uma lista ordenada. Ele retorna o índice do elemento encontrado ou um valor negativo se o elemento não for encontrado.

6. **Máximo e Mínimo (`Collections.max()` e `Collections.min()`):** Esses métodos são usados para encontrar o elemento máximo e mínimo em uma coleção, respectivamente.

7. **SubList (`List.subList()`):** O método `subList()` é usado para obter uma sublista de uma lista existente, com base nos índices especificados.

8. **Frequência (`Collections.frequency()`):** O método `frequency()` é usado para contar quantas vezes um determinado elemento aparece em uma coleção.

9. **Troca (`Collections.swap()`):** O método `swap()` é usado para trocar os elementos em duas posições específicas em uma lista.

Esses são apenas alguns exemplos dos algoritmos disponíveis no Collections Framework. Eles fornecem funcionalidades comuns e poderosas para trabalhar com coleções de maneira eficiente e padronizada em Java. Cada algoritmo é implementado como um método estático na classe `Collections` ou diretamente nas classes de coleção, como `List`, `Set`, etc.</h4>

<p align="center">
<img  width="500" height="250" src="https://github.com/Evandrolds/java-collections/assets/57682675/5124011d-7339-40a8-a0a3-00475eb97488">
</p>

### Vou apresentar uma breve descrição de cada uma das interfaces da hierarquia:
## Collection
#### O collection está no topo da hierarquia. Não existe implementação direta dessa interface, mas ela define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.
#### Exemplos:
As operações básicas no Collections Framework do Java envolvem a criação, adição, remoção e iteração através de coleções de objetos. Vou descrever essas operações de forma mais detalhada:

1. **Criação de Coleções:**
   Você pode criar diferentes tipos de coleções (Listas, Conjuntos, Mapas, Filas) usando as classes fornecidas pelo framework, como `ArrayList`, `HashSet`, `HashMap`, `LinkedList`, etc. Por exemplo:
   
   ```java
   List<String> lista = new ArrayList<>();
   Set<Integer> conjunto = new HashSet<>();
   Map<String, Integer> mapa = new HashMap<>();
   ```

2. **Adição de Elementos:**
   Para adicionar elementos a uma coleção, você utiliza os métodos `add()` para Listas e Conjuntos, e `put()` para Mapas. Por exemplo:
   
   ```java
   lista.add("Maçã");
   conjunto.add(42);
   mapa.put("Chave", 100);
   ```

3. **Remoção de Elementos:**
   Para remover elementos de uma coleção, você utiliza os métodos `remove()` para Listas e Conjuntos, e `remove()` com a chave para Mapas. Por exemplo:
   
   ```java
   lista.remove("Banana");
   conjunto.remove(42);
   mapa.remove("Chave");
   ```

4. **Iteração através de Coleções:**
   Você pode iterar sobre os elementos de uma coleção usando loops (como `for` e `foreach`) ou usando um iterator. Aqui está um exemplo usando um loop `for` e um iterator:
   
   ```java
   // Usando loop for-each (apenas para coleções que implementam Iterable)
   for (String elemento : lista) {
       System.out.println(elemento);
   }
   
   // Usando iterator
   Iterator<Integer> iterator = conjunto.iterator();
   while (iterator.hasNext()) {
       Integer elemento = iterator.next();
       System.out.println(elemento);
   }
   ```

5. **Verificação de Existência:**
   Você pode verificar se um elemento existe em uma coleção usando o método `contains()`. Por exemplo:
   
   ```java
   boolean existe = lista.contains("Maçã");
   ```

6. **Tamanho da Coleção:**
   Para obter o tamanho (quantidade de elementos) de uma coleção, você usa o método `size()`. Por exemplo:
   
   ```java
   int tamanhoLista = lista.size();
   ```

7. **Limpeza da Coleção:**
   Para remover todos os elementos de uma coleção, você pode usar o método `clear()`. Por exemplo:
   
   ```java
   lista.clear();
   ```

8. **Ordenação (para Listas):**
   Para ordenar elementos em uma lista, você pode usar o método `sort()`. Isso é aplicável somente para coleções que implementam a interface `List`. Por exemplo:
   
   ```java
   Collections.sort(lista);
   ```

Lembre-se de que as operações básicas podem variar ligeiramente dependendo do tipo de coleção que você está usando. O Collections Framework oferece uma variedade de classes e interfaces para lidar com diferentes tipos de coleções de forma eficiente e padronizada.  
## Set
#### O Java oferece a interface Set como parte da sua biblioteca de coleções para representar conjuntos, que são coleções de elementos únicos, ou seja, sem repetições. Aqui está um exemplo de como você pode utilizar a interface Set:

```java
import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        // Criando um conjunto usando HashSet
        Set<String> conjunto = new HashSet<>();

        // Adicionando elementos ao conjunto
        conjunto.add("Maçã");
        conjunto.add("Banana");
        conjunto.add("Laranja");
        conjunto.add("Maçã"); // Não será adicionado, pois conjuntos não permitem duplicatas

        // Imprimindo o conjunto
        System.out.println("Conjunto: " + conjunto);

        // Verificando se um elemento está no conjunto
        boolean contemBanana = conjunto.contains("Banana");
        System.out.println("O conjunto contém Banana? " + contemBanana);

        // Removendo um elemento do conjunto
        boolean removido = conjunto.remove("Laranja");
        System.out.println("Laranja removida? " + removido);

        // Tamanho do conjunto
        int tamanho = conjunto.size();
        System.out.println("Tamanho do conjunto: " + tamanho);

        // Iterando sobre os elementos do conjunto
        System.out.println("Elementos do conjunto:");
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }

        // Limpando o conjunto
        conjunto.clear();
        System.out.println("Conjunto vazio? " + conjunto.isEmpty());
    }
}
```

Neste exemplo, utilizei a implementação HashSet da interface Set para criar e manipular um conjunto de strings. Lembre-se de que conjuntos ou (Set) em inglês não permitem elementos duplicados, então, quando tentamos adicionar uma "Maçã" duplicada, ela não é inserida novamente no conjunto.
## List
#### O list define uma coleção ordenada, podendo conter elementos duplicados. Em geral, o usuário tem controle total sobre a posição onde cada elemento é inserido e pode recuperá-los através de seus índices. Prefira esta interface quando precisar de acesso aleatório, através do índice do elemento;
Certamente! A interface List em Java é usada para representar uma sequência ordenada de elementos, permitindo acesso por índice e manipulação de elementos. Aqui está um exemplo de como você pode utilizar a interface List:

```java
import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // Criando uma lista de strings usando ArrayList
        List<String> lista = new ArrayList<>();

        // Adicionando elementos à lista
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");
        lista.add("Maçã"); // Elementos duplicados são permitidos

        // Acessando elementos por índice
        String primeiraFruta = lista.get(0);
        System.out.println("Primeira fruta: " + primeiraFruta);

        // Verificando se a lista contém um elemento
        boolean contemLaranja = lista.contains("Laranja");
        System.out.println("A lista contém Laranja? " + contemLaranja);

        // Encontrando o índice de um elemento
        int indiceBanana = lista.indexOf("Banana");
        System.out.println("Índice da Banana: " + indiceBanana);

        // Removendo um elemento da lista
        boolean removido = lista.remove("Maçã"); // Remove a primeira ocorrência de "Maçã"
        System.out.println("Foi removido um elemento 'Maçã'? " + removido);

        // Tamanho da lista
        int tamanho = lista.size();
        System.out.println("Tamanho da lista: " + tamanho);

        // Iterando sobre os elementos da lista
        System.out.println("Elementos da lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Limpando a lista
        lista.clear();
        System.out.println("Lista vazia? " + lista.isEmpty());
    }
}
```

Neste exemplo, utilizei a implementação ArrayList da interface List para criar e manipular uma lista de strings. Note que elementos duplicados são permitidos em uma lista. Utilizamos os métodos da interface List para adicionar, acessar, verificar a presença, encontrar índices, remover elementos e iterar sobre a lista.
  
## Queue
Queue um tipo de coleção para manter uma lista de prioridades, onde a ordem dos seus elementos, definida pela implementação de Comparable ou Comparator, determina essa prioridade. Com a interface fila pode-se criar filas e pilhas;
Claro! A interface `Queue` em Java faz parte do Java Collections Framework e é usada para representar uma fila, ou seja, uma estrutura de dados onde os elementos são inseridos no final e removidos do início. Vou lhe dar um exemplo de como utilizar a `Queue` com a implementação `LinkedList`:

```java
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        // Criando uma fila usando LinkedList
        Queue<String> fila = new LinkedList<>();

        // Adicionando elementos à fila
        fila.add("Primeiro");
        fila.add("Segundo");
        fila.add("Terceiro");

        // Acessando e removendo o elemento da frente da fila
        String elementoRemovido = fila.poll();
        System.out.println("Elemento removido: " + elementoRemovido);

        // Acessando o elemento da frente da fila sem removê-lo
        String elementoFrente = fila.peek();
        System.out.println("Elemento da frente: " + elementoFrente);

        // Tamanho da fila
        int tamanhoFila = fila.size();
        System.out.println("Tamanho da fila: " + tamanhoFila);

        // Verificando se a fila está vazia
        boolean vazia = fila.isEmpty();
        System.out.println("A fila está vazia? " + vazia);

        // Iterando sobre os elementos da fila
        System.out.println("Elementos da fila:");
        for (String elemento : fila) {
            System.out.println(elemento);
        }
    }
}
```

Neste exemplo, utilizei a implementação `LinkedList` da interface `Queue` para criar e manipular uma fila de strings. Note que a inserção (`add()`) é feita no final da fila, e a remoção (`poll()`) é feita no início da fila. O método `peek()` é usado para acessar o elemento da frente da fila sem removê-lo. Além disso, a iteração é possível usando um loop `for-each`.
  
* Map – mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não. SortedMap é uma interface que estende Map, e permite classificação ascendente das chaves. Uma aplicação dessa interface é a classe Properties, que é usada para persistir propriedades/configurações de um sistema, por exemplo.
#### O Java oferece a interface Map para representar estruturas de dados que associam chaves a valores, conhecidas como pares chave-valor. Aqui está um exemplo de como você pode utilizar a interface Map:

```java
import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        // Criando um mapa usando HashMap
        Map<String, Integer> mapa = new HashMap<>();

        // Adicionando pares chave-valor ao mapa
        mapa.put("Maçã", 3);
        mapa.put("Banana", 5);
        mapa.put("Laranja", 2);
        mapa.put("Maçã", 4); // A chave "Maçã" terá o valor substituído para 4

        // Imprimindo o mapa
        System.out.println("Mapa: " + mapa);

        // Obtendo o valor associado a uma chave
        int quantidadeDeBananas = mapa.get("Banana");
        System.out.println("Quantidade de bananas: " + quantidadeDeBananas);

        // Verificando se uma chave está no mapa
        boolean contemChave = mapa.containsKey("Laranja");
        System.out.println("O mapa contém a chave 'Laranja'? " + contemChave);

        // Removendo um par chave-valor do mapa
        Integer valorRemovido = mapa.remove("Maçã");
        System.out.println("Valor removido para a chave 'Maçã': " + valorRemovido);

        // Tamanho do mapa
        int tamanho = mapa.size();
        System.out.println("Tamanho do mapa: " + tamanho);

        // Iterando sobre as chaves do mapa
        System.out.println("Chaves do mapa:");
        for (String chave : mapa.keySet()) {
            System.out.println(chave);
        }

        // Iterando sobre os valores do mapa
        System.out.println("Valores do mapa:");
        for (Integer valor : mapa.values()) {
            System.out.println(valor);
        }

        // Iterando sobre os pares chave-valor do mapa
        System.out.println("Pares chave-valor do mapa:");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println("Chave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }

        // Limpando o mapa
        mapa.clear();
        System.out.println("Mapa vazio? " + mapa.isEmpty());
    }
}
```

Neste exemplo, utilizei a implementação HashMap da interface Map para criar e manipular um mapa que associa strings a valores inteiros. Note que as chaves em um mapa devem ser únicas, mas os valores podem se repetir. Quando inserimos um par chave-valor com uma chave já existente, o valor associado à chave é substituído pelo novo valor.

### A API oferece também interfaces que permitem percorrer uma coleção derivada de Collection. aqui sitarei de:

### Iterator:
#### O iterator em Java é uma interface que permite percorrer uma coleção de elementos de forma sequencial. Aqui está um exemplo de como você pode utilizar o iterator para percorrer uma lista:

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIterator {
    public static void main(String[] args) {
        // Criando uma lista de strings
        List<String> lista = new ArrayList<>();
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");

        // Obtendo um iterator da lista
        Iterator<String> iterator = lista.iterator();

        // Percorrendo a lista usando o iterator
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
        }

        // Removendo um elemento da lista usando o iterator
        iterator = lista.iterator(); // Reiniciando o iterator
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals("Banana")) {
                iterator.remove();
            }
        }

        // Imprimindo a lista após remover "Banana"
        System.out.println("Lista após remover 'Banana': " + lista);
    }
}
```

Neste exemplo, utilizei um iterator para percorrer uma lista de strings e imprimir os elementos. Além disso, depois de percorrer a lista, reiniciamos o iterator e usamos o método `remove()` para remover o elemento "Banana" da lista.

Lembre-se de que o iterator permite percorrer a coleção, acessar os elementos e removê-los de forma segura, evitando problemas de concorrência. Cada chamada ao método `next()` avança o cursor do iterator para o próximo elemento, e a remoção usando `remove()` remove o elemento atual da coleção.

### ListIterator: 
Listiterator estende Iterator e suporta acesso bidirecional em uma lista, modificando e/ou removendo elementos.

## Implementações

#### As interfaces apresentadas anteriormente possuem diversas implementações que são utilizadas para armazenar as coleções. tentarei resumir as implementações mais comuns que podem te ajudar a decidir qual delas utilizar em uma aplicação:

### Implementações de List:

* ArrayList – é como um array cujo tamanho pode crescer. A busca de um elemento é rápida, mas inserções e exclusões não são. Podemos afirmar que as inserções e exclusões são lineares, o tempo cresce com o aumento do tamanho da estrutura. Esta implementação é preferível quando se deseja acesso mais rápido aos elementos. Por exemplo, se você quiser criar um catálogo com os livros de sua biblioteca pessoal e cada obra inserida receber um número sequencial (que será usado para acesso) a partir de zero;
* LinkedList – implementa uma lista ligada, ou seja, cada nó contém o dado e uma referência para o próximo nó. Ao contrário do ArrayList, a busca é linear e inserções e exclusões são rápidas. Portanto, prefira LinkedList quando a aplicação exigir grande quantidade de inserções e exclusões. Um pequeno sistema para gerenciar suas compras mensais de supermercado pode ser uma boa aplicação, dada a necessidade de constantes inclusões e exclusões de produtos;

### Implementações de Set:

* HashSet – o acesso aos dados é mais rápido que em um TreeSet, mas nada garante que os dados estarão ordenados. Escolha este conjunto quando a solução exigir elementos únicos e a ordem não for importante. Poderíamos usar esta implementação para criar um catálogo pessoal das canções da nossa discografia;
* TreeSet – os dados são classificados, mas o acesso é mais lento que em um HashSet. Se a necessidade for um conjunto com elementos não duplicados e acesso em ordem natural, prefira o TreeSet. É recomendado utilizar esta coleção para as mesmas aplicações de HashSet, com a vantagem dos objetos estarem em ordem natural;
* LinkedHashSet – é derivada de HashSet, mas mantém uma lista duplamente ligada através de seus itens. Seus elementos são iterados na ordem em que foram inseridos. Opcionalmente é possível criar um LinkedHashSet que seja percorrido na ordem em que os elementos foram acessados na última iteração. Poderíamos usar esta implementação para registrar a chegada dos corredores de uma maratona;

### Implementações de Map:

* HashMap – baseada em tabela de espalhamento, permite chaves e valores null. Não existe garantia que os dados ficarão ordenados. Escolha esta implementação se a ordenação não for importante e desejar uma estrutura onde seja necessário um ID (identificador). Um exemplo de aplicação é o catálogo da biblioteca pessoal, onde a chave poderia ser o ISBN (International Standard Book Number);
* TreeMap – implementa a interface SortedMap. Há garantia que o mapa estará classificado em ordem ascendente das chaves. Mas existe a opção de especificar uma ordem diferente. Use esta implementação para um mapa ordenado. Aplicação semelhante a HashMap, com a diferença que TreeMap perde no quesito desempenho;
* LinkedHashMap – mantém uma lista duplamente ligada através de seus itens. A ordem de iteração é a ordem em que as chaves são inseridas no mapa. Se for necessário um mapa onde os elementos são iterados na ordem em que foram inseridos, use esta implementação. O registro dos corredores de uma maratona, onde a chave seria o número que cada um recebe no ato da inscrição, é um exemplo de aplicação desta coleção.
### <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html">Para Saber mais sobre o java collections framwork </a>
