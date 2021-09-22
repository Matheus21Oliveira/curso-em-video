algoritmo "exercicios035"

var
   carro: caractere
   km, valor: real
inicio
      escreval("escolha o tipo do carro luxo ou popular?")
      leia (carro)
      
      escreval("quantos kilometros foram percorridos?")
      leia (km)
      
      escolha carro
      caso "popular"
         se (km <= 100) entao
            valor <- 90 + (0.2*km)
            escreval ("o preço será de R$" , valor)
         senao
              valor <- 90+(0.1*km)
              escreval ("o preço será de R$" , valor)
         fimse
       caso "luxo"
             se (km <= 200) entao
                valor <- 150 + (0.3*km)
                 escreval ("o preço será de R$" , valor)
          senao
              valor <- 150+(0.25*km)
              escreval ("o preço será de R$" , valor)
         fimse
          
      fimescolha
      
fimalgoritmo

