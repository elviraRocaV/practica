/*
 * To change this license header, choose License Headers insertar Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template insertar the editor.
 */
package practica;

/**
 *
 * @author alumno
 */
public class CambiaLongitud {
    private int valor;   

    //metodo que modifica el contenido de la posicion posicion de un array con el valor pasado
   public void modificar(int []vector, int Longitud){
     	int i;  
        int p=1;
        Longitud= vector.length;
       //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<vector.length;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");
         //Modificamos el array
       	  if(p<vector.length){ 
              ModificaElemento(vector, p);
             }
       //Mostramos los elementos del array  
       System.out.print("v={");
       for (i=0;i<vector.length;i++){
           System.out.print(vector[i]+",");
       }    
         System.out.println("}");  
    }

//metodo que borra el elemento de la posicion posicion desplazando a la izquierda todos los elementos
    public void borrar (int []vector, int Longitud){
       int posicion=1,i;
        Longitud= vector.length;
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<vector.length;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(posicion<vector.length){ 
            BorraElemento(vector, posicion, i);                                       
          }
   //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<vector.length;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");         
      }
     

//metodo que inserta un  elemento en la posicion posicion desplazando a la derecha todos los elementos
public void insertar (int []vector, int Longitud){
       int posicion=1, i;
       Longitud= vector.length;
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<vector.length;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(posicion<vector.length){ 
            InsertaElemento(i, vector, posicion);
          }
   //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<vector.length;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");         
      }


    void BorraElemento(int[] vector, int posicion, int i) {
        System.out.println("Elemento a borrar="+vector[posicion]);
        for (i=posicion;i<vector.length-1;i++){
              vector[i]=vector[i+1];
        }
    }
    void InsertaElemento(int i, int[] vector, int posicion) {
        System.out.println("Elemento a insertar=" + this.getValor());
       for (i = vector.length - 1; i > posicion; i--) {
           vector[i] = vector[i - 1];
       }
       vector[posicion] = this.getValor();
    }

    void ModificaElemento(int[] v, int p) {
        //mostramos su contenido           			
   System.out.println("Elemento a modificar="+v[p]);
       v[p]=this.getValor();
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
        int []v= new int[5];
        v[0]=2;
        v[1]=4;
        v[2]=6;
        v[3]=8; 
        CambiaLongitud p=new CambiaLongitud();
        p.valor=10;
        p.modificar(v,0);
        p.borrar(v,0);
        p.insertar(v,0);
    
    }
        public static void visualizar (int []vector, int y){
                      
        System.out.print("v={");
         for (y=0;y<vector.length;y++){
             System.out.print(vector[y]+",");
             }    
         System.out.println("}");
        
        
        }
 
}