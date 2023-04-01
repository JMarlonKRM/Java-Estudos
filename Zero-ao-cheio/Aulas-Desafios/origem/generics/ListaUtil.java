package generics;

import java.util.List;

public class ListaUtil {

    public static Object getListaUtil1 (List<?> Lista){
        return Lista.get(Lista.size() - 1 );
    }

    public static <T> T getListaUtil2 (List<T> Lista){
        return Lista.get(Lista.size() - 1 );
    }

}
