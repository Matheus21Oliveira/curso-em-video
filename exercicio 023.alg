algoritmo "exercício 023"

var
   nome, sexo: caractere
   valor: real
inicio
      escreval ("qual é o seu nome?")
      leia (nome)

      escreval ("qual é o seu sexo?")
      leia (sexo)
      
      escreval("qual é o valor da sua compra?")
      leia (valor)
      
      se (sexo = "feminino") entao
         valor <- valor - (valor * 0.13)
      senao
           valor <- valor - (valor * 0.05)
      fimse

      escreva (nome, " voce terá R$" , valor)
fimalgoritmo
