algoritmo "exerc�cio 023"

var
   nome, sexo: caractere
   valor: real
inicio
      escreval ("qual � o seu nome?")
      leia (nome)

      escreval ("qual � o seu sexo?")
      leia (sexo)
      
      escreval("qual � o valor da sua compra?")
      leia (valor)
      
      se (sexo = "feminino") entao
         valor <- valor - (valor * 0.13)
      senao
           valor <- valor - (valor * 0.05)
      fimse

      escreva (nome, " voce ter� R$" , valor)
fimalgoritmo
