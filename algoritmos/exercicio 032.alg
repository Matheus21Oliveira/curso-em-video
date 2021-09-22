algoritmo "exercicios032"

var
   numero, valor: inteiro
inicio

    escreval ("tente advinhar um numero de um a cinco!")
    leia (numero)

    aleatorio 1, 5
    leia (valor)
    aleatorio off

    se (numero=valor) entao
       escreval ("voce acertou!!!")

    senao
       escreval ("poxa, não foi desta vez..., mas não desista!")

    fimse
fimalgoritmo

