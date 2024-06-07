
    public class CuentaBancaria1 {
        public int cedula;
        public String Nombre;

        public int getMonto() {
            return Monto;
        }

        public void setMonto(int monto) {
            Monto = monto;
        }

        public int Monto;

        public CuentaBancaria1(int cedula,String Nombre,int Monto){
            this.cedula=cedula;
            this.Nombre=Nombre;
            this.Monto=Monto;
        }
        public void Mostrar(){
            System.out.println("Bienvenido "+Nombre+" de cedula "+cedula);
            System.out.println("Su saldo inicial es: ");
            System.out.println(Monto);
        }



    class CuentaAhorros extends CuentaBancaria1 {
        public int NumeroCuenta;
        public int deposito;
        public CuentaAhorros(int cedula,String Nombre,int Monto, int NumeroCuenta, int deposito){
            super(cedula, Nombre, Monto);
            this.NumeroCuenta=NumeroCuenta;
            this.deposito=deposito;
        }
        public void Mostrar2(){
            System.out.println("Usted ingreso : "+deposito+" dolares");
            int total=Monto+deposito;
            setMonto(total);
            System.out.println("El monto con el deposito es de: "+total);
        }


    }
}
