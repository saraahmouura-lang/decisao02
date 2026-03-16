import java.util.Scanner;
public class extenso {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num= sc.nextInt();

        if( num ==1000){
            System.out.println("este numero por extenso é: mil");
            return;
        
        }
        int cent= num/100;
        int dez= (num%100)/10;
        int uni= num%10;

        String extenso= "";

        switch (cent) {
            case 1:
            if(num==100) extenso+= "cem";
            else extenso+= "cento";
            break;
            case 2:extenso+= "duzentos";break;
            case 3:extenso+= "trezentos";break;
            case 4:extenso+= "quatrocentos";break;
            case 5:extenso+= "quinhentos";break;
            case 6:extenso+= "seiscentos";break;
            case 7:extenso+= "setecentos";break;
 import java.util.Scanner;
public class hora {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("digite o horario atual: ");
        double hora= scanner.nextDouble();

        if(hora>=0 && hora<12){
            System.out.println("bom dia, vamos acordar!!!");
        }else if (hora>=12 && hora<18){
            System.out.println("boa tarde, vamos tomar um cafezin!!");
        }else if (hora>=18 && hora<=23){
            System.out.println("boa noite, vamos dormir ne!!");
        }else{
            System.out.println("não entendi");
        }

        scanner.close();
    }
}extenso.java           case 8:extenso+= "oitocentos";break;
            case 9:extenso+= "novecentos";break;
        }
        if(cent>0 && (dez>0||uni>0)){
            extenso+="e";
        }
        if(dez==1 && uni>0){
            switch (uni) {
                case 1: extenso+= " onze";break;
                case 2: extenso+= " doze";break;
                case 3: extenso+= "treze";break;
                case 4: extenso+= " catorze";break;
                case 5: extenso+= " quinze";break;
                case 6: extenso+= " dezesseis";break;
                case 7: extenso+= " dezessete";break;
                case 8: extenso+= " dezoito";break;
                case 9: extenso+= " dezenove";break;
            }    
        }else{
                switch (dez) {
                    case 1:extenso+="dez";break;
                    case 2:extenso+="vinte";break;
                    case 3:extenso+="trinta";break;
                    case 4:extenso+="quarenta";break;
                    case 5:extenso+="cinquenta";break;
                    case 6:extenso+="sessenta";break;
                    case 7:extenso+="setenta";break;
                    case 8:extenso+="oitenta";break;
                    case 9:extenso+="noventa";break;
                }
        if(dez>0 && uni>0){
            extenso+="e";
        }
            switch (uni) {
                case 1:extenso+="um";break;
                case 2:extenso+="dois";break;
                case 3:extenso+="três";break;
                case 4:extenso+="quatro";break;
                case 5:extenso+="cinco";break;
                case 6:extenso+="seis";break;
                case 7:extenso+="sete";break;
                case 8:extenso+="oito";break;
                case 9:extenso+="nove";break;
            }

        }
        System.out.println("este numero por extenso é:"+extenso);
        

        
    }
}
