# Programação Orientada a Objetos

## Cadeia de Construtores

Quando uma instância é criada, o construtor da class é invocado.

O primeiro comando executado em um construtor deve sempre ser o pedido para invocar outro construtor da classe ou então algum consrutor da clsse superiora (super classe)

Em outras palavras, mesmo se o comando super() for omitido, ele sera o primeiro a ser invocado dentro de um construtor, e dependendo da situação, pode acarretar na cadeia de construtores, por isso o nome

Exemplo:

![image](https://github.com/lant-silva/aula-projetosPOO/assets/125385378/705b0562-5423-4d2b-9f64-8bfbc8d5cae8)

![image](https://github.com/lant-silva/aula-projetosPOO/assets/125385378/4bc3d320-110a-4232-a241-b8e0b436c9ad)

Quando uma instancia da classe aluno for criada, seu construtor irá chamar o construtor da classe Pessoa, que irá fazer o mesmo para a classe Object, ai então segue a execução das outras linhas do construtor

![image](https://github.com/lant-silva/aula-projetosPOO/assets/125385378/91f4a07f-c17b-46fb-990e-3734b481ad3b)

## Construtores Cíclicos

Um construtor pode chamar outro construtor abaixo dele na mesma classe usando o this()

## Regras

O primeiro construtor em uma classe, caso não tenha super() ou this(), receberá, automaticamente, um super() na primeira linha do construtor

## Polimorfismo

### Coerção

A coerção ocorre quando um tipo é transformado em outro tipo devido a operação utilizada 

No java, uma variável de um tipo pode ser transformada em outro tipo para viabilizar uma operação

### Sobrecarga

A sobrecarga permite a criação de métodos com o mesmo nome, porém, com parâmetros diferente,s de modo que 

### Universal

O universal permite que o código a ser executado seja escolhido na hora da execução, caso exista métodos com o mesmo nome em classes diferentes (classes utilizando a herança)

### Sobrescrita

A sobrescrita permite que uma subclasse modifique o comportamento herdado de uma superclasse

Importante:

- Na sobrescrita, uma classe que herda não pode usar comportamentos exclusivos da classe herdeira

- Não pode haver uma redução de visibilidade

- O tipo de retorno pode ser o mesmo tipo ou um subtipo dele

- Uma classe não pode lançar mais ou menos exceções que a superclasse

- Métodos marcados com final ou static não podem ser sobrescritos

- Um método só pode ser sobrescrito, caso a subclasse possa acessa-lo

Exemplo: Uma classe Humano com comportamento dormir() e falar() que herda dormir() da classe Animal, pode usar o dormir e falar, mas uma classe animal não pode usar o comportamento falar da classe Humano

### Parametric - Generics

A parametrização constrasta com o ad-hoc pois neste último existe um conjunto de métods criados para trabalhar com tipos diferentes.

Já o paramétrico permite a criação de um único método genérico que pode ser utilizado para diversos tipos
