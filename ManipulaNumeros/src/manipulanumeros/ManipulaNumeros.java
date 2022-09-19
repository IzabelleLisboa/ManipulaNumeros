
package manipulanumeros;

import java.util.Scanner;

public class ManipulaNumeros {

    public static Scanner ler = new Scanner(System.in);
    public static int x,y;     
    public static void main(String[] args) {
        
    int op;
    do{
        System.out.println("Menu de Operação com números");
        System.out.println("1-Maior de 2 números");
        System.out.println("2- Ordenar valores em ordem decrescente");
        System.out.println("3- Soma impares multiplica pares");
        
        System.out.println("0 - Sair");
        System.out.println("Selecione a opção pretendida");
        op=ler.nextInt();
        switch(op){
            case 0: break;
            case 1:
                leValores("Insira um valor","insira outro valor");
                MaiorNumero.maior2(x,y);
                break;
            case 2:
             do{   
                 le1valor("Insira um valor");
             }while (x<=0);
                NumeroDecrescente.ordenaDecrescente(x);                
               break;              
            case 3: somaImparesMultiplicaPares(); break;             
            default: System.out.println("Insira opção válida");
                
        }
    }while(op!=0);
    }

    private static void leValores(String s1, String s2) {
        System.out.println(s1);
        x = ler.nextInt();
        System.out.println(s2);
        y = ler.nextInt();        
    }

    private static void le1valor(String s1) {
        System.out.println(s1);
        x = ler.nextInt();       
    }

    private static void somaImparesMultiplicaPares() {
        for( x=1; x<=30; x++ ){
            if(x%2==0){
               y*=x;
            else(y+=x);
          
        }
        
    }
    
}
