
package manipulanumeros;


class ValorCredito {

    static void calculaSaldoMédio() {
    int s_m;
    s_m = ManipulaNumeros.ler.nextInt();
     System.out.println("Insira o saldo médio do último ano");   
      switch(s_m){
          case 1:
            System.out.println("Nenhum Crédito"+s_m);
          case 2:
            System.out.println("Crédito de 20% do saldo médio"+s_m);
          case 3:
            System.out.println("Crédito de 30% do saldo médio"+s_m);
          case 4:
            System.out.println("Crédito de 40% do saldo médio"+s_m);
                      
          
      }
    }
    
}
