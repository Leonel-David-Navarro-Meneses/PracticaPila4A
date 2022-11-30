package pila;

import java.util.ArrayList;

public class Stack {
    private Data[] stack;
    private int top;
    

    //crea una pila con espacio para t Data
    public Stack(int t){
        stack = new Data[t];
        top = t;
        
        System.out.println("el valor de top es: " + this.top);
        System.out.println("tamaño de la pila: " + stack.length);
    
    }
//regresa true si la pila esta vacia
    public boolean isEmpty(){
        if(top == stack.length)
        return true;
        else
        return false;
    }
//regresa la pila si esta llena
    public boolean isFull(){
        if(top == 0)
        return true;
        else
        return false;
    }
//inserta un elemento pila
    public boolean push(Data d){
         if(this.isFull())//la pila esta llena y no se puede insertar mas datos
         return false;
         this.top--;
         stack[top] = d;
         System.out.println("valor de top:" + this.top);
         return true;
    }
//saca un elemento de la pila
    public Data pop(){
        Data unDato = null;
        //si la pila No esta vacia, se puede retirara elementos
          if(this.isEmpty()){
            unDato = stack[top];
            this.top++;
          }
          return unDato;
    }
//regresa el numero de elementos que estan en la pila

public int getSize(){
    return this.stack.length;
}

}

