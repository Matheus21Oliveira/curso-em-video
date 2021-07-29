algoritmo "exercício 019"

var
   nome: caractere
   media, nota1, nota2: real

inicio
      escreval ("qual o nome do aluno(a)?")

      leia (nome)
      
      escreval (" qual é a primeira nota do(a) ", nome , "?")

      leia (nota1)

      escreval (" qual é a segunda nota do(a)", nome , "?")
      
      leia (nota2)
      
      media <- (nota1 + nota2) / 2

      se (media >= 7)  entao
         escreva (nome , " esta acima da média")
      senao
          escreva (nome , " esta abaixo da média")
      fimse
fimalgoritmo
