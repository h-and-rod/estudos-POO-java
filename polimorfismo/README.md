# Polimorfismo

Quando a forma de efetivação de uma operação de uma superclasse é diferente nas respectivas subclasses. 

## Método abstrato
Indica ao compilador que o método é assinado na superclasse, mas que sua implementação e lógica serão definidas em suas respectivas subclasses


Em Java:

### 1. Defina o método abstrato:
```
abstract public double calcSalBruto();
```

### 2. Corrija a declaração da classe, já que agora ela é uma classe abstrata:
```
public abstract class Funcionario(){

}
```
## Classe abstrata
Classe que tem pelo menos um método abstrato

## Representação em um Diagrama de Classes
O método está presente na representação tanto da superclasse quanto da subclasse

## Uso de super.metodo()
A palavra-chave `super` é utilizada para acessar membros (métodos ou atributos) da superclasse a partir de uma subclasse. Quando sobrescrevemos um método (`override`), podemos usar `super.metodo()` para:

1. **Invocar a implementação original** da superclasse
2. **Estender o comportamento** do método, adicionando funcionalidades específicas da subclasse
3. **Reutilizar código** existente da superclasse

Exemplo:
```java
public double calcSalLiquido() {
    // Chama a implementação da superclasse e adiciona gratificação
    return super.calcSalLiquido() + calcGratificacao();
}
```