# POO

### Construtores

O Construtor é um método especial que é invocado no momento que esá sendo instanciado um novo objeto daquela classe. Segue algumas regras

Em um construtor, talvez possa ser necessario aplicar o this, caso a variavel definida no construtor tenha o mesmo nome que a variavel da classe

( O this aponta para o atributo da classe atual )

- Segue o mesmo nome da classe

- Não retorna valores

- Uma classe pode possuir mais de um construtor com assinaturas diferentes

- Toda vez que um objeto é criado ao menos 1 construtor é executado.

- Mesmo que não exista um construtor declarado explicitamente na classe, o compilador cria um automaticamente

### Dependencias

Uma classe pode ter dois tipos de associação, agregação ou composição

- Agregação: Agrega em uma classe, mudanças públicas podem ser realizadas numa agregação

- Composição: Faz parte de uma classe, mudanças pública não podem ser realizadas numa composição, portanto, é possivel que uma classe tenha uma dependencia dessa composição, que significa que a classe não funcionará corretamente sem a composição
