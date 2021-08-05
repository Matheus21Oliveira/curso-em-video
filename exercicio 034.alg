algoritmo "exercicios034"

var
altura, peso, resultado : real
inicio
      escreval("qual é a sua altura?")
      leia (altura)
      
      escreval ("qual é o seu peso?")
      leia (peso)
      
      resultado <- peso/(altura^2)
      
      se (resultado <= 18.5) entao
         escreval ("voce esta abaixo do peso!")
      senao
           se (resultado <= 25) entao
              escreval ("voce está com o peso ideal!")
           senao
                se (resultado <= 30) entao
                   escreval ("voce está em sobrepeso!")
                senao
                     se ( resultado  <= 40) entao
                        escreval ("voce está em obesidade!")
                     senao
                          escreval ("voce está em uma obesidade mórbida!")
                     fimse
                fimse
           fimse
      fimse
      

fimalgoritmo

