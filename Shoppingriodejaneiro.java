public class Shoppingriodejaneiro extends shopping {
    
    public Shoppingriodejaneiro( String nomedoshopping,String cidadedoshoppping,String bairrodoshopping,String ruadoshopping, String numerodoshopping ){
    
        super(nomedoshopping,cidadedoshoppping,ruadoshopping,bairrodoshopping,numerodoshopping);
}


public static void main(String[] args){
    Shoppingriodejaneiro shoppingriodejaneiro = new Shoppingriodejaneiro("Norte Shopping", "Rio de Janeiro", "Del Castilho", "Av. Dom Helder Câmara", "1313");
    shoppingriodejaneiro.nomedoshopping();
}
}

