algoritmo "exerc�cio 026"

var
   n1, n2: inteiro

inicio
      escreval ("me diga um n�mero?")
      leia (n1)
      
      escreval ("agora me diga outro n�mero?")
      leia (n2)
      
      se (n2 < n1) entao
         escreval ("o primeiro valor � maior!")
      senao
           se (n1 < n2) entao
              escreval ("o segundo valor � maior")
           senao
                escreval ("nao existe valor maior, os dois sao iguais!")
           fimse
      fimse
fimalgoritmo

