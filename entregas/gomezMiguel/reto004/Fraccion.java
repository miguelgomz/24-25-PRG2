package entregas.gomezMiguel.reto004;

public class Fraccion {
    
    private int numerador;
    private int denominador;

    public Fraccion (int numerador,int denominador){
        assert denominador !=0: "EL denominador no puede ser cero ...Burro";
        if(denominador<0){
            numerador=numerador;
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
    }
    }


