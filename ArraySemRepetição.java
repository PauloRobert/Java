package DeclaracaoArray;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Declaracao_Array {

    public static void main(String[] args) {
        Declaracao_Array d = new Declaracao_Array();
        System.out.println(d.data());
    }

    public String data (){
        List<String> lista = new ArrayList<String>();


        lista.add ( "01/09/2015" );
        lista.add ( "02/09/2015" );
        lista.add ( "03/09/2015");
        lista.add ( "04/09/2015");
        lista.add ( "08/09/2015" );
        lista.add ( "09/09/2015" );
        lista.add ( "10/09/2015");
        lista.add ( "11/09/2015");
        lista.add ( "14/09/2015" );
        lista.add ( "15/09/2015" );
        lista.add ( "17/09/2015");
        lista.add ( "18/09/2015");
        lista.add ( "21/09/2015" );
        lista.add ( "22/09/2015" );
        lista.add ( "23/09/2015");


        Collections.shuffle ( lista );


        return lista.get(0);

    }

}
