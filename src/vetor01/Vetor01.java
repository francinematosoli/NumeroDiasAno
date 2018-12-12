/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author Francine
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    
     /*public static boolean isAnoBissexto(int ano) {
      
       if ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) ){
            return true;
        }
        else{
            return false;
        
}}*/
    public static void main(String[] args) {
        // TODO code application logic here
       /* int n[]={3,2,8,7,5,4};
        System.out.println("Total de casas de N"+n.length);
        for(int c=0;c<=n.length-1;c++){
            System.out.println("Na posição "+ c +" temos o valor "+ n[c]);*/
       
       String mes[] ={"Jan","Fev","Mar","Abr","Maio","Jun","Jul","Ago","Set",
           "Out","nov","Dez"};
       
        
       int tot[]={31,28,31,30,31,30,31,30,31,31,30,31,30,31};
       
       
       for(int c=0;c<mes.length;c++){
       System.out.println("O mês de "+ mes[c]+" tem "+tot[c]+" dias ao todo");
               
        }
    }
   
}
