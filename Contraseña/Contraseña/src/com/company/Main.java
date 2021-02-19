package com.company;
import java.util.Objects;
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
       // Scanner key =new Scanner(System.in);
        int veces = 0;

        String contra = "",usuario = "", usuarior = "",contrar = "";
        //Registro
        //Usuario
        Scanner usu = new Scanner(System.in);
        System.out.println("Establezca un usuario: ");
        usuario = usu.nextLine();
        //contraseña
        Scanner con= new Scanner(System.in);
        System.out.println("Establezca una contraseña: ");
        contra = con.nextLine();

  do {
      //usuario
      Scanner usur = new Scanner(System.in);
      System.out.println("Establezca un usuario: ");
      usuarior = usur.nextLine();
      //contraseña
      Scanner conr= new Scanner(System.in);
      System.out.println("Establezca una contraseña: ");
      contrar = conr.nextLine();
      if(Objects.equals(contrar, contra) && Objects.equals(usuarior, usuario)){
          System.out.println("Aceptado");
          veces = 3;
      }
      else{
          System.out.println("Usuario o contraseña incorrecta");
          veces = veces+1;
      }
    }
  while(veces < 3 );
  if(veces <= 3) {
      System.out.println("Llego al limite de intentos, espere un momento");
  }
    }
}
