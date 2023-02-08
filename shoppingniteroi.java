public class shoppingniteroi extends shopping {

    public shoppingniteroi( String nomedoshopping,String cidadedoshoppping,String bairrodoshopping,String ruadoshopping, String numerodoshopping ){
        
        super(nomedoshopping,cidadedoshoppping,ruadoshopping,bairrodoshopping,numerodoshopping); 
    
       
    }
    
    
    public static void main(String[] args){
        shoppingniteroi shoppingniteroi = new shoppingniteroi("plaza Shopping", "Niterói", "15 de novembro", "Centro de niterói", "08");
        shoppingniteroi.nomedoshopping();
    }
    }

