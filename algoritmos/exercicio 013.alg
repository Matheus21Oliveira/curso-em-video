algoritmo "exercício13"

var
funcionario: caractere
aumento: real
salario: real
promocao: real
inicio
escreval ("qual é o nome do funcionário?")
leia (funcionario)
escreval ("qual o valor do salário de " , funcionario , "?")
leia (salario)
aumento <- salario*0.15
promocao <- salario+aumento
escreval ("valor do salario de " , funcionario , " é R$" , promocao)


fimalgoritmo
