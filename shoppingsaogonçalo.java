public class shoppingsaogonçalo extends shopping {

        public shoppingsaogonçalo( String nomedoshopping,String cidadedoshoppping,String bairrodoshopping,String ruadoshopping, String numerodoshopping ){
            
            super(nomedoshopping,cidadedoshoppping,ruadoshopping,bairrodoshopping,numerodoshopping); 
        
           
        }
        
        
        public static void main(String[] args){
            shoppingsaogonçalo shoppingsaogonçalo = new shoppingsaogonçalo("São Gonçalo Shopping", "São Gonçalo", "Boa Vista", "Rodovia Niterói Manilia", "100");
            shoppingsaogonçalo.nomedoshopping();
        }
        }

