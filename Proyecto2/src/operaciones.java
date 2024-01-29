public class operaciones {
   
    
 public double a;
 public double b;
 public double c=0.0;  

 public operaciones(double a, double b){
    this.a = a;
    this.b = b;

 }

public double geta() {

    return a;

}
public void  seta(double a) {

    this.a =  a;

}
public double getb() {

    return b;

}
public void  setb(double b) {

    this.b = b;

}

public double getc(){
    return c;

}
public double suma(){

    c=a+b;
    return c;

}

public double resta(){

    c=a-b;
    return c;

}

public double multiplicacion(){

    c=a*b;
    return c;

}

public double division(){

    c=a/b;
    return c;

}
}
