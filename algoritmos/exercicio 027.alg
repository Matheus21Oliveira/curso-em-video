algoritmo "exerc�cio 027"

var
   nome: caractere
   media, nota1, nota2: real

inicio
      escreval ("qual o nome do aluno(a)?")

      leia (nome)

      escreval (" qual � a primeira nota do(a) ", nome , "?")

      leia (nota1)

      escreval (" qual � a segunda nota do(a)", nome , "?")

      leia (nota2)

      media <- (nota1 + nota2) / 2

      se (media <= 4.9)  entao
         escreva (nome , " esta reprovado")
      senao
          se ( media <= 6.9) entao
              escreva (nome , " esta em recupera��o")
          senao
               escreva (nome, " esta aprovado")
          fimse

      fimse
fimalgoritmo
