algoritmo "exercício 018"

var
   ano, idade : real

inicio
      escreva ("Em que ano voce nasceu?")

      leia (ano)
     idade <- 2021 - ano

     se  (idade > 18) entao
         escreva ("voce tem a idade e é obrigado a votar")

     senao
          se (idade >= 16) entao
             escreva ("voce pode votar, porem não é obrigatório")
          senao
               escreva ("voce nao tem a idade mínima de 16 anos para votar")
          fimse
      fimse
fimalgoritmo
