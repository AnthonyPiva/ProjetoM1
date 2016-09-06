/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vision;

import java.util.Scanner;

/**
 *
 * @author 5725089
 */
public class Menu {
    
    public static void ExibirMenu(){
        char op = '0';
        System.out.println(" ---- Menu ---- ");
        System.out.println("Digite V para visualizar os problemas reportados.");
        System.out.println("Digite R para reportar um novo problema.");
        System.out.println("Digite E para sair do programa.");
        System.out.println("\nOpção:");
        System.out.println(">> ");
        Scanner entrada = new Scanner(System.in);
        do{
            try{
                op = entrada.nextLine().charAt(0);
            }catch(Exception e){
                System.out.println("Digite V, R ou E");
            }
        }while(op != 'V' && op != 'R' && op != 'E');
        if(op=='R'){
            ProblemaVisao.exibirFormularioCadastroProblema();
        }else if(op == 'V'){
            ProblemaVisao.exibirListaProblemas();
        }else if(op == 'E'){
            System.exit(0);
        }
    }
    
}
