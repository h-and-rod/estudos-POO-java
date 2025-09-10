# Especialização e generalização
---

## Super classe
Classe que possui atributos e métodos comuns às subclasses

## Sub classe
Classe que possui atributos e métodos específicos que se somam aos atributos **herdados** da superclasse

## Implementação em Java

### 1. Defina a classe como subclasse:
```
public class Aluno extends Pessoa{ 
    //código
}
```

### 2. No método construtor da subclasse, atribua valores ao método construtor da superclasse usando "super()":
```
public Aluno(int re, String n, String dn){
        super(n, dn); //chamada do método construtor
                      //herdado da super classe
                      
        regEscolar = re;
    }
```