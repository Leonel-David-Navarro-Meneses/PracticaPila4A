package pila;

public class Data<T> {
private T value;

public Data (T v){
    this.value = v;
}
public T getValue() {
    return value;
}
public void setValue(T value) {
    this.value = value;
}


}