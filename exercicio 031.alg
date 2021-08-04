algoritmo "exercicios031"

var
player1, player2, resposta1, resposta2: caractere

inicio
escreval ("qual o nome do jogador 1?")
leia (player1)

escreval ("qual o nome do jogador 2?")
leia (player2)

escreval("jogador 1 voce escolhe pedra, papel ou tesoura?")
leia (resposta1)

escreval("e voce jogador 2 escolhe pedra, papel ou tesoura?")
leia (resposta2)

se (resposta1 = "pedra") entao
   se (resposta2 = "papel") entao
      escreval (player2, " ganhou esta rodada")
   senao
      se ( resposta2 = "pedra") entao
         escreval ("ambos os jogadores deram empate!")
      senao
         escreval (player1, " ganhou esta rodada")
      fimse
   fimse
senao
   se (resposta1 = "papel") entao
      se (resposta2 = "papel") entao
         escreval ("amobs os jogadores deram empate!")
      senao
         se ( resposta2 = "pedra") entao
            escreval (player1, " ganhou esta rodada!")

         senao
            escreval (player2, " ganhou esta rodada!")
         fimse
      fimse
   senao
      se (resposta1 = "tesoura") entao
         se (resposta2 = "papel") entao
            escreval (player1, " ganhou esta rodada")
         senao
            se ( resposta2 = "pedra") entao
               escreval (player2, " ganhou esta rodada!")

            senao
               escreval ("ambos os jogadores seram empate"")
            fimse
         fimse
      fimse
   fimse
fimse
fimalgoritmo

