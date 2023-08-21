# O que é Collections Framework?
## Resulmo
### Collections Framework é um conjunto bem definido de interfaces e classes para representar e tratar grupos de dados como uma única unidade, que pode ser chamada de coleção, ou collection em inglês.

#### A plataforma Java inclui uma estrutura de coleções.
Uma coleção é um objeto que representa um grupo de objetos.
Uma estrutura de coleções é uma arquitetura unificada para representar e manipular coleções, permitindo que as coleções sejam manipuladas independentemente dos detalhes de implementação.
#### Uma estrutura de coleções é uma arquitetura unificada para representar e manipular coleções, permitindo que as coleções sejam manipuladas independentemente dos detalhes de implementação.
### As principais vantagens de uma estrutura de coleções são:

* Reduz o esforço de programação fornecendo estruturas de dados e algoritmos para que você não precise escrevê-los sozinho.
* Aumenta o desempenho fornecendo implementações de alto desempenho de estruturas de dados e algoritmos.
  Como as várias implementações de cada interface que pode ser trocada, os programas podem ser ajustados alternando as implementações.
* Fornece interoperabilidade entre APIs não relacionadas, estabelecendo uma linguagem comum para passar coleções de um lado para o outro.
* Reduz o esforço necessário para aprender APIs, exigindo que você aprenda várias APIs de coleta ad hoc.
* Reduz o esforço necessário para projetar e implementar APIs, não exigindo que você produza APIs de coleções ad hoc.
* Promove a reutilização de software fornecendo uma interface padrão para coleções e algoritmos para manipulá-los.
  
## A Collections Framework contém os seguintes elementos:
## Interfaces:
#### Interface são tipos abstratos que representam as coleções. Permitem que coleções sejam manipuladas tendo como base o conceito “Programar para interfaces e não para implementações”, desde que o acesso aos objetos se restrinja apenas ao uso de métodos definidos nas interfaces;
## Implementações:
#### São as implementações concretas das interfaces;
## Exemplo de impelemntação em Java:

A palavra reservada ( Implements ) faz a chamada de qualquer interface que foi criada ou se ja existia na sua aplicação,
nesse exemplo eu criei uma intercafe que tem um método que carrega a assinatura (nome) de IMC,
então eu precisei ultilizar o metodo que essa interface tem em seu corpo,
e para eu não ter que criar outro, eu implemento esse interface e com isso eu sou obrigado e implementar o(os) metodo(s) dela.
A imagem a baixo mostra a Interface e seu método.
<p align="center">
<img  width="400" height="125" src="https://github.com/Evandrolds/java-collections/assets/57682675/776f3205-af76-4dbc-a331-79b25de40c54">
</p>
Aqui na classe Pessoa eu a implemento a interface PessoaImpl, observe logo no topo da imagem a palavra reservado do java ( implements + o nome da interface que é PessoaImpl.

 <p align="center">
 <img  width="480" height="170"  src="https://github.com/Evandrolds/java-collections/assets/57682675/fde0a6bd-aee5-4c1d-9dd2-7fd849257246">
 </p>

## Algoritmos: 
<h4> Algoritmos do collection framework são os métodos que realizam as operações sobre os objetos das coleções, tais como busca e ordenação. </
A Figura a baixo mostra a árvore da hierarquia de interfaces e classes da Java Collections Framework que são derivadas da interface Collection.
A hierarquia da Collections Framework tem uma segunda árvore. São as classes e interfaces relacionadas a mapas ou Map em inglês, que não são  derivadas de Collection, como mostra na figura a cima, Essas interfaces, mesmo não sendo consideradas coleções, podem ser manipuladas como uma coleção ou Collection em inglês.</h4>

![Collection](https://github.com/Evandrolds/java-collections/assets/57682675/5124011d-7339-40a8-a0a3-00475eb97488)

### Vou apresentar uma breve descrição de cada uma das interfaces da hierarquia:

* Collection – está no topo da hierarquia. Não existe implementação direta dessa interface, mas ela define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;
  
* Set – interface que define uma coleção que não permite elementos duplicados. A interface SortedSet, que estende Set, possibilita a classificação natural dos elementos, tal como a ordem alfabética;
  
* List – define uma coleção ordenada, podendo conter elementos duplicados. Em geral, o usuário tem controle total sobre a posição onde cada elemento é inserido e pode recuperá-los através de seus índices. Prefira esta interface quando precisar de acesso aleatório, através do índice do elemento;
  
* Queue – um tipo de coleção para manter uma lista de prioridades, onde a ordem dos seus elementos, definida pela implementação de Comparable ou Comparator, determina essa prioridade. Com a interface fila pode-se criar filas e pilhas;
  
* Map – mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não. SortedMap é uma interface que estende Map, e permite classificação ascendente das chaves. Uma aplicação dessa interface é a classe Properties, que é usada para persistir propriedades/configurações de um sistema, por exemplo.

### A API oferece também interfaces que permitem percorrer uma coleção derivada de Collection. aqui sitarei de:

### Iterator:
O iterator possibilita percorrer uma coleção e remover seus elementos;
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

