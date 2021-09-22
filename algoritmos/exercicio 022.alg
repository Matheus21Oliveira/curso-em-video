algoritmo "exercício 022"

var
nome: caractere
ano, alistamento, idade: inteiro

inicio
      escreval ("digite o nome do interessado")
      leia (nome)
      
      escreval ("em que ano ", nome , " nasceu?")
      leia (ano)
      
      idade <- 2021 - ano


      se (idade < 18) entao
         alistamento <- 18 - idade
         escreval ("faltará", alistamento, " anos")

      senao
           se (idade = 18) entao
              escreval ("esta na idade de ingressar ao alistamento militar")
           senao
                alistamento <- idade - 18
                escreval ("passou", alistamento, " anos")
           fimse
      fimse
fimalgoritmo
