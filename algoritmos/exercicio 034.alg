algoritmo "exercicios034"

var
altura, peso, resultado : real
inicio
      escreval("qual � a sua altura?")
      leia (altura)
      
      escreval ("qual � o seu peso?")
      leia (peso)
      
      resultado <- peso/(altura^2)
      
      se (resultado <= 18.5) entao
         escreval ("voce esta abaixo do peso!")
      senao
           se (resultado <= 25) entao
              escreval ("voce est� com o peso ideal!")
           senao
                se (resultado <= 30) entao
                   escreval ("voce est� em sobrepeso!")
                senao
                     se ( resultado  <= 40) entao
                        escreval ("voce est� em obesidade!")
                     senao
                          escreval ("voce est� em uma obesidade m�rbida!")
                     fimse
                fimse
           fimse
      fimse
      

fimalgoritmo

