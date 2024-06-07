public class CuentaBancaria {
    public int cedula;
    public String Nombre;
    public int Monto;

    public CuentaBancaria(int cedula,String Nombre,int Monto){
        this.cedula=cedula;
        this.Nombre=Nombre;
        this.Monto=Monto;
    }
    public void Mostrar(){
        System.out.println("Bienvenido "+Nombre+" de cedula "+cedula);
        System.out.println("Su saldo inicial es: ");
        System.out.println(Monto);
    }

}
class CuentaAhorros extends CuentaBancaria{
public int NumeroCuenta;
public int deposito;
public CuentaAhorros(int cedula,String Nombre,int Monto, int NumeroCuenta, int deposito){
    super(cedula, Nombre, Monto);
    this.NumeroCuenta=NumeroCuenta;
    this.deposito=deposito;
}
public int Depositar(int deposito){
    int total=Monto+deposito;
    System.out.println("Su deposito es de: ");
    System.out.println(deposito);
    System.out.println("Su monto con deposito es de: ");
    System.out.println(total);
    return total;
}


}