algoritmo "exerc�cios 028"

var
   largura, comprimento, terreno: real
inicio
      escreval ("qual � a largura do terreno?")
      leia(largura)
      
      escreval ("qual � o comprimento do terreno?")
      leia (comprimento)
      
      terreno <- largura * comprimento
      
      se (terreno < 100) entao
      escreva (" este terreno tem ", terreno ,"m� e � um terreno popular")

      senao

           se ( terreno <= 500) entao
           escreva ("este terreno tem ", terreno , "m� e � um terreno master")
      
           senao
           escreva ("este terreno tem ", terreno ,"m� e � um terreno vip")
            fimse
      fimse
fimalgoritmo
