algoritmo "exercícios 028"

var
   largura, comprimento, terreno: real
inicio
      escreval ("qual é a largura do terreno?")
      leia(largura)
      
      escreval ("qual é o comprimento do terreno?")
      leia (comprimento)
      
      terreno <- largura * comprimento
      
      se (terreno < 100) entao
      escreva (" este terreno tem ", terreno ,"m² e é um terreno popular")

      senao

           se ( terreno <= 500) entao
           escreva ("este terreno tem ", terreno , "m² e é um terreno master")
      
           senao
           escreva ("este terreno tem ", terreno ,"m² e é um terreno vip")
            fimse
      fimse
fimalgoritmo
