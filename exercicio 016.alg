algoritmo "exercicio 16"

var
   ano, dia: inteiro
   cigarro, anosEdias, vida: real
inicio
      escreval ("quantos cigarros voce fuma ao dia? ")
      leia (dia)

      escreval ("por quantos anos voce usa cigarro? ")
      leia (ano)

      cigarro <- dia * 10

      cigarro <- cigarro * 365
      
      cigarro <- cigarro / 60

      cigarro <- cigarro * 24
      
      anosEdias <- ano * 365
      
      vida <- anosEdias - cigarro
      escreval (" voce perdera ao total de", vida , " dias")
fimalgoritmo
