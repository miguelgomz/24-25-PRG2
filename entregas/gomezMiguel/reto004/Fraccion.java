package entregas.gomezMiguel.reto004;

public class Fraccion {
    
    private int numerador;
    private int denominador;

    public Fraccion (int numerador,int denominador){
        assert denominador !=0: "EL denominador no puede ser cero ...Burro";
        this.mumerador = numerador;
        this.denominador = denominador;

        if(denominador<0){
            numerador= -numerador;
            denominador= -denominador;

        }

        this.numerador= numerador;
        this.denominador= denominador;
    int mcd =mcd(Math.abs(numerador),denominador);
    this.numerador =numerador/mcd;
    this.denominador= denominador/mcd;
    }
    public fraccion (){
        this(0);
    }
    private int mcd(int a, int b){
        while (b!=0){
            int temp =b;
            b=a % b;
            a =temp;
        }
        return  a; 
    }

    
    public String toString(){
        if (denominador==1){
            return"" +numerador;

        }else{
        return numerador + "\n-\n" + denominador;
        }
        public Fraccion sumar(Fraccion fraccion){
        if (this.denominador == fraccion.denominador) {
            int nuevoNumerador = this.numerador + fraccion.numerador;
            int nuevoDenominador = this.denominador;
            return new Fraccion(nuevoNumerador,nuevoDenominador);
        }else{
            int nuevoNumerador = this.numerador * fraccion.denominador + fraccion.numerador * this.denominador;
            int nuevoDenominador = this.denominador * fraccion.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
    }
     public Fraccion sumar(int entero){
        int nuevoNumerador = this.numerador + (entero * this.denominador);
        int nuevoDenominador = this.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion restar(Fraccion fraccion){
        if (this.denominador == fraccion.denominador) {
            int nuevoNumerador = this.numerador - fraccion.numerador;
            int nuevoDenominador = this.denominador;
            return new Fraccion(nuevoNumerador,nuevoDenominador);
        }else{
            int nuevoNumerador = this.numerador * fraccion.denominador - fraccion.numerador * this.denominador;
            int nuevoDenominador = this.denominador * fraccion.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
    }	
     public Fraccion restar(int entero){
        int nuevoNumerador = this.numerador - (entero * this.denominador);
        int nuevoDenominador = this.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicar(Fraccion fraccion){
        int nuevoNumerador = this.numerador * fraccion.numerador;
        int nuevoDenominador = this.denominador * fraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }	







    }
    }


