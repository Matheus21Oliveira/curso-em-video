algoritmo "exerc�cios 029"

var
   nome: caractere
   As, Ns: real
   tempo: inteiro
inicio
      escreval ("qual o nome do funcionario? ")
      leia (nome)
      
      escreval ("qual o atual salario de ", nome, "?")
      leia (As)
      
      escreval ("quanto tempo ", nome , " trabalha na empresa?")
      leia (tempo)

      se(tempo <= 3) entao
           Ns <- As + ( As * 0.03)
      senao
           se (tempo < 10) entao
           Ns <- As + ( As * 0.125)
           senao
           Ns <- As + (As * 0.020)
           fimse

      fimse
      escreval ("O(a) funcion�rio(a) ", nome, " que trabalha � ", tempo, " anos receber� R$", Ns," reais")
fimalgoritmo
