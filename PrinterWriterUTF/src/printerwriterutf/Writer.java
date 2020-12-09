
package printerwriterutf;

import java.io.*;

public class Writer {
    public static void cadena(){
        String linea="hola....";
        File direc;
        DataOutputStream salida=null;
        direc=new File("texto.txt");
        try{
            salida=new DataOutputStream(new FileOutputStream(direc));
            for(int i=0;i<3;++i){
            System.out.println("Escribiendo cadena: " + linea);
                salida.writeUTF(linea);
                System.out.println("Espacio archivo: " + salida.size() + " Bytes");
            }
            System.out.println("Espacio total " + salida.size() + " Bytes");
        }catch(IOException e){
            System.out.println("Error operando archivo");
        }finally{
            if(salida != null){
                try{
                    salida.close();
                }catch(IOException e2){
                    System.out.println("error al cerrar el archivo");               }
            }
        }
    }
    public static void Leer(){
    File direc;
    DataInputStream entrada=null;
    direc=new File("texto.txt");
    try{
        entrada=new DataInputStream(new FileInputStream(direc));
        while(entrada.available()!=0){
                System.out.println("Queda: " + entrada.available() + " Bytes por leer");
                System.out.println("cadena: " + entrada.readUTF());
            }
            if(entrada.available()==0){
                System.out.println("Proceso Completado");
            }
    }catch(IOException e){
        System.out.println("Error operando archivo");
    }finally{
        if(entrada != null){
            try{
                entrada.close();
            }catch(IOException e2){
                System.out.println("error al cerrar el archivo");               }
            }
        }
    }   
}

