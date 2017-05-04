package variables;
/**
 *
 * @author Boyka
 */class CuentaBancaria {
     public int saldo ; 
    }
    public class Variables {
        public static void SumarSaldo (CuentaBancaria cta) {
        cta.saldo += 10 ;
        }
        public static void SumarSaldo (int saldo) {
        saldo += 10 ;
        }
        public static void main(String[] args)  {
        CuentaBancaria ct1 = new CuentaBancaria ();
        ct1.saldo = 1000; 
        SumarSaldo (ct1); //_Valor
        SumarSaldo (ct1.saldo); //_Imprime 1010
        System.out.println(ct1.saldo);
        //_Add+
        CuentaBancaria ct2=ct1 ;
        ct1.saldo = 1000;
        SumarSaldo (ct1);
        SumarSaldo (ct2);
        System.out.println("Ct1:" +ct1.saldo); //_Imprime_1020
        System.out.println("Ct2:" +ct2.saldo); //_Imprime_1020
        //_Add+
        ct2 = new CuentaBancaria ();
        System.out.println("Ct2" +ct2.saldo); //_Imrpime 20
        //_Add1    
        CuentaBancaria ct3=ct2;
        CuentaBancaria ct4= ct3;
        ct1.saldo = 66;
        SumarSaldo (ct1);
        System.out.println("Prueba_1: " +ct1.saldo); //_Imprime 76
        //Add2+
        CuentaBancaria ct5= ct4;
        CuentaBancaria ct6= ct5;
        CuentaBancaria ct7= ct6;
        ct4.saldo = 234;
        SumarSaldo (ct4);
        SumarSaldo (ct5);
        SumarSaldo (ct6);
        System.out.println("Prueba_2:" +ct6.saldo); //_Imprime 264  
        //Add3+
        CuentaBancaria m1 = new CuentaBancaria ();
        m1.saldo = 0;
        SumarSaldo (m1);
        System.out.println("Prueba_3:" +m1.saldo); //Imprime 10
        //Add4+
        CuentaBancaria c1 = new CuentaBancaria ();
        c1.saldo = 500;
        SumarSaldo (c1.saldo) ;
        System.out.println("Prueba_4:" +c1.saldo); //_Imprime 500 
        //Add5+
        CuentaBancaria c3 = new CuentaBancaria ();
        c3.saldo = 41;
        SumarSaldo (c3);
        CuentaBancaria c44 = new CuentaBancaria ();
        c44.saldo = 5;
        SumarSaldo (c44);
        int R = c3.saldo + c44.saldo ; 
        System.out.println("EL total es:" +R ); //_Imprime 66           
        //_Add6+
        CuentaBancaria k1 = new CuentaBancaria ();
        k1.saldo = 17 ;
        SumarSaldo(k1);
        System.out.println("Prueba_5:" +k1.saldo);
        //_Add7+
        k1.saldo = 34 ;
        SumarSaldo (k1);
        c44.saldo = 56 ;
        SumarSaldo (c44);
        SumarSaldo (k1);
        int r = k1.saldo + c44.saldo / k1.saldo ;
        System.out.println("El total es:" +r); //_Imprime 55
        //_Add8+
        CuentaBancaria p1 = new CuentaBancaria ();
        CuentaBancaria p2 = p1;
        CuentaBancaria p3 = p2;
        CuentaBancaria p4 = p3;
        p4.saldo =  35;
        SumarSaldo (p4);
        SumarSaldo (p4);
        p4 = new CuentaBancaria ();
        System.out.println("Prueba_8:" + p4.saldo); //_Perdio el acumulador, 0  
        //_Add9+     
        CuentaBancaria i9 =new CuentaBancaria ();
        i9.saldo = 20;
        SumarSaldo (i9);
        SumarSaldo (i9);
        System.out.println("PrimerValor:"+i9.saldo);
        CuentaBancaria i8 = i9 ;
        i9.saldo = 78;
        SumarSaldo (i9.saldo);
            System.out.println("Prueba_9:"+i8.saldo);//_Imprime 78     
        //_Add10+                                       
        i9.saldo = - 90;
       SumarSaldo (i9);
            System.out.println("Prueba_10:" +i9.saldo); //_Imprime - 80
        }
    }