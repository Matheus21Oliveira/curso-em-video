algoritmo "exerc�cio 024"

var
km, preco: real
inicio
      escreval ("qual � a distancia que deseja percorrer?")
      leia (km)


      se (km <= 200) entao
         preco <- 0.50 * km
               escreval ("a passagem ser� " , preco)
      senao
         preco <- 0.45 * km
               escreval (" a passagem ser� ", preco)
      fimse
      
fimalgoritmo
