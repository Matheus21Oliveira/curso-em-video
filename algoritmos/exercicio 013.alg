algoritmo "exerc�cio13"

var
funcionario: caractere
aumento: real
salario: real
promocao: real
inicio
escreval ("qual � o nome do funcion�rio?")
leia (funcionario)
escreval ("qual o valor do sal�rio de " , funcionario , "?")
leia (salario)
aumento <- salario*0.15
promocao <- salario+aumento
escreval ("valor do salario de " , funcionario , " � R$" , promocao)


fimalgoritmo
