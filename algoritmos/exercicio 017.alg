algoritmo "exercício 017"

var
   vel, multa : real

inicio
      escreva ("qual é a velocidade do carro?")
      leia (vel)
      se  (vel > 80) entao
          escreva ("voce ultrapassou a velocidade permitida,")
          multa <- (vel-80) * 5
          escreva (" sua multa será de R$", multa)
      senao
           escreva ("voce esta na velocidade correta")
      fimse
fimalgoritmo
