algoritmo "exercício 024"

var
km, preco: real
inicio
      escreval ("qual é a distancia que deseja percorrer?")
      leia (km)


      se (km <= 200) entao
         preco <- 0.50 * km
               escreval ("a passagem será " , preco)
      senao
         preco <- 0.45 * km
               escreval (" a passagem será ", preco)
      fimse
      
fimalgoritmo
