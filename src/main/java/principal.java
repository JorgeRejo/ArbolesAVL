/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge
 */
import java.util.Scanner;
class ArbolesAVL {
//************************************
// Arbol obtenerArbol()
//************************************
public static Arbol obtenerArbol() {
 String palabra = ArbolesAVL.solicitarPalabra();
 Arbol arbol = new Arbol();
    for (int i = 0; i < palabra.length(); i++) {
     String letra = String.valueOf(palabra.charAt(i));
     if (!arbol.existe(letra)) {
      arbol.insertar(letra);
      }
    }
  return arbol;
}
//************************************
// solicitarPablabra()
//************************************
private static String solicitarPalabra() {
  Scanner sc = new Scanner(System.in);
   while (true) {
    System.out.println("Ingresa la palabra: ");
    String palabra = sc.nextLine();
    if (palabra.contains(" ")) {
    System.out.println("No puedes ingresar una frase");
    } 
    else if (palabra.length() < 10) {
     System.out.println("La longitud minima es de 10");
     } 
     else {
     return palabra;
    }
   } 
  }
}
class Nodo {
  private final String dato;
  private Nodo izquierda, derecha;
 //************************************
 // Nodo
 //************************************
 public Nodo(String dato) {
  this.dato = dato;
  this.izquierda = this.derecha = null;
  }
  //************************************
 // getDato()
 //************************************
  public String getDato() {
   return dato;
   }
  //************************************
  // getIzquierda
  //************************************
  public Nodo getIzquierda() {
   return izquierda;
   }
  //************************************
  // setIzquierda
  //************************************
  public void setIzquierda(Nodo izquierda) {
  this.izquierda = izquierda;
   }
  //************************************
  // getDerecha
  //************************************
  public Nodo getDerecha() {
  return derecha;
  }
  //************************************
  // setDerecha
  //************************************
  public void setDerecha(Nodo derecha) {
  this.derecha = derecha;
 }
  //************************************
  // imprimirDato
  //************************************
   public void imprimirDato() {
   System.out.println(this.getDato());
    }
}
class Arbol {
   private Nodo raiz;
    //**********************
   public Arbol() {
    }
     //************************************
    // existe (busqueda)
    //************************************
   public boolean existe(String busqueda) {
   return existe(this.raiz, busqueda);
    }
    //************************************
   // existe (nodo,busqueda)
   //************************************
   private boolean existe(Nodo n, String busqueda){
    if (n == null) {
      return false;
    }
    if (n.getDato().equals(busqueda)) {
      return true;
    }
   else if (busqueda.compareTo((String) n.getDato()) < 0) {
     return existe(n.getIzquierda(), busqueda);
    }      
   else {
     return existe(n.getDerecha(), busqueda);
    }
}
//************************************
// insertar dato
//************************************
public void insertar(String dato) {
    if (this.raiz == null) {
     this.raiz = new Nodo(dato);
    } 
    else {
     this.insertar(this.raiz, dato);
    }
}
import TipoPila.PilaVector;
 ArbolBinario arbol;
Nodo a1, a2, a;
PilaVector pila = new PilaVector();
a1 = ArbolBinario.nuevoArbol(null,"Maria",null);
a2 = ArbolBinario.nuevoArbol(null,"Rodrigo",null);
a = ArbolBinario.nuevoArbol(a1,"Esperanza",a2);
pila.insertar(a);
a1 = ArbolBinario.nuevoArbol(null,"Anyora",null);
a2 = ArbolBinario.nuevoArbol(null,"Abel",null);
a = ArbolBinario.nuevoArbol(a1,"M Jesus",a2);
pila.insertar(a);
a2 = (Nodo) pila.quitar();
a1 = (Nodo) pila.quitar();
a = ArbolBinario.nuevoArbol(a1,"Esperanza",a2);
arbol = new ArbolBinario(a);
//************************************
// insertar padre,dato
////**********************************
  private void insertar(Nodo padre, String dato) {
  (dato.compareTo((String) padre.getDato()) > 0){
  if (padre.getDerecha() == null)
     padre.setDerecha(new Nodo(dato));
     else
     this.insertar(padre.getDerecha(), dato);
    }
     else   
      if (padre.getIzquierda() == null)
      padre.setIzquierda(new Nodo(dato));
     else
      this.insertar(padre.getIzquierda(), dato);
    }

    void preorden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void postorden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
//************************************
// preorden nodo n
//************************************
private void preorden(Nodo n) {
    if (n != null) {
      n.imprimirDato();
      preorden(n.getIzquierda());
      preorden(n.getDerecha());
    }
}
//************************************
// inorden nodo n
//************************************
private void inorden(Nodo n) {
    if (n != null) {
      inorden(n.getIzquierda());
      n.imprimirDato();
      inorden(n.getDerecha());
    }
}
//************************************
// postorden nodo n
//************************************
private void postorden(Nodo n) {
    if (n != null) {
      postorden(n.getIzquierda());
      postorden(n.getDerecha());
      n.imprimirDato();
    }
}
//************************************
// preorden
//************************************
public void preorden() {
   this.preorden(this.raiz);
}
//************************************
//inorden
//************************************
public void inorden() {
   this.inorden(this.raiz);
}
//************************************
// postorden
//************************************
public void postorden() {
  this.postorden(this.raiz);
}
}
//************************************
// Funcion main
//************************************
class Main {
  public static void main(String[] args) {
     String eleccion = "";
     Arbol arbol = null;
     Scanner sc = new Scanner(System.in);
       while (!eleccion.equals("5")) {
          System.out.println("1. Ingresar");
               System.out.println("2. Visualizar Pre-Orden");
               System.out.println("3. Visualizar Pos-Orden");
               System.out.println("4. Visualizar In-Orden");
               System.out.println("5. Visualizar Datos Tarea");
               System.out.println("6. Salir");
               System.out.println("Elige: ");
          eleccion = sc.nextLine();
         switch (eleccion) {
          case "1":
             arbol = AyudanteDatos.obtenerArbol();
           break;
          case "2":
             if (arbol != null) arbol.preorden();
               else System.out.println("No has ingresado nada");
          break;
          case "3":
              if (arbol != null) arbol.postorden();
              else System.out.println("No has ingresado nada");
          break;
          case "4":
             if (arbol != null) arbol.inorden();
             else System.out.println("No has ingresado nada");
           break;
           default:
            break;
        }
}
}
}
