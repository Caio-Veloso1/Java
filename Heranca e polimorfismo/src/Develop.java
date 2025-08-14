public record Develop(double salary) /*extends Employee */{
    /*Um record não pode ter herança, pois record não é possivel ter propriedades
    pro exemplo: private int code;
    *ele so aceita prorpiedades static, e oque é static pertence somente a classe
     e metodos staticos não sao passados por herança.
     record é imutavel e as propriedades so podem ser recebidas como argumentos.
     ou seja um record não pode herdar nada*/
}
