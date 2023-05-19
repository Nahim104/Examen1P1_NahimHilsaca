/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_nahimhilsaca;
import java.util.Scanner;

/**
 *
 * @author nahim
 */
public class Examen1P1_NahimHilsaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer=new Scanner(System.in);
        
        int opcion=0;
        
        while (opcion !=3){
        
            System.out.println("Menu");
            System.out.println("1. Suma de Binarios");
            System.out.println("2. Estrella de David");
            System.out.println("3. Salir");
            
            opcion = leer.nextInt();
            
            
            switch(opcion){
            
                case 1:
                    
                    String primero;
                    String segundo;
                    String respuesta= " ";
                    boolean pri=true;
                    boolean seg=true;
                    
                    
                    System.out.println("Ingrese el primer numero: ");
                    primero=leer.next();
                    System.out.println("Ingrese el segundo numero: ");
                    segundo=leer.next();
                    
                    
                    while( primero.length() != segundo.length()){
                
                   System.out.println("Los números deben de tener el mismo número de bits");
                    System.out.println("Ingrese el primer numero: ");
                    primero=leer.next();
                    System.out.println("Ingrese el segundo numero: ");
                    segundo=leer.next();
                            }
                    
                    for( int i=0; i<primero.length(); i++){
                    
                     char charac1=primero.charAt(i);
                           
                       if(charac1 !=48 &&  charac1!=49 ){
                        
                       pri=false;
                       break;
                        }
                       
                     
                    }// Fin del for para el primer numero
                  
                        if(!pri){
                        
                        System.out.println("El primer número contiene caracteres distintos de '0' y '1'.");
                        
                        } // Para validar si tiene numeros que no sean 0 y 1   
                    
                    
                    
                    for( int j=0; j<primero.length(); j++){
                    
                    char charac2=segundo.charAt(j);
                    
                        if(charac2 !=48 && charac2 !=49 ){
                        
                        seg=false;
                        break;
                        }
                   
                    }// Fin del for para el segundo numero
                    
                    if(!seg){
                        
                        System.out.println("El segundo número contiene caracteres distintos de '0' y '1'.");
                        
                        }// Para validar si tiene numeros que no sean 0 y 1
                    
                    
                 
                    
                    
                    
                    
                    
                     
                    break;
                    
                case 2:
                    
                    System.out.println("Ingrese su magnitud: ");
                    int num=leer.nextInt();
                    
                    
                    while( num<9){
                    
                        System.out.println("El numero tiene que ser mayor a 9");
                        num=leer.nextInt();
                    
                    }// Valida cuando el numero introducido es menor a 9
                    
                    while (num%2 ==0){
                    
                        System.out.println("El numero tiene que ser impar");
                        num=leer.nextInt();
                    
                    
                    }// Valida cuando el numero introducido es par
                    
                    if( num>9 && num%2 !=0){
                    
                        for( int j=0; j<num; j++){
                            
                            System.out.print("*");
                            
                       
                        }
                        
                        
                        
                         
                           
                        
                        }// Fin del if
                 
                       
          
                    break;      
                         
                    
                
            
            }// Fin del switch
        
        
        }// Fin del while
    }// Fin del main
    
}// Fin de la clase
