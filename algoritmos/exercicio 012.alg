algoritmo "exerc�cio12"

var
produto: caractere
desconto: real
valor: real
promocional: real
inicio
escreval ("qual � o nome do produto?")
leia (produto)
escreval ("qual o valor de " , produto , "?")
leia (valor)
desconto <- valor*0.05
promocional <- valor-desconto
escreval ("valor promocional de " , produto , " � R$" , promocional)


fimalgoritmo
