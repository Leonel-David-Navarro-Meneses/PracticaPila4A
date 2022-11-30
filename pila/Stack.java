package pila;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Data> stack;
    private int top;

    //crea una pila con espacio para t Data
    public Stack(int t){
        stack = new ArrayList(t);
        top = stack.size();
    
    }
//regresa true si la pila esta vacia
    public boolean isEmpty(){
        if(top == stack.size())
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
         stack.add(top, d);
         return true;
    }
//saca un elemento de la pila
    public Data pop(){
        Data unDato = null;
        //si la pila No esta vacia, se puede retirara elementos
          if(this.isEmpty()){
            unDato = stack.remove(this.top);
            this.top++;
          }
          return unDato;
    }
//regresa el numero de elementos que estan en la pila

public int getSize(){
    return this.stack.size();
}

}

