//ProblemaVisao

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vision;
  
import control.ProblemaControle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.Problema;

/**
 *
 * @author 5725089
 */
public class ProblemaVisao {
    
    public static void exibirListaProblemas(){
        Scanner entrada = new Scanner(System.in);
        String op = "M";
        System.out.println("==== LISTAGEM DE PROBLEMAS REPORTADOS ====");
        System.out.println("CÓDIGO \t DESCRIÇÃO \t SITUAÇÃO \t DATA");
        for(Problema obj : ProblemaControle.ObterLista()){
            System.out.println(obj.getCod()+" \t "+obj.getDescricao()+" \t "+obj.getStatus()+" \t "+obj.getDataProblema());
        }
        System.out.println("Digite M para voltar ao menu.");
        System.out.println("Digite o código do problema para mudar a situação para resolvido.");
        System.out.println("\nOpção:");
        System.out.println(">> ");
        op = entrada.nextLine();
        if(entrada.equals("M")){
            Menu.ExibirMenu();
        }else{
            Problema encontrado = ProblemaControle.ObterProblemaPeloCod(op);
            if(encontrado == null){
                System.out.println("Problema Nao Encontrado");
                Menu.ExibirMenu();
            }else{
                encontrado.setStatus("Resolvido");
                Menu.ExibirMenu();
            }
        }
        
    }
    
    public static void exibirFormularioCadastroProblema(){
        Scanner entrada = new Scanner(System.in);
        String descricao;
        Date dataProblema;
        System.out.println("==== REPORTE DE NOVO PROBLEMAS ====");
        System.out.println("Digite a descrição do problema:");
        System.out.println(">> ");
        descricao = entrada.nextLine();     
        System.out.println("\nDigite a data que o problema foi reportado:");
        System.out.println(">> ");
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        formatadorData.setLenient(false);
        do{
            try{
                dataProblema = formatadorData.parse(entrada.nextLine());
//                if(dataProblema.after(new Date)){
//                    System.out.println("Data no futuro");
//                }
                break;
            }catch(Exception e){
                System.out.println("Erro na data");
            }
        }while(true);
        ProblemaControle.recebeFormularioCadastroProblema(descricao,dataProblema);
        Menu.ExibirMenu();
    }
    
}
